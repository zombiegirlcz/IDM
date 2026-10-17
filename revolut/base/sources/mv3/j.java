package mv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f209133c;

    public j(String title, String subtitle, String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f209131a = title;
        this.f209132b = subtitle;
        this.f209133c = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f209131a, jVar.f209131a) && Intrinsics.f(this.f209132b, jVar.f209132b) && Intrinsics.f(this.f209133c, jVar.f209133c);
    }

    public final int hashCode() {
        return this.f209133c.hashCode() + p.a.c(this.f209131a.hashCode() * 31, 31, this.f209132b);
    }
}
