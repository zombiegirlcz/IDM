package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f168463c;
    public final b d;

    public c(String title, String description, b primaryButton, b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f168461a = title;
        this.f168462b = description;
        this.f168463c = primaryButton;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f168461a, cVar.f168461a) && Intrinsics.f(this.f168462b, cVar.f168462b) && Intrinsics.f(this.f168463c, cVar.f168463c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f168463c.hashCode() + p.a.c(this.f168461a.hashCode() * 31, 31, this.f168462b)) * 31;
        b bVar = this.d;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
