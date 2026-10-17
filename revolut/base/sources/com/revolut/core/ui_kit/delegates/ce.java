package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ce implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f53751b;

    public ce(String listId, Image image) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f53750a = listId;
        this.f53751b = image;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f53750a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj2;
        return Intrinsics.f(this.f53750a, ceVar.f53750a) && Intrinsics.f(this.f53751b, ceVar.f53751b);
    }

    public final int hashCode() {
        return this.f53751b.hashCode() + (this.f53750a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof ce) {
            return new be(!Intrinsics.f(((ce) oldItem).f53751b, this.f53751b));
        }
        return null;
    }
}
