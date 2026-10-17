package to7;

import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import java.util.Iterator;
import zhm.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterable f272538b;

    public /* synthetic */ l(Iterable iterable, int i) {
        this.f272537a = i;
        this.f272538b = iterable;
    }

    @Override // zhm.j0
    public final Object keyOf(Object obj2) {
        switch (this.f272537a) {
            case 0:
                return ((CarVariation) obj2).f75195g;
            default:
                return Integer.valueOf(((koi.k) obj2).getF98535a());
        }
    }

    @Override // zhm.j0
    public final Iterator sourceIterator() {
        switch (this.f272537a) {
        }
        return this.f272538b.iterator();
    }
}
