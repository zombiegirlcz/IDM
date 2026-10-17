package slm;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;
import yhm.s;
import yhm.u;
import yhm.w;
import yhm.z;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends dki.h {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a80.e writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.d = z;
    }

    @Override // dki.h
    public final void q(byte b4) {
        if (this.d) {
            s.Companion companion = yhm.s.INSTANCE;
            w(String.valueOf(b4 & UnsignedBytes.MAX_VALUE));
        } else {
            s.Companion companion2 = yhm.s.INSTANCE;
            u(String.valueOf(b4 & UnsignedBytes.MAX_VALUE));
        }
    }

    @Override // dki.h
    public final void s(int i) {
        if (this.d) {
            u.Companion companion = yhm.u.INSTANCE;
            w(Integer.toUnsignedString(i));
        } else {
            u.Companion companion2 = yhm.u.INSTANCE;
            u(Integer.toUnsignedString(i));
        }
    }

    @Override // dki.h
    public final void t(long j2) {
        if (this.d) {
            w.Companion companion = yhm.w.INSTANCE;
            w(Long.toUnsignedString(j2));
        } else {
            w.Companion companion2 = yhm.w.INSTANCE;
            u(Long.toUnsignedString(j2));
        }
    }

    @Override // dki.h
    public final void v(short s2) {
        if (this.d) {
            z.Companion companion = yhm.z.INSTANCE;
            w(String.valueOf(s2 & HPKE.aead_EXPORT_ONLY));
        } else {
            z.Companion companion2 = yhm.z.INSTANCE;
            u(String.valueOf(s2 & HPKE.aead_EXPORT_ONLY));
        }
    }
}
