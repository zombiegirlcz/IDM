package cie;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.t2;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f24480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f24481c;
    public final ArrayList d;
    public final List e;
    public final tx0.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f24482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24483h;
    public final ola.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24484j;
    public final d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NavBarMessage f24485l;

    public h0(List items, t2 profileAvatar, TextLocalisedClause searchButtonText, ArrayList menuItems, List headerContentModels, tx0.q pagerIndicatorType, AnalyticsContext analyticsContext, boolean z, ola.c loadingNavBarIntroProduct, String str, d0 d0Var, NavBarMessage navBarMessage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profileAvatar, "profileAvatar");
        Intrinsics.checkNotNullParameter(searchButtonText, "searchButtonText");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(headerContentModels, "headerContentModels");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        Intrinsics.checkNotNullParameter(loadingNavBarIntroProduct, "loadingNavBarIntroProduct");
        this.f24479a = items;
        this.f24480b = profileAvatar;
        this.f24481c = searchButtonText;
        this.d = menuItems;
        this.e = headerContentModels;
        this.f = pagerIndicatorType;
        this.f24482g = analyticsContext;
        this.f24483h = z;
        this.i = loadingNavBarIntroProduct;
        this.f24484j = str;
        this.k = d0Var;
        this.f24485l = navBarMessage;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new g0((h0) oldState);
    }

    @Override // cli.p
    public final List c() {
        return this.f24479a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f24479a, h0Var.f24479a) && this.f24480b.equals(h0Var.f24480b) && this.f24481c.equals(h0Var.f24481c) && this.d.equals(h0Var.d) && Intrinsics.f(this.e, h0Var.e) && this.f.equals(h0Var.f) && Intrinsics.f(this.f24482g, h0Var.f24482g) && this.f24483h == h0Var.f24483h && this.i == h0Var.i && Intrinsics.f(this.f24484j, h0Var.f24484j) && Intrinsics.f(this.k, h0Var.k) && Intrinsics.f(this.f24485l, h0Var.f24485l);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, t61.a.a((this.f24480b.hashCode() + (this.f24479a.hashCode() * 31)) * 31, 31, this.f24481c), 31), 31, this.e)) * 31;
        AnalyticsContext analyticsContext = this.f24482g;
        int iHashCode2 = (this.i.hashCode() + j6.a.c((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f24483h)) * 31;
        String str = this.f24484j;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        d0 d0Var = this.k;
        int iHashCode4 = (iHashCode3 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        NavBarMessage navBarMessage = this.f24485l;
        return iHashCode4 + (navBarMessage != null ? navBarMessage.hashCode() : 0);
    }
}
