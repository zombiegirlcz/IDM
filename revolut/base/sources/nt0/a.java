package nt0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class a extends UIKitFrameLayout implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function1 f218942h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public Function1<MotionEvent, Unit> getInterceptor() {
        return this.f218942h;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function1<MotionEvent, Unit> interceptor = getInterceptor();
        if (interceptor != null) {
            interceptor.invoke(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // nt0.b
    public void setInterceptor(Function1<? super MotionEvent, Unit> function1) {
        this.f218942h = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
