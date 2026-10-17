package vp8;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleChoiceDelegate.Model f291141a;

    public f(SingleChoiceDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f291141a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f291141a, ((f) obj2).f291141a);
    }

    public final int hashCode() {
        return this.f291141a.hashCode();
    }
}
