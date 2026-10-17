package com.revolut.kompot.common;

import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends ModalDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f98314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalDestination.Style f98315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98316c;

    public b(com.revolut.kompot.navigable.a controller, ModalDestination.Style style, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f98314a = controller;
        this.f98315b = style;
        this.f98316c = z;
    }

    public final com.revolut.kompot.navigable.a a() {
        return this.f98314a;
    }

    public final boolean b() {
        return this.f98316c;
    }

    public final ModalDestination.Style c() {
        return this.f98315b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f98314a, bVar.f98314a) && Intrinsics.f(this.f98315b, bVar.f98315b) && this.f98316c == bVar.f98316c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98316c) + ((this.f98315b.hashCode() + (this.f98314a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ b(com.revolut.kompot.navigable.a aVar, ModalDestination.Style style, int i) {
        this(aVar, (i & 2) != 0 ? ModalDestination.Style.FULLSCREEN_FADE.f98307a : style, false);
    }
}
