package um5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreenContract$InputData;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionRequiredScreenContract$InputData f281228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f281229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f281230c;

    public a(c cVar, ActionRequiredScreenContract$InputData actionRequiredScreenContract$InputData) {
        this.f281228a = actionRequiredScreenContract$InputData;
        int i = 8;
        this.f281229b = e4m.b.b(new k0(cVar, this, 1, i));
        this.f281230c = e4m.b.b(new k0(cVar, this, 0, i));
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
