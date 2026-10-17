package com.revolut.core.ui_kit.internal.views.chart;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends us0.f {
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f56782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ HistogramView f56783h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HistogramView histogramView) {
        super(histogramView, us0.b.BAR_CHART);
        this.f56783h = histogramView;
        this.f = new RectF();
        this.f56782g = new Rect();
    }

    @Override // us0.f
    public final Clause a() {
        return this.f56783h.getContentDescription();
    }

    @Override // us0.f
    public final Rect b() {
        RectF rectF = this.f56783h.getDrawHolder().i;
        Rect rect = this.f56782g;
        knm.b.R(rect, rectF);
        return rect;
    }

    @Override // us0.f
    public final int c(float f, float f4) {
        float f5;
        HistogramView histogramView = this.f56783h;
        float f6 = histogramView.getDrawHolder().i.top;
        RectF rectF = this.f;
        rectF.top = f6;
        rectF.bottom = histogramView.getDrawHolder().i.bottom;
        RectF[] rectFArr = histogramView.getDrawHolder().f56692g;
        int i = 0;
        if (rectFArr.length > 1) {
            f5 = rectFArr[1].left - rectFArr[0].right;
        } else {
            f5 = BitmapDescriptorFactory.HUE_RED;
        }
        RectF[] rectFArr2 = histogramView.getDrawHolder().f56692g;
        int length = rectFArr2.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            RectF rectF2 = rectFArr2[i];
            float f32 = f5 / 2.0f;
            rectF.left = rectF2.left - f32;
            rectF.right = rectF2.right + f32;
            if (rectF.contains(f, f4)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -1;
    }

    @Override // us0.f
    public final void d(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        int size = this.f56783h.getItems().size();
        for (int i = 0; i < size; i++) {
            virtualViewIds.add(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    @Override // us0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r18, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r19) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chart.g.e(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
