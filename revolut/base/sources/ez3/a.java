package ez3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130884b;

    public a(String title, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f130883a = title;
        this.f130884b = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130883a, aVar.f130883a) && Intrinsics.f(this.f130884b, aVar.f130884b);
    }

    public final int hashCode() {
        return this.f130884b.hashCode() + (this.f130883a.hashCode() * 31);
    }
}
