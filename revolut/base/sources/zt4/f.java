package zt4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f325071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f325072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f325073c;

    public f(TextLocalisedClause title, TextLocalisedClause description, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f325071a = title;
        this.f325072b = description;
        this.f325073c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f325071a.equals(fVar.f325071a) && this.f325072b.equals(fVar.f325072b) && this.f325073c.equals(fVar.f325073c);
    }

    public final int hashCode() {
        return this.f325073c.hashCode() + t61.a.a(this.f325071a.hashCode() * 31, 31, this.f325072b);
    }
}
