package grd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f145996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f145997c;
    public final aw0.e d;

    public e(aim.e items, TextLocalisedClause title, LayeredImage toolbarIcon, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarIcon, "toolbarIcon");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f145995a = items;
        this.f145996b = title;
        this.f145997c = toolbarIcon;
        this.d = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f145995a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f145995a, eVar.f145995a) && this.f145996b.equals(eVar.f145996b) && this.f145997c.equals(eVar.f145997c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.e(this.f145997c, t61.a.a(this.f145995a.hashCode() * 31, 31, this.f145996b), 31);
    }
}
