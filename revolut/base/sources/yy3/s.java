package yy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f317798c;

    public s(String title, String description, ArrayList signingMethods) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(signingMethods, "signingMethods");
        this.f317796a = title;
        this.f317797b = description;
        this.f317798c = signingMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f317796a, sVar.f317796a) && Intrinsics.f(this.f317797b, sVar.f317797b) && this.f317798c.equals(sVar.f317798c);
    }

    public final int hashCode() {
        return this.f317798c.hashCode() + p.a.c(this.f317796a.hashCode() * 31, 31, this.f317797b);
    }
}
