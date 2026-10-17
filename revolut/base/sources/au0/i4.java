package au0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i4 extends FrameLayout implements ny0.h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static i4 a(View fromView) {
            View childAt;
            Intrinsics.checkNotNullParameter(fromView, "fromView");
            ViewGroup viewGroupO = jb3.l.o(js0.f.Companion, fromView, true);
            if (viewGroupO == null) {
                return null;
            }
            int childCount = viewGroupO.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = viewGroupO.getChildAt(i);
                Intrinsics.h(childAt);
                if (childAt instanceof i4) {
                    break;
                }
                i++;
            }
            if (childAt != null) {
                return (i4) childAt;
            }
            Context context = viewGroupO.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i4 i4Var = new i4(context, null);
            viewGroupO.addView(i4Var, 0, new FrameLayout.LayoutParams(-1, -1));
            return i4Var;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i4(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return ix0.x0.a(insets);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setFitsSystemWindows(true);
    }
}
