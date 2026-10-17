package nji;

import android.view.View;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import kotlin.jvm.internal.Intrinsics;
import nji.b;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final ControllerContainerSliderLayout a(b.a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        while (view != null) {
            if (view instanceof ControllerContainerSliderLayout) {
                return (ControllerContainerSliderLayout) view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }
}
