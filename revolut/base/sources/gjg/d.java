package gjg;

import com.revolut.data.model.Data;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import com.revolut.rxdata.core.CompositeException;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f144279b;

    public /* synthetic */ d(j jVar, int i) {
        this.f144278a = i;
        this.f144279b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144278a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                List list = (List) data.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                List list2 = (List) data2.getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                boolean loading = data.getLoading();
                boolean loading2 = data2.getLoading();
                this.f144279b.getClass();
                Throwable error = data.getError();
                Throwable error2 = data2.getError();
                return new TrustedMerchantsFlowContract$MerchantsContent(list, list2, loading, loading2, (error == null || error2 == null) ? error == null ? error2 : error : new CompositeException(v.k(error, error2)));
            case 1:
                TrustedMerchantsFlowContract$MerchantsContent content = (TrustedMerchantsFlowContract$MerchantsContent) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                l lVar = (l) this.f144279b.e;
                return w.z0(lVar.f144291b.getValue(lVar, l.f144290c[0]), content);
            case 2:
                f action = (f) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                j jVar = this.f144279b;
                yig.a aVar = jVar.f144286b;
                String merchantId = action.f144282a;
                bjg.f fVar = (bjg.f) aVar;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(merchantId, "merchantId");
                pfm.a aVarE = w.g0(fVar.f15668a.approveMerchant(merchantId, null)).h(sjg.a.b(jVar.f144287c)).e(jVar.j3());
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            default:
                g action2 = (g) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                j jVar2 = this.f144279b;
                yig.a aVar2 = jVar2.f144286b;
                String merchantId2 = action2.f144283a;
                bjg.f fVar2 = (bjg.f) aVar2;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(merchantId2, "merchantId");
                pfm.a aVarE2 = w.g0(fVar2.f15668a.disapproveMerchant(merchantId2)).h(sjg.a.b(jVar2.f144287c)).e(jVar2.j3());
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
        }
    }
}
