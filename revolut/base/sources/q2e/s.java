package q2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f241618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f241619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241620c;
    public final aw0.i d;

    public s(k header, p navigation, String selectedTabId, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f241618a = header;
        this.f241619b = navigation;
        this.f241620c = selectedTabId;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f241618a, sVar.f241618a) && Intrinsics.f(this.f241619b, sVar.f241619b) && Intrinsics.f(this.f241620c, sVar.f241620c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f241619b.hashCode() + (this.f241618a.hashCode() * 31)) * 31, 31, this.f241620c);
        aw0.i iVar = this.d;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
