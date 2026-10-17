package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120800b;

    public v1(String title, String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f120799a = title;
        this.f120800b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f120799a, v1Var.f120799a) && Intrinsics.f(this.f120800b, v1Var.f120800b);
    }

    public final int hashCode() {
        return this.f120800b.hashCode() + (this.f120799a.hashCode() * 31);
    }
}
