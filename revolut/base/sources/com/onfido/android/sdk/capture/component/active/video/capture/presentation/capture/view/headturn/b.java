package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.view.MotionEvent;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.toolbox.ToolboxView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49895a;

    public /* synthetic */ b(int i) {
        this.f49895a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f49895a) {
            case 0:
                return OnfidoAnimWebView._init_$lambda$0(view, motionEvent);
            case 1:
                ToolboxView.a aVar = ToolboxView.Companion;
                return true;
            case 2:
                SmallActionButton.a aVar2 = SmallActionButton.Companion;
                return true;
            default:
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                Intrinsics.checkNotNullParameter(null, "model");
                throw null;
        }
    }
}
