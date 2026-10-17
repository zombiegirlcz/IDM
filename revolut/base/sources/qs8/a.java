package qs8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248755a;

    public a(String portalUrl) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f248755a = portalUrl;
    }

    public final String b() {
        return this.f248755a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f248755a, ((a) obj2).f248755a);
    }

    public final int hashCode() {
        return this.f248755a.hashCode();
    }
}
