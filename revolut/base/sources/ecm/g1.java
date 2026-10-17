package ecm;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class g1 extends i1 {
    public final h1 e;

    public g1(String str, h1 h1Var) {
        super(str, false, h1Var);
        Preconditions.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.e = (h1) Preconditions.checkNotNull(h1Var, "marshaller");
    }

    @Override // ecm.i1
    public final Object a(byte[] bArr) {
        return this.e.b(new String(bArr, Charsets.US_ASCII));
    }

    @Override // ecm.i1
    public final byte[] b(Object obj2) {
        return ((String) Preconditions.checkNotNull(this.e.a(obj2), "null marshaller.toAsciiString()")).getBytes(Charsets.US_ASCII);
    }
}
