package wjh;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements bih.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3f.a f298124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f298126c;
    public final ArrayList d;
    public final AnimationRequest e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WealthAccount f298127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f298128h;
    public final bih.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f298129j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f298130l;

    public x(d3f.a content, boolean z, int i, ArrayList swipeableAssets, AnimationRequest animationRequest, Data data, WealthAccount account, boolean z3, bih.b expandCollapseItemsCtaState, List accountActions, Data data2, List list) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        Intrinsics.checkNotNullParameter(accountActions, "accountActions");
        this.f298124a = content;
        this.f298125b = z;
        this.f298126c = i;
        this.d = swipeableAssets;
        this.e = animationRequest;
        this.f = data;
        this.f298127g = account;
        this.f298128h = z3;
        this.i = expandCollapseItemsCtaState;
        this.f298129j = accountActions;
        this.k = data2;
        this.f298130l = list;
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
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f298124a, xVar.f298124a) && this.f298125b == xVar.f298125b && this.f298126c == xVar.f298126c && this.d.equals(xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && this.f298127g.equals(xVar.f298127g) && this.f298128h == xVar.f298128h && this.i == xVar.i && Intrinsics.f(this.f298129j, xVar.f298129j) && Intrinsics.f(this.k, xVar.k) && Intrinsics.f(this.f298130l, xVar.f298130l);
    }

    @Override // bih.m
    public final int getOrder() {
        return this.f298126c;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f298126c, j6.a.c(this.f298124a.hashCode() * 31, 31, this.f298125b), 31), 31);
        AnimationRequest animationRequest = this.e;
        int iHashCode = (iB + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
        Data data = this.f;
        int iD = p.a.d((this.i.hashCode() + j6.a.c((this.f298127g.hashCode() + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31)) * 31, 31, this.f298128h)) * 31, 31, this.f298129j);
        Data data2 = this.k;
        int iHashCode2 = (iD + (data2 == null ? 0 : data2.hashCode())) * 31;
        List list = this.f298130l;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
