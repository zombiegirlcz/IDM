package com.revolut.kompot.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import eoi.d;
import hli.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/kompot/view/RootFrameLayout;", "Landroid/widget/FrameLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "hli/j", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RootFrameLayout extends FrameLayout implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f98455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f98456b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RootFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(j metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        ArrayList arrayList = this.f98455a;
        for (int iJ = v.j(arrayList); -1 < iJ; iJ--) {
            if (Intrinsics.f((j) arrayList.get(iJ), metrics)) {
                arrayList.remove(iJ);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long jNanoTime = System.nanoTime();
        super.dispatchDraw(canvas);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        ArrayList arrayList = this.f98455a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j) arrayList.get(i)).a().a(jNanoTime2);
        }
        List list = this.f98456b;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((d) list.get(i2)).a();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long jNanoTime = System.nanoTime();
        super.onDraw(canvas);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        ArrayList arrayList = this.f98455a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j) arrayList.get(i)).a().a(jNanoTime2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        long jNanoTime = System.nanoTime();
        super.onLayout(z, i, i2, i3, i5);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        ArrayList arrayList = this.f98455a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((j) arrayList.get(i6)).b().a(jNanoTime2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        long jNanoTime = System.nanoTime();
        super.onMeasure(i, i2);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        ArrayList arrayList = this.f98455a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((j) arrayList.get(i3)).c().a(jNanoTime2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RootFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98455a = new ArrayList();
    }

    public /* synthetic */ RootFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
