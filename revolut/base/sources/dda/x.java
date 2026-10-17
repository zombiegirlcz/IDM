package dda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f113205c;

    public x(String title, String value, List highlights) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f113203a = title;
        this.f113204b = value;
        this.f113205c = highlights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f113203a, xVar.f113203a) && Intrinsics.f(this.f113204b, xVar.f113204b) && Intrinsics.f(this.f113205c, xVar.f113205c);
    }

    public final int hashCode() {
        return this.f113205c.hashCode() + p.a.c(this.f113203a.hashCode() * 31, 31, this.f113204b);
    }
}
