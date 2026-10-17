package e7l;

import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f123356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f123357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123358c;
    public final dj0.d d;

    public d(Date date, e socialNetworkType, String url2, dj0.d reward) {
        Intrinsics.checkNotNullParameter(socialNetworkType, "socialNetworkType");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f123356a = date;
        this.f123357b = socialNetworkType;
        this.f123358c = url2;
        this.d = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f123356a, dVar.f123356a) && this.f123357b == dVar.f123357b && Intrinsics.f(this.f123358c, dVar.f123358c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        Date date = this.f123356a;
        return this.d.hashCode() + p.a.c((this.f123357b.hashCode() + ((date == null ? 0 : date.hashCode()) * 31)) * 31, 31, this.f123358c);
    }
}
