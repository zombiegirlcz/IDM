package du8;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.kyc.api.R$plurals;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.KycScreenContract$KycDocsStatus;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import cu8.d1;
import cu8.g1;
import cu8.i1;
import cu8.k1;
import cu8.n1;
import cu8.s0;
import cu8.u0;
import efm.d0;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import my8.q;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import rfm.f0;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements um.b, g3l.d {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f117949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.kyc.impl.errorhandling.d f117950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3l.a f117951c;
    public final v60.e d;

    public i(i1 kycRouter, com.revolut.feature.kyc.impl.errorhandling.d kycServerErrorParser, g3l.a statusDialogViewConfiguration, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(kycRouter, "kycRouter");
        Intrinsics.checkNotNullParameter(kycServerErrorParser, "kycServerErrorParser");
        Intrinsics.checkNotNullParameter(statusDialogViewConfiguration, "statusDialogViewConfiguration");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f117949a = kycRouter;
        this.f117950b = kycServerErrorParser;
        this.f117951c = statusDialogViewConfiguration;
        this.d = serverErrorsProvider;
    }

    public static efm.b c(k3l.j jVar, Function0 function0) throws Throwable {
        if (jVar instanceof k3l.h) {
            return (efm.b) function0.invoke();
        }
        boolean z = jVar instanceof k3l.g;
        m mVar = m.f235744a;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(jVar instanceof k3l.i) && !(jVar instanceof k3l.f)) {
            throw new NoWhenBranchMatchedException();
        }
        hx7.e.n(new IllegalStateException(a0.d.r(o0.f186429a.b(jVar.getClass()).m(), " is not handled")));
        return mVar;
    }

    @Override // um.b
    public final d0 a(um.a errorData) throws IOException {
        efm.b bVarC0;
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        mm.a aVar = errorData.f281172a;
        if (!Intrinsics.f(aVar, d1.f108833a) && !Intrinsics.f(aVar, k1.f108851a)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        rw8.h hVarB = this.f117950b.b(errorData.f281173b);
        if (hVarB == null) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        boolean z = hVarB instanceof rw8.c;
        i1 i1Var = this.f117949a;
        if (z) {
            rw8.b bVar = (rw8.b) zhm.d0.a0(((rw8.c) hVarB).f257847b);
            q kycProvider = q.ONFIDO;
            my8.k kycConsent = bVar.f257844a;
            String str = bVar.f257845b;
            com.revolut.feature.kyc.impl.f fVar = (com.revolut.feature.kyc.impl.f) i1Var;
            g1 g1Var = fVar.f77669c;
            Intrinsics.checkNotNullParameter(kycProvider, "kycProvider");
            Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
            if (kycConsent == my8.k.INCODE_DOCUMENT_PROCESSING) {
                n1 n1Var = (n1) ((com.revolut.feature.kyc.impl.b) g1Var).e;
                bVarC0 = w.z0(n1Var.A0(), new KycScreenContract$Step.IncodeDocumentProcessingConsent((wi0.b) n1Var.y0().get(), (KycScreenContract$Step) n1Var.A0().get()));
            } else {
                d0 d0VarFirstOrError = ((com.revolut.feature.kyc.impl.b) g1Var).s3().firstOrError();
                u0 u0Var = new u0(3, new a5b.b((Object) fVar, (Object) kycConsent, str, (Enum) kycProvider, 21));
                d0VarFirstOrError.getClass();
                pfm.a aVar2 = new pfm.a(d0VarFirstOrError, u0Var, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                bVarC0 = aVar2;
            }
        } else {
            boolean z3 = hVarB instanceof rw8.g;
            KycScreenContract$KycDocsStatus.FailedUnrecoverable failedUnrecoverable = KycScreenContract$KycDocsStatus.FailedUnrecoverable.f77554a;
            g3l.a aVar3 = this.f117951c;
            if (z3) {
                bVarC0 = aVar3.c0(new StatusViewConfiguration.Error("retry_dialog_id", new TextLocalisedClause(R$string.kyc_document_error_modal_title, null, null, 14), new TextLocalisedClause(R$string.kyc_document_error_modal_description_scan, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, failedUnrecoverable, null, 8112));
            } else if (hVarB instanceof rw8.a) {
                bVarC0 = aVar3.c0(new StatusViewConfiguration.Error("COMMON_ERROR_STATUS_VIEW_CONFIGURATION_ID", new TextLocalisedClause(R$string.common_error_something_went_wrong, null, null, 14), null, null, null, null, null, 8188));
            } else if (hVarB instanceof rw8.f) {
                bVarC0 = aVar3.c0(new StatusViewConfiguration.Error("timeframe_retry_dialog_id", new TextLocalisedClause(R$string.kyc_document_error_timeframe_modal_title, null, null, 14), new TextLocalisedClause(R$string.kyc_document_error_timeframe_modal_description, u.c(new TextLocalisedQuantityClause(R$plurals.kyc_document_error_timeframe_modal_description_duration_minutes, Integer.valueOf(((rw8.f) hVarB).f257851b), (List) null, (Style) null, 28)), null, 12), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, failedUnrecoverable, null, 8112));
            } else if (hVarB instanceof rw8.d) {
                com.revolut.feature.kyc.impl.f fVar2 = (com.revolut.feature.kyc.impl.f) i1Var;
                fVar2.getClass();
                pfm.h hVar = new pfm.h(new s0(fVar2, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                bVarC0 = hVar;
            } else {
                if (!(hVarB instanceof rw8.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                v60.c cVarB = ((ao0.a) this.d).b(Integer.valueOf(((rw8.e) hVarB).f257849a));
                bVarC0 = aVar3.c0(new StatusViewConfiguration.Error("retry_dialog_id", new TextLocalisedClause(R$string.kyc_document_error_modal_title, null, null, 14), cVarB != null ? ofm.q.O(cVarB) : new TextLocalisedClause(R$string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, KycScreenContract$KycDocsStatus.FailedRecoverable.f77553a, null, 8112));
            }
        }
        f0 f0VarF = bVarC0.f(d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) throws Throwable {
        efm.b bVarC;
        Intrinsics.checkNotNullParameter(result, "result");
        Parcelable f = result.a().getF();
        if (!(f instanceof KycScreenContract$KycDocsStatus)) {
            return d0.m(Boolean.FALSE);
        }
        KycScreenContract$KycDocsStatus kycScreenContract$KycDocsStatus = (KycScreenContract$KycDocsStatus) f;
        if (kycScreenContract$KycDocsStatus instanceof KycScreenContract$KycDocsStatus.Completed) {
            bVarC = ((com.revolut.feature.kyc.impl.f) this.f117949a).m3();
        } else if (kycScreenContract$KycDocsStatus instanceof KycScreenContract$KycDocsStatus.FailedUnrecoverable) {
            final int i = 0;
            bVarC = c(result, new Function0(this) { // from class: du8.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f117948b;

                {
                    this.f117948b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return (pfm.h) ((com.revolut.feature.kyc.impl.b) ((com.revolut.feature.kyc.impl.f) this.f117948b.f117949a).f77669c).f77569g.c0(d1.f108833a);
                        default:
                            return (pfm.h) ((com.revolut.feature.kyc.impl.b) ((com.revolut.feature.kyc.impl.f) this.f117948b.f117949a).f77669c).f77569g.c0(k1.f108851a);
                    }
                }
            });
        } else {
            if (!(kycScreenContract$KycDocsStatus instanceof KycScreenContract$KycDocsStatus.FailedRecoverable)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i2 = 1;
            bVarC = c(result, new Function0(this) { // from class: du8.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f117948b;

                {
                    this.f117948b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            return (pfm.h) ((com.revolut.feature.kyc.impl.b) ((com.revolut.feature.kyc.impl.f) this.f117948b.f117949a).f77669c).f77569g.c0(d1.f108833a);
                        default:
                            return (pfm.h) ((com.revolut.feature.kyc.impl.b) ((com.revolut.feature.kyc.impl.f) this.f117948b.f117949a).f77669c).f77569g.c0(k1.f108851a);
                    }
                }
            });
        }
        return bVarC.f(d0.m(Boolean.TRUE));
    }

    @Override // um.b
    public final int getLevel() {
        return 10000;
    }
}
