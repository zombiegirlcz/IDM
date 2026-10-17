package xu3;

import dx4.z2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f308947b;

    public w(String text, z2 info) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f308946a = text;
        this.f308947b = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f308946a, wVar.f308946a) && Intrinsics.f(this.f308947b, wVar.f308947b);
    }

    public final int hashCode() {
        return this.f308947b.hashCode() + (this.f308946a.hashCode() * 31);
    }
}
