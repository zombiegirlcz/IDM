package yh1;

import com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetContract$InputData;
import java.util.Collections;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BadAddressSheetContract$InputData f313715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f313716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f313717c;

    public g(e eVar, d dVar, BadAddressSheetContract$InputData badAddressSheetContract$InputData) {
        this.f313715a = badAddressSheetContract$InputData;
        this.f313716b = e4m.b.b(new q(eVar, this, 1, 24));
        this.f313717c = e4m.b.b(new q(eVar, this, 0, 24));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
