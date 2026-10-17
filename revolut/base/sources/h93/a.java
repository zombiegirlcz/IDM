package h93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150090b;

    public a(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f150089a = title;
        this.f150090b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150089a, aVar.f150089a) && Intrinsics.f(this.f150090b, aVar.f150090b);
    }

    public final int hashCode() {
        return this.f150090b.hashCode() + (this.f150089a.hashCode() * 31);
    }
}
