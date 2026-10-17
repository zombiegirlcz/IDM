package t20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f267388b;

    public c(String chatToken, a authInfo) {
        Intrinsics.checkNotNullParameter(chatToken, "chatToken");
        Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        this.f267387a = chatToken;
        this.f267388b = authInfo;
    }

    public final a a() {
        return this.f267388b;
    }

    public final String b() {
        return this.f267387a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f267387a, cVar.f267387a) && Intrinsics.f(this.f267388b, cVar.f267388b);
    }

    public final int hashCode() {
        return this.f267388b.hashCode() + (this.f267387a.hashCode() * 31);
    }
}
