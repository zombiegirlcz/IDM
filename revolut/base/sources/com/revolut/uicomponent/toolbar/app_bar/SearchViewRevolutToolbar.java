package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\b\b\u0001\u0010\u001d\u001a\u00020\u0007J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u0007H\u0002J\u0010\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0013R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/SearchViewRevolutToolbar;", "Lcom/revolut/uicomponent/toolbar/app_bar/CustomViewRevolutToolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchHelper", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarSearchHelper;", "searchView", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "expandedOnStart", "", "titleView", "Landroid/widget/TextView;", "init", "", "applyAttrs", "setTitle", "title", "", "setTitleMarginLeft", "value", "getCustomView", "Landroid/view/View;", "customViewLayoutId", "setSearchViewListener", "listener", "Lcom/revolut/uicomponent/toolbar/app_bar/SearchViewListener;", "setSearchHint", "hint", "", "setCanIconify", "canIconify", "setIconified", "iconified", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class SearchViewRevolutToolbar extends CustomViewRevolutToolbar {
    private boolean expandedOnStart;
    private ToolbarSearchHelper searchHelper;
    private SearchView searchView;
    private TextView titleView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchViewRevolutToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getCustomView(Context context, int customViewLayoutId) {
        View viewInflate = LayoutInflater.from(context).inflate(customViewLayoutId, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.CustomViewRevolutToolbar, com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void applyAttrs(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.applyAttrs(context, attrs);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.SearchViewRevolutToolbar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.expandedOnStart = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SearchViewRevolutToolbar_srtb_expanded_on_start, false);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final SearchView getSearchView() {
        return this.searchView;
    }

    @Override // com.revolut.uicomponent.toolbar.app_bar.CustomViewRevolutToolbar, com.revolut.uicomponent.toolbar.app_bar.BaseToolbar
    public void init(@NotNull Context context, AttributeSet attrs) {
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(context, "context");
        setCustomView(getCustomView(context, R$layout.view_search));
        super.init(context, attrs);
        View customView = getCustomView();
        this.titleView = customView != null ? (TextView) customView.findViewById(R$id.title) : null;
        View customView2 = getCustomView();
        SearchView searchView = customView2 != null ? (SearchView) customView2.findViewById(R$id.header_search) : null;
        this.searchView = searchView;
        if (searchView != null) {
            this.searchHelper = new ToolbarSearchHelper(searchView, this.titleView, this.expandedOnStart, null, false, 16, null);
        }
        SearchView searchView2 = this.searchView;
        if (searchView2 != null && (textView2 = (TextView) searchView2.findViewById(androidx.appcompat.R$id.search_src_text)) != null) {
            textView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        }
        SearchView searchView3 = this.searchView;
        if (searchView3 == null || (textView = (TextView) searchView3.findViewById(androidx.appcompat.R$id.search_src_text)) == null) {
            return;
        }
        textView.setHintTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
    }

    public final void setCanIconify(boolean canIconify) {
        ToolbarSearchHelper toolbarSearchHelper = this.searchHelper;
        if (toolbarSearchHelper != null) {
            toolbarSearchHelper.setCanIconify(canIconify);
        }
    }

    public final void setIconified(boolean iconified) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setIconified(iconified);
        }
    }

    public final void setSearchHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQueryHint(hint);
        }
    }

    public final void setSearchView(SearchView searchView) {
        this.searchView = searchView;
    }

    public final void setSearchViewListener(SearchViewListener listener) {
        ToolbarSearchHelper toolbarSearchHelper = this.searchHelper;
        if (toolbarSearchHelper != null) {
            toolbarSearchHelper.setListener(listener);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public final void setTitleMarginLeft(int value) {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setPadding(value, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchViewRevolutToolbar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewRevolutToolbar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchViewRevolutToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
