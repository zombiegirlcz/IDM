package com.revolut.feature.sca_prompt.impl.flow;

import com.revolut.feature.sca_prompt.impl.flow.ScaPromptFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import isc.c;
import isc.e;
import isc.f;
import isc.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vrc.j;
import yki.i;
import zhm.q0;
import zrc.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements e {

    @NotNull
    public static final g Companion = new g();
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f85344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f85345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dsc.a f85346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l61.a f85347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f85348t;

    public b(f inputData, d cryptoScaInteractor, c scaPromptDialogFactory, dsc.a dependenciesProvider, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(scaPromptDialogFactory, "scaPromptDialogFactory");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = inputData;
        this.f85344p = cryptoScaInteractor;
        this.f85345q = scaPromptDialogFactory;
        this.f85346r = dependenciesProvider;
        this.f85347s = userCompanyInteractor;
        this.f85348t = d8l.d.a(this, new in1.a(this, 12));
    }

    public final void I2(isc.h hVar) {
        if (this.o.f168178b != null) {
            C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("SCA_PROMPT_EXTRA_IS_SUCCESS", Boolean.valueOf(hVar.b()))), null, 4)));
        } else {
            C2(new j(hVar.b(), hVar.a()));
        }
    }

    public final void J2() {
        int i = isc.i.f168180a[this.o.f168179c.ordinal()];
        if (i == 1) {
            I2(isc.h.DECLINED);
            Unit unit = Unit.f186387a;
            return;
        }
        i iVar = this.f85348t;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (i == 2) {
            h.w2(iVar, ScaPromptFlowContract$Step.AreYouSureDialog.f85340a, bottom_dialog);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(iVar, ScaPromptFlowContract$Step.WarningDialog.f85343a, bottom_dialog);
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85348t;
    }
}
