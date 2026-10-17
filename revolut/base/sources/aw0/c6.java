package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6 f10259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10260b;

    public c6(p6 icon, Clause title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10259a = icon;
        this.f10260b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj2;
        return Intrinsics.f(this.f10259a, c6Var.f10259a) && Intrinsics.f(this.f10260b, c6Var.f10260b);
    }

    public final int hashCode() {
        return this.f10260b.hashCode() + (this.f10259a.hashCode() * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c6(int i, Clause title, Integer num) {
        this(new p6(i, num), title);
        Intrinsics.checkNotNullParameter(title, "title");
    }
}
