package lr9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f199457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaymentGroup f199458c;

    public /* synthetic */ k(p pVar, PaymentGroup paymentGroup, int i) {
        this.f199456a = i;
        this.f199457b = pVar;
        this.f199458c = paymentGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f199456a) {
            case 0:
                ar9.r groupEntity = (ar9.r) obj2;
                Intrinsics.checkNotNullParameter(groupEntity, "groupEntity");
                p pVar = this.f199457b;
                d0 d0VarFirstOrError = pVar.f199467c.a(this.f199458c.f79285a).firstOrError();
                b bVar = new b(27, new llh.j(pVar, groupEntity, 21));
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, bVar, 0);
            default:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                PaymentGroup paymentGroup = this.f199458c;
                String str = paymentGroup.f79285a;
                long millis = DateTime.now().getMillis();
                p pVar2 = this.f199457b;
                long jA = r.a(pVar2.f199468g, str);
                e eVar = pVar2.f199465a;
                String str2 = paymentGroup.f79285a;
                ufm.i iVar = new ufm.i(w.H0(eVar.a(jA, str2), eVar.c(jA, str2)), new b(22, new csl.a(pVar2, paymentGroup, millis, 10)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return w.i0(iVar).v();
        }
    }
}
