package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168508b;

    public u(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f168507a = title;
        this.f168508b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f168507a, uVar.f168507a) && Intrinsics.f(this.f168508b, uVar.f168508b);
    }

    public final int hashCode() {
        return this.f168508b.hashCode() + (this.f168507a.hashCode() * 31);
    }
}
