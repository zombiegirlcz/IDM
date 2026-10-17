package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeFlowContract$InputData f292092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f292093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f292094c = this;
    public final e4m.e d;
    public final e4m.e e;

    public x(t tVar, StreetModeFlowContract$InputData streetModeFlowContract$InputData) {
        this.f292093b = tVar;
        this.f292092a = streetModeFlowContract$InputData;
        int i = 17;
        this.d = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.e = e4m.b.b(new vn2.l(tVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
