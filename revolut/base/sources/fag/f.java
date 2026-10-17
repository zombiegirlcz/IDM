package fag;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f133321b;

    public /* synthetic */ f(i iVar, int i) {
        this.f133320a = i;
        this.f133321b = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        efm.r rVarJust;
        switch (this.f133320a) {
            case 0:
                i iVar = this.f133321b;
                Object obj2 = iVar.f133332c.get("TRAVEL_HOTELS_RECENT_FILTERS");
                List list = obj2 instanceof List ? (List) obj2 : null;
                Data dataP = list != null ? zi0.c.P(list, false, null, 3) : null;
                if (dataP != null && (rVarJust = efm.r.just(dataP)) != null) {
                    return rVarJust;
                }
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return pd.b.t(iVar.f.e(Unit.f186387a, loadingStrategy), new e(iVar, 2));
            default:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f133321b.f133331b, "TRAVEL_HOTELS_HAS_SHOWN_SMART_FILTERS_INFO", Boolean.TRUE);
                return Unit.f186387a;
        }
    }
}
