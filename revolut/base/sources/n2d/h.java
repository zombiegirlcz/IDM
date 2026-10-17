package n2d;

import kotlin.jvm.internal.Intrinsics;
import r2d.p;
import r2d.s;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f211529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f211530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f211531c;
    public final efd.a d;
    public final i e;

    public h(p presentationModel, xoj.a featuresInteractor, s mapper, efd.a alertsInteractor, i removeAlertShotDialogConfigProvider) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(removeAlertShotDialogConfigProvider, "removeAlertShotDialogConfigProvider");
        this.f211529a = presentationModel;
        this.f211530b = featuresInteractor;
        this.f211531c = mapper;
        this.d = alertsInteractor;
        this.e = removeAlertShotDialogConfigProvider;
    }
}
