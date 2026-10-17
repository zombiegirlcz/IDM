package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import dx4.g2;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f116677w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f116678x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f116679y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, String str, long j2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116677w = q0Var;
        this.f116678x = str;
        this.f116679y = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0(this.f116677w, this.f116678x, this.f116679y, continuation, 0);
            default:
                return new p0(this.f116677w, this.f116678x, this.f116679y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xm4.f fVar;
        ?? arrayList;
        g2 g2VarJ;
        int i = this.u;
        long j2 = this.f116679y;
        String str = this.f116678x;
        q0 q0Var = this.f116677w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService = q0Var.f116683a;
                    this.v = 1;
                    obj2 = creditCardService.getRepaymentReview(str, j2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mo4.d dVar = (mo4.d) obj2;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                dj0.d dVarO = mo3.a.o(dVar.getStatementBalance());
                mo4.e revpointsInfo = dVar.getRevpointsInfo();
                if (revpointsInfo != null) {
                    Intrinsics.checkNotNullParameter(revpointsInfo, "<this>");
                    long points = revpointsInfo.getPoints();
                    String loyaltyQuoteToken = revpointsInfo.getLoyaltyQuoteToken();
                    mo4.a dialog = revpointsInfo.getDialog();
                    fVar = new xm4.f(points, dialog != null ? nx4.p.c(uc0.b.D(dialog)) : null, loyaltyQuoteToken);
                } else {
                    fVar = null;
                }
                List discounts = dVar.getDiscounts();
                if (discounts != null) {
                    List<mo4.b> list = discounts;
                    arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (mo4.b bVar : list) {
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        xi0.a aVar2 = xi0.b.Companion;
                        String currency = bVar.getCurrency();
                        aVar2.getClass();
                        arrayList.add(new xm4.a(bVar.getPoints(), new dj0.d(bVar.getAmount(), xi0.a.a(currency)), bVar.getLabel()));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = zhm.f0.f322471a;
                }
                ?? r62 = arrayList;
                nx4.d1 statementDetails = dVar.getStatementDetails();
                if (statementDetails != null) {
                    DateTimeFormatter dateTimeFormatter = nx4.o0.f220296a;
                    g2VarJ = nx4.o0.j(statementDetails, zhm.r0.g());
                } else {
                    g2VarJ = null;
                }
                mo4.a confirmationDialog = dVar.getConfirmationDialog();
                return new xm4.e(dVarO, fVar, r62, g2VarJ, confirmationDialog != null ? nx4.p.c(uc0.b.D(confirmationDialog)) : null);
            default:
                Object aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService2 = q0Var.f116683a;
                    this.v = 1;
                    obj2 = creditCardService2.validateRepaymentAmount(str, j2, this);
                    if (obj2 != aVar3) {
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                po4.a aVar4 = (po4.a) obj2;
                Intrinsics.checkNotNullParameter(aVar4, "<this>");
                String auxiliaryMessage = aVar4.getAuxiliaryMessage();
                String errorMessage = aVar4.getErrorMessage();
                boolean isError = aVar4.getIsError();
                mo4.a infoAction = aVar4.getInfoAction();
                aVar3 = new ym4.a(auxiliaryMessage, errorMessage, isError, infoAction != null ? nx4.p.c(uc0.b.D(infoAction)) : null);
                return aVar3;
        }
    }
}
