package com.google.android.material.sidesheet;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import dyl.j;
import kotlin.jvm.internal.Ref$ObjectRef;
import z9h.n;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49139a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f49140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49141c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(View view, int i, Ref$ObjectRef ref$ObjectRef, RecyclerView recyclerView) {
        this.f49140b = view;
        this.f49141c = i;
        this.d = ref$ObjectRef;
        this.e = recyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f49139a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i2 = this.f49141c;
        View view = this.f49140b;
        switch (i) {
            case 0:
                ((SideSheetBehavior) obj3).lambda$getCoplanarFinishAnimatorUpdateListener$1((ViewGroup.MarginLayoutParams) obj2, i2, view, valueAnimator);
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                RecyclerView recyclerView = (RecyclerView) obj2;
                int i3 = TransferToChatTransitionFlowContainerLayout.f107124p;
                float fFloatValue = ((Float) n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                view.setAlpha(fFloatValue);
                float fAlpha = Color.alpha(i2) / 255.0f;
                float f = fAlpha < 1.0f ? (1.0f - fFloatValue) / (1.0f - (fAlpha * fFloatValue)) : 1.0f;
                j jVar = (j) ref$ObjectRef.f186409a;
                if (jVar != null) {
                    jVar.f121157b.setAlpha((int) (255 * f));
                }
                recyclerView.invalidate();
                break;
        }
    }

    public /* synthetic */ d(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view) {
        this.d = sideSheetBehavior;
        this.e = marginLayoutParams;
        this.f49141c = i;
        this.f49140b = view;
    }
}
