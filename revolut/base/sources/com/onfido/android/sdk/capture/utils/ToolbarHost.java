package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.sidesheet.b;
import com.onfido.android.sdk.capture.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H&J0\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t2\b\b\u0003\u0010\b\u001a\u00020\tH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/ToolbarHost;", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "applyMenuIconColor", "", "iconColor", "", "disableImmersiveFragment", "enableImmersiveFragment", "resetToolbar", "resetToolbarColors", "restoreToolbar", "setToolbarColor", "backgroundColor", "titleColor", "subtitleColor", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ToolbarHost {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        private static void applyMenuIconColor(ToolbarHost toolbarHost, int i) {
            Drawable icon;
            MenuItem menuItemFindItem = toolbarHost.getToolbar().getMenu().findItem(R.id.action_exit_flow);
            if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
                return;
            }
            icon.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }

        public static void resetToolbar(@NotNull ToolbarHost toolbarHost) {
            toolbarHost.restoreToolbar();
            toolbarHost.resetToolbarColors();
        }

        public static void resetToolbarColors(@NotNull ToolbarHost toolbarHost) {
            toolbarHost.setToolbarColor(R.attr.onfidoColorToolbarBackground, R.attr.onfidoColorContentToolbarTitle, R.attr.onfidoColorContentToolbarSubtitle, R.attr.onfidoColorToolbarIcon);
        }

        public static void setToolbarColor(@NotNull ToolbarHost toolbarHost, int i, int i2, int i3, int i5) {
            int toolbarColor$getColorInt = setToolbarColor$getColorInt(toolbarHost, i5);
            toolbarHost.getToolbar().setBackgroundColor(setToolbarColor$getColorInt(toolbarHost, i));
            toolbarHost.getToolbar().setTitleTextColor(setToolbarColor$getColorInt(toolbarHost, i2));
            Drawable navigationIcon = toolbarHost.getToolbar().getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.setColorFilter(toolbarColor$getColorInt, PorterDuff.Mode.SRC_ATOP);
            }
            toolbarHost.getToolbar().setSubtitleTextColor(setToolbarColor$getColorInt(toolbarHost, i3));
            toolbarHost.getToolbar().post(new b(toolbarHost, toolbarColor$getColorInt, 2));
        }

        public static /* synthetic */ void setToolbarColor$default(ToolbarHost toolbarHost, int i, int i2, int i3, int i5, int i6, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setToolbarColor");
            }
            if ((i6 & 8) != 0) {
                i5 = i2;
            }
            toolbarHost.setToolbarColor(i, i2, i3, i5);
        }

        private static int setToolbarColor$getColorInt(ToolbarHost toolbarHost, int i) {
            Context context = toolbarHost.getToolbar().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return ContextUtilsKt.colorFromAttr(context, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void setToolbarColor$lambda$0(ToolbarHost this$0, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            applyMenuIconColor(this$0, i);
        }
    }

    void disableImmersiveFragment();

    void enableImmersiveFragment();

    @NotNull
    Toolbar getToolbar();

    void resetToolbar();

    void resetToolbarColors();

    void restoreToolbar();

    void setToolbarColor(int backgroundColor, int titleColor, int subtitleColor, int iconColor);
}
