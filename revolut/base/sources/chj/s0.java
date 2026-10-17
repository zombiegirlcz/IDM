package chj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ EsimGiftRecipient A;
    public final /* synthetic */ dej.c B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ PaymentMethod F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ j1 J;
    public final /* synthetic */ Boolean K;
    public final /* synthetic */ dj0.d L;
    public final /* synthetic */ String M;
    public final /* synthetic */ Long N;
    public int u;
    public final /* synthetic */ u0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimDataPlanOfferInfo f24300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l71.d f24301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dej.m f24302y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, EsimDataPlanOfferInfo esimDataPlanOfferInfo, l71.d dVar, dej.m mVar, String str, EsimGiftRecipient esimGiftRecipient, dej.c cVar, String str2, String str3, String str4, PaymentMethod paymentMethod, String str5, String str6, boolean z, j1 j1Var, Boolean bool, dj0.d dVar2, String str7, Long l2, Continuation continuation) {
        super(2, continuation);
        this.v = u0Var;
        this.f24300w = esimDataPlanOfferInfo;
        this.f24301x = dVar;
        this.f24302y = mVar;
        this.z = str;
        this.A = esimGiftRecipient;
        this.B = cVar;
        this.C = str2;
        this.D = str3;
        this.E = str4;
        this.F = paymentMethod;
        this.G = str5;
        this.H = str6;
        this.I = z;
        this.J = j1Var;
        this.K = bool;
        this.L = dVar2;
        this.M = str7;
        this.N = l2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.v, this.f24300w, this.f24301x, this.f24302y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objU;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u0 u0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r0 r0Var = new r0(u0Var, this.f24300w, this.f24301x, this.f24302y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, null, 1);
            this.u = 1;
            objU = do3.q.u(u0Var, r0Var, this);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objU = obj2;
        }
        u0.j3(u0Var, (nii.h) objU);
        return Unit.f186387a;
    }
}
