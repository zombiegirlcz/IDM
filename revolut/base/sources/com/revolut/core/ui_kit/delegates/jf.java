package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f54334b;

    public jf(Clause text, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f54333a = text;
        this.f54334b = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj2;
        return this.f54333a.equals(jfVar.f54333a) && Intrinsics.f(this.f54334b, jfVar.f54334b);
    }

    public final int hashCode() {
        int iHashCode = this.f54333a.hashCode() * 31;
        Image image = this.f54334b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
