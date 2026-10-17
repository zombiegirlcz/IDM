package com.revolut.core.ui_kit.internal.views.stories;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import jo0.m;
import jq0.g;
import jq0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/stories/StoriesHorizontalStepsProgressView;", "Lcom/revolut/core/ui_kit/views/HorizontalStepsProgressView;", "Ljq0/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startPos", "", "setStartPosition", "(I)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoriesHorizontalStepsProgressView extends HorizontalStepsProgressView implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f57578m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesHorizontalStepsProgressView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Activity getActivity() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return null;
    }

    @Override // jq0.g
    public final boolean b() {
        boolean z = m.f176847a;
        return m.f;
    }

    public final void c(float f, long j2) {
        i iVar = this.f57578m;
        iVar.a();
        if (f >= getItemsCount()) {
            return;
        }
        i.d(iVar, f, getItemsCount(), (long) ((getItemsCount() - f) * j2));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        Lifecycle lifecycle;
        super.onAttachedToWindow();
        ComponentCallbacks2 activity = getActivity();
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this.f57578m);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Lifecycle lifecycle;
        ComponentCallbacks2 activity = getActivity();
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.f57578m);
        }
        super.onDetachedFromWindow();
    }

    public final void setStartPosition(int startPos) {
        if (startPos >= getItemsCount()) {
            return;
        }
        this.f57578m.c(startPos);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoriesHorizontalStepsProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesHorizontalStepsProgressView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57578m = new i(this);
    }

    public /* synthetic */ StoriesHorizontalStepsProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
