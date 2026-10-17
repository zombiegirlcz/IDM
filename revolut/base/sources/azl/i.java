package azl;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.uicomponent.swipe_layout.SwipeToActionLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av8.n f11485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f11487c;
    public a d;

    public i(SwipeToActionLayout swipeToActionLayout, av8.n onActionClickListener) {
        Intrinsics.checkNotNullParameter(swipeToActionLayout, "swipeToActionLayout");
        Intrinsics.checkNotNullParameter(onActionClickListener, "onActionClickListener");
        this.f11485a = onActionClickListener;
        Context context = swipeToActionLayout.getContext();
        this.f11486b = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = new c();
        TextPaint textPaint = new TextPaint(1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("R_Medium", "typefaceAssetPath");
        textPaint.setTypeface(v01.f.c(context, "R_Medium", Float.valueOf(14.0f)));
        this.f11487c = cVar;
        c.Companion.getClass();
        this.d = c.f11480a;
    }

    public final LinearLayout a(h gravity) {
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Context context = this.f11486b;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setVerticalGravity(16);
        linearLayout.setHorizontalGravity(1);
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, kli.a.k(context, 32.0f));
        Intrinsics.checkNotNullExpressionValue(context, "context");
        layoutParams.topMargin = kli.a.k(context, 8.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        layoutParams2.leftMargin = kli.a.k(context, 8.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        layoutParams2.rightMargin = kli.a.k(context, 8.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setTag("ICON");
        linearLayout.addView(appCompatImageView, layoutParams);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        TypefaceTextView typefaceTextView = new TypefaceTextView(context);
        typefaceTextView.setTag("TEXT");
        linearLayout.addView(typefaceTextView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, -1);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
        layoutParams3.gravity = gravity.a();
        linearLayout.setLayoutParams(layoutParams3);
        return linearLayout;
    }

    public final ArrayList b(ArrayList actions, h gravity) {
        int size;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        ArrayList arrayList = new ArrayList();
        if (gravity == h.LEFT && -1 < actions.size() - 1) {
            actions.size();
            if (actions.get(size) != null) {
                throw new ClassCastException();
            }
            Intrinsics.checkNotNullParameter(null, "action");
            Intrinsics.checkNotNullParameter(gravity, "gravity");
            LinearLayout actionView = a(gravity);
            Intrinsics.checkNotNullParameter(actionView, "actionView");
            Intrinsics.checkNotNullParameter(null, "action");
            actionView.setOnClickListener(new ap0.f(this, actionView, 2));
            throw null;
        }
        if (gravity != h.RIGHT || actions.size() <= 0) {
            return arrayList;
        }
        actions.size();
        if (actions.get(0) != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "action");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        LinearLayout actionView2 = a(gravity);
        Intrinsics.checkNotNullParameter(actionView2, "actionView");
        Intrinsics.checkNotNullParameter(null, "action");
        actionView2.setOnClickListener(new ap0.f(this, actionView2, 2));
        throw null;
    }

    public final void c(int i, int i2, ArrayList actions, ArrayList actionViews, h gravity) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(actionViews, "actionViews");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        int size = (actions.size() - 1) * this.d.f11477a;
        if (gravity == h.LEFT) {
            int size2 = actions.size();
            while (true) {
                size2--;
                if (-1 >= size2) {
                    break;
                }
                ((View) actionViews.get(size2)).layout(size, 0, this.d.f11477a + size, i2);
                size -= this.d.f11477a;
            }
        }
        int size3 = (actions.size() - 1) * this.d.f11477a;
        if (gravity == h.RIGHT) {
            int size4 = actions.size();
            for (int i3 = 0; i3 < size4; i3++) {
                int i5 = i - size3;
                ((View) actionViews.get(i3)).layout(i5 - this.d.f11477a, 0, i5, i2);
                size3 -= this.d.f11477a;
            }
        }
    }

    public final void d(int i, int i2, ArrayList actions, ArrayList actionViews, h gravity) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(actionViews, "actionViews");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        if (actions.isEmpty()) {
            return;
        }
        int iMin = Math.min(i, i2);
        this.f11487c.getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        Iterator it8 = actions.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
        this.d = new a(iMin, iMin, 0);
        if (gravity == h.LEFT) {
            int size = actions.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                } else {
                    ((View) actionViews.get(size)).measure(View.MeasureSpec.makeMeasureSpec(this.d.f11477a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.f11478b, 1073741824));
                }
            }
        }
        if (gravity == h.RIGHT) {
            int size2 = actions.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((View) actionViews.get(i3)).measure(View.MeasureSpec.makeMeasureSpec(this.d.f11477a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.f11478b, 1073741824));
            }
        }
    }
}
