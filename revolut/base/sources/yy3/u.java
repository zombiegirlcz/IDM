package yy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317801b;

    public u(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f317800a = title;
        this.f317801b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f317800a, uVar.f317800a) && Intrinsics.f(this.f317801b, uVar.f317801b);
    }

    public final int hashCode() {
        return this.f317801b.hashCode() + (this.f317800a.hashCode() * 31);
    }
}
