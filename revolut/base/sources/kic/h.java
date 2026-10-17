package kic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184200b;

    public h(String userEmail, boolean z) {
        Intrinsics.checkNotNullParameter(userEmail, "userEmail");
        this.f184199a = userEmail;
        this.f184200b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f184199a, hVar.f184199a) && this.f184200b == hVar.f184200b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184200b) + (this.f184199a.hashCode() * 31);
    }
}
