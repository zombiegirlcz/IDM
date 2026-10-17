package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupDetailsScreenContract$InputData f238382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238384c;
    public final e4m.e d;

    public c0(n nVar, GroupDetailsScreenContract$InputData groupDetailsScreenContract$InputData) {
        this.f238383b = nVar;
        this.f238382a = groupDetailsScreenContract$InputData;
        int i = 27;
        this.f238384c = e4m.b.b(new pa6.f(nVar, this, 1, i));
        this.d = e4m.b.b(new pa6.f(nVar, this, 0, i));
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
