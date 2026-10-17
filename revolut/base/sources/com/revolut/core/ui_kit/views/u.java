package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends Tabs.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yy0.j f59746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f59747c;

    public u(Clause title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        yy0.j imageUiElement = new yy0.j(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        s imagePosition = s.START;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
        this.f59745a = title;
        this.f59746b = imageUiElement;
        this.f59747c = imagePosition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f59745a, uVar.f59745a) && Intrinsics.f(this.f59746b, uVar.f59746b) && this.f59747c == uVar.f59747c;
    }

    public final int hashCode() {
        return this.f59747c.hashCode() + a10.b.c(this.f59746b.f317755a, this.f59745a.hashCode() * 31, 31);
    }
}
