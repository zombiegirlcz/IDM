package jf8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173730c;
    public final List d;

    public a(String ownerId, String firstName, String fullName, List pocketIds) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        this.f173728a = ownerId;
        this.f173729b = firstName;
        this.f173730c = fullName;
        this.d = pocketIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f173728a, aVar.f173728a) && Intrinsics.f(this.f173729b, aVar.f173729b) && Intrinsics.f(this.f173730c, aVar.f173730c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f173728a.hashCode() * 31, 31, this.f173729b), 31, this.f173730c);
    }
}
