package epg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zlg.n f128184c;
    public final dpg.a d;

    public l(String usernameInput, String currentUsername, zlg.n usernameData, dpg.a aVar) {
        Intrinsics.checkNotNullParameter(usernameInput, "usernameInput");
        Intrinsics.checkNotNullParameter(currentUsername, "currentUsername");
        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
        this.f128182a = usernameInput;
        this.f128183b = currentUsername;
        this.f128184c = usernameData;
        this.d = aVar;
    }

    public static l a(l lVar, String usernameInput, String currentUsername, zlg.n usernameData, dpg.a aVar, int i) {
        if ((i & 1) != 0) {
            usernameInput = lVar.f128182a;
        }
        if ((i & 2) != 0) {
            currentUsername = lVar.f128183b;
        }
        if ((i & 4) != 0) {
            usernameData = lVar.f128184c;
        }
        if ((i & 8) != 0) {
            aVar = lVar.d;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(usernameInput, "usernameInput");
        Intrinsics.checkNotNullParameter(currentUsername, "currentUsername");
        Intrinsics.checkNotNullParameter(usernameData, "usernameData");
        return new l(usernameInput, currentUsername, usernameData, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f128182a, lVar.f128182a) && Intrinsics.f(this.f128183b, lVar.f128183b) && Intrinsics.f(this.f128184c, lVar.f128184c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f128184c.hashCode() + p.a.c(this.f128182a.hashCode() * 31, 31, this.f128183b)) * 31;
        dpg.a aVar = this.d;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
