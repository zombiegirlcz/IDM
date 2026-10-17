package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/revolut/core/ui_kit/views/InputTravelSearchItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "searchTextClause", "", "setPrimarySearchText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "searchHints", "setSearchHints", "(Ljava/util/List;)V", "secondarySearchTextClause", "setSecondarySearchText", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setSearchIconImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "isVisible", "setProgressVisible", "(Z)V", "Lcom/revolut/core/ui_kit/views/InputTravelView;", "a", "Le8/q;", "getSearch", "()Lcom/revolut/core/ui_kit/views/InputTravelView;", "search", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTravelSearchItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e8.q search;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ny0.k f58671b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelSearchItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final InputTravelView getSearch() {
        return (InputTravelView) this.search.f();
    }

    public final efm.r a() {
        return getSearch().a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f58671b.b(i);
        super.onMeasure(i, i2);
    }

    public final void setPrimarySearchText(@NotNull Clause searchTextClause) {
        Intrinsics.checkNotNullParameter(searchTextClause, "searchTextClause");
        getSearch().setPrimaryText(searchTextClause);
    }

    public final void setProgressVisible(boolean isVisible) {
        getSearch().setProgressVisible(isVisible);
    }

    public final void setSearchHints(@NotNull List<? extends Clause> searchHints) {
        Intrinsics.checkNotNullParameter(searchHints, "searchHints");
        getSearch().setHints(searchHints);
    }

    public final void setSearchIconImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getSearch().setIconImage(image);
    }

    public final void setSecondarySearchText(@NotNull Clause secondarySearchTextClause) {
        Intrinsics.checkNotNullParameter(secondarySearchTextClause, "secondarySearchTextClause");
        getSearch().setSecondaryText(secondarySearchTextClause);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelSearchItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTravelSearchItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.search = kli.a.J(R$id.inputTravelSearchItem_search, this);
        ny0.k kVar = new ny0.k(this);
        this.f58671b = kVar;
        View.inflate(context, R$layout.internal_view_travel_item_search, this);
        kVar.d(true);
    }

    public /* synthetic */ InputTravelSearchItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
