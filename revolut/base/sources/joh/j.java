package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerAllFiltersFlowContract$InputData f177009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tsk.t f177010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f177011c;
    public final j d = this;
    public final e4m.e e;

    public j(w wVar, ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData, tsk.t tVar) {
        this.f177011c = wVar;
        this.f177009a = screenerAllFiltersFlowContract$InputData;
        this.f177010b = tVar;
        this.e = e4m.b.b(new c3(wVar, this, 4));
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
