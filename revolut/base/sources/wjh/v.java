package wjh;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements bih.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2b.a f298116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f298118c;
    public final ArrayList d;
    public final AnimationRequest e;
    public final WealthAccount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bih.b f298119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f298120h;

    public v(b2b.a content, boolean z, int i, ArrayList swipeableAssets, AnimationRequest animationRequest, WealthAccount account, bih.b expandCollapseItemsCtaState, List accountActions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        Intrinsics.checkNotNullParameter(accountActions, "accountActions");
        this.f298116a = content;
        this.f298117b = z;
        this.f298118c = i;
        this.d = swipeableAssets;
        this.e = animationRequest;
        this.f = account;
        this.f298119g = expandCollapseItemsCtaState;
        this.f298120h = accountActions;
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
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f298116a, vVar.f298116a) && this.f298117b == vVar.f298117b && this.f298118c == vVar.f298118c && this.d.equals(vVar.d) && Intrinsics.f(this.e, vVar.e) && this.f.equals(vVar.f) && this.f298119g == vVar.f298119g && Intrinsics.f(this.f298120h, vVar.f298120h);
    }

    @Override // bih.m
    public final int getOrder() {
        return this.f298118c;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f298118c, j6.a.c(this.f298116a.hashCode() * 31, 31, this.f298117b), 31), 31);
        AnimationRequest animationRequest = this.e;
        return this.f298120h.hashCode() + ((this.f298119g.hashCode() + ((this.f.hashCode() + ((iB + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31)) * 31)) * 31);
    }
}
