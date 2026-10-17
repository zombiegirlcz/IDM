package fpa;

import aw0.w2;
import cli.z;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface e extends z {
    default void N() {
    }

    default void O(ActionsView.Item action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    default void P0(CircleActionButtonsBarDelegate.CircleActionButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
    }

    default void Z0(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
    }

    default void q() {
    }

    default void t0(w2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
    }

    default void y(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
    }
}
