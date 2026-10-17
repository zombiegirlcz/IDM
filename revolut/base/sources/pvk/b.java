package pvk;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f240265b;

    public /* synthetic */ b(Data data, int i) {
        this.f240264a = i;
        this.f240265b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f240264a) {
            case 0:
                p pVar = (p) obj2;
                InstrumentTicker instrumentTicker = (InstrumentTicker) this.f240265b.getContent();
                return p.a(pVar, null, null, instrumentTicker != null ? instrumentTicker.e : null, null, null, null, null, null, null, 507);
            case 1:
                return p.a((p) obj2, null, null, null, null, null, null, this.f240265b, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 2:
                return p.a((p) obj2, null, null, null, null, null, this.f240265b, null, null, null, 479);
            case 3:
                return p.a((p) obj2, this.f240265b, null, null, null, null, null, null, null, null, 510);
            case 4:
                return p.a((p) obj2, null, this.f240265b, null, null, null, null, null, null, null, 509);
            case 5:
                return p.a((p) obj2, null, null, null, this.f240265b, null, null, null, null, null, 503);
            case 6:
                return p.a((p) obj2, null, null, null, null, this.f240265b, null, null, null, null, 495);
            case 7:
                return p.a((p) obj2, null, null, null, null, null, null, null, null, this.f240265b, 255);
            case 8:
                return pwb.f.a((pwb.f) obj2, null, null, this.f240265b, 7);
            case 9:
                return pwb.f.a((pwb.f) obj2, null, this.f240265b, null, 11);
            case 10:
                return pwc.g.a((pwc.g) obj2, null, false, false, null, (uib.a) this.f240265b.getContent(), null, false, null, null, false, 4031);
            case 11:
                Data data = this.f240265b;
                Intrinsics.h(data);
                return q09.l.a((q09.l) obj2, data, null, null, 6);
            case 12:
                Data data2 = this.f240265b;
                Intrinsics.h(data2);
                return q23.q.a((q23.q) obj2, null, false, null, null, null, null, data2, null, null, false, null, 4031);
            case 13:
                return q23.q.a((q23.q) obj2, null, false, this.f240265b, null, null, null, null, null, null, false, null, 4091);
            case 14:
                return q23.q.a((q23.q) obj2, this.f240265b, false, null, null, null, null, null, null, null, false, null, 4094);
            case 15:
                return q2e.h.a((q2e.h) obj2, null, null, null, null, null, null, null, false, false, false, false, this.f240265b, null, null, null, 63487);
            case 16:
                Data data3 = this.f240265b;
                Intrinsics.h(data3);
                return q2e.h.a((q2e.h) obj2, null, null, null, data3, null, null, null, false, false, false, false, null, null, null, null, 65527);
            case 17:
                return q2e.h.a((q2e.h) obj2, null, null, null, null, null, null, this.f240265b, false, false, false, false, null, null, null, null, 65471);
            case 18:
                ((q42.e) obj2).getClass();
                Data data4 = this.f240265b;
                Intrinsics.checkNotNullParameter(data4, "data");
                return new q42.e(data4);
            case 19:
                ((q48.d) obj2).getClass();
                Data legalEntityContext = this.f240265b;
                Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
                return new q48.d(legalEntityContext);
            case 20:
                Data data5 = this.f240265b;
                Intrinsics.h(data5);
                return q4a.f.a((q4a.f) obj2, false, false, null, null, data5, false, null, null, 495);
            case 21:
                return new q4b.e(this.f240265b, ((q4b.e) obj2).f242121b);
            case 22:
                q5g.s update = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q5g.s.a(update, null, this.f240265b, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, false, null, 459);
            case 23:
                q5g.s update2 = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data6 = this.f240265b;
                return q5g.s.a(update2, null, new Data(null, data6.getError(), data6.getLoading(), 1, null), null, null, null, null, false, null, 507);
            case 24:
                q5g.s update3 = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return q5g.s.a(update3, null, this.f240265b, null, null, null, null, false, null, 507);
            case 25:
                return q5g.s.a((q5g.s) obj2, null, null, null, this.f240265b, null, null, false, null, 495);
            case 26:
                return q5g.s.a((q5g.s) obj2, null, null, null, null, this.f240265b, null, false, null, 479);
            case 27:
                Data data7 = this.f240265b;
                Intrinsics.h(data7);
                return q5g.s.a((q5g.s) obj2, null, null, null, null, null, data7, false, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 28:
                ((q5h.i) obj2).getClass();
                Data servicesData = this.f240265b;
                Intrinsics.checkNotNullParameter(servicesData, "servicesData");
                return new q5h.i(servicesData);
            default:
                return new q64.l(this.f240265b);
        }
    }
}
