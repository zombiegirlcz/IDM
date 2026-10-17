package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedAlertDetailsFlowContract$InputData f214440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f214441b;
    public final e4m.e e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f214442c = this;
    public final e4m.e d = e4m.b.b(new mil.a(this, 0, 22));
    public final e4m.e f = e4m.b.b(new mil.a(this, 1, 22));

    public d(e eVar, BaseFlow baseFlow, SharedAlertDetailsFlowContract$InputData sharedAlertDetailsFlowContract$InputData) {
        this.f214441b = eVar;
        this.f214440a = sharedAlertDetailsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(baseFlow));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
