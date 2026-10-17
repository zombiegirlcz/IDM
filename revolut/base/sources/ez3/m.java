package ez3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130907b;

    public m(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f130906a = title;
        this.f130907b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f130906a, mVar.f130906a) && Intrinsics.f(this.f130907b, mVar.f130907b);
    }

    public final int hashCode() {
        return this.f130907b.hashCode() + (this.f130906a.hashCode() * 31);
    }
}
