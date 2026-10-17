package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends Tabs.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.j f59617a;

    public r(int i) {
        this.f59617a = new yy0.j(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f59617a, ((r) obj2).f59617a);
    }

    public final int hashCode() {
        return this.f59617a.f317755a.hashCode();
    }
}
