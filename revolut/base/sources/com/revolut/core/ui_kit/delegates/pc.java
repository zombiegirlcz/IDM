package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import ip0.y50;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pc implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f54583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f54584c;
    public final y50 d;

    public pc(String listId, ResourceImage icon, TimeClause title, y50 style) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54582a = listId;
        this.f54583b = icon;
        this.f54584c = title;
        this.d = style;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55201b() {
        return this.f54582a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj2;
        return Intrinsics.f(this.f54582a, pcVar.f54582a) && this.f54583b.equals(pcVar.f54583b) && this.f54584c.equals(pcVar.f54584c) && Intrinsics.f(this.d, pcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.d(this.f54584c, org.bouncycastle.jcajce.provider.digest.a.b(this.f54583b, this.f54582a.hashCode() * 31, 31), 961);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof pc)) {
            return null;
        }
        pc pcVar = (pc) oldItem;
        return new nc(!this.f54584c.equals(pcVar.f54584c), !this.f54583b.equals(pcVar.f54583b), !true, !Intrinsics.f(this.d, pcVar.d));
    }
}
