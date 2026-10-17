package iqe;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo3.c f167819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TeenProfile f167820b;

    public b(fo3.c wallet, TeenProfile teenProfile) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        this.f167819a = wallet;
        this.f167820b = teenProfile;
    }

    @Override // iqe.c
    public final TeenProfile a() {
        return this.f167820b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f167819a, bVar.f167819a) && Intrinsics.f(this.f167820b, bVar.f167820b);
    }

    public final int hashCode() {
        return this.f167820b.hashCode() + (this.f167819a.hashCode() * 31);
    }
}
