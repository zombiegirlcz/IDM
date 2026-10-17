package nfj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ dj0.d B;
    public final /* synthetic */ EsimDataPlanOfferInfo C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f214915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f214916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f214917y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, String str2, dj0.d dVar2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, String str3, String str4, String str5, String str6, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214917y = dVar;
        this.z = str;
        this.A = str2;
        this.B = dVar2;
        this.C = esimDataPlanOfferInfo;
        this.D = str3;
        this.E = str4;
        this.F = str5;
        this.G = str6;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f214917y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation, 0);
                bVar.f214916x = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f214917y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation, 1);
                bVar2.f214916x = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
