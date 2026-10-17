package jy0;

import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOutlineProvider f179264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f179265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f179266c;

    public j(ViewOutlineProvider viewOutlineProvider, boolean z, float f) {
        this.f179264a = viewOutlineProvider;
        this.f179265b = z;
        this.f179266c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f179264a, jVar.f179264a) && this.f179265b == jVar.f179265b && Float.compare(this.f179266c, jVar.f179266c) == 0;
    }

    public final int hashCode() {
        ViewOutlineProvider viewOutlineProvider = this.f179264a;
        return Float.hashCode(this.f179266c) + j6.a.c((viewOutlineProvider == null ? 0 : viewOutlineProvider.hashCode()) * 31, 31, this.f179265b);
    }
}
