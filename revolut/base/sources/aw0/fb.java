package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6 f10312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10313b;

    public fb(p6 icon, Clause title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10312a = icon;
        this.f10313b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj2;
        return this.f10312a.equals(fbVar.f10312a) && this.f10313b.equals(fbVar.f10313b);
    }

    public final int hashCode() {
        return this.f10313b.hashCode() + (this.f10312a.hashCode() * 31);
    }
}
