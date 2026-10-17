package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10288a;

    public e1(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f10288a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && this.f10288a.equals(((e1) obj2).f10288a);
    }

    public final int hashCode() {
        return this.f10288a.hashCode();
    }
}
