package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends ObjectCarouselNavBarContentView.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f59551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f59552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f59553c;
    public final ObjectCarouselNavBarContentView.CarouselItemModel d;

    public v(TextLocalisedClause title, TextLocalisedClause subtitle, ArrayList items, ObjectCarouselNavBarContentView.CarouselItemModel carouselItemModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f59551a = title;
        this.f59552b = subtitle;
        this.f59553c = items;
        this.d = carouselItemModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f59551a.equals(vVar.f59551a) && this.f59552b.equals(vVar.f59552b) && this.f59553c.equals(vVar.f59553c) && this.d.equals(vVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f59553c, t61.a.a(this.f59551a.hashCode() * 31, 31, this.f59552b), 31);
    }
}
