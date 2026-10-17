package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class Table {

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f7414bb;
    protected int bb_pos;
    Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    public int __indirect(int i) {
        return this.f7414bb.getInt(i) + i;
    }

    public int __offset(int i) {
        if (i < this.vtable_size) {
            return this.f7414bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    public void __reset(int i, ByteBuffer byteBuffer) {
        this.f7414bb = byteBuffer;
        if (byteBuffer == null) {
            this.bb_pos = 0;
            this.vtable_start = 0;
            this.vtable_size = 0;
        } else {
            this.bb_pos = i;
            int i2 = i - byteBuffer.getInt(i);
            this.vtable_start = i2;
            this.vtable_size = this.f7414bb.getShort(i2);
        }
    }

    public int __vector(int i) {
        int i2 = i + this.bb_pos;
        return this.f7414bb.getInt(i2) + i2 + 4;
    }

    public int __vector_len(int i) {
        int i2 = i + this.bb_pos;
        return this.f7414bb.getInt(this.f7414bb.getInt(i2) + i2);
    }
}
