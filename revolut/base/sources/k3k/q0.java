package k3k;

import com.revolut.chat.domain.model.ChatMessageToPass;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import ft3.h1;
import java.util.ArrayList;
import k50.j4;
import k50.s2;
import k7c.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import v20.r2;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f180784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f180785x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180785x = obj2;
        this.f180784w = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q0((t0) this.f180784w, continuation, 0);
            case 1:
                return new q0((t0) this.f180784w, (Function1) this.f180785x, continuation);
            case 2:
                return new q0((k44.c) this.f180785x, (h1) this.f180784w, continuation, 2);
            case 3:
                q0 q0Var = new q0((mii.q) this.f180784w, continuation, 3);
                q0Var.f180785x = obj2;
                return q0Var;
            case 4:
                q0 q0Var2 = new q0((n1) this.f180784w, continuation, 4);
                q0Var2.f180785x = obj2;
                return q0Var2;
            case 5:
                q0 q0Var3 = new q0((aii.r) this.f180784w, continuation, 5);
                q0Var3.f180785x = obj2;
                return q0Var3;
            case 6:
                return new q0((k4a.u) this.f180785x, (qv0.p) this.f180784w, continuation, 6);
            case 7:
                return new q0((k50.a0) this.f180785x, (y20.p) this.f180784w, continuation, 7);
            case 8:
                return new q0((j4) this.f180784w, continuation, 8);
            case 9:
                return new q0((j4) this.f180785x, (r2) this.f180784w, continuation, 9);
            case 10:
                return new q0((j4) this.f180785x, (v30.k0) this.f180784w, continuation, 10);
            case 11:
                return new q0((j4) this.f180785x, (s2) this.f180784w, continuation, 11);
            case 12:
                return new q0((j4) this.f180785x, (ChatMessageToPass) this.f180784w, continuation, 12);
            case 13:
                return new q0((j4) this.f180785x, (ArrayList) this.f180784w, continuation, 13);
            case 14:
                return new q0((k64.h) this.f180785x, (String) this.f180784w, continuation, 14);
            case 15:
                return new q0((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.f180785x, (g65.f) this.f180784w, continuation, 15);
            case 16:
                return new q0((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.f180785x, (String) this.f180784w, continuation, 16);
            case 17:
                return new q0((k6a.s) this.f180785x, (String) this.f180784w, continuation, 17);
            case 18:
                return new q0((k79.r) this.f180785x, (String) this.f180784w, continuation, 18);
            case 19:
                return new q0((k79.r) this.f180785x, (s69.d) this.f180784w, continuation, 19);
            case 20:
                return new q0((k7c.b) this.f180785x, (String) this.f180784w, continuation, 20);
            case 21:
                return new q0((k7c.k) this.f180785x, (String) this.f180784w, continuation, 21);
            case 22:
                return new q0((k7c.z) this.f180785x, (u6c.p) this.f180784w, continuation, 22);
            case 23:
                return new q0((k7c.z) this.f180785x, (u6c.h0) this.f180784w, continuation, 23);
            case 24:
                return new q0((k7c.g0) this.f180785x, (AcceptPaymentParams) this.f180784w, continuation, 24);
            case 25:
                return new q0((k7c.p0) this.f180785x, (u7c.a) this.f180784w, continuation, 25);
            case 26:
                return new q0((y0) this.f180785x, (Address) this.f180784w, continuation, 26);
            case 27:
                return new q0((y0) this.f180785x, (String) this.f180784w, continuation, 27);
            case 28:
                return new q0((ShippingContact) this.f180785x, (y0) this.f180784w, continuation, 28);
            default:
                return new q0(this.f180785x, (com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.f180784w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((q0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0533  */
    /* JADX WARN: Type inference failed for: r2v23, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3k.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180784w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(t0 t0Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f180784w = t0Var;
        this.f180785x = (gim.i) function1;
    }
}
