package com.revolut.feature.bank_account_switching.impl.ui.switch_out;

import com.revolut.feature.bank_account_switching.impl.ui.switch_out.BankAccountSwitchingSwitchOutFlowContract$Step;
import cp5.d;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp2.b;
import rp2.c;
import up2.f;
import wli.x;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final BankAccountSwitchingSwitchOutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f64049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sp2.a f64050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bp2.c f64051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f64052s;

    public a(BankAccountSwitchingSwitchOutFlowContract$InputData inputData, x deeplinkHandler, sp2.a confirmationScreenProvider, bp2.c switchReviewInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(confirmationScreenProvider, "confirmationScreenProvider");
        Intrinsics.checkNotNullParameter(switchReviewInteractor, "switchReviewInteractor");
        this.o = inputData;
        this.f64049p = deeplinkHandler;
        this.f64050q = confirmationScreenProvider;
        this.f64051r = switchReviewInteractor;
        this.f64052s = d.a(this, new BankAccountSwitchingSwitchOutFlowContract$Step.Review(inputData.f64044a), f0.f322471a, new rl8.d(this, 8));
    }

    public final void I2(mn2.a aVar, f fVar, String str) {
        wn2.d dVar = fVar.f281819b;
        int i = dVar == null ? -1 : rp2.d.f256250b[dVar.ordinal()];
        Continuation continuation = null;
        yki.a aVar2 = this.f64052s;
        if (i == -1) {
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Accepted Switch Request for ", aVar.name(), " but no preference is set"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
            h.D2(aVar2);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new rm6.c(this, str, continuation, 15), new yi5.b(26));
            h.D2(aVar2);
            return;
        }
        LocalDate localDate = fVar.f281820c;
        if (localDate != null) {
            h.t2(this, aVar2, new BankAccountSwitchingSwitchOutFlowContract$Step.Confirmation(this.o.f64044a, aVar, localDate), false, null, false, 12);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Accepted Switch Request for ", aVar.name(), " Full Switch but no Switch Date was present"));
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        h.D2(aVar2);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64052s;
    }
}
