package nng;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaceOfBirthScreenContract$InputData f217665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk7.k f217666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk7.k f217667c;
    public final e4m.e d;

    public m(p pVar, PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData) {
        this.f217665a = placeOfBirthScreenContract$InputData;
        int i = 14;
        this.f217666b = new nk7.k(pVar, this, 1, i);
        this.f217667c = new nk7.k(pVar, this, 2, i);
        this.d = e4m.b.b(new nk7.k(pVar, this, 0, i));
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
