package com.revolut.core.ui_kit.click.animator.ripple;

import android.R;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import hp0.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/click/animator/ripple/StateListRippleDrawable;", "Landroid/graphics/drawable/StateListDrawable;", "Lhp0/a;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StateListRippleDrawable extends StateListDrawable implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f51550a;

    /* JADX WARN: Multi-variable type inference failed */
    public StateListRippleDrawable(a aVar, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        Intrinsics.checkNotNullParameter(aVar, "default");
        a[] elements = {aVar, drawable instanceof a ? (a) drawable : null, drawable2 instanceof a ? (a) drawable2 : null, drawable3 instanceof a ? (a) drawable3 : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f51550a = d.L(elements);
        if (drawable != 0) {
            addState(new int[]{-16842910}, drawable);
        }
        if (drawable2 != 0) {
            addState(new int[]{R.attr.state_selected}, drawable2);
        }
        if (drawable3 != 0) {
            addState(new int[]{R.attr.state_activated}, drawable3);
        }
        addState(new int[0], aVar.b());
        setEnterFadeDuration(0);
        setExitFadeDuration(0);
    }

    @Override // hp0.a
    public final Drawable b() {
        return this;
    }
}
