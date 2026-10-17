package d1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110638b;

    public i(String str, int i) {
        this.f110637a = str;
        this.f110638b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f110637a, iVar.f110637a) && this.f110638b == iVar.f110638b;
    }

    public final int hashCode() {
        String str = this.f110637a;
        return Integer.hashCode(this.f110638b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
