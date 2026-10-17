package yp;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import cpi.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.b f315712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f315713b;

    public b(ui0.b app, g storeIntentProvider) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        this.f315712a = app;
        this.f315713b = storeIntentProvider;
    }

    public final ActivityNavigateCommand a(ui0.b bVar) {
        if (bVar == null) {
            bVar = this.f315712a;
        }
        Intent intentU = this.f315713b.u(bVar);
        String action = intentU.getAction();
        if (action == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new ActivityNavigateCommand(new ImplicitActivityDestination(action, null, intentU.getPackage(), null, intentU.getData(), 10), null, null, null, intentU.getFlags(), null, null, null, null, false, 1006);
    }

    public final ExternalDestination.ByIntent b(ui0.b bVar) {
        if (bVar == null) {
            bVar = this.f315712a;
        }
        return new ExternalDestination.ByIntent(this.f315713b.u(bVar));
    }
}
