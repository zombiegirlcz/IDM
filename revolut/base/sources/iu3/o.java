package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168494c;
    public final String d;

    public o(String title, String description, String primaryButtonTitle, String secondaryButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        this.f168492a = title;
        this.f168493b = description;
        this.f168494c = primaryButtonTitle;
        this.d = secondaryButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f168492a, oVar.f168492a) && Intrinsics.f(this.f168493b, oVar.f168493b) && Intrinsics.f(this.f168494c, oVar.f168494c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f168492a.hashCode() * 31, 31, this.f168493b), 31, this.f168494c);
    }
}
