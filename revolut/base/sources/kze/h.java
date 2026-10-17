package kze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l25.u;
import l97.n;
import lf6.j;
import lh9.r;
import lhi.e0;
import lhk.r0;
import lic.o;
import lig.p;
import lk6.b0;
import llh.l;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f191108w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191108w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((i) this.f191108w, continuation, 0);
            case 1:
                return new h((u) this.f191108w, continuation, 1);
            case 2:
                return new h((com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.flow.b) this.f191108w, continuation, 2);
            case 3:
                return new h((com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.c) this.f191108w, continuation, 3);
            case 4:
                return new h((n) this.f191108w, continuation, 4);
            case 5:
                return new h((com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a) this.f191108w, continuation, 5);
            case 6:
                return new h((com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) this.f191108w, continuation, 6);
            case 7:
                return new h((lc1.d) this.f191108w, continuation, 7);
            case 8:
                return new h((com.revolut.feature.apm.upi.impl.flow.b) this.f191108w, continuation, 8);
            case 9:
                return new h((j) this.f191108w, continuation, 9);
            case 10:
                return new h((r) this.f191108w, continuation, 10);
            case 11:
                return new h((c84.c) this.f191108w, continuation, 11);
            case 12:
                return new h((lhi.e) this.f191108w, continuation, 12);
            case 13:
                return new h((e0) this.f191108w, continuation, 13);
            case 14:
                return new h((r0) this.f191108w, continuation, 14);
            case 15:
                return new h((com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.a) this.f191108w, continuation, 15);
            case 16:
                return new h((com.revolut.feature.instruments.trend.collections.impl.ui.launcher.b) this.f191108w, continuation, 16);
            case 17:
                return new h((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) this.f191108w, continuation, 17);
            case 18:
                return new h((o) this.f191108w, continuation, 18);
            case 19:
                return new h((p) this.f191108w, continuation, 19);
            case 20:
                return new h((com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.a) this.f191108w, continuation, 20);
            case 21:
                return new h((ljc.r) this.f191108w, continuation, 21);
            case 22:
                return new h((com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.a) this.f191108w, continuation, 22);
            case 23:
                return new h((b0) this.f191108w, continuation, 23);
            case 24:
                return new h((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f191108w, continuation, 24);
            case 25:
                return new h((lle.b) this.f191108w, continuation, 25);
            case 26:
                return new h((llh.b) this.f191108w, continuation, 26);
            case 27:
                return new h((l) this.f191108w, continuation, 27);
            case 28:
                return new h((lnb.b) this.f191108w, continuation, 28);
            default:
                return new h((lnk.n) this.f191108w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:436:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kze.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
