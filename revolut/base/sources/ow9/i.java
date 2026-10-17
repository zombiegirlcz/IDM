package ow9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCardContract$InputData;
import java.util.Set;
import ove.w;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileDetailsCardContract$InputData f230388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f230389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230390c;
    public final e4m.e d;

    public i(e eVar, ProfileDetailsCardContract$InputData profileDetailsCardContract$InputData) {
        this.f230389b = eVar;
        this.f230388a = profileDetailsCardContract$InputData;
        this.f230390c = e4m.b.b(new w(eVar, this, 1, 6));
        this.d = e4m.b.b(new w(eVar, this, 0, 6));
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
