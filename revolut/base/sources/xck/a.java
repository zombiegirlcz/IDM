package xck;

import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304141c;
    public final RewardInfo d;

    public a(String id10, String title, String icon, RewardInfo info) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f304139a = id10;
        this.f304140b = title;
        this.f304141c = icon;
        this.d = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f304139a, aVar.f304139a) && Intrinsics.f(this.f304140b, aVar.f304140b) && Intrinsics.f(this.f304141c, aVar.f304141c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f304139a.hashCode() * 31, 31, this.f304140b), 31, this.f304141c);
    }
}
