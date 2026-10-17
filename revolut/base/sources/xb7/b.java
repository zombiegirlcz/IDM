package xb7;

import kotlin.jvm.internal.Intrinsics;
import vxc.g;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f304017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb7.a f304018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cc7.a f304019c;

    public b(g homeNpsWidgetState, yb7.a homeNPSInteractor, gte.a featureToggleInteractor, cc7.a mapper) {
        Intrinsics.checkNotNullParameter(homeNpsWidgetState, "homeNpsWidgetState");
        Intrinsics.checkNotNullParameter(homeNPSInteractor, "homeNPSInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f304017a = homeNpsWidgetState;
        this.f304018b = homeNPSInteractor;
        this.f304019c = mapper;
    }
}
