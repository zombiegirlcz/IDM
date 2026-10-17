package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266011c;
    public final String d;

    public v1(String imageUrl, String title, String description, String primaryButtonText) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f266009a = imageUrl;
        this.f266010b = title;
        this.f266011c = description;
        this.d = primaryButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f266009a, v1Var.f266009a) && Intrinsics.f(this.f266010b, v1Var.f266010b) && Intrinsics.f(this.f266011c, v1Var.f266011c) && Intrinsics.f(this.d, v1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f266009a.hashCode() * 31, 31, this.f266010b), 31, this.f266011c);
    }
}
