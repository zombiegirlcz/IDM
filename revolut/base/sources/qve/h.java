package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreenContract$InputData;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndiaStoredMethodDetailsScreenContract$InputData f249594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f249595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249596c;

    public h(k kVar, IndiaStoredMethodDetailsScreenContract$InputData indiaStoredMethodDetailsScreenContract$InputData) {
        this.f249594a = indiaStoredMethodDetailsScreenContract$InputData;
        int i = 14;
        this.f249595b = e4m.b.b(new v1(kVar, this, 1, i));
        this.f249596c = e4m.b.b(new v1(kVar, this, 0, i));
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
