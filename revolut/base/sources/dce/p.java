package dce;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9e.b f112883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112884c;
    public final Data d;
    public final Data e;
    public final Data f;

    public p(String subscriptionId, f9e.b mode, boolean z, Data items, Data navBarModel, Data subscription) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f112882a = subscriptionId;
        this.f112883b = mode;
        this.f112884c = z;
        this.d = items;
        this.e = navBarModel;
        this.f = subscription;
    }

    public static p a(p pVar, Data data, Data data2, Data data3, int i) {
        String subscriptionId = pVar.f112882a;
        f9e.b mode = pVar.f112883b;
        boolean z = pVar.f112884c;
        if ((i & 8) != 0) {
            data = pVar.d;
        }
        Data items = data;
        if ((i & 16) != 0) {
            data2 = pVar.e;
        }
        Data navBarModel = data2;
        if ((i & 32) != 0) {
            data3 = pVar.f;
        }
        Data subscription = data3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return new p(subscriptionId, mode, z, items, navBarModel, subscription);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f112882a, pVar.f112882a) && this.f112883b == pVar.f112883b && this.f112884c == pVar.f112884c && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, j6.a.c((this.f112883b.hashCode() + (this.f112882a.hashCode() * 31)) * 31, 31, this.f112884c), 31), 31);
    }
}
