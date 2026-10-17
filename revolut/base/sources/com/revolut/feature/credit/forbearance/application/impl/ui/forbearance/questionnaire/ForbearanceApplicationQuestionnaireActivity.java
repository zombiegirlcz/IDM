package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire;

import android.os.Bundle;
import b05.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire.ForbearanceApplicationQuestionnaireActivity;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire.ForbearanceApplicationQuestionnaireContract$Configuration;
import com.revolut.retail.common.ui.R$id;
import d05.a;
import grl.k9;
import hqi.i;
import hqi.k;
import iqi.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import qc0.b;
import xpi.f;
import yhm.j;
import zc0.h;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/questionnaire/ForbearanceApplicationQuestionnaireActivity;", "Lqc0/b;", "Lqc0/i;", "Lqc0/l;", "<init>", "()V", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForbearanceApplicationQuestionnaireActivity extends b {
    public static final /* synthetic */ int K0 = 0;
    public final AnalyticsProduct.Retail G0;
    public final Lazy H0;
    public final Lazy I0;
    public a J0;

    public ForbearanceApplicationQuestionnaireActivity() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.G0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
        final int i = 0;
        this.H0 = j.b(new Function0(this) { // from class: c05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForbearanceApplicationQuestionnaireActivity f20165b;

            {
                this.f20165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ForbearanceApplicationQuestionnaireActivity forbearanceApplicationQuestionnaireActivity = this.f20165b;
                switch (i2) {
                    case 0:
                        int i3 = ForbearanceApplicationQuestionnaireActivity.K0;
                        return (ForbearanceApplicationQuestionnaireContract$Configuration) forbearanceApplicationQuestionnaireActivity.G0();
                    default:
                        int i5 = ForbearanceApplicationQuestionnaireActivity.K0;
                        return ((ForbearanceApplicationQuestionnaireContract$Configuration) forbearanceApplicationQuestionnaireActivity.H0.getValue()).f69944a.f51308a;
                }
            }
        });
        final int i2 = 1;
        this.I0 = j.b(new Function0(this) { // from class: c05.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForbearanceApplicationQuestionnaireActivity f20165b;

            {
                this.f20165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ForbearanceApplicationQuestionnaireActivity forbearanceApplicationQuestionnaireActivity = this.f20165b;
                switch (i22) {
                    case 0:
                        int i3 = ForbearanceApplicationQuestionnaireActivity.K0;
                        return (ForbearanceApplicationQuestionnaireContract$Configuration) forbearanceApplicationQuestionnaireActivity.G0();
                    default:
                        int i5 = ForbearanceApplicationQuestionnaireActivity.K0;
                        return ((ForbearanceApplicationQuestionnaireContract$Configuration) forbearanceApplicationQuestionnaireActivity.H0.getValue()).f69944a.f51308a;
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.J0;
        if (aVar != null) {
            return aVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85962s0() {
        return (String) this.I0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.J0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.G0;
    }

    @Override // qc0.b
    public final h Z0() {
        a aVar = this.J0;
        if (aVar != null) {
            return aVar.j();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // qc0.b, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c cVar = (c) ((d05.b) com.bumptech.glide.c.l(this).b(null, getF85962s0())).a().h(rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container)));
        Lazy lazy = this.H0;
        ForbearanceApplicationQuestionnaireContract$Configuration forbearanceApplicationQuestionnaireContract$Configuration = (ForbearanceApplicationQuestionnaireContract$Configuration) lazy.getValue();
        switch (cVar.f11568a) {
            case 0:
                forbearanceApplicationQuestionnaireContract$Configuration.getClass();
                cVar.f11571g = forbearanceApplicationQuestionnaireContract$Configuration;
                break;
            default:
                forbearanceApplicationQuestionnaireContract$Configuration.getClass();
                cVar.f11571g = forbearanceApplicationQuestionnaireContract$Configuration;
                break;
        }
        c cVar2 = (c) cVar.g(new i(Integer.valueOf(com.revolut.core.backend_flow.R$id.toolbar_progress), k.a.f154719a));
        f.Companion.getClass();
        c cVar3 = (c) cVar2.k();
        ypi.h.Companion.getClass();
        a aVar = (a) ((c) ((c) cVar3.b(ypi.h.a(ypi.h.e, null, Integer.valueOf(com.revolut.core.backend_flow.R$id.bottom_note_text), 3))).a(new g(R$id.twinVerticalButton))).build();
        this.J0 = aVar;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        aVar.D(this);
        if (bundle == null) {
            a aVar2 = this.J0;
            if (aVar2 == null) {
                Intrinsics.r("component");
                throw null;
            }
            aVar2.getFlowState().b0().set(((ForbearanceApplicationQuestionnaireContract$Configuration) lazy.getValue()).f69945b);
        }
        super.onCreate(bundle);
    }
}
