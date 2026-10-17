package kce;

import com.revolut.data.model.Data;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import e8e.t;
import efm.d0;
import io.reactivex.exceptions.CompositeException;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.u;
import te0.w;
import tof.s9;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f182705b;

    public /* synthetic */ d(q qVar, int i) {
        this.f182704a = i;
        this.f182705b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable error;
        switch (this.f182704a) {
            case 0:
                qua.p subscription = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                Set set = subscription.G;
                if (u.E(subscription) && set != null) {
                    return new ufm.i(ue0.e.F(com.revolut.domain.interactors.transactions.a.b(this.f182705b.f182712b, new s9(set), null, null, null, null, 30), f0.f322471a), new c(new t(subscription, 1), 4), 1);
                }
                ufm.b bVarM = d0.m(new RecurringPaymentWithExtra.General(subscription));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                Data data = (Data) hVar.f288433a;
                xi0.b bVar = (xi0.b) hVar.f288434b;
                Data data2 = (Data) hVar.f288435c;
                Data data3 = (Data) hVar.d;
                boolean z = data.getLoading() || data2.getLoading();
                if (data.getError() == null || data2.getError() == null) {
                    error = data.getError();
                    if (error == null) {
                        error = data2.getError();
                    }
                } else {
                    error = new CompositeException(v.k(data.getError(), data2.getError()));
                }
                Throwable th10 = error;
                if (data.getContent() == null || data2.getContent() == null) {
                    return w.h(new Data(null, th10, z));
                }
                Object content = data.getContent();
                Intrinsics.h(content);
                b9e.e eVar = (b9e.e) content;
                Object content2 = data2.getContent();
                Intrinsics.h(content2);
                return this.f182705b.g(bVar, eVar).map(new k64.a(27, new e(data3, bVar, eVar, (List) content2, th10, z)));
        }
    }
}
