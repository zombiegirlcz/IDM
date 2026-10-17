package com.revolut.uicomponent.toolbar.app_bar;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarSearchHelper;", "", "searchView", "Landroidx/appcompat/widget/SearchView;", "titleText", "Landroid/view/View;", "expandedOnStart", "", "listener", "Lcom/revolut/uicomponent/toolbar/app_bar/SearchViewListener;", "canIconify", "<init>", "(Landroidx/appcompat/widget/SearchView;Landroid/view/View;ZLcom/revolut/uicomponent/toolbar/app_bar/SearchViewListener;Z)V", "getListener", "()Lcom/revolut/uicomponent/toolbar/app_bar/SearchViewListener;", "setListener", "(Lcom/revolut/uicomponent/toolbar/app_bar/SearchViewListener;)V", "getCanIconify", "()Z", "setCanIconify", "(Z)V", "changeSearchViewFocus", "", "hasFocus", "onSearchViewShow", "show", "onClose", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToolbarSearchHelper {
    private boolean canIconify;
    private SearchViewListener listener;

    @NotNull
    private final SearchView searchView;
    private final View titleText;

    public ToolbarSearchHelper(@NotNull SearchView searchView, View view, boolean z, SearchViewListener searchViewListener, boolean z3) {
        Intrinsics.checkNotNullParameter(searchView, "searchView");
        this.searchView = searchView;
        this.titleText = view;
        this.listener = searchViewListener;
        this.canIconify = z3;
        if (z) {
            changeSearchViewFocus(true);
            searchView.setIconified(false);
            searchView.requestFocus();
        }
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.revolut.uicomponent.toolbar.app_bar.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                this.f107290a.changeSearchViewFocus(z4);
            }
        });
        searchView.setOnCloseListener(new c(this));
        searchView.setQueryHint("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ToolbarSearchHelper toolbarSearchHelper) {
        boolean zOnClose = toolbarSearchHelper.onClose();
        toolbarSearchHelper.onSearchViewShow(false);
        return zOnClose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeSearchViewFocus(boolean hasFocus) {
        if (!hasFocus) {
            if (this.canIconify) {
                this.searchView.setIconified(true);
            }
        } else {
            onSearchViewShow(true);
            View view = this.titleText;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private final boolean onClose() {
        View view = this.titleText;
        if (view != null) {
            view.setVisibility(0);
        }
        return false;
    }

    private final void onSearchViewShow(boolean show) {
        if (show) {
            this.searchView.onActionViewExpanded();
        } else {
            this.searchView.onActionViewCollapsed();
        }
        SearchViewListener searchViewListener = this.listener;
        if (searchViewListener != null) {
            searchViewListener.onSearchViewShow(show);
        }
    }

    public final boolean getCanIconify() {
        return this.canIconify;
    }

    public final SearchViewListener getListener() {
        return this.listener;
    }

    public final void setCanIconify(boolean z) {
        this.canIconify = z;
    }

    public final void setListener(SearchViewListener searchViewListener) {
        this.listener = searchViewListener;
    }

    public /* synthetic */ ToolbarSearchHelper(SearchView searchView, View view, boolean z, SearchViewListener searchViewListener, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(searchView, view, z, searchViewListener, (i & 16) != 0 ? true : z3);
    }
}
