package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154916c;

    public n(String title, String description, String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f154914a = title;
        this.f154915b = description;
        this.f154916c = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f154914a, nVar.f154914a) && Intrinsics.f(this.f154915b, nVar.f154915b) && Intrinsics.f(this.f154916c, nVar.f154916c);
    }

    public final int hashCode() {
        return this.f154916c.hashCode() + p.a.c(this.f154914a.hashCode() * 31, 31, this.f154915b);
    }
}
