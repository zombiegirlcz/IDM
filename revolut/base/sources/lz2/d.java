package lz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreenContract$InputData;
import java.util.Set;
import lti.l;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardSetLimitScreenContract$InputData f200908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f200909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200910c;
    public final e4m.e d;
    public final e4m.e e;

    public d(a aVar, b bVar, CardSetLimitScreenContract$InputData cardSetLimitScreenContract$InputData) {
        this.f200909b = aVar;
        this.f200908a = cardSetLimitScreenContract$InputData;
        this.f200910c = e4m.b.b(new l(aVar, this, 2, 29));
        this.d = e4m.b.b(new l(aVar, this, 1, 29));
        this.e = e4m.b.b(new l(aVar, this, 0, 29));
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
