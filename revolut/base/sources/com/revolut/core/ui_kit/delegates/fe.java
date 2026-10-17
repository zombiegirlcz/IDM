package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fe implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f54163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54164c;
    public final boolean d;

    public fe(String listId, Image image, Clause label, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f54162a = listId;
        this.f54163b = image;
        this.f54164c = label;
        this.d = z;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52708a() {
        return this.f54162a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj2;
        return Intrinsics.f(this.f54162a, feVar.f54162a) && Intrinsics.f(this.f54163b, feVar.f54163b) && this.f54164c.equals(feVar.f54164c) && this.d == feVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f54162a.hashCode() * 31;
        Image image = this.f54163b;
        return j6.a.c(p.a.b((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f54164c), 31, this.d);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof fe)) {
            return null;
        }
        return new ee(!Intrinsics.f(this.f54163b, r6.f54163b), !this.f54164c.equals(r6.f54164c), this.d != ((fe) oldItem).d);
    }
}
