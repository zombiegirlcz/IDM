package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.delegates.ProgressTimelineDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class mc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressTimelineDelegate f54476b;

    public /* synthetic */ mc(ProgressTimelineDelegate progressTimelineDelegate, int i) {
        this.f54475a = i;
        this.f54476b = progressTimelineDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f54475a) {
            case 0:
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                ProgressTimelineDelegate.StepDelegate stepDelegate = this.f54476b.f53032c;
                FrameLayout frameLayout = new FrameLayout(context);
                stepDelegate.getClass();
                return ProgressTimelineDelegate.StepDelegate.q(frameLayout);
            default:
                pc step = (pc) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                ProgressTimelineDelegate progressTimelineDelegate = this.f54476b;
                oc ocVar = (oc) progressTimelineDelegate.e.c();
                progressTimelineDelegate.f53032c.p(ocVar, step, 0, zhm.f0.f322471a);
                ocVar.itemView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                return Integer.valueOf(ocVar.itemView.getMeasuredWidth());
        }
    }
}
