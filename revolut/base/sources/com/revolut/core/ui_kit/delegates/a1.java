package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AttributeWideDelegate;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dr0.d f53653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dr0.d f53654b;

    static {
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorAccent);
        AttributeWideDelegate.Companion companion = AttributeWideDelegate.INSTANCE;
        companion.getClass();
        float f = AttributeWideDelegate.f51682g;
        f53653a = new dr0.d(f, solid);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorGreyTone5);
        companion.getClass();
        f53654b = new dr0.d(f, solid2);
    }

    public static final dr0.e a(x0 x0Var) {
        if (x0Var instanceof w0) {
            Color.Solid solid = ((w0) x0Var).f54892a;
            AttributeWideDelegate.INSTANCE.getClass();
            return new dr0.d(AttributeWideDelegate.f51682g, solid);
        }
        if (x0Var instanceof v0) {
            UiKitGradient uiKitGradient = ((v0) x0Var).f54843a;
            AttributeWideDelegate.INSTANCE.getClass();
            return new dr0.c(uiKitGradient, AttributeWideDelegate.f51682g);
        }
        if (x0Var == null) {
            return f53654b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
