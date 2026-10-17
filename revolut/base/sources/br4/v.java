package br4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f17922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f17923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17924c;
    public final LayeredImage d;

    public v(TextLocalisedClause title, TextLocalisedClause toolbarTitle, Clause description, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f17922a = title;
        this.f17923b = toolbarTitle;
        this.f17924c = description;
        this.d = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f17922a.equals(vVar.f17922a) && this.f17923b.equals(vVar.f17923b) && this.f17924c.equals(vVar.f17924c) && this.d.equals(vVar.d);
    }

    public final int hashCode() {
        return h30.l.e(this.d, p.a.b(t61.a.a(this.f17922a.hashCode() * 31, 31, this.f17923b), 31, this.f17924c), 961);
    }
}
