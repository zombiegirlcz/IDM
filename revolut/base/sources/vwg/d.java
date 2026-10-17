package vwg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292727c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f292728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f292729h;

    public d(String portfolioId, String key, String title, String description, String sortOrderLabel, String sortOrder, r info, List assets) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(sortOrderLabel, "sortOrderLabel");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f292725a = portfolioId;
        this.f292726b = key;
        this.f292727c = title;
        this.d = description;
        this.e = sortOrderLabel;
        this.f = sortOrder;
        this.f292728g = info;
        this.f292729h = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f292725a, dVar.f292725a) && Intrinsics.f(this.f292726b, dVar.f292726b) && Intrinsics.f(this.f292727c, dVar.f292727c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f292728g, dVar.f292728g) && Intrinsics.f(this.f292729h, dVar.f292729h);
    }

    public final int hashCode() {
        return this.f292729h.hashCode() + ((this.f292728g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f292725a.hashCode() * 31, 31, this.f292726b), 31, this.f292727c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }
}
