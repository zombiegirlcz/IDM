package r8j;

import g9j.w;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv5.c f252462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f252463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f252464c;
    public final efd.a d;

    public c(xv5.c baseCurrencyInteractor, h0 watchlistInteractor, w presentationModel, efd.a alertsInteractor) {
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        this.f252462a = baseCurrencyInteractor;
        this.f252463b = watchlistInteractor;
        this.f252464c = presentationModel;
        this.d = alertsInteractor;
    }
}
