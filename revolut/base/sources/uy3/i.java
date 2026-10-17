package uy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f284069c;
    public final h d;

    public i(String title, String description, h primaryButton, h hVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f284067a = title;
        this.f284068b = description;
        this.f284069c = primaryButton;
        this.d = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f284067a, iVar.f284067a) && Intrinsics.f(this.f284068b, iVar.f284068b) && Intrinsics.f(this.f284069c, iVar.f284069c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f284069c.hashCode() + p.a.c(this.f284067a.hashCode() * 31, 31, this.f284068b)) * 31;
        h hVar = this.d;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
