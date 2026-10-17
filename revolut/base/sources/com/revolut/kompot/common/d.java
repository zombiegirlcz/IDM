package com.revolut.kompot.common;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.navigable.screen.BaseScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends ModalDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f98326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalDestination.Style f98327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f98328c;

    public d(BaseScreen screen, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f98326a = screen;
        this.f98327b = style;
        this.f98328c = function1;
    }

    public final BaseScreen a() {
        return this.f98326a;
    }

    public final ModalDestination.Style b() {
        return this.f98327b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f98326a, dVar.f98326a) && Intrinsics.f(this.f98327b, dVar.f98327b) && Intrinsics.f(this.f98328c, dVar.f98328c);
    }

    public final int hashCode() {
        int iHashCode = (this.f98327b.hashCode() + (this.f98326a.hashCode() * 31)) * 31;
        Function1 function1 = this.f98328c;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(BaseRecyclerViewScreen baseRecyclerViewScreen, int i) {
        ModalDestination.Style style;
        if ((i & 2) != 0) {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        } else {
            style = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        }
        this(baseRecyclerViewScreen, style, null);
    }
}
