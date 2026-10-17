package nb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f213997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f213998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213999c;

    public l(i header, j navigation, String selectedTabId) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f213997a = header;
        this.f213998b = navigation;
        this.f213999c = selectedTabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f213997a, lVar.f213997a) && Intrinsics.f(this.f213998b, lVar.f213998b) && Intrinsics.f(this.f213999c, lVar.f213999c);
    }

    public final int hashCode() {
        return this.f213999c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f213998b.f213996a, this.f213997a.f213995a.hashCode() * 31, 31);
    }
}
