package a31;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f995y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, qua.p pVar, TransferReasonsValues transferReasonsValues, String str, String str2, String str3, Map map, String str4, Continuation continuation) {
        super(2, continuation);
        this.z = xVar;
        this.A = pVar;
        this.B = transferReasonsValues;
        this.f993w = str;
        this.f994x = str2;
        this.f995y = str3;
        this.D = map;
        this.C = str4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v((x) this.z, (qua.p) this.A, (TransferReasonsValues) this.B, (String) this.f993w, (String) this.f994x, (String) this.f995y, (Map) this.D, (String) this.C, continuation);
            case 1:
                return new v((akl.k) this.z, (cjl.s) this.A, (String) this.f993w, (String) this.f994x, (Set) this.B, (Set) this.C, (Boolean) this.D, (String) this.f995y, continuation);
            case 2:
                return new v((id1.n) this.z, (String) this.f993w, (String) this.f994x, (String) this.f995y, (dj0.d) this.A, (String) this.C, (cd1.j) this.B, (String) this.D, continuation);
            case 3:
                v vVar = new v((jtj.k) this.A, (List) this.B, (IncomeSorterDestinationId) this.f995y, (hzi.a) this.C, (String) this.f993w, (Boolean) this.D, (String) this.f994x, continuation);
                vVar.z = obj2;
                return vVar;
            default:
                v vVar2 = new v((com.revolut.feature.tax_residency.impl.screens.list.a) this.D, continuation);
                vVar2.C = obj2;
                return vVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(akl.k kVar, cjl.s sVar, String str, String str2, Set set, Set set2, Boolean bool, String str3, Continuation continuation) {
        super(2, continuation);
        this.z = kVar;
        this.A = sVar;
        this.f993w = str;
        this.f994x = str2;
        this.B = set;
        this.C = set2;
        this.D = bool;
        this.f995y = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.tax_residency.impl.screens.list.a aVar, Continuation continuation) {
        super(2, continuation);
        this.D = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(id1.n nVar, String str, String str2, String str3, dj0.d dVar, String str4, cd1.j jVar, String str5, Continuation continuation) {
        super(2, continuation);
        this.z = nVar;
        this.f993w = str;
        this.f994x = str2;
        this.f995y = str3;
        this.A = dVar;
        this.C = str4;
        this.B = jVar;
        this.D = str5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(jtj.k kVar, List list, IncomeSorterDestinationId incomeSorterDestinationId, hzi.a aVar, String str, Boolean bool, String str2, Continuation continuation) {
        super(2, continuation);
        this.A = kVar;
        this.B = list;
        this.f995y = incomeSorterDestinationId;
        this.C = aVar;
        this.f993w = str;
        this.D = bool;
        this.f994x = str2;
    }
}
