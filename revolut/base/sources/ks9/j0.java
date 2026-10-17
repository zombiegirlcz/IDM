package ks9;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ g6 A;
    public final /* synthetic */ do3.n B;
    public skm.h0 u;
    public hr9.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f189333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f189334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n0 f189335y;
    public final /* synthetic */ PaymentGroup z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, PaymentGroup paymentGroup, g6 g6Var, do3.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f189335y = n0Var;
        this.z = paymentGroup;
        this.A = g6Var;
        this.B = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.f189335y, this.z, this.A, this.B, continuation);
        j0Var.f189334x = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (nim.a.a(r1, r16) == r2) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
