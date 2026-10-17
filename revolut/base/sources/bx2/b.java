package bx2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaContract$InputData;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResetCardScaContract$InputData f19485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f19486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f19487c;

    public b(a aVar, ResetCardScaContract$InputData resetCardScaContract$InputData) {
        this.f19485a = resetCardScaContract$InputData;
        int i = 3;
        this.f19486b = e4m.b.b(new bt7.e(aVar, this, 1, i));
        this.f19487c = e4m.b.b(new bt7.e(aVar, this, 0, i));
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
