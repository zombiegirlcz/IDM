package f3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f131967c;

    public e(String id10, String campaignId, c location) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter("", "title");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f131965a = id10;
        this.f131966b = campaignId;
        this.f131967c = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f131965a, eVar.f131965a) && Intrinsics.f(this.f131966b, eVar.f131966b) && this.f131967c.equals(eVar.f131967c);
    }

    public final int hashCode() {
        return this.f131967c.hashCode() + p.a.c(this.f131965a.hashCode() * 31, 961, this.f131966b);
    }
}
