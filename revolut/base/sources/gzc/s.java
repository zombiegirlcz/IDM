package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f148036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148037b;

    public s(t type, String title) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f148036a = type;
        this.f148037b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f148036a == sVar.f148036a && Intrinsics.f(this.f148037b, sVar.f148037b);
    }

    public final int hashCode() {
        return this.f148037b.hashCode() + (this.f148036a.hashCode() * 31);
    }
}
