package d0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110384c;
    public final String d;
    public final String e;
    public final ArrayList f;

    public d(String id10, String title, String subtitle, String asset, String deeplink, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f110382a = id10;
        this.f110383b = title;
        this.f110384c = subtitle;
        this.d = asset;
        this.e = deeplink;
        this.f = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f110382a, dVar.f110382a) && Intrinsics.f(this.f110383b, dVar.f110383b) && Intrinsics.f(this.f110384c, dVar.f110384c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f.equals(dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f110382a.hashCode() * 31, 31, this.f110383b), 31, this.f110384c), 31, this.d), 31, this.e);
    }
}
