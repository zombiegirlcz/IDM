package av3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9896b;

    public e(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f9895a = title;
        this.f9896b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f9895a, eVar.f9895a) && Intrinsics.f(this.f9896b, eVar.f9896b);
    }

    public final int hashCode() {
        return this.f9896b.hashCode() + (this.f9895a.hashCode() * 31);
    }
}
