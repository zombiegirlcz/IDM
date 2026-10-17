package kkk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f185114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f185115c;
    public final Clause d;
    public final aw0.i e;

    public p(List items, AnimatedBackgroundType animatedBackgroundType, CdnImage cdnImage, TextLocalisedClause textLocalisedClause, aw0.h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f185113a = items;
        this.f185114b = animatedBackgroundType;
        this.f185115c = cdnImage;
        this.d = textLocalisedClause;
        this.e = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f185113a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f185113a, pVar.f185113a) && Intrinsics.f(this.f185114b, pVar.f185114b) && Intrinsics.f(this.f185115c, pVar.f185115c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f185113a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f185114b;
        int iHashCode2 = (iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31;
        Image image = this.f185115c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
        aw0.i iVar = this.e;
        return iHashCode4 + (iVar != null ? iVar.hashCode() : 0);
    }
}
