package iyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169702b;

    public h(String id10, String token) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f169701a = id10;
        this.f169702b = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f169701a, hVar.f169701a) && Intrinsics.f(this.f169702b, hVar.f169702b);
    }

    public final int hashCode() {
        return this.f169702b.hashCode() + (this.f169701a.hashCode() * 31);
    }
}
