package dwi;

import com.revolut.data.model.Data;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f120419b;

    public /* synthetic */ e(h hVar, int i) {
        this.f120418a = i;
        this.f120419b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b bVarE;
        switch (this.f120418a) {
            case 0:
                svi.k it8 = (svi.k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((hwi.a0) this.f120419b.f120424a.f120458a).f.f(Unit.f186387a, true);
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((hwi.a0) this.f120419b.f120424a.f120458a).f.g(Unit.f186387a, false);
            case 2:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (((svi.t) data.getContent()) != null && this.f120419b.f120426c.getAndSet(false) && data.getLoading() && data.getError() == null) ? Data.copy$default(data, null, null, false, 6, null) : data;
            case 3:
                this.f120419b.f120426c.set(true);
                return Unit.f186387a;
            default:
                Data qrCodeData = (Data) obj2;
                Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
                svi.t tVar = (svi.t) qrCodeData.getContent();
                if (tVar != null) {
                    if (qrCodeData.getLoading()) {
                        tVar = null;
                    }
                    if (tVar != null) {
                        DateTime dateTime = tVar.f265988b;
                        boolean z = dateTime.isAfterNow() && dateTime.minusSeconds(5).isBeforeNow();
                        h hVar = this.f120419b;
                        if (z) {
                            bVarE = new pfm.h(new a08.d(hVar, 11), 2);
                            Intrinsics.checkNotNullExpressionValue(bVarE, "fromAction(...)");
                        } else {
                            if (z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            long jMin = tVar.f265989c - ((long) 5);
                            long millis = (dateTime.minusSeconds(5).getMillis() - DateTime.now().getMillis()) / ((long) 1000);
                            if (millis > 0) {
                                jMin = Long.min(millis, jMin);
                            }
                            pfm.w wVarA = efm.b.A(jMin, TimeUnit.SECONDS, hhm.f.f152430b);
                            pfm.h hVar2 = new pfm.h(new a08.d(hVar, 11), 2);
                            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                            bVarE = wVarA.e(hVar2);
                            Intrinsics.checkNotNullExpressionValue(bVarE, "andThen(...)");
                        }
                        efm.r rVarJust = efm.r.just(qrCodeData);
                        mfm.f.b(rVarJust, "other is null");
                        return rVarJust.concatWith(bVarE.C());
                    }
                }
                return efm.r.just(qrCodeData);
        }
    }
}
