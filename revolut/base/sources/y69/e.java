package y69;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import gim.i;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import tof.a3;
import tof.t3;
import ys7.h;
import z20.q;
import zkf.p;
import zuh.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f311238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f311239x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f311239x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                e eVar = new e((f) this.f311239x, (Continuation) obj4, 0);
                eVar.v = (Data) obj2;
                eVar.f311238w = (Map) obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            case 1:
                e eVar2 = new e((y9d.e) this.f311239x, (Continuation) obj4, 1);
                eVar2.v = (String) obj2;
                eVar2.f311238w = (InvoiceTemplate) obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
            case 2:
                e eVar3 = new e((yr3.b) this.f311239x, (Continuation) obj4, 2);
                eVar3.v = (yr3.a) obj2;
                eVar3.f311238w = (List) obj3;
                return eVar3.invokeSuspend(Unit.f186387a);
            case 3:
                e eVar4 = new e((h) this.f311239x, (Continuation) obj4, 3);
                eVar4.v = (ys7.f) obj2;
                eVar4.f311238w = (os7.a) obj3;
                return eVar4.invokeSuspend(Unit.f186387a);
            case 4:
                e eVar5 = new e((Function2) this.f311239x, (Continuation) obj4, 4);
                eVar5.v = (Data) obj2;
                eVar5.f311238w = (Set) obj3;
                return eVar5.invokeSuspend(Unit.f186387a);
            case 5:
                e eVar6 = new e((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) this.f311239x, (Continuation) obj4, 5);
                eVar6.v = (Data) obj2;
                eVar6.f311238w = (String) obj3;
                return eVar6.invokeSuspend(Unit.f186387a);
            case 6:
                e eVar7 = new e((q) this.f311239x, (Continuation) obj4, 6);
                eVar7.v = (Data) obj2;
                eVar7.f311238w = (List) obj3;
                return eVar7.invokeSuspend(Unit.f186387a);
            case 7:
                e eVar8 = new e((com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.f311239x, (Continuation) obj4, 7);
                eVar8.v = (Data) obj2;
                eVar8.f311238w = (Data) obj3;
                return eVar8.invokeSuspend(Unit.f186387a);
            case 8:
                e eVar9 = new e((p) this.f311239x, (Continuation) obj4, 8);
                eVar9.v = (t3) obj2;
                eVar9.f311238w = (a3) obj3;
                return eVar9.invokeSuspend(Unit.f186387a);
            case 9:
                e eVar10 = new e((zue.a) this.f311239x, (Continuation) obj4, 9);
                eVar10.v = (String) obj2;
                eVar10.f311238w = (so6.a) obj3;
                return eVar10.invokeSuspend(Unit.f186387a);
            case 10:
                e eVar11 = new e((o) this.f311239x, (Continuation) obj4, 10);
                eVar11.v = (pil.a) obj2;
                eVar11.f311238w = (ApplicableDocuments) obj3;
                return eVar11.invokeSuspend(Unit.f186387a);
            default:
                e eVar12 = new e((zwk.a) this.f311239x, (Continuation) obj4, 11);
                eVar12.v = (List) obj2;
                eVar12.f311238w = (List) obj3;
                return eVar12.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 3386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y69.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
