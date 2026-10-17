package fya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138979b;

    public a(String title, String action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f138978a = title;
        this.f138979b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f138978a, aVar.f138978a) && Intrinsics.f(this.f138979b, aVar.f138979b);
    }

    public final int hashCode() {
        return this.f138979b.hashCode() + (this.f138978a.hashCode() * 31);
    }
}
