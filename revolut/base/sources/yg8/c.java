package yg8;

import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExternalAppDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.a f313572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rqi.c f313573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f313574c;

    public c(y70.a appInstalledChecker, z70.d revolutApplicationsIdProvider, rqi.c googlePlayNaviCommandFactory, f80.a uriHelper, a intentHelper) {
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        Intrinsics.checkNotNullParameter(revolutApplicationsIdProvider, "revolutApplicationsIdProvider");
        Intrinsics.checkNotNullParameter(googlePlayNaviCommandFactory, "googlePlayNaviCommandFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
        this.f313572a = appInstalledChecker;
        this.f313573b = googlePlayNaviCommandFactory;
        this.f313574c = uriHelper;
    }

    public final ActivityNavigateCommand a() {
        return this.f313572a.a("com.revolut.junior") ? new ActivityNavigateCommand(new ExternalAppDestination("com.revolut.junior"), null, null, null, 268435456, null, null, null, null, false, 1006) : this.f313573b.a("com.revolut.junior", gh0.d.GOOGLE);
    }
}
