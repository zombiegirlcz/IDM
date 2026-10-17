package xg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements p, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f305475b;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(3, null, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f305474a, oVar.f305474a) && Intrinsics.f(this.f305475b, oVar.f305475b);
    }

    public final int hashCode() {
        String str = this.f305474a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Exception exc2 = this.f305475b;
        return iHashCode + (exc2 != null ? exc2.hashCode() : 0);
    }

    public /* synthetic */ o(int i, Exception exc2, String str) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc2);
    }

    public o(String str, Exception exc2) {
        this.f305474a = str;
        this.f305475b = exc2;
    }
}
