package hj0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f152638b;

    public h(String style, ArrayList items) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152637a = style;
        this.f152638b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f152637a, hVar.f152637a) && this.f152638b.equals(hVar.f152638b);
    }

    public final int hashCode() {
        return this.f152638b.hashCode() + (this.f152637a.hashCode() * 31);
    }
}
