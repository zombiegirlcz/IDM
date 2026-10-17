package k47;

import com.revolut.feature.statements.impl.services.StatementsService;
import efm.d0;
import gim.i;
import iuf.y;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import nii.g;
import oyd.e;
import oyd.q;
import pfm.h;
import ryd.w;
import uyd.h0;
import uyd.z;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ Set A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c f180841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LocalDate f180842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LocalDate f180843y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar, LocalDate localDate, LocalDate localDate2, Set set, Set set2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f180841w = cVar;
        this.f180842x = localDate;
        this.f180843y = localDate2;
        this.z = set;
        this.A = set2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f180841w, this.f180842x, this.f180843y, this.z, this.A, continuation, 0);
            default:
                return new d(this.f180841w, this.f180842x, this.f180843y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar;
        Object objV;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    w wVar = (w) this.f180841w.f74397p;
                    wVar.getClass();
                    LocalDate fromDate = this.f180842x;
                    Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                    LocalDate toDate = this.f180843y;
                    Intrinsics.checkNotNullParameter(toDate, "toDate");
                    Set currencies = this.z;
                    Intrinsics.checkNotNullParameter(currencies, "currencies");
                    Set excludeTransactionIds = this.A;
                    Intrinsics.checkNotNullParameter(excludeTransactionIds, "excludeTransactionIds");
                    h0 h0Var = (h0) wVar.f258357a;
                    h0Var.getClass();
                    Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                    Intrinsics.checkNotNullParameter(toDate, "toDate");
                    Intrinsics.checkNotNullParameter(currencies, "currencies");
                    Intrinsics.checkNotNullParameter(excludeTransactionIds, "excludeTransactionIds");
                    StatementsService statementsService = h0Var.f284188a;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
                    String str = fromDate.format(dateTimeFormatter);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    String str2 = toDate.format(dateTimeFormatter);
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = currencies.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((xi0.b) it8.next()).f306286a);
                    }
                    d0<q> proTaxAccountStatement = statementsService.getProTaxAccountStatement(new e(str, str2, arrayList, zhm.d0.d1(excludeTransactionIds)));
                    z zVar = new z(10, new ux7.i(1, h0Var.f284189b, syd.a.class, "toDomain", "toDomain(Lcom/revolut/feature/statements/impl/dto/StatementUrlStateDto;)Lcom/revolut/feature/statements/api/models/StatementUrlState;", 0, 5));
                    proTaxAccountStatement.getClass();
                    ufm.i iVar = new ufm.i(proTaxAccountStatement, zVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    h hVar = new h(te0.w.i0(iVar), 4);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromSingle(...)");
                    this.v = 1;
                    if (nim.a.a(hVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar2 = this.f180841w;
                if (i2 == 0) {
                    o.b(obj2);
                    y yVar = new y(cVar2, 5);
                    a3b.h hVar2 = new a3b.h(cVar2, 29);
                    d dVar = new d(cVar2, this.f180842x, this.f180843y, this.z, this.A, null, 0);
                    cVar = cVar2;
                    this.v = 1;
                    objV = k.V(cVar, null, hVar2, yVar, dVar, this, 1);
                    if (objV == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objV = obj2;
                    cVar = cVar2;
                }
                if (((nii.h) objV) instanceof g) {
                    cVar.C2(c.f180840a);
                    oki.h.D2(cVar.f74400s);
                }
                return Unit.f186387a;
        }
    }
}
