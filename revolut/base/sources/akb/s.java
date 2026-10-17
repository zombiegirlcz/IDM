package akb;

import akf.s1;
import akl.b0;
import akl.e1;
import aqh.v;
import as1.a0;
import au6.e0;
import au6.k1;
import au6.r1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5783w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5783w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.f5783w, continuation, 0);
            case 1:
                return new s((s1) this.f5783w, continuation, 1);
            case 2:
                return new s((b0) this.f5783w, continuation, 2);
            case 3:
                return new s((e1) this.f5783w, continuation, 3);
            case 4:
                return new s((com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a) this.f5783w, continuation, 4);
            case 5:
                return new s((ald.h) this.f5783w, continuation, 5);
            case 6:
                return new s((com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a) this.f5783w, continuation, 6);
            case 7:
                return new s((ang.f) this.f5783w, continuation, 7);
            case 8:
                return new s((anh.o) this.f5783w, continuation, 8);
            case 9:
                return new s((anl.i) this.f5783w, continuation, 9);
            case 10:
                s sVar = new s((v) this.f5783w, continuation, 10);
                sVar.v = ((Number) obj2).intValue();
                return sVar;
            case 11:
                return new s((com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a) this.f5783w, continuation, 11);
            case 12:
                return new s((com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) this.f5783w, continuation, 12);
            case 13:
                return new s((com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) this.f5783w, continuation, 13);
            case 14:
                return new s((arf.l) this.f5783w, continuation, 14);
            case 15:
                return new s((a0) this.f5783w, continuation, 15);
            case 16:
                return new s((atk.l) this.f5783w, continuation, 16);
            case 17:
                return new s((au6.f) this.f5783w, continuation, 17);
            case 18:
                return new s((au6.v) this.f5783w, continuation, 18);
            case 19:
                return new s((e0) this.f5783w, continuation, 19);
            case 20:
                return new s((k1) this.f5783w, continuation, 20);
            case 21:
                return new s((r1) this.f5783w, continuation, 21);
            case 22:
                return new s((aw.k) this.f5783w, continuation, 22);
            case 23:
                return new s((aw.r) this.f5783w, continuation, 23);
            case 24:
                return new s((ProducerScope) this.f5783w, continuation, 24);
            case 25:
                return new s((aw1.q) this.f5783w, continuation, 25);
            case 26:
                return new s((aw7.l) this.f5783w, continuation, 26);
            case 27:
                return new s((awd.c) this.f5783w, continuation, 27);
            case 28:
                return new s((com.revolut.feature.payments.profile.impl.ui_kompot.scanner.f) this.f5783w, continuation, 28);
            default:
                return new s((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a) this.f5783w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 10:
                break;
        }
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:485:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akb.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
