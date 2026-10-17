package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p3 implements q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f54571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f54572b;

    public p3(CompositeClause title, ArrayList scrollerItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(scrollerItems, "scrollerItems");
        this.f54571a = title;
        this.f54572b = scrollerItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return this.f54571a.equals(p3Var.f54571a) && this.f54572b.equals(p3Var.f54572b);
    }

    public final int hashCode() {
        return this.f54572b.hashCode() + (this.f54571a.hashCode() * 31);
    }
}
