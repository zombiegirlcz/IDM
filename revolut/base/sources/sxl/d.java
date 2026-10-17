package sxl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f266527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f266528b;

    public d(b handler, View targetView) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        this.f266527a = handler;
        this.f266528b = targetView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f266527a, dVar.f266527a) && Intrinsics.f(this.f266528b, dVar.f266528b);
    }

    public final int hashCode() {
        return this.f266528b.hashCode() + (this.f266527a.hashCode() * 31);
    }
}
