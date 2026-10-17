package kr2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188636b;

    public a(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f188635a = title;
        this.f188636b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f188635a, aVar.f188635a) && Intrinsics.f(this.f188636b, aVar.f188636b);
    }

    public final int hashCode() {
        return this.f188636b.hashCode() + (this.f188635a.hashCode() * 31);
    }
}
