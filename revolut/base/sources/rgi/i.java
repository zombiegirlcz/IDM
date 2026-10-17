package rgi;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f254196c;

    public i(String url2, String userAgent, LinkedHashMap headers) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f254194a = url2;
        this.f254195b = userAgent;
        this.f254196c = headers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f254194a, iVar.f254194a) && Intrinsics.f(this.f254195b, iVar.f254195b) && this.f254196c.equals(iVar.f254196c);
    }

    public final int hashCode() {
        return this.f254196c.hashCode() + p.a.c(this.f254194a.hashCode() * 31, 31, this.f254195b);
    }

    public final String toString() {
        return j6.a.s("Authorized(url=", this.f254194a, ", userAgent=", this.f254195b, ", headers=REDACTED)");
    }
}
