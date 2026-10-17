package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10333a;

    public h1(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f10333a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && Intrinsics.f(this.f10333a, ((h1) obj2).f10333a);
    }

    public final int hashCode() {
        return this.f10333a.hashCode();
    }
}
