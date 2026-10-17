package ecm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class k1 extends i1 {
    public final l1 e;

    public k1(String str, boolean z, l1 l1Var) {
        super(str, z, l1Var);
        Preconditions.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.e = (l1) Preconditions.checkNotNull(l1Var, "marshaller");
    }

    @Override // ecm.i1
    public final Object a(byte[] bArr) {
        return this.e.b(bArr);
    }

    @Override // ecm.i1
    public final byte[] b(Object obj2) {
        return (byte[]) Preconditions.checkNotNull(this.e.a(obj2), "null marshaller.toAsciiString()");
    }
}
