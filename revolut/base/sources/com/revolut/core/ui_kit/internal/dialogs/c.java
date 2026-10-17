package com.revolut.core.ui_kit.internal.dialogs;

import android.view.View;
import com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends AnchoredStateBottomSheetBehavior.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr0.d f55921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomExpandableDialogView f55923c;

    public c(BottomExpandableDialogView bottomExpandableDialogView, cr0.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f55923c = bottomExpandableDialogView;
        this.f55921a = action;
    }

    @Override // com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior.b, cr0.a
    public final void a(View bottomSheet, int i, int i2) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (this.f55922b) {
            return;
        }
        BottomExpandableDialogView.Companion companion = BottomExpandableDialogView.INSTANCE;
        this.f55923c.getClass();
        this.f55921a.invoke(BottomExpandableDialogView.l0(i2));
    }

    @Override // com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior.b, cr0.a
    public final void b(int i) {
        if (this.f55922b) {
            return;
        }
        BottomExpandableDialogView.Companion companion = BottomExpandableDialogView.INSTANCE;
        this.f55923c.getClass();
        this.f55921a.invoke(BottomExpandableDialogView.l0(i));
    }
}
