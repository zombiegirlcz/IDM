package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements b9a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationType.Inputtable f233983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233985c;

    public i(d0 d0Var, f fVar, AliasRegistrationType.Inputtable inputtable) {
        this.f233984b = d0Var;
        this.f233983a = inputtable;
        this.f233985c = e4m.b.b(new h(d0Var, this));
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
