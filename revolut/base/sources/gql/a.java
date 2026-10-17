package gql;

import g8i.h;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import rh0.b;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f145773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f145774b;

    public a(b mobileServicesAvailabilityManager) {
        Intrinsics.checkNotNullParameter(mobileServicesAvailabilityManager, "mobileServicesAvailabilityManager");
        this.f145773a = mobileServicesAvailabilityManager;
        this.f145774b = j.b(new h(this, 24));
    }

    public final boolean a() {
        return ((Boolean) this.f145774b.getValue()).booleanValue();
    }
}
