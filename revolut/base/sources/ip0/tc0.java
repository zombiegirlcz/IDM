package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc0 f166495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166496c;

    public tc0() {
        this((String) null, false, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tc0)) {
            return false;
        }
        tc0 tc0Var = (tc0) obj2;
        return Intrinsics.f(this.f166494a, tc0Var.f166494a) && this.f166495b == tc0Var.f166495b && this.f166496c == tc0Var.f166496c;
    }

    public final int hashCode() {
        String str = this.f166494a;
        return Boolean.hashCode(this.f166496c) + ((this.f166495b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public tc0(String str, sc0 selectItemStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(selectItemStrategy, "selectItemStrategy");
        this.f166494a = str;
        this.f166495b = selectItemStrategy;
        this.f166496c = z;
    }

    public /* synthetic */ tc0(String str, boolean z, int i) {
        this((i & 1) != 0 ? null : str, sc0.FORCE_CHANGE, (i & 4) != 0 ? true : z);
    }
}
