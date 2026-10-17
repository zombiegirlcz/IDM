package dce;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f112864a;

    public f0(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112864a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f112864a, ((f0) obj2).f112864a);
    }

    public final int hashCode() {
        return this.f112864a.hashCode();
    }
}
