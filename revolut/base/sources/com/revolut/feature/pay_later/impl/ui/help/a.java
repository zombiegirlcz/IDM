package com.revolut.feature.pay_later.impl.ui.help;

import ang.f;
import com.revolut.feature.pay_later.api.navigation.RightToCancelDescriptor;
import com.revolut.feature.pay_later.impl.ui.help.PayLaterGetHelpDialogFactory;
import com.revolut.kompot.common.ControllerDestination;
import di9.b;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import ux4.l;
import ux4.m;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f15.a f78877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PayLaterGetHelpDialogFactory f78878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f78879n;
    public final xh9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f78880p;

    public a(f15.a getCreditHelpExtension, PayLaterGetHelpDialogFactory dialogFactory, gte.a featureToggleInteractor, xh9.a payLaterInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f78877l = getCreditHelpExtension;
        this.f78878m = dialogFactory;
        this.f78879n = featureToggleInteractor;
        this.o = payLaterInteractor;
        this.f78880p = userInteractor;
    }

    @Override // f15.a
    public final void O(m helpRequest) {
        Intrinsics.checkNotNullParameter(helpRequest, "helpRequest");
        this.f78877l.O(helpRequest);
    }

    @Override // f15.a
    public final boolean O1(p parcelItem) {
        Intrinsics.checkNotNullParameter(parcelItem, "parcelItem");
        Object f52567m = parcelItem.getF();
        if (!(f52567m instanceof PayLaterGetHelpDialogFactory.CancelContract)) {
            return this.f78877l.O1(parcelItem);
        }
        A2(new ControllerDestination.Stack(new RightToCancelDescriptor(((PayLaterGetHelpDialogFactory.CancelContract) f52567m).f78876a.f283871a), null, true));
        return true;
    }

    @Override // f15.a
    public final l a1(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return this.f78877l.a1(countryCode);
    }

    @Override // f15.a
    public final void y(String str) {
        this.f78877l.y(str);
    }
}
