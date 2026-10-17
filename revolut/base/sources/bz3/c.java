package bz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19914c;
    public final String d;

    public c(String title, String description, String primaryButton, String secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f19912a = title;
        this.f19913b = description;
        this.f19914c = primaryButton;
        this.d = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f19912a, cVar.f19912a) && Intrinsics.f(this.f19913b, cVar.f19913b) && Intrinsics.f(this.f19914c, cVar.f19914c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f19912a.hashCode() * 31, 31, this.f19913b), 31, this.f19914c);
    }
}
