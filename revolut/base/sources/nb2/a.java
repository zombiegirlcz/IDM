package nb2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo.AdditionalInfoDialogScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfoDialogScreenContract$InputData f213956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f213957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213958c;

    public a(b bVar, AdditionalInfoDialogScreenContract$InputData additionalInfoDialogScreenContract$InputData) {
        this.f213956a = additionalInfoDialogScreenContract$InputData;
        int i = 20;
        this.f213957b = e4m.b.b(new mil.a(this, 1, i));
        this.f213958c = e4m.b.b(new mil.a(this, 0, i));
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
