package com.revolut.core.ui_kit.internal.views.chart;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f56758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56760c;

    public a(Clause label, float f, float f4) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f56758a = label;
        this.f56759b = f;
        this.f56760c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f56758a, aVar.f56758a) && Float.compare(this.f56759b, aVar.f56759b) == 0 && Float.compare(this.f56760c, aVar.f56760c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f56760c) + m72.b.b(this.f56759b, this.f56758a.hashCode() * 31, 31);
    }
}
