package c1d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentInvitationContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentInvitationContract$InputData f20452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f20453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f20454c;
    public final e4m.e d;

    public c(a aVar, SemiIndependentInvitationContract$InputData semiIndependentInvitationContract$InputData) {
        this.f20453b = aVar;
        this.f20452a = semiIndependentInvitationContract$InputData;
        int i = 9;
        this.f20454c = e4m.b.b(new bt7.e(aVar, this, 0, i));
        this.d = e4m.b.b(new bt7.e(aVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        i1d.d extension = (i1d.d) this.f20454c.get();
        h1d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return ImmutableSet.of(extension);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
