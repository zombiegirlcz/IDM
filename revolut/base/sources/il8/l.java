package il8;

import com.revolut.feature.junior_remote_login.navigation.JuniorUpdatePhoneNumberDestination;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f162169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f162170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162171c;

    public l(k kVar, m mVar, int i) {
        this.f162169a = kVar;
        this.f162170b = mVar;
        this.f162171c = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f162171c;
        if (i != 0) {
            if (i == 1) {
                return new tl8.b();
            }
            throw new AssertionError(i);
        }
        m mVar = this.f162170b;
        JuniorUpdatePhoneNumberDestination.InputData inputData = mVar.f162172a;
        k kVar = this.f162169a;
        zq.a aVarA = kVar.f162166c.a();
        z80.b bVarS = kVar.f162164a.s();
        s.j(bVarS);
        return new com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b(inputData, aVarA, bVarS, (tl8.a) mVar.f162173b.get());
    }
}
