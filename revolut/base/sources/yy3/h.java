package yy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317775c;

    public h(String title, String description, String logoUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f317773a = title;
        this.f317774b = description;
        this.f317775c = logoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f317773a, hVar.f317773a) && Intrinsics.f(this.f317774b, hVar.f317774b) && Intrinsics.f(this.f317775c, hVar.f317775c);
    }

    public final int hashCode() {
        return this.f317775c.hashCode() + p.a.c(this.f317773a.hashCode() * 31, 31, this.f317774b);
    }
}
