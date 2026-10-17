package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen.WhatWillHappenScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WhatWillHappenScreenContract$InputData f159755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f159756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159757c;

    public x(o oVar, h hVar, WhatWillHappenScreenContract$InputData whatWillHappenScreenContract$InputData) {
        this.f159755a = whatWillHappenScreenContract$InputData;
        int i = 8;
        this.f159756b = e4m.b.b(new i72.j(this, 1, i));
        this.f159757c = e4m.b.b(new i72.j(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
