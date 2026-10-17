package com.revolut.core.ui_kit.internal.dialogs;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import cr0.f;
import cr0.h;
import iv0.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends AnchoredStateBottomSheetBehavior.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomExpandableDialogView f55920a;

    public a(BottomExpandableDialogView bottomExpandableDialogView) {
        this.f55920a = bottomExpandableDialogView;
    }

    @Override // com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior.b, cr0.a
    public final void a(View bottomSheet, int i, int i2) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        h hVarL0 = BottomExpandableDialogView.l0(i2);
        h hVarL02 = BottomExpandableDialogView.l0(i);
        BottomExpandableDialogView bottomExpandableDialogView = this.f55920a;
        bottomExpandableDialogView.f55906n.onNext(hVarL0);
        bottomExpandableDialogView.g0(hVarL0, hVarL02);
        if (bottomExpandableDialogView.getSupportBackButtonHideDialog()) {
            if (f.f108167a[hVarL0.ordinal()] == 1) {
                Context context = bottomExpandableDialogView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                tri.c cVarA = ue8.c.A(context);
                if (cVarA != null) {
                    cVarA.b(bottomExpandableDialogView);
                    return;
                }
                return;
            }
            Context context2 = bottomExpandableDialogView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            tri.c cVarA2 = ue8.c.A(context2);
            if (cVarA2 != null) {
                cVarA2.a(bottomExpandableDialogView, new co7.a(bottomExpandableDialogView, 9));
            }
        }
    }

    @Override // com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior.b, cr0.a
    public final void onSlide(View bottomSheet, float f) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        BottomExpandableDialogView.Companion companion = BottomExpandableDialogView.INSTANCE;
        BottomExpandableDialogView bottomExpandableDialogView = this.f55920a;
        if (bottomExpandableDialogView.m0()) {
            BottomExpandableDialogView.b bVar = bottomExpandableDialogView.f55913x;
            if (bVar == null) {
                Intrinsics.r("config");
                throw null;
            }
            BottomExpandableDialogView.b.a aVar = bVar instanceof BottomExpandableDialogView.b.a ? (BottomExpandableDialogView.b.a) bVar : null;
            if ((aVar != null ? aVar.f55917c : null) == b.DYNAMIC_MARGINS) {
                float f4 = f >= 0.8f ? (f - 0.8f) / 0.19999999f : BitmapDescriptorFactory.HUE_RED;
                s sVar = bottomExpandableDialogView.O;
                if (sVar != null) {
                    int i = (int) (bottomExpandableDialogView.z * f4);
                    Rect rect = sVar.e;
                    if (rect.bottom != i) {
                        rect.bottom = i;
                        bottomExpandableDialogView.invalidateOutline();
                    }
                }
            }
        }
        Function1 function1 = bottomExpandableDialogView.f;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
    }
}
