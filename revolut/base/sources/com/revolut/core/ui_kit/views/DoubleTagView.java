package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.h5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/views/DoubleTagView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "primaryTagViewData", "", "setPrimaryTag", "(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", "secondaryTagViewData", "setSecondaryTag", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "g", "Le8/q;", "getPrimaryTag", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "primaryTag", "h", "getSecondaryTag", "secondaryTag", "Landroid/widget/TextView;", "i", "getTagSign", "()Landroid/widget/TextView;", "tagSign", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DoubleTagView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58516b;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q primaryTag;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q secondaryTag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q tagSign;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleTagView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TagView getPrimaryTag() {
        return (TagView) this.primaryTag.f();
    }

    private final TagView getSecondaryTag() {
        return (TagView) this.secondaryTag.f();
    }

    private final TextView getTagSign() {
        return (TextView) this.tagSign.f();
    }

    public final void setPrimaryTag(TagViewData primaryTagViewData) {
        if (primaryTagViewData == null) {
            getPrimaryTag().setVisibility(8);
            return;
        }
        getPrimaryTag().setVisibility(0);
        getPrimaryTag().setContent(primaryTagViewData);
        getPrimaryTag().setOnClickListener(new h5(this, primaryTagViewData, 0));
    }

    public final void setSecondaryTag(TagViewData secondaryTagViewData) {
        Color color;
        if (secondaryTagViewData == null) {
            getTagSign().setVisibility(8);
            getSecondaryTag().setVisibility(8);
            getSecondaryTag().setOnClickListener(null);
            return;
        }
        getTagSign().setVisibility(0);
        TagViewData.TagBackground tagBackground = secondaryTagViewData.f57642c;
        if (tagBackground instanceof TagViewData.TagBackground.Gradient) {
            color = (Color) d0.b0(((TagViewData.TagBackground.Gradient) tagBackground).f57650a);
        } else {
            if (!(tagBackground instanceof TagViewData.TagBackground.Solid)) {
                throw new NoWhenBranchMatchedException();
            }
            color = ((TagViewData.TagBackground.Solid) tagBackground).f57652a;
        }
        Context context = getTagSign().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kli.a.b(getTagSign(), new TextClause("+", (Style) new Custom(new Custom.Color.SolidInt(io0.a.c(context, color)), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), ty0.f.f275450a);
        getSecondaryTag().setVisibility(0);
        getSecondaryTag().setContent(secondaryTagViewData);
        getSecondaryTag().setOnClickListener(new h5(this, secondaryTagViewData, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleTagView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleTagView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58516b = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.primaryTag = kli.a.J(R$id.doubleTagView_primaryTag, this);
        this.secondaryTag = kli.a.J(R$id.doubleTagView_secondaryTag, this);
        this.tagSign = kli.a.J(R$id.doubleTagView_tagSign, this);
        View.inflate(context, R$layout.internal_view_double_tag, this);
    }

    public /* synthetic */ DoubleTagView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
