package b8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subaccount f13208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13210c;
    public final d d;

    public h(Subaccount subaccount, boolean z, String userId, d profileExtraData) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(profileExtraData, "profileExtraData");
        this.f13208a = subaccount;
        this.f13209b = z;
        this.f13210c = userId;
        this.d = profileExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f13208a, hVar.f13208a) && this.f13209b == hVar.f13209b && Intrinsics.f(this.f13210c, hVar.f13210c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(j6.a.c(this.f13208a.hashCode() * 31, 31, this.f13209b), 961, this.f13210c);
    }
}
