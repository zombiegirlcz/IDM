package vub;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import java.util.Set;
import vtc.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputData f292291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f292292b;

    public c(a aVar, InputData inputData) {
        this.f292291a = inputData;
        this.f292292b = e4m.b.b(new n(aVar, this, 5));
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
