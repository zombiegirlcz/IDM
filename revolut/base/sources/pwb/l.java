package pwb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f240385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f240386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240387c;

    public l(i header, j navigation, String selectedTabId) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f240385a = header;
        this.f240386b = navigation;
        this.f240387c = selectedTabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f240385a, lVar.f240385a) && Intrinsics.f(this.f240386b, lVar.f240386b) && Intrinsics.f(this.f240387c, lVar.f240387c);
    }

    public final int hashCode() {
        return this.f240387c.hashCode() + p.a.d(this.f240385a.f240383a.hashCode() * 31, 31, this.f240386b.f240384a);
    }
}
