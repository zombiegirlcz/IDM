package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements ted.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedAlertsDestination.InputData f214454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f214455b;
    public final e4m.e e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f214456c = this;
    public final e4m.e d = e4m.b.b(new f(this, 0));
    public final e4m.e f = e4m.b.b(new f(this, 1));

    public g(e eVar, BaseFlow baseFlow, SharedAlertsDestination.InputData inputData) {
        this.f214455b = eVar;
        this.f214454a = inputData;
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
