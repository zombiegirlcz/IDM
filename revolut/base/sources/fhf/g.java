package fhf;

import cli.p;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f135217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f135218c;
    public final List d;

    public g(List items, Image image, CircleBadgeModel circleBadgeModel, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f135216a = items;
        this.f135217b = image;
        this.f135218c = circleBadgeModel;
        this.d = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f135216a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f135216a, gVar.f135216a) && Intrinsics.f(this.f135217b, gVar.f135217b) && Intrinsics.f(this.f135218c, gVar.f135218c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f135216a.hashCode() * 31;
        Image image = this.f135217b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f135218c;
        return this.d.hashCode() + ((iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31);
    }

    public g(List list) {
        this(list, null, null, f0.f322471a);
    }
}
