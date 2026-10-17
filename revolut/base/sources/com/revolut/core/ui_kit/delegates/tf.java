package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tf extends RowDelegate.Model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.l f54782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf f54783b;

    public tf(yy0.l imageUiElement, sf verticalAlignment) {
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.f54782a = imageUiElement;
        this.f54783b = verticalAlignment;
    }

    public final yy0.l a() {
        return this.f54782a;
    }

    public final sf b() {
        return this.f54783b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj2;
        return Intrinsics.f(this.f54782a, tfVar.f54782a) && this.f54783b == tfVar.f54783b;
    }

    public final int hashCode() {
        return this.f54783b.hashCode() + (this.f54782a.hashCode() * 31);
    }

    public /* synthetic */ tf(yy0.l lVar) {
        this(lVar, sf.CENTER);
    }

    public tf(int i, Image image, boolean z) {
        yy0.l lVarL;
        z = (i & 2) != 0 ? false : z;
        sf verticalAlignment = sf.CENTER;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        Intrinsics.checkNotNullParameter(image, "<this>");
        if (z) {
            lVarL = new yy0.k(image.getF59199b(), image);
        } else {
            lVarL = nz8.d.L(image);
        }
        this(lVarL, verticalAlignment);
    }
}
