package tn3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreenContract$InputData;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CooldownCheckFailedScreenContract$InputData f272287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f272288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f272289c;

    public b(c cVar, d dVar, CooldownCheckFailedScreenContract$InputData cooldownCheckFailedScreenContract$InputData) {
        this.f272287a = cooldownCheckFailedScreenContract$InputData;
        int i = 0;
        this.f272288b = e4m.b.b(new a(this, 1, i));
        this.f272289c = e4m.b.b(new a(this, 0, i));
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
