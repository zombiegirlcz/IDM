package vu4;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292251b;

    public c(boolean z, String formattedDate) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        this.f292250a = z;
        this.f292251b = formattedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f292250a == cVar.f292250a && Intrinsics.f(this.f292251b, cVar.f292251b);
    }

    public final int hashCode() {
        return this.f292251b.hashCode() + (Boolean.hashCode(this.f292250a) * 31);
    }
}
