package um5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$InputData;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaceOfBirthScreenContract$InputData f281248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f281249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f281250c;
    public final e4m.e d;

    public f(c cVar, PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData) {
        this.f281249b = cVar;
        this.f281248a = placeOfBirthScreenContract$InputData;
        int i = 10;
        this.f281250c = e4m.b.b(new k0(cVar, this, 1, i));
        this.d = e4m.b.b(new k0(cVar, this, 0, i));
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
