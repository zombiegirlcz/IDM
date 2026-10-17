package aw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f10455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f10456c;
    public final Object d;

    public p0(String listId, TextLocalisedClause title, CircleImageDecorator circleImageDecorator, Object obj2, int i) {
        circleImageDecorator = (i & 8) != 0 ? null : circleImageDecorator;
        obj2 = (i & 16) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10454a = listId;
        this.f10455b = title;
        this.f10456c = circleImageDecorator;
        this.d = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55191g() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f10454a.equals(p0Var.f10454a) && this.f10455b.equals(p0Var.f10455b) && Intrinsics.f(this.f10456c, p0Var.f10456c) && Intrinsics.f(this.d, p0Var.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f10454a.hashCode() * 31, 961, this.f10455b);
        Image image = this.f10456c;
        int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
