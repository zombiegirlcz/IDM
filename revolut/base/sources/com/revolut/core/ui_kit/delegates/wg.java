package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yp0.s;

/* JADX INFO: loaded from: classes19.dex */
public final class wg extends SmallStockCardDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54923a;

    public wg(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        s.b rightmostImage = s.b.f315754a;
        Intrinsics.checkNotNullParameter(rightmostImage, "rightmostImage");
        this.f54923a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wg) || !Intrinsics.f(this.f54923a, ((wg) obj2).f54923a)) {
            return false;
        }
        Object obj3 = s.b.f315754a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return s.b.f315754a.hashCode() + (this.f54923a.hashCode() * 31);
    }
}
