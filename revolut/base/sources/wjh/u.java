package wjh;

import com.revolut.core.ui_kit.models.AnimationRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements bih.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot5.b f298113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f298115c;
    public final ArrayList d;
    public final AnimationRequest e;
    public final bih.b f;

    public u(ot5.b content, boolean z, int i, ArrayList swipeableAssets, AnimationRequest animationRequest, bih.b expandCollapseItemsCtaState) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        this.f298113a = content;
        this.f298114b = z;
        this.f298115c = i;
        this.d = swipeableAssets;
        this.e = animationRequest;
        this.f = expandCollapseItemsCtaState;
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
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f298113a.equals(uVar.f298113a) && this.f298114b == uVar.f298114b && this.f298115c == uVar.f298115c && this.d.equals(uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f;
    }

    @Override // bih.m
    public final int getOrder() {
        return this.f298115c;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f298115c, j6.a.c(this.f298113a.hashCode() * 31, 31, this.f298114b), 31), 31);
        AnimationRequest animationRequest = this.e;
        return this.f.hashCode() + ((iB + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31);
    }
}
