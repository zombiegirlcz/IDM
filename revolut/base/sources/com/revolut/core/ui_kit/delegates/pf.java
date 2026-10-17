package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pf extends RowDelegate.Model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f54592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms0.h4 f54593c;
    public final boolean d;
    public final boolean e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnimationRequest f54595h;
    public final String i;

    public pf(Clause clause, Image image, ms0.h4 style, boolean z, boolean z3, Object obj2, String str, AnimationRequest animationRequest, String str2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54591a = clause;
        this.f54592b = image;
        this.f54593c = style;
        this.d = z;
        this.e = z3;
        this.f = obj2;
        this.f54594g = str;
        this.f54595h = animationRequest;
        this.i = str2;
    }

    public final String a() {
        return this.i;
    }

    public final boolean b() {
        return this.d;
    }

    public final AnimationRequest c() {
        return this.f54595h;
    }

    public final Image d() {
        return this.f54592b;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj2;
        return Intrinsics.f(this.f54591a, pfVar.f54591a) && Intrinsics.f(this.f54592b, pfVar.f54592b) && this.f54593c == pfVar.f54593c && this.d == pfVar.d && this.e == pfVar.e && Intrinsics.f(this.f, pfVar.f) && Intrinsics.f(this.f54594g, pfVar.f54594g) && Intrinsics.f(this.f54595h, pfVar.f54595h) && Intrinsics.f(this.i, pfVar.i);
    }

    public final ms0.h4 f() {
        return this.f54593c;
    }

    public final String g() {
        return this.f54594g;
    }

    public final Clause h() {
        return this.f54591a;
    }

    public final int hashCode() {
        Clause clause = this.f54591a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f54592b;
        int iC = j6.a.c(j6.a.c((this.f54593c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        Object obj2 = this.f;
        int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.f54594g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AnimationRequest animationRequest = this.f54595h;
        int iHashCode4 = (iHashCode3 + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ pf(Clause clause, ResourceImage resourceImage, ms0.h4 h4Var, boolean z, Object obj2, String str, int i) {
        this(clause, (i & 2) != 0 ? null : resourceImage, (i & 4) != 0 ? ms0.h4.SEMIACCENT : h4Var, (i & 8) != 0 ? true : z, false, (i & 32) != 0 ? null : obj2, (i & 64) != 0 ? null : str, null, null);
    }
}
