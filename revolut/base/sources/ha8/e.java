package ha8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.junior_profile.api.models.a f150461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cfl.b f150463c;
    public final u98.a d;

    public e(com.revolut.feature.junior_profile.api.models.a profile, boolean z, cfl.b jisaState, u98.a dateOfBirthEligibility) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(jisaState, "jisaState");
        Intrinsics.checkNotNullParameter(dateOfBirthEligibility, "dateOfBirthEligibility");
        this.f150461a = profile;
        this.f150462b = z;
        this.f150463c = jisaState;
        this.d = dateOfBirthEligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f150461a, eVar.f150461a) && this.f150462b == eVar.f150462b && this.f150463c == eVar.f150463c && this.d == eVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f150463c.hashCode() + j6.a.c(this.f150461a.hashCode() * 31, 31, this.f150462b)) * 31);
    }
}
