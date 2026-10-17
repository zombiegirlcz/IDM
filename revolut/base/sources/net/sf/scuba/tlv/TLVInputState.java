package net.sf.scuba.tlv;

import a0.d;
import j6.a;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import kii.e;

/* JADX INFO: loaded from: classes14.dex */
class TLVInputState {
    private boolean isAtStartOfLength;
    private boolean isAtStartOfTag;
    private boolean isReadingValue;
    private Deque<TLStruct> state;

    public class TLStruct {
        private int length;

        /* JADX INFO: renamed from: tag, reason: collision with root package name */
        private int f214659tag;
        private int valueBytesRead;

        public TLStruct(TLVInputState tLVInputState, int i) {
            this(i, Integer.MAX_VALUE, 0);
        }

        public int getLength() {
            return this.length;
        }

        public int getTag() {
            return this.f214659tag;
        }

        public int getValueBytesProcessed() {
            return this.valueBytesRead;
        }

        public void setLength(int i) {
            this.length = i;
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("[TLStruct ");
            e.y(sb6, ", ", this.f214659tag);
            sb6.append(this.length);
            sb6.append(", ");
            return a.v(sb6, "]", this.valueBytesRead);
        }

        public void updateValueBytesProcessed(int i) {
            this.valueBytesRead += i;
        }

        public TLStruct(TLVInputState tLVInputState, TLStruct tLStruct) {
            this(tLStruct.f214659tag, tLStruct.length, tLStruct.valueBytesRead);
        }

        public TLStruct(int i, int i2, int i3) {
            this.f214659tag = i;
            this.length = i2;
            this.valueBytesRead = i3;
        }
    }

    public TLVInputState() {
        this(new ArrayDeque(), true, false, false);
    }

    private Deque<TLStruct> getDeepCopyOfState() {
        ArrayDeque arrayDeque = new ArrayDeque(this.state.size());
        Iterator<TLStruct> it8 = this.state.iterator();
        while (it8.hasNext()) {
            arrayDeque.addLast(new TLStruct(this, it8.next()));
        }
        return arrayDeque;
    }

    public int getLength() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        return this.state.peek().getLength();
    }

    public int getTag() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Tag not yet read.");
        }
        return this.state.peek().getTag();
    }

    public int getValueBytesLeft() {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Length of value is unknown.");
        }
        TLStruct tLStructPeek = this.state.peek();
        return tLStructPeek.getLength() - tLStructPeek.getValueBytesProcessed();
    }

    public int getValueBytesProcessed() {
        return this.state.peek().getValueBytesProcessed();
    }

    public boolean isAtStartOfLength() {
        return this.isAtStartOfLength;
    }

    public boolean isAtStartOfTag() {
        return this.isAtStartOfTag;
    }

    public boolean isProcessingValue() {
        return this.isReadingValue;
    }

    public void setDummyLengthProcessed() {
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setLengthProcessed(int i, int i2) {
        if (i < 0) {
            StringBuilder sbW = d.w(i, "Cannot set negative length (length = ", ", 0x");
            e.y(sbW, " for tag ", i);
            sbW.append(Integer.toHexString(getTag()));
            sbW.append(").");
            throw new IllegalArgumentException(sbW.toString());
        }
        TLStruct tLStructPop = this.state.pop();
        if (!this.state.isEmpty()) {
            this.state.peek().updateValueBytesProcessed(i2);
        }
        tLStructPop.setLength(i);
        this.state.push(tLStructPop);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = false;
        this.isReadingValue = true;
    }

    public void setTagProcessed(int i, int i2) {
        TLStruct tLStruct = new TLStruct(this, i);
        if (!this.state.isEmpty()) {
            this.state.peek().updateValueBytesProcessed(i2);
        }
        this.state.push(tLStruct);
        this.isAtStartOfTag = false;
        this.isAtStartOfLength = true;
        this.isReadingValue = false;
    }

    public String toString() {
        return this.state.toString();
    }

    public void updateValueBytesProcessed(int i) {
        if (this.state.isEmpty()) {
            return;
        }
        TLStruct tLStructPeek = this.state.peek();
        int length = tLStructPeek.getLength() - tLStructPeek.getValueBytesProcessed();
        if (i > length) {
            StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Cannot process ", i, length, " bytes! Only ", " bytes left in this TLV object ");
            sbW.append(tLStructPeek);
            throw new IllegalArgumentException(sbW.toString());
        }
        tLStructPeek.updateValueBytesProcessed(i);
        int length2 = tLStructPeek.getLength();
        if (tLStructPeek.getValueBytesProcessed() != length2) {
            this.isAtStartOfTag = false;
            this.isAtStartOfLength = false;
            this.isReadingValue = true;
        } else {
            this.state.pop();
            updateValueBytesProcessed(length2);
            this.isAtStartOfTag = true;
            this.isAtStartOfLength = false;
            this.isReadingValue = false;
        }
    }

    public TLVInputState(TLVInputState tLVInputState) {
        this(tLVInputState.getDeepCopyOfState(), tLVInputState.isAtStartOfTag, tLVInputState.isAtStartOfLength, tLVInputState.isReadingValue);
    }

    private TLVInputState(Deque<TLStruct> deque, boolean z, boolean z3, boolean z4) {
        this.state = deque;
        this.isAtStartOfTag = z;
        this.isAtStartOfLength = z3;
        this.isReadingValue = z4;
    }
}
