package yt8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f316665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f316666b;

    public d(i status, List addresses) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.f316665a = status;
        this.f316666b = addresses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f316665a == dVar.f316665a && Intrinsics.f(this.f316666b, dVar.f316666b);
    }

    public final int hashCode() {
        return this.f316666b.hashCode() + (this.f316665a.hashCode() * 31);
    }
}
