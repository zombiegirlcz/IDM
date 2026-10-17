package vu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f292224c;

    public i(String title, String str, e action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f292222a = title;
        this.f292223b = str;
        this.f292224c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f292222a, iVar.f292222a) && Intrinsics.f(this.f292223b, iVar.f292223b) && Intrinsics.f(this.f292224c, iVar.f292224c);
    }

    public final int hashCode() {
        int iHashCode = this.f292222a.hashCode() * 31;
        String str = this.f292223b;
        return this.f292224c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
