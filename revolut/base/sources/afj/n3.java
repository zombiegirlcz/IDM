package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4363a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimRefundReasonScreenContract$InputData f4364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4365c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n3(b bVar, t0 t0Var, EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData) {
        this.f4365c = bVar;
        this.f4364b = esimRefundReasonScreenContract$InputData;
        int i = 13;
        this.d = e4m.b.b(new d(bVar, t0Var, this, 0, i));
        this.e = e4m.b.b(new d(bVar, t0Var, this, 2, i));
        this.f = e4m.b.b(new d(bVar, t0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f4363a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f4363a) {
        }
        return ImmutableSet.of();
    }

    public n3(b bVar, p pVar, EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData) {
        this.f4365c = bVar;
        this.f4364b = esimRefundReasonScreenContract$InputData;
        int i = 12;
        this.d = e4m.b.b(new d(bVar, pVar, this, 0, i));
        this.e = e4m.b.b(new d(bVar, pVar, this, 2, i));
        this.f = e4m.b.b(new d(bVar, pVar, this, 1, i));
    }
}
