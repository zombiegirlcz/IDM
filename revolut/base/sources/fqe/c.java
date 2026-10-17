package fqe;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo3.c f137252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TeenProfile f137254c;
    public final dj0.d d;

    public c(fo3.c wallet, List pockets, TeenProfile teenProfile, dj0.d totalBalance) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        this.f137252a = wallet;
        this.f137253b = pockets;
        this.f137254c = teenProfile;
        this.d = totalBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f137252a, cVar.f137252a) && Intrinsics.f(this.f137253b, cVar.f137253b) && Intrinsics.f(this.f137254c, cVar.f137254c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f137254c.hashCode() + p.a.d(this.f137252a.hashCode() * 31, 31, this.f137253b)) * 31);
    }
}
