package com.revolut.ui_kit_pdf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ip0.ad;
import jyl.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import nyl.b;
import org.jetbrains.annotations.NotNull;
import oyl.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/ui_kit_pdf/PdfView;", "Landroid/widget/FrameLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "jyl/a", "ui_kit_pdf_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfView extends FrameLayout implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f107139a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final f a(Function1 configure) {
        Intrinsics.checkNotNullParameter(configure, "configure");
        Intrinsics.checkNotNullParameter(this, "rootView");
        a aVar = new a();
        aVar.f179519a = true;
        aVar.f179521c = true;
        configure.invoke(aVar);
        f fVar = new f(this);
        Function1 onError = aVar.d;
        if (onError != null) {
            Intrinsics.checkNotNullParameter(onError, "onError");
            fVar.f231061b = onError;
        }
        boolean z = aVar.f179519a;
        b bVar = fVar.d;
        bVar.setZoomEnabled(z);
        bVar.setMaxZoom(3.0f);
        boolean z3 = aVar.f179521c;
        int i = z3 ? 0 : 8;
        TextView textView = fVar.e;
        textView.setVisibility(i);
        fVar.f = z3;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        ad zoomChanged = aVar.f179520b;
        if (zoomChanged != null) {
            Intrinsics.checkNotNullParameter(zoomChanged, "zoomChanged");
            bVar.setZoomChanged(zoomChanged);
        }
        this.f107139a = fVar;
        return fVar;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF57230b() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f107139a;
        if (fVar != null) {
            fVar.close();
        }
        this.f107139a = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PdfView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
