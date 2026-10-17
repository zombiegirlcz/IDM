package tde;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269986b;

    public i(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f269985a = title;
        this.f269986b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f269985a, iVar.f269985a) && Intrinsics.f(this.f269986b, iVar.f269986b);
    }

    public final int hashCode() {
        return this.f269986b.hashCode() + (this.f269985a.hashCode() * 31);
    }
}
