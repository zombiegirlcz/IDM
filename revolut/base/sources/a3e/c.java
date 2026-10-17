package a3e;

import com.revolut.data.model.Data;
import f3e.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f1103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3e.h f1104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk0.g f1105c;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data dealsLayout, f3e.h userLocation, lk0.g gVar, int i) {
        if ((i & 1) != 0) {
            dealsLayout = cVar.f1103a;
        }
        if ((i & 2) != 0) {
            userLocation = cVar.f1104b;
        }
        if ((i & 4) != 0) {
            gVar = cVar.f1105c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(dealsLayout, "dealsLayout");
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        return new c(dealsLayout, userLocation, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f1103a, cVar.f1103a) && Intrinsics.f(this.f1104b, cVar.f1104b) && Intrinsics.f(this.f1105c, cVar.f1105c);
    }

    public final int hashCode() {
        int iHashCode = (this.f1104b.hashCode() + (this.f1103a.hashCode() * 31)) * 31;
        lk0.g gVar = this.f1105c;
        return iHashCode + (gVar == null ? 0 : gVar.f196174a.hashCode());
    }

    public c(Data dealsLayout, f3e.h userLocation, lk0.g gVar) {
        Intrinsics.checkNotNullParameter(dealsLayout, "dealsLayout");
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        this.f1103a = dealsLayout;
        this.f1104b = userLocation;
        this.f1105c = gVar;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null), h.a.f131970a, null);
    }
}
