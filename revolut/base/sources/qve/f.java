package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalCardDetailsScreenContract$InputData f249588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249590c;

    public f(k kVar, e eVar, ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData) {
        this.f249588a = externalCardDetailsScreenContract$InputData;
        this.f249589b = e4m.b.b(new ppd.j(kVar, eVar, this, 1, 15));
        this.f249590c = e4m.b.b(new ppd.j(kVar, eVar, this, 0, 15));
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
