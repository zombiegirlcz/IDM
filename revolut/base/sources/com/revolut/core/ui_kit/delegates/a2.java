package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a2 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f53656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f53657c;

    public a2(String listId, List iconList, Image image) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(iconList, "iconList");
        this.f53655a = listId;
        this.f53656b = iconList;
        this.f53657c = image;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CardPersonalisationToolbarDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52354a() {
        return this.f53655a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return this.f53655a.equals(a2Var.f53655a) && Intrinsics.f(this.f53656b, a2Var.f53656b) && Intrinsics.f(this.f53657c, a2Var.f53657c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f53655a.hashCode() * 31, 31, this.f53656b);
        Image image = this.f53657c;
        return (iD + (image == null ? 0 : image.hashCode())) * 31;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof a2 ? (a2) oldItem : null) == null) {
            return null;
        }
        a2 a2Var = (a2) oldItem;
        return new ip0.q5(!Intrinsics.f(a2Var.f53656b, this.f53656b), !Intrinsics.f(a2Var.f53657c, this.f53657c), !true);
    }
}
