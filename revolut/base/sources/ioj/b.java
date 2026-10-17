package ioj;

import dfj.f5;
import dfj.k0;
import foj.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements hej.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f163337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final foj.b f163338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f163339c;
    public final f5 d;
    public final bej.c e;

    public b(c smallWidgetBuilder, foj.b mediumWidgetBuilder, k0 installationStateInteractor, f5 widgetsConfigInteractor, bej.c connectEligibilityInteractor) {
        Intrinsics.checkNotNullParameter(smallWidgetBuilder, "smallWidgetBuilder");
        Intrinsics.checkNotNullParameter(mediumWidgetBuilder, "mediumWidgetBuilder");
        Intrinsics.checkNotNullParameter(installationStateInteractor, "installationStateInteractor");
        Intrinsics.checkNotNullParameter(widgetsConfigInteractor, "widgetsConfigInteractor");
        Intrinsics.checkNotNullParameter(connectEligibilityInteractor, "connectEligibilityInteractor");
        this.f163337a = smallWidgetBuilder;
        this.f163338b = mediumWidgetBuilder;
        this.f163339c = installationStateInteractor;
        this.d = widgetsConfigInteractor;
        this.e = connectEligibilityInteractor;
    }
}
