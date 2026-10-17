package com.revolut.core.ui_kit.delegates;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f6 extends zi0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ip0.yh f54145b;

    public f6(ArrayList productsItems, ip0.yh ratio) {
        Intrinsics.checkNotNullParameter(productsItems, "productsItems");
        ew0.a backgroundType = ew0.a.f129982a;
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.f54144a = productsItems;
        this.f54145b = ratio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj2;
        if (!this.f54144a.equals(f6Var.f54144a)) {
            return false;
        }
        Object obj3 = ew0.a.f129982a;
        return obj3.equals(obj3) && this.f54145b == f6Var.f54145b;
    }

    public final int hashCode() {
        return this.f54145b.hashCode() + ((ew0.a.f129982a.hashCode() + (this.f54144a.hashCode() * 31)) * 31);
    }
}
