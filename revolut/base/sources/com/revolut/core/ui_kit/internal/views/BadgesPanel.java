package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/BadgesPanel;", "Lcom/revolut/flexbox/FlexboxLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "content", "", "setContent", "(Ljava/util/List;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class BadgesPanel extends FlexboxLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f56099r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgesPanel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setContent(@NotNull List<TagViewData> content) {
        AttributeSet attributeSet;
        Intrinsics.checkNotNullParameter(content, "content");
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            attributeSet = null;
            if (i2 >= childCount) {
                break;
            }
            getChildAt(i2).setOnClickListener(null);
            i2++;
        }
        removeAllViews();
        for (TagViewData tagViewData : content) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TagView tagView = new TagView(context, attributeSet, 6, i);
            tagView.setId(R$id.badgesPanel_tagView);
            tagView.setContent(tagViewData);
            addView(tagView);
            tagView.setOnClickListener(new kp0.l(this, tagViewData, 4));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgesPanel(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesPanel(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56099r = v0.a.d("create(...)");
        setFlexDirection(0);
        setFlexWrap(1);
        setDividerDrawable(ContextCompat.getDrawable(context, R$drawable.internal_divider_badges));
        setShowDivider(2);
    }

    public /* synthetic */ BadgesPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
