package ji1;

import java.io.File;
import jni.s;
import k4a.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f174336w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f174336w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((com.revolut.feature.address.common.impl.flow.screen.find.b) this.f174336w, continuation, 0);
            case 1:
                return new m((jjd.b) this.f174336w, continuation, 1);
            case 2:
                return new m((com.revolut.feature.credit.autopay.ui.screen.amount.input.b) this.f174336w, continuation, 2);
            case 3:
                return new m((jkh.l) this.f174336w, continuation, 3);
            case 4:
                return new m((jm3.g) this.f174336w, continuation, 4);
            case 5:
                return new m((com.revolut.feature.robo.impl.ui.flow.edit_goal.f) this.f174336w, continuation, 5);
            case 6:
                return new m((s) this.f174336w, continuation, 6);
            case 7:
                return new m((com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) this.f174336w, continuation, 7);
            case 8:
                return new m((joa.i) this.f174336w, continuation, 8);
            case 9:
                return new m((job.c) this.f174336w, continuation, 9);
            case 10:
                return new m((job.e) this.f174336w, continuation, 10);
            case 11:
                return new m((jq4.n) this.f174336w, continuation, 11);
            case 12:
                return new m((com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) this.f174336w, continuation, 12);
            case 13:
                return new m((js5.e) this.f174336w, continuation, 13);
            case 14:
                return new m((ju4.q) this.f174336w, continuation, 14);
            case 15:
                return new m((jv5.e) this.f174336w, continuation, 15);
            case 16:
                return new m((com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) this.f174336w, continuation, 16);
            case 17:
                return new m((com.revolut.feature.apm.core.code.ui.a) this.f174336w, continuation, 17);
            case 18:
                return new m((jy6.m) this.f174336w, continuation, 18);
            case 19:
                return new m((jyk.g) this.f174336w, continuation, 19);
            case 20:
                return new m((jyk.r) this.f174336w, continuation, 20);
            case 21:
                return new m((jz6.o) this.f174336w, continuation, 21);
            case 22:
                return new m((jze.b) this.f174336w, continuation, 22);
            case 23:
                return new m((com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a) this.f174336w, continuation, 23);
            case 24:
                return new m((k22.f) this.f174336w, continuation, 24);
            case 25:
                return new m((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) this.f174336w, continuation, 25);
            case 26:
                return new m((u) this.f174336w, continuation, 26);
            case 27:
                return new m((File) this.f174336w, continuation, 27);
            case 28:
                return new m((k52.e) this.f174336w, continuation, 28);
            default:
                return new m((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.f174336w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:333:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05d7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
