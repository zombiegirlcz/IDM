package h1k;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import efm.r;
import gzg.a0;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import sgm.e3;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends bji.b implements h {
    public final WealthAssetTypeNewsScreenContract$InputData u;
    public final m0k.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e3 f148601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final aah.h f148602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f148603y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(WealthAssetTypeNewsScreenContract$InputData inputData, m0k.e wealthNewsInteractor, e3 trendPreviewPresentationModel, aah.h wealthDisclaimersControllerModelExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(trendPreviewPresentationModel, "trendPreviewPresentationModel");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.u = inputData;
        this.v = wealthNewsInteractor;
        this.f148601w = trendPreviewPresentationModel;
        this.f148602x = wealthDisclaimersControllerModelExtension;
        this.f148603y = new g(inputData.f101867a, inputData.f101868b, null, null, null, null, null);
    }

    public final r B2(DateTime dateTime, DateTime dateTime2, int i) {
        WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData = this.u;
        return m0k.e.b(this.v, wealthAssetTypeNewsScreenContract$InputData.f101867a, wealthAssetTypeNewsScreenContract$InputData.f101868b, null, null, dateTime, dateTime2, Integer.valueOf(i), true, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        rzj.c scope;
        WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData = this.u;
        rzj.g gVar = wealthAssetTypeNewsScreenContract$InputData.f101867a.f101803a;
        boolean z = wealthAssetTypeNewsScreenContract$InputData.f101868b;
        rzj.g gVar2 = rzj.g.STOCKS;
        Continuation continuation = null;
        if (gVar == gVar2 && z) {
            scope = rzj.c.GENERAL_MARKET;
        } else if (gVar == gVar2 && !z) {
            scope = rzj.c.STOCK_MARKET;
        } else if (gVar == rzj.g.CRYPTO) {
            scope = rzj.c.CRYPTO_MARKET;
        } else if (gVar == rzj.g.COMMODITIES) {
            scope = rzj.c.COMMODITY_MARKET;
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "WealthAssetTypeNewsScreenModel", "Can't map asset type " + gVar + " to symbol scope", null, null, 16);
            scope = null;
        }
        if (scope != null) {
            e3 e3Var = this.f148601w;
            e3Var.getClass();
            Intrinsics.checkNotNullParameter(scope, "symbolScope");
            m0k.a aVar = (m0k.a) e3Var.f262806b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(scope, "scope");
            i0k.b bVar = aVar.f201154a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(scope, "scope");
            final int i = 0;
            zii.i.t(this, pd.b.r(bVar.f157411c.f(scope, false), new xw9.c(e3Var, 29)), new Function1(this) { // from class: h1k.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f148598b;

                {
                    this.f148598b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            Data it8 = (Data) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f148598b.x2(new ghg.r(it8, 29));
                            break;
                        default:
                            yhm.r rVar = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                            this.f148598b.x2(new afg.h(7, (Data) rVar.f314201a, (Data) rVar.f314202b, (Data) rVar.f314203c));
                            break;
                    }
                    return Unit.f186387a;
                }
            }, null, 14);
        }
        DateTime dateTimeWithTime = new DateTime().withTime(LocalTime.MIDNIGHT);
        final int i2 = 1;
        DateTime dateTimePlusDays = dateTimeWithTime.plusDays(1);
        DateTime dateTimeMinusDays = dateTimeWithTime.minusDays(1);
        zii.i.t(this, w.m(B2(dateTimePlusDays, dateTimeWithTime, 10), B2(dateTimeWithTime, dateTimeMinusDays, 10), B2(dateTimeMinusDays, null, 50)), new Function1(this) { // from class: h1k.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f148598b;

            {
                this.f148598b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Data it8 = (Data) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f148598b.x2(new ghg.r(it8, 29));
                        break;
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        this.f148598b.x2(new afg.h(7, (Data) rVar.f314201a, (Data) rVar.f314202b, (Data) rVar.f314203c));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, 14);
        if (wealthAssetTypeNewsScreenContract$InputData.f101867a.f101803a == gVar2) {
            int i3 = 13;
            yji.l.b1(this, nim.a.v(this.f148602x.f2828l.w0(), new a0(i3)), null, new gul.n(this, continuation, i3), 3);
        }
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.f148603y;
    }
}
