package com.revolut.core.ui_kit.internal.views.navbar;

import com.revolut.core.ui_kit.internal.views.navbar.VersatileTitleView;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends VersatileTitleView.a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57414b;

    public h(Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f57413a = clause;
        this.f57414b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f57413a, hVar.f57413a) && this.f57414b == hVar.f57414b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57414b) + (this.f57413a.hashCode() * 31);
    }
}
