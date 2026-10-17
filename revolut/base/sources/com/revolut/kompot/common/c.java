package com.revolut.kompot.common;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import dki.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends ModalDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f98323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalDestination.Style f98324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f98325c;

    public c(p flow, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f98323a = flow;
        this.f98324b = style;
        this.f98325c = function1;
    }

    public final p a() {
        return this.f98323a;
    }

    public final ModalDestination.Style b() {
        return this.f98324b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f98323a, cVar.f98323a) && Intrinsics.f(this.f98324b, cVar.f98324b) && Intrinsics.f(this.f98325c, cVar.f98325c);
    }

    public final int hashCode() {
        int iHashCode = (this.f98324b.hashCode() + (this.f98323a.hashCode() * 31)) * 31;
        Function1 function1 = this.f98325c;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public /* synthetic */ c(BaseFlow baseFlow, Function1 function1, int i) {
        this(baseFlow, ModalDestination.Style.FULLSCREEN_FADE.f98307a, (i & 4) != 0 ? null : function1);
    }
}
