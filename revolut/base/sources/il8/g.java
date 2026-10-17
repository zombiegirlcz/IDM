package il8;

import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f162152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f162153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162154c;

    public g(k kVar, h hVar, int i) {
        this.f162152a = kVar;
        this.f162153b = hVar;
        this.f162154c = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f162154c;
        if (i != 0) {
            if (i == 1) {
                return new tl8.b();
            }
            throw new AssertionError(i);
        }
        h hVar = this.f162153b;
        JuniorCreatePhoneNumberDestination.InputData inputData = hVar.f162155a;
        k kVar = this.f162152a;
        zq.a aVarA = kVar.f162166c.a();
        z80.b bVarS = kVar.f162164a.s();
        s.j(bVarS);
        return new com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b(inputData, aVarA, bVarS, (tl8.a) hVar.f162156b.get());
    }
}
