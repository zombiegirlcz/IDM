package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.c, yfd.b, bgd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedAddAlertFlowContract$InputData f214437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f214438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f214439c = this;
    public final e4m.e d;
    public final e4m.e e;

    public c(e eVar, SharedAddAlertFlowContract$InputData sharedAddAlertFlowContract$InputData) {
        this.f214438b = eVar;
        this.f214437a = sharedAddAlertFlowContract$InputData;
        int i = 18;
        this.d = e4m.b.b(new s(eVar, this, 1, i));
        this.e = e4m.b.b(new s(eVar, this, 0, i));
    }

    @Override // yfd.b
    public final fgd.h b() {
        return new fgd.h(this.f214438b, this.f214439c, 1);
    }

    @Override // bgd.a
    public final fgd.a c() {
        return new fgd.a(this.f214438b, this.f214439c, 1);
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
