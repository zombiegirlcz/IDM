package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
import java.util.Set;
import jm4.z3;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c, dra.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwnerCreationInputData f177531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f177532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177533c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public b(e eVar, CardOwnerCreationInputData cardOwnerCreationInputData) {
        this.f177532b = eVar;
        this.f177531a = cardOwnerCreationInputData;
        int i = 26;
        this.d = e4m.b.b(new z3(eVar, this, 1, i));
        this.e = e4m.b.b(new z3(eVar, this, 0, i));
        this.f = e4m.b.b(new z3(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // dra.b
    public final dra.a q() {
        return new j(this.f177532b, this.f177533c);
    }
}
