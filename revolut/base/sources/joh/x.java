package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$Input;
import java.util.Set;
import jm4.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements xph.b, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerViewCollectionFlowContract$Input f177074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f177075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f177076c = this;
    public final e4m.e d = e4m.b.b(new n1(this, 19));

    public x(w wVar, ScreenerViewCollectionFlowContract$Input screenerViewCollectionFlowContract$Input) {
        this.f177075b = wVar;
        this.f177074a = screenerViewCollectionFlowContract$Input;
    }

    @Override // xph.b
    public final xph.a b() {
        return new r10.a(this.f177075b, this.f177076c);
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
