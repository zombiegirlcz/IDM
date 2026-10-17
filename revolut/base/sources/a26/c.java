package a26;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f671b;

    public c() {
        this(0);
    }

    public static c a(c cVar, List splitAccountWidget, List widgetItems, int i) {
        if ((i & 1) != 0) {
            splitAccountWidget = cVar.f670a;
        }
        if ((i & 2) != 0) {
            widgetItems = cVar.f671b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(splitAccountWidget, "splitAccountWidget");
        Intrinsics.checkNotNullParameter(widgetItems, "widgetItems");
        return new c(splitAccountWidget, widgetItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f670a, cVar.f670a) && Intrinsics.f(this.f671b, cVar.f671b);
    }

    public final int hashCode() {
        return this.f671b.hashCode() + (this.f670a.hashCode() * 31);
    }

    public c(List splitAccountWidget, List widgetItems) {
        Intrinsics.checkNotNullParameter(splitAccountWidget, "splitAccountWidget");
        Intrinsics.checkNotNullParameter(widgetItems, "widgetItems");
        this.f670a = splitAccountWidget;
        this.f671b = widgetItems;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i) {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var);
    }
}
