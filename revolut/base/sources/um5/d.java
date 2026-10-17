package um5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateOfBirthScreenContract$InputData f281242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f281243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f281244c;
    public final e4m.e d;

    public d(c cVar, DateOfBirthScreenContract$InputData dateOfBirthScreenContract$InputData) {
        this.f281243b = cVar;
        this.f281242a = dateOfBirthScreenContract$InputData;
        int i = 22;
        this.f281244c = e4m.b.b(new tn3.a(this, 1, i));
        this.d = e4m.b.b(new tn3.a(this, 0, i));
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
