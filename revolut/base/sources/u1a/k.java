package u1a;

import cli.p;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel f276373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f276374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276375c;

    public k(ProfileCardModel profileCardModel, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(profileCardModel, "profileCardModel");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f276373a = profileCardModel;
        this.f276374b = menuItems;
        this.f276375c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f276375c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f276373a, kVar.f276373a) && Intrinsics.f(this.f276374b, kVar.f276374b) && Intrinsics.f(this.f276375c, kVar.f276375c);
    }

    public final int hashCode() {
        return this.f276375c.hashCode() + p.a.d(this.f276373a.hashCode() * 31, 31, this.f276374b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(ProfileCardModel profileCardModel, List list, int i) {
        f0 f0Var = f0.f322471a;
        this(profileCardModel, f0Var, (i & 4) != 0 ? f0Var : list);
    }
}
