package toh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f273213a;

    public c(ybl.b instrumentTickerInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                this.f273213a = instrumentTickerInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                this.f273213a = instrumentTickerInteractor;
                break;
        }
    }

    public akg.n a(List collections) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collections.iterator();
        while (it8.hasNext()) {
            Iterable iterable = ((ScreenerCollection) it8.next()).k;
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            a0.x(iterable, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(((ScreenerInstrument) it9.next()).f105162a);
        }
        return nim.a.v(linkedHashSet.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : ((ael.k) this.f273213a).l(linkedHashSet), new tkm.d(collections, this, 3));
    }
}
