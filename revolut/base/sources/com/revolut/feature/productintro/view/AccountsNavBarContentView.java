package com.revolut.feature.productintro.view;

import a0.d;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import aw0.l6;
import com.revolut.feature.productintro.R$styleable;
import eq0.a;
import jo0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oh4.i;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import ue0.e;
import ux0.s0;
import yhm.j;
import z92.f;
import zkm.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/productintro/view/AccountsNavBarContentView;", "Lux0/s0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Law0/l6;", "product", "", "setIntroViewed", "(Law0/l6;)V", "Lwjg/a;", "B", "Lkotlin/Lazy;", "getUiPersonalisationInteractor", "()Lwjg/a;", "uiPersonalisationInteractor", "feature_product_intro_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountsNavBarContentView extends s0 {
    public static final /* synthetic */ int C = 0;
    public final a A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final Lazy uiPersonalisationInteractor;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CoroutineScope f81294y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountsNavBarContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AccountsNavBarContentView);
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AccountsNavBarContentView_particlesThemeHost, false);
            typedArrayObtainStyledAttributes.recycle();
            this.z = z;
            Activity activityI = f.i(context);
            if (activityI == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            phm.a aVar = (phm.a) e.j(activityI).a().get(mla.a.class);
            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
            if (aVar2 == null) {
                throw new IllegalStateException(d.q("Api ", mla.a.class, " is not found"));
            }
            this.A = ((mla.a) aVar2.b()).a();
            this.uiPersonalisationInteractor = j.b(new lu0.a(context, 16));
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wjg.a getUiPersonalisationInteractor() {
        return (wjg.a) this.uiPersonalisationInteractor.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ux0.s0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        CoroutineScope coroutineScope;
        super.onAttachedToWindow();
        p0 p0Var = p0.f264001a;
        this.f81294y = rd0.e.a(o.f323119a.e);
        if (this.z && ((Boolean) g.P.getValue()).booleanValue() && (coroutineScope = this.f81294y) != null) {
            e0.C(coroutineScope, null, null, new nt4.f(this, null, 27), 3);
        }
    }

    @Override // ux0.s0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.f81294y;
        if (coroutineScope != null) {
            e0.k(coroutineScope, null);
        }
        this.f81294y = null;
    }

    @Override // ux0.s0
    public void setIntroViewed(@NotNull l6 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        CoroutineScope coroutineScope = this.f81294y;
        if (coroutineScope != null) {
            e0.C(coroutineScope, null, null, new i(this, product, (Continuation) null, 18), 3);
        }
    }
}
