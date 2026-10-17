package com.revolut.feature.credit.application.plugins.impl.ui.valuators.details;

import android.content.Intent;
import android.net.Uri;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$Action;
import com.revolut.kompot.common.ExternalDestination;
import fj4.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements g {
    public final fj4.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f68505p;

    public a(fj4.a intentProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = intentProvider;
        this.f68505p = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(ValuatorDetailsScreenContract$Action action) {
        Intent intent;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z = action instanceof ValuatorDetailsScreenContract$Action.Call;
        fj4.a aVar = this.o;
        if (z) {
            String phoneNumber = ((ValuatorDetailsScreenContract$Action.Call) action).f68500a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + phoneNumber));
        } else if (action instanceof ValuatorDetailsScreenContract$Action.OpenBrowser) {
            String link = ((ValuatorDetailsScreenContract$Action.OpenBrowser) action).f68501a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            intent = new Intent("android.intent.action.VIEW", Uri.parse(link));
        } else if (action instanceof ValuatorDetailsScreenContract$Action.SendEmail) {
            String email = ((ValuatorDetailsScreenContract$Action.SendEmail) action).f68502a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(email, "email");
            intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + email));
        } else {
            if (!(action instanceof ValuatorDetailsScreenContract$Action.ShowMap)) {
                throw new NoWhenBranchMatchedException();
            }
            co3.a location = ((ValuatorDetailsScreenContract$Action.ShowMap) action).f68503a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(location, "location");
            intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + location.f25486a + "," + location.f25487b));
        }
        C1(new ExternalDestination.ByIntent(intent, null));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68505p;
    }
}
