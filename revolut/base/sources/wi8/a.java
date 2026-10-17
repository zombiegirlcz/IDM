package wi8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements xki.c, fj8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorCardProfileFlowContract$Input f297836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f297837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f297838c = this;
    public final e4m.e d;

    public a(e eVar, JuniorCardProfileFlowContract$Input juniorCardProfileFlowContract$Input) {
        this.f297837b = eVar;
        this.f297836a = juniorCardProfileFlowContract$Input;
        this.d = e4m.b.b(new whc.d(eVar, this, 8));
    }

    @Override // fj8.b
    public final fj8.a b() {
        return new f(this.f297837b, this.f297838c);
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
