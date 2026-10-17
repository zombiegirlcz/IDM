package ptb;

import com.revolut.core.ui_kit.utils.TagTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagTarget f239651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mw0.a f239652b;

    public k(TagTarget target, mw0.a model) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f239651a = target;
        this.f239652b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f239651a.equals(kVar.f239651a) && this.f239652b.equals(kVar.f239652b);
    }

    public final int hashCode() {
        return this.f239652b.hashCode() + (this.f239651a.f58294a.hashCode() * 31);
    }
}
