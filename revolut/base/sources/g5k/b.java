package g5k;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dsh.e f140799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f140800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f140801y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dsh.e eVar, c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f140799w = eVar;
        this.f140800x = cVar;
        this.f140801y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f140799w, this.f140800x, this.f140801y, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r1.emit(r7, r17) == r2) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.v
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.u
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L25
            if (r3 == r4) goto L1f
            if (r3 != r5) goto L17
            yhm.o.b(r18)
            goto L7a
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r18)
            r3 = r18
            goto L41
        L25:
            yhm.o.b(r18)
            dsh.e r3 = r0.f140799w
            java.lang.String r7 = "countryCode"
            java.lang.String r3 = r3.a(r7)
            if (r3 == 0) goto L7d
            g5k.c r7 = r0.f140800x
            fkg.a r7 = r7.d
            r0.v = r1
            r0.u = r4
            java.lang.Object r3 = r7.p(r3, r0)
            if (r3 != r2) goto L41
            goto L79
        L41:
            r15 = r3
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r15 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData) r15
            com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate$Model r7 = new com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate$Model
            com.revolut.core.ui_kit_core.displayers.image.models.CountryImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.CountryImage
            wi0.b r3 = r15.f101977a
            java.lang.String r3 = r3.f297794a
            r8 = 14
            r9.<init>(r3, r6, r6, r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_send_header_title
            r12.<init>(r3, r6, r6, r8)
            com.revolut.core.ui_kit.delegates.widgets.d3 r13 = new com.revolut.core.ui_kit.delegates.widgets.d3
            com.revolut.core.ui_kit.delegates.widgets.e3 r3 = new com.revolut.core.ui_kit.delegates.widgets.e3
            int r8 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_arrow_up
            r3.<init>(r8, r4)
            r4 = 6
            r13.<init>(r3, r6, r4)
            r14 = 0
            r16 = 332(0x14c, float:4.65E-43)
            java.lang.String r8 = r0.f140801y
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.v = r6
            r0.u = r5
            java.lang.Object r1 = r1.emit(r7, r0)
            if (r1 != r2) goto L7a
        L79:
            return r2
        L7a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L7d:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r1 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r2 = 3
            r1.<init>(r6, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5k.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
