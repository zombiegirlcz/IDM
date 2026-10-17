package com.revolut.core.ui_kit.delegates.chat;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f53978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53979b;

    public k(Clause label, ArrayList cells) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.f53978a = label;
        this.f53979b = cells;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f53978a, kVar.f53978a) && this.f53979b.equals(kVar.f53979b);
    }

    public final int hashCode() {
        return this.f53979b.hashCode() + (this.f53978a.hashCode() * 31);
    }
}
