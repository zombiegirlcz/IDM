package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReplaceFlowContract$InputData f275775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f275776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f275777c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(e eVar, CardReplaceFlowContract$InputData cardReplaceFlowContract$InputData) {
        this.f275776b = eVar;
        this.f275775a = cardReplaceFlowContract$InputData;
        int i = 18;
        this.d = e4m.b.b(new tg5.h(eVar, this, 1, i));
        this.e = e4m.b.b(new tg5.h(eVar, this, 2, i));
        this.f = e4m.b.b(new tg5.h(eVar, this, 0, i));
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
