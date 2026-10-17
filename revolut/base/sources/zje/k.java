package zje;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itb.a f322798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f322799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx0.q f322800c;
    public final String d;
    public final List e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f322801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NavBarMessage f322802h;

    public k(itb.a profileAvatar, aim.e headerModels, tx0.q pagerIndicatorType, String str, List headerMenuItems, Clause clause, boolean z, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(profileAvatar, "profileAvatar");
        Intrinsics.checkNotNullParameter(headerModels, "headerModels");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        this.f322798a = profileAvatar;
        this.f322799b = headerModels;
        this.f322800c = pagerIndicatorType;
        this.d = str;
        this.e = headerMenuItems;
        this.f = clause;
        this.f322801g = z;
        this.f322802h = navBarMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f322798a, kVar.f322798a) && Intrinsics.f(this.f322799b, kVar.f322799b) && Intrinsics.f(this.f322800c, kVar.f322800c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && this.f322801g == kVar.f322801g && Intrinsics.f(this.f322802h, kVar.f322802h);
    }

    public final int hashCode() {
        int iHashCode = (this.f322800c.hashCode() + p.a.d(this.f322798a.f168357a.hashCode() * 31, 31, this.f322799b)) * 31;
        String str = this.d;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        int iC = j6.a.c((iD + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f322801g);
        NavBarMessage navBarMessage = this.f322802h;
        return iC + (navBarMessage != null ? navBarMessage.hashCode() : 0);
    }
}
