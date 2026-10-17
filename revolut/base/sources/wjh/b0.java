package wjh;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements bih.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3f.a f298091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f298093c;
    public final ArrayList d;
    public final AnimationRequest e;
    public final WealthAccount.TaxAdvantageWealthAccount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f298094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bih.b f298095h;
    public final List i;

    public b0(d3f.a content, boolean z, int i, ArrayList swipeableAssets, AnimationRequest animationRequest, WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount, boolean z3, bih.b expandCollapseItemsCtaState, List accountActions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        Intrinsics.checkNotNullParameter(taxAdvantageWealthAccount, "taxAdvantageWealthAccount");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        Intrinsics.checkNotNullParameter(accountActions, "accountActions");
        this.f298091a = content;
        this.f298092b = z;
        this.f298093c = i;
        this.d = swipeableAssets;
        this.e = animationRequest;
        this.f = taxAdvantageWealthAccount;
        this.f298094g = z3;
        this.f298095h = expandCollapseItemsCtaState;
        this.i = accountActions;
    }

    @Override // bih.m
    public final List a() {
        return this.d;
    }

    @Override // bih.m
    public final AnimationRequest b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f298091a, b0Var.f298091a) && this.f298092b == b0Var.f298092b && this.f298093c == b0Var.f298093c && this.d.equals(b0Var.d) && Intrinsics.f(this.e, b0Var.e) && this.f.equals(b0Var.f) && this.f298094g == b0Var.f298094g && this.f298095h == b0Var.f298095h && Intrinsics.f(this.i, b0Var.i);
    }

    @Override // bih.m
    public final int getOrder() {
        return this.f298093c;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f298093c, j6.a.c(this.f298091a.hashCode() * 31, 31, this.f298092b), 31), 31);
        AnimationRequest animationRequest = this.e;
        return this.i.hashCode() + ((this.f298095h.hashCode() + j6.a.c((this.f.hashCode() + ((iB + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31)) * 31, 31, this.f298094g)) * 31);
    }
}
