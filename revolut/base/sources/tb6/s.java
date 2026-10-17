package tb6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f269494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f269495c;
    public final Clause d;
    public final Image e;
    public final Image f;

    public s(List list) {
        this(list, f0.f322471a, null, null, null, null);
    }

    @Override // cli.p
    public final List c() {
        return this.f269493a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f269493a, sVar.f269493a) && Intrinsics.f(this.f269494b, sVar.f269494b) && Intrinsics.f(this.f269495c, sVar.f269495c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f269493a.hashCode() * 31, 31, this.f269494b);
        Clause clause = this.f269495c;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.e;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f;
        return iHashCode3 + (image2 != null ? image2.hashCode() : 0);
    }

    public s(List items, List actionViews, TextClause textClause, MoneyClause moneyClause, UrlImage urlImage, UrlImage urlImage2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionViews, "actionViews");
        this.f269493a = items;
        this.f269494b = actionViews;
        this.f269495c = textClause;
        this.d = moneyClause;
        this.e = urlImage;
        this.f = urlImage2;
    }
}
