package xy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309582c;
    public final String d;

    public l(String title, String description, String primaryButtonText, String secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f309580a = title;
        this.f309581b = description;
        this.f309582c = primaryButtonText;
        this.d = secondaryButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f309580a, lVar.f309580a) && Intrinsics.f(this.f309581b, lVar.f309581b) && Intrinsics.f(this.f309582c, lVar.f309582c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f309580a.hashCode() * 31, 31, this.f309581b), 31, this.f309582c);
    }
}
