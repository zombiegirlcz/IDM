package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class l3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4333a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionDetailsScreenContract$InputData f4334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4335c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l3(b bVar, m mVar, EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData) {
        this.f4335c = bVar;
        this.f4334b = esimSubscriptionDetailsScreenContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new d(bVar, mVar, this, 0, i));
        this.e = e4m.b.b(new d(bVar, mVar, this, 2, i));
        this.f = e4m.b.b(new d(bVar, mVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f4333a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f4333a) {
        }
        return ImmutableSet.of();
    }

    public l3(b bVar, x0 x0Var, EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData) {
        this.f4335c = bVar;
        this.f4334b = esimSubscriptionDetailsScreenContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new d(bVar, x0Var, this, 0, i));
        this.e = e4m.b.b(new d(bVar, x0Var, this, 2, i));
        this.f = e4m.b.b(new d(bVar, x0Var, this, 1, i));
    }
}
