package uo;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh0.b f281485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f281486b;

    public k(nh0.b advertisingIdClient) {
        Intrinsics.checkNotNullParameter(advertisingIdClient, "advertisingIdClient");
        this.f281485a = advertisingIdClient;
        this.f281486b = yhm.j.b(new ulm.p0(this, 3));
    }
}
