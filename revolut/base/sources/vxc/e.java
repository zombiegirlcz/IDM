package vxc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EntityHelpScreenContract$InputData f293063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f293064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293065c;

    public e(d dVar, c cVar, EntityHelpScreenContract$InputData entityHelpScreenContract$InputData) {
        this.f293063a = entityHelpScreenContract$InputData;
        int i = 24;
        this.f293064b = e4m.b.b(new vn2.l(dVar, this, 1, i));
        this.f293065c = e4m.b.b(new vn2.l(dVar, this, 0, i));
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
