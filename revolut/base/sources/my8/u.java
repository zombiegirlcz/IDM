package my8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210401b;

    public u(String deeplink, String highlightText) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(highlightText, "highlightText");
        this.f210400a = deeplink;
        this.f210401b = highlightText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f210400a, uVar.f210400a) && Intrinsics.f(this.f210401b, uVar.f210401b);
    }

    public final int hashCode() {
        return this.f210401b.hashCode() + (this.f210400a.hashCode() * 31);
    }
}
