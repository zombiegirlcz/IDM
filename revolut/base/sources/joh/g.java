package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewScreenerScreenContract$Input f177003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f177004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f177005c;

    public g(w wVar, NewScreenerScreenContract$Input newScreenerScreenContract$Input) {
        this.f177004b = wVar;
        this.f177003a = newScreenerScreenContract$Input;
        this.f177005c = e4m.b.b(new c3(wVar, this, 3));
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
