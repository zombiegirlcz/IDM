package com.revolut.recyclerkit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import c8g.a;
import gmk.j;
import jo0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.l;
import ny0.o;
import ny0.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/revolut/recyclerkit/UIKitRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lny0/o;", "Lny0/l;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "Z", "getSuppressLayout", "()Z", "setSuppressLayout", "(Z)V", "suppressLayout", "c", "getConsumeTouchEvents", "setConsumeTouchEvents", "consumeTouchEvents", "recycler_kit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class UIKitRecyclerView extends RecyclerView implements o, l {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean suppressLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f98533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean consumeTouchEvents;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.l
    public final void b(int i, Object requestToken, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(requestToken, "requestToken");
        this.f98533b.b(0, requestToken, 0, 0, i5);
    }

    public final boolean getConsumeTouchEvents() {
        return this.consumeTouchEvents;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public /* bridge */ boolean getF57232a() {
        return false;
    }

    public boolean getSuppressLayout() {
        return this.suppressLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f98533b.d(i);
        super.onMeasure(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) && this.consumeTouchEvents;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getSuppressLayout()) {
            return;
        }
        super.requestLayout();
    }

    public final void setConsumeTouchEvents(boolean z) {
        this.consumeTouchEvents = z;
    }

    @Override // ny0.o
    public void setSuppressLayout(boolean z) {
        this.suppressLayout = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public UIKitRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = new q(this);
        this.f98533b = qVar;
        this.consumeTouchEvents = true;
        if (((Boolean) g.f176833q.getValue()).booleanValue()) {
            setClipToPadding(false);
            addItemDecoration(new goi.g());
        }
        qVar.e(true);
        a.a(this, ny0.a.f220589a, new j(this, 7));
    }

    public /* synthetic */ UIKitRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
