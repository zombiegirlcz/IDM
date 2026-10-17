package slm;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.CharacterCodingException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class b0 extends a {
    public final pak.h e;
    public final char[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f264239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f264240h;

    public b0(pak.h reader, char[] buffer) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.e = reader;
        this.f = buffer;
        this.f264239g = 128;
        this.f264240h = new d(buffer);
        E(0);
    }

    @Override // slm.a
    public final String A(int i, int i2) {
        d dVar = this.f264240h;
        return kotlin.text.a0.s(dVar.f264245a, i, Math.min(i2, dVar.f264246b));
    }

    public final void E(int i) throws CharacterCodingException {
        d dVar = this.f264240h;
        char[] buffer = dVar.f264245a;
        if (i != 0) {
            int i2 = this.f264232a;
            zhm.p.g(buffer, buffer, 0, i2, i2 + i);
        }
        int i3 = dVar.f264246b;
        while (true) {
            if (i == i3) {
                break;
            }
            pak.h hVar = this.e;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int iA = ((k) hVar.f234573b).a(buffer, i, i3 - i);
            if (iA == -1) {
                dVar.f264246b = Math.min(dVar.f264245a.length, i);
                this.f264239g = -1;
                break;
            }
            i += iA;
        }
        this.f264232a = 0;
    }

    public final void F() {
        i iVar = i.f264264c;
        iVar.getClass();
        char[] array = this.f;
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length == 16384) {
            iVar.a(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // slm.a
    public final void b(int i, int i2) {
        StringBuilder sb6 = this.d;
        sb6.append(this.f264240h.f264245a, i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
    }

    @Override // slm.a
    public boolean c() throws CharacterCodingException {
        o();
        int i = this.f264232a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.f264232a = iY;
                return false;
            }
            char c2 = this.f264240h.f264245a[iY];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.f264232a = iY;
                return a.u(c2);
            }
            i = iY + 1;
        }
    }

    @Override // slm.a
    public final String e() throws CharacterCodingException {
        h(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i = this.f264232a;
        d dVar = this.f264240h;
        int i2 = dVar.f264246b;
        char[] cArr = dVar.f264245a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iY = y(i);
            if (iY != -1) {
                return k(dVar, this.f264232a, iY);
            }
            int i5 = this.f264232a;
            int i6 = i5 - 1;
            a.r(this, p.a.p("Expected quotation mark '\"', but had '", (i5 == dVar.f264246b || i6 < 0) ? "EOF" : String.valueOf(dVar.f264245a[i6]), "' instead"), i6, null, 4);
            throw null;
        }
        for (int i21 = i; i21 < i3; i21++) {
            if (cArr[i21] == '\\') {
                return k(dVar, this.f264232a, i21);
            }
        }
        this.f264232a = i3 + 1;
        return kotlin.text.a0.s(cArr, i, Math.min(i3, dVar.f264246b));
    }

    @Override // slm.a
    public byte f() throws CharacterCodingException {
        o();
        int i = this.f264232a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.f264232a = iY;
                return (byte) 10;
            }
            int i2 = iY + 1;
            byte bH = q.h(this.f264240h.f264245a[iY]);
            if (bH != 3) {
                this.f264232a = i2;
                return bH;
            }
            i = i2;
        }
    }

    @Override // slm.a
    public void h(char c2) throws CharacterCodingException {
        o();
        int i = this.f264232a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.f264232a = iY;
                D(c2);
                throw null;
            }
            int i2 = iY + 1;
            char c3 = this.f264240h.f264245a[iY];
            if (c3 != ' ' && c3 != '\n' && c3 != '\r' && c3 != '\t') {
                this.f264232a = i2;
                if (c3 == c2) {
                    return;
                }
                D(c2);
                throw null;
            }
            i = i2;
        }
    }

    @Override // slm.a
    public final void o() throws CharacterCodingException {
        int i = this.f264240h.f264246b - this.f264232a;
        if (i > this.f264239g) {
            return;
        }
        E(i);
    }

    @Override // slm.a
    public final CharSequence t() {
        return this.f264240h;
    }

    @Override // slm.a
    public final String v(String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // slm.a
    public final int y(int i) throws CharacterCodingException {
        d dVar = this.f264240h;
        if (i < dVar.f264246b) {
            return i;
        }
        this.f264232a = i;
        o();
        return (this.f264232a != 0 || dVar.length() == 0) ? -1 : 0;
    }

    @Override // slm.a
    public int z() throws CharacterCodingException {
        int iY;
        char c2;
        int i = this.f264232a;
        while (true) {
            iY = y(i);
            if (iY == -1 || !((c2 = this.f264240h.f264245a[iY]) == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t')) {
                break;
            }
            i = iY + 1;
        }
        this.f264232a = iY;
        return iY;
    }
}
