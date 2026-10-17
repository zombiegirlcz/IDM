package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.i implements Function2 {
    public /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Serializable F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f149657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f149658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f149659y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b6i.l lVar, long j2, xi0.b bVar, AccountWrapper accountWrapper, e0 e0Var, b6i.j jVar, OrderMode orderMode, AccountWrapper accountWrapper2, Continuation continuation) {
        super(2, continuation);
        this.E = lVar;
        this.f149657w = j2;
        this.F = bVar;
        this.C = accountWrapper;
        this.G = e0Var;
        this.H = jVar;
        this.I = orderMode;
        this.D = accountWrapper2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0((b6i.l) this.E, this.f149657w, (xi0.b) this.F, (AccountWrapper) this.C, (e0) this.G, (b6i.j) this.H, (OrderMode) this.I, (AccountWrapper) this.D, continuation);
                d0Var.A = obj2;
                return d0Var;
            default:
                return new d0((Ref$ObjectRef) this.z, this.f149657w, (nfj.d) this.A, (String) this.B, (String) this.C, (dj0.d) this.D, (EsimDataPlanOfferInfo) this.E, (String) this.F, (String) this.G, (String) this.H, (String) this.I, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ae -> B:36:0x00af). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Ref$ObjectRef ref$ObjectRef, long j2, nfj.d dVar, String str, String str2, dj0.d dVar2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, String str3, String str4, String str5, String str6, Continuation continuation) {
        super(2, continuation);
        this.z = ref$ObjectRef;
        this.f149657w = j2;
        this.A = dVar;
        this.B = str;
        this.C = str2;
        this.D = dVar2;
        this.E = esimDataPlanOfferInfo;
        this.F = str3;
        this.G = str4;
        this.H = str5;
        this.I = str6;
    }
}
