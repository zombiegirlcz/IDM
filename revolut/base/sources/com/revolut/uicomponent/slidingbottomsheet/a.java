package com.revolut.uicomponent.slidingbottomsheet;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.slidingbottomsheet.MiddleStateBottomSheetBehavior;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zyl.c;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends MiddleStateBottomSheetBehavior.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomExpandableDialogView f107257a;

    public a(BottomExpandableDialogView bottomExpandableDialogView) {
        this.f107257a = bottomExpandableDialogView;
    }

    @Override // com.revolut.uicomponent.slidingbottomsheet.MiddleStateBottomSheetBehavior.a, zyl.f
    public final void a(View bottomSheet, int i, int i2) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        c cVarH0 = BottomExpandableDialogView.h0(i2);
        c cVarH02 = BottomExpandableDialogView.h0(i);
        BottomExpandableDialogView bottomExpandableDialogView = this.f107257a;
        Function1 function1 = bottomExpandableDialogView.f;
        if (function1 != null) {
            function1.invoke(cVarH0);
        }
        c cVar = c.EXPANDED;
        if (cVarH02 == cVar && (cVarH0 == c.DRAGGING || cVarH0 == c.SETTLING)) {
            bottomExpandableDialogView.getRecyclerView().smoothScrollToPosition(0);
        }
        if (bottomExpandableDialogView.getNeedDrawToolbarShadow()) {
            bottomExpandableDialogView.findViewById(R$id.shadowView).animate().alpha(cVarH0 == cVar ? 1.0f : BitmapDescriptorFactory.HUE_RED).setDuration(300L);
        }
    }

    @Override // com.revolut.uicomponent.slidingbottomsheet.MiddleStateBottomSheetBehavior.a, zyl.f
    public final void onSlide(View bottomSheet, float f) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        Function1 function1 = this.f107257a.f107230b;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
    }
}
