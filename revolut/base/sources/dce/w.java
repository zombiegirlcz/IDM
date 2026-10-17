package dce;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsChevronDelegate.Model f112905a;

    public w(CellDetailsChevronDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112905a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f112905a, ((w) obj2).f112905a);
    }

    public final int hashCode() {
        return this.f112905a.hashCode();
    }
}
