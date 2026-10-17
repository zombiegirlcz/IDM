package msk;

import boh.f;
import com.revolut.data.model.Data;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$StockDetailsAirTips;
import e5d.e;
import go.g;
import jte.d;
import k18.c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l5d.i;
import n0c.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ek1.a f208678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jt0.b f208679c;

    public b(String ref2, ek1.a learnAirTipInteractor, jt0.b smartNotificationFeedInteractor) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(learnAirTipInteractor, "learnAirTipInteractor");
        Intrinsics.checkNotNullParameter(smartNotificationFeedInteractor, "smartNotificationFeedInteractor");
        this.f208677a = ref2;
        this.f208678b = learnAirTipInteractor;
        this.f208679c = smartNotificationFeedInteractor;
    }

    @Override // e5d.e
    public final Object a(d5d.a aVar, i iVar) {
        Object objA;
        d5d.b bVar = aVar.f;
        nsk.a aVar2 = bVar instanceof nsk.a ? (nsk.a) bVar : null;
        if (aVar2 == null) {
            return Unit.f186387a;
        }
        String str = aVar2.f218903a;
        yj1.e eVar = aVar2.f218904b;
        ek1.a aVar3 = this.f208678b;
        if (!aVar3.f126923c.add(str) || (objA = aVar3.f126922b.a(str, eVar, iVar)) != fim.a.COROUTINE_SUSPENDED) {
            objA = Unit.f186387a;
        }
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // e5d.e
    public final Flow c() {
        Flow gVar;
        String ref2 = this.f208677a;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jt0.b bVar = this.f208679c;
        if (((d) ((gte.a) bVar.f178265b)).c(InvestSmartNotificationsApi$Toggles$StockDetailsAirTips.f76419c)) {
            c cVar = (c) bVar.f178266c;
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            gVar = nim.a.v(nim.a.v(((x4l.c) cVar.f180141c).b(ref2, loadingStrategy), new k0d.c(cVar, 3)), new o(23));
        } else {
            od0.i.Companion.getClass();
            gVar = new g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        return f.e(nim.a.A(gVar, new msb.c(5)), new mqi.a(this, 6));
    }
}
