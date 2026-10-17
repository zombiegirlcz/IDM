package vze;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import efm.c0;
import efm.d0;
import java.util.concurrent.TimeUnit;
import jte.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nd.l;
import ng0.b;
import ni0.j;
import rd0.e;
import ufm.f;
import ufm.p;
import yze.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yze.a f293528a;

    public a(yze.a googlePayRepository) {
        Intrinsics.checkNotNullParameter(googlePayRepository, "googlePayRepository");
        this.f293528a = googlePayRepository;
    }

    public final p a(boolean z) {
        d0 fVar;
        ufm.b bVarM;
        c cVar = (c) this.f293528a;
        Boolean bool = cVar.f318096c;
        Boolean bool2 = cVar.d;
        int i = 2;
        if (!cp5.c.j(cVar.f318094a)) {
            bVarM = d0.m(Boolean.FALSE);
            if (((d) cVar.f318095b).c(TopupApi$Toggles.LogGooglePay.f90467c)) {
                Intrinsics.checkNotNullParameter("false, walletPaymentClientFactory not from Google", "<set-?>");
                Unit unit = Unit.f186387a;
            }
            Intrinsics.checkNotNullExpressionValue(bVarM, "logGooglePayIfNeeded(...)");
        } else if (z && bool2 != null) {
            bVarM = d0.m(bool2);
            if (((d) cVar.f318095b).c(TopupApi$Toggles.LogGooglePay.f90467c)) {
                Intrinsics.checkNotNullParameter("Result " + bool2, "<set-?>");
                Unit unit2 = Unit.f186387a;
            }
            Intrinsics.checkNotNullExpressionValue(bVarM, "logGooglePayIfNeeded(...)");
        } else {
            if (z || bool == null) {
                IsReadyToPayRequest.Builder internal = IsReadyToPayRequest.newBuilder();
                Intrinsics.checkNotNullExpressionValue(internal, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(internal, "<this>");
                Intrinsics.checkNotNullParameter(internal, "internal");
                int i2 = 1;
                if (z) {
                    internal.setExistingPaymentMethodRequired(true);
                } else {
                    internal.addAllowedPaymentMethod(1);
                    internal.addAllowedPaymentMethod(2);
                }
                IsReadyToPayRequest internal2 = internal.build();
                Intrinsics.checkNotNullExpressionValue(internal2, "build(...)");
                Intrinsics.checkNotNullParameter(internal2, "<this>");
                Intrinsics.checkNotNullParameter(internal2, "internal");
                l request = new l();
                j jVar = (j) cVar.e.getValue();
                jVar.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                PaymentsClient paymentsClient = jVar.f215616a;
                Intrinsics.checkNotNullParameter(request, "<this>");
                Task<Boolean> taskIsReadyToPay = paymentsClient.isReadyToPay(internal2);
                Intrinsics.checkNotNullExpressionValue(taskIsReadyToPay, "isReadyToPay(...)");
                f fVar2 = new f(e.t(taskIsReadyToPay), new yzc.a(13, new yze.b(cVar, z)), i2);
                Intrinsics.checkNotNullExpressionValue(fVar2, "doOnError(...)");
                fVar = new f(ue0.e.F(fVar2, Boolean.FALSE), new yzc.a(14, new yze.b(z, cVar)), 0);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ufm.c cVar2 = new ufm.c(new a68.f(19), i);
                c0 c0Var = hhm.f.f152430b;
                mfm.f.b(timeUnit, "unit is null");
                mfm.f.b(c0Var, "scheduler is null");
                p pVar = new p(fVar, 5L, timeUnit, c0Var, cVar2);
                Intrinsics.checkNotNullExpressionValue(pVar, "timeout(...)");
                return pVar;
            }
            bVarM = d0.m(bool);
            if (((d) cVar.f318095b).c(TopupApi$Toggles.LogGooglePay.f90467c)) {
                Intrinsics.checkNotNullParameter("Result: " + bool, "<set-?>");
                Unit unit3 = Unit.f186387a;
            }
            Intrinsics.checkNotNullExpressionValue(bVarM, "logGooglePayIfNeeded(...)");
        }
        fVar = bVarM;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ufm.c cVar22 = new ufm.c(new a68.f(19), i);
        c0 c0Var2 = hhm.f.f152430b;
        mfm.f.b(timeUnit2, "unit is null");
        mfm.f.b(c0Var2, "scheduler is null");
        p pVar2 = new p(fVar, 5L, timeUnit2, c0Var2, cVar22);
        Intrinsics.checkNotNullExpressionValue(pVar2, "timeout(...)");
        return pVar2;
    }
}
