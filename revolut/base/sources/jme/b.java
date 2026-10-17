package jme;

import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollerNavBarContentView.b f176602a;

    public b(ScrollerNavBarContentView.b scrollerModel) {
        Intrinsics.checkNotNullParameter(scrollerModel, "scrollerModel");
        this.f176602a = scrollerModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f176602a, ((b) obj2).f176602a);
    }

    public final int hashCode() {
        return this.f176602a.hashCode();
    }
}
