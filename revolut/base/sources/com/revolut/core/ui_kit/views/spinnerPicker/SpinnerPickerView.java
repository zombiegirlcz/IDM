package com.revolut.core.ui_kit.views.spinnerPicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.delegates.SpinnerPickerItemDelegate;
import com.revolut.core.ui_kit.internal.delegates.SpinnerPickerItemLoadingDelegate;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemLoadingDelegateModel;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import ey0.d;
import ey0.e;
import ey0.g;
import ihm.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004\n\u001d\u001e\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/revolut/core/ui_kit/views/spinnerPicker/SpinnerPickerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/spinnerPicker/c;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/views/spinnerPicker/c;)V", "Landroid/graphics/LinearGradient;", "getForegroundLinearGradient", "()Landroid/graphics/LinearGradient;", "Lcom/revolut/core/ui_kit/views/spinnerPicker/a;", "setContentModel", "(Lcom/revolut/core/ui_kit/views/spinnerPicker/a;)V", "", "isEnabled", "setRecyclersScrollEnabled", "(Z)V", "Lcom/revolut/core/ui_kit/views/spinnerPicker/b;", "setLoadingModel", "(Lcom/revolut/core/ui_kit/views/spinnerPicker/b;)V", "Companion", "ey0/f", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinnerPickerView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f59693p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpinnerPickerItemDelegate f59694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpinnerPickerItemLoadingDelegate f59695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpinnerPickerItemDelegateModel[] f59696c;
    public final f d;
    public c e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f59697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f59698h;
    public final Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59699j;
    public final int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f59700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f59701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f59702n;
    public final a0.a o;

    public static final class a {
        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f59703a = new a();

            private a() {
            }

            @Override // com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView.b
            public final int a(int i, Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return View.MeasureSpec.getMode(i) == 0 ? C0446b.f59704a.a(i, context) : View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView$b$b, reason: collision with other inner class name */
        public static final class C0446b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0446b f59704a = new C0446b();

            private C0446b() {
            }

            @Override // com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView.b
            public final int a(int i, Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return View.MeasureSpec.makeMeasureSpec(kli.a.k(context, 380.0f), 1073741824);
            }
        }

        private b() {
        }

        public abstract int a(int i, Context context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinnerPickerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearGradient getForegroundLinearGradient() {
        return new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getHeight(), this.k, this.f59700l, Shader.TileMode.CLAMP);
    }

    private final void setContentModel(com.revolut.core.ui_kit.views.spinnerPicker.a model) {
        int i = 0;
        List listK = v.k(model.f59705a, model.f59706b, model.f59707c);
        this.f59696c = new SpinnerPickerItemDelegateModel[listK.size()];
        setRecyclersScrollEnabled(true);
        a(listK);
        if (this.f59699j) {
            return;
        }
        Iterator it8 = this.f59697g.iterator();
        while (true) {
            int i2 = i;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            i = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            RecyclerView recyclerView = (RecyclerView) next;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                break;
            }
            int itemCount = adapter.getItemCount();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                break;
            }
            RecyclerView.OnFlingListener onFlingListener = recyclerView.getOnFlingListener();
            LinearSnapHelper linearSnapHelper = onFlingListener instanceof LinearSnapHelper ? (LinearSnapHelper) onFlingListener : null;
            if (linearSnapHelper == null) {
                break;
            }
            recyclerView.scrollToPosition(itemCount / 2);
            addOnLayoutChangeListener(new g(linearSnapHelper, linearLayoutManager, recyclerView, this, i2));
        }
        this.f59699j = true;
    }

    private final void setLoadingModel(com.revolut.core.ui_kit.views.spinnerPicker.b model) {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            ArrayList arrayList2 = new ArrayList(3);
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList2.add(new SpinnerPickerItemLoadingDelegateModel(model.f59708a, "SPINNER_PICKER_VIEW_LOADING_ITEM_" + i + i2));
            }
            arrayList.add(arrayList2);
        }
        setRecyclersScrollEnabled(false);
        a(arrayList);
    }

    private final void setRecyclersScrollEnabled(boolean isEnabled) {
        Iterator it8 = this.f59697g.iterator();
        while (it8.hasNext()) {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) it8.next()).getLayoutManager();
            UIKitLinearLayoutManager uIKitLinearLayoutManager = layoutManager instanceof UIKitLinearLayoutManager ? (UIKitLinearLayoutManager) layoutManager : null;
            if (uIKitLinearLayoutManager != null) {
                uIKitLinearLayoutManager.f98538b = isEnabled;
            }
        }
    }

    public final void a(List list) {
        int i = 0;
        for (Object obj2 : this.f) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ((j) obj2).c((List) list.get(i));
            i = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), this.f59701m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.removeCallbacksAndMessages(null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 2) {
            this.i.removeCallbacks(this.o);
            d dVar = this.f59702n;
            if (dVar != null) {
                dVar.a();
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        b bVarA;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && layoutParams.width == -1 && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        c cVar = this.e;
        if (cVar == null || (bVarA = cVar.a()) == null) {
            bVarA = b.C0446b.f59704a;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super.onMeasure(i, bVarA.a(i2, context));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f59701m.setShader(getForegroundLinearGradient());
    }

    public final void setModel(@NotNull c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.e, model)) {
            return;
        }
        c cVar = this.e;
        boolean zF = Intrinsics.f(cVar != null ? cVar.a() : null, model.a());
        this.e = model;
        setGravity(model.b().a());
        if (!zF) {
            requestLayout();
        }
        if (model instanceof com.revolut.core.ui_kit.views.spinnerPicker.a) {
            setContentModel((com.revolut.core.ui_kit.views.spinnerPicker.a) model);
        } else {
            if (!(model instanceof com.revolut.core.ui_kit.views.spinnerPicker.b)) {
                throw new NoWhenBranchMatchedException();
            }
            setLoadingModel((com.revolut.core.ui_kit.views.spinnerPicker.b) model);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinnerPickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public SpinnerPickerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59694a = new SpinnerPickerItemDelegate();
        this.f59695b = new SpinnerPickerItemLoadingDelegate();
        ?? r2 = 0;
        this.f59696c = new SpinnerPickerItemDelegateModel[0];
        this.d = v0.a.d("create(...)");
        this.i = new Handler(Looper.getMainLooper());
        this.k = new int[]{kli.a.s(R$attr.uikit_windowBackground, context), 0, 0, kli.a.s(R$attr.uikit_windowBackground, context)};
        this.f59700l = new float[]{BitmapDescriptorFactory.HUE_RED, 0.33f, 0.67f, 1.0f};
        Paint paint = new Paint();
        paint.setShader(getForegroundLinearGradient());
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f59701m = paint;
        this.o = new a0.a(this, 28);
        setOrientation(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (i2 < 3) {
            RecyclerView recyclerView = new RecyclerView(context);
            recyclerView.setId(View.generateViewId());
            recyclerView.setLayoutManager(new UIKitLinearLayoutManager(context));
            LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
            SpinnerPickerItemDelegate spinnerPickerItemDelegate = this.f59694a;
            SpinnerPickerItemLoadingDelegate spinnerPickerItemLoadingDelegate = this.f59695b;
            BaseRecyclerViewDelegate[] baseRecyclerViewDelegateArr = new BaseRecyclerViewDelegate[2];
            baseRecyclerViewDelegateArr[r2] = spinnerPickerItemDelegate;
            baseRecyclerViewDelegateArr[1] = spinnerPickerItemLoadingDelegate;
            iq0.a aVar = new iq0.a(new koi.c(v.k(baseRecyclerViewDelegateArr)), r2, 14);
            linearSnapHelper.attachToRecyclerView(recyclerView);
            recyclerView.addOnScrollListener(new e());
            recyclerView.setAdapter(aVar);
            arrayList2.add(aVar);
            f fVar = new f();
            Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
            new xq0.f(fVar, new d1.g(this, i2, recyclerView, 3)).c(recyclerView, aVar);
            arrayList3.add(fVar);
            pd.b.q(recyclerView, true);
            if (i2 == 2) {
                this.f59702n = new d(recyclerView, linearSnapHelper);
            }
            if (i2 == 0) {
                z = false;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                recyclerView.setPaddingRelative(0, 0, kli.a.k(context2, 8.0f), 0);
            } else if (i2 != 2) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK = kli.a.k(context3, 8.0f);
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int iK2 = kli.a.k(context4, 8.0f);
                z = false;
                recyclerView.setPaddingRelative(iK, 0, iK2, 0);
            } else {
                z = false;
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                recyclerView.setPaddingRelative(kli.a.k(context5, 8.0f), 0, 0, 0);
            }
            addView(recyclerView, new LinearLayout.LayoutParams(-2, -1));
            arrayList.add(recyclerView);
            i2++;
            r2 = z;
        }
        this.f59697g = arrayList;
        this.f = arrayList2;
        this.f59698h = arrayList3;
    }

    public /* synthetic */ SpinnerPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
