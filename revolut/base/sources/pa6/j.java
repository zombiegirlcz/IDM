package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonateWithPointsContract$InputData f234377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234379c;
    public final e4m.e d;

    public j(m mVar, n nVar, DonateWithPointsContract$InputData donateWithPointsContract$InputData) {
        this.f234378b = mVar;
        this.f234377a = donateWithPointsContract$InputData;
        int i = 3;
        this.f234379c = e4m.b.b(new f(mVar, this, 0, i));
        this.d = e4m.b.b(new f(mVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f234379c.get());
    }
}
