package uy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284061c;
    public final String d;

    public d(String title, String description, String primaryButtonTitle, String secondaryButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        Intrinsics.checkNotNullParameter(secondaryButtonTitle, "secondaryButtonTitle");
        this.f284059a = title;
        this.f284060b = description;
        this.f284061c = primaryButtonTitle;
        this.d = secondaryButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f284059a, dVar.f284059a) && Intrinsics.f(this.f284060b, dVar.f284060b) && Intrinsics.f(this.f284061c, dVar.f284061c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f284059a.hashCode() * 31, 31, this.f284060b), 31, this.f284061c);
    }
}
