package kl2;

import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.RestrictionsScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import jm4.c3;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RestrictionsScreenContract$InputData f185273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f185274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f185275c;

    public b(a aVar, RestrictionsScreenContract$InputData restrictionsScreenContract$InputData) {
        this.f185274b = aVar;
        this.f185273a = restrictionsScreenContract$InputData;
        this.f185275c = e4m.b.b(new c3(aVar, this, 15));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
