package qf1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f245222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f245223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f245224c;
    public final int d;
    public final CircleBadgeModel e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f245225g;

    public m(Clause title, Clause subtitle, Clause valueAction, int i, CircleBadgeModel circleBadgeModel, b background, String str, int i2) {
        circleBadgeModel = (i2 & 32) != 0 ? null : circleBadgeModel;
        str = (i2 & 128) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(valueAction, "valueAction");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f245222a = title;
        this.f245223b = subtitle;
        this.f245224c = valueAction;
        this.d = i;
        this.e = circleBadgeModel;
        this.f = background;
        this.f245225g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f245222a, mVar.f245222a) && Intrinsics.f(this.f245223b, mVar.f245223b) && Intrinsics.f(this.f245224c, mVar.f245224c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f245225g, mVar.f245225g);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.a(p.a.a(this.f245222a.hashCode() * 31, 31, this.f245223b), 31, this.f245224c), 961);
        CircleBadgeModel circleBadgeModel = this.e;
        int iHashCode = (this.f.hashCode() + ((iB + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31)) * 31;
        String str = this.f245225g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
