package dii;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f115071a;

    public i(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f115071a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f115071a, ((i) obj2).f115071a);
    }

    public final int hashCode() {
        return this.f115071a.hashCode();
    }
}
