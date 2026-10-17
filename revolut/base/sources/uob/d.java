package uob;

import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f281592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ncd.d f281593c;

    public d(dj0.d amount, s vault, ncd.d interestAliasVariant) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(interestAliasVariant, "interestAliasVariant");
        this.f281591a = amount;
        this.f281592b = vault;
        this.f281593c = interestAliasVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f281591a, dVar.f281591a) && Intrinsics.f(this.f281592b, dVar.f281592b) && this.f281593c == dVar.f281593c;
    }

    public final int hashCode() {
        return this.f281593c.hashCode() + ((this.f281592b.hashCode() + (this.f281591a.hashCode() * 31)) * 31);
    }
}
