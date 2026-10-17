package fgd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements hgd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedConverterDestination.InputData f135047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f135048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f135049c = this;
    public final e4m.e d;

    public f(d dVar, SharedConverterDestination.InputData inputData) {
        this.f135048b = dVar;
        this.f135047a = inputData;
        this.d = e4m.b.b(new e(dVar, this));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
