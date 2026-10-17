package iqe;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f167817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TeenProfile f167818b;

    public a(TeenProfile teenProfile, io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        this.f167817a = pocket;
        this.f167818b = teenProfile;
    }

    @Override // iqe.c
    public final TeenProfile a() {
        return this.f167818b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f167817a, aVar.f167817a) && Intrinsics.f(this.f167818b, aVar.f167818b);
    }

    public final int hashCode() {
        return this.f167818b.hashCode() + (this.f167817a.hashCode() * 31);
    }
}
