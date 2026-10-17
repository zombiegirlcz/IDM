package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.b;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import dr0.l;
import foh.i;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kp0.t;
import m70.a;
import org.jetbrains.annotations.NotNull;
import ty0.c;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleReactionView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkp0/t;", "reactions", "", "setReactions", "(Lkp0/t;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatBubbleReactionView extends AppCompatTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleReactionView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setReactions(@NotNull t reactions) {
        String str;
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        Integer num = reactions.f188094b;
        if (num != null) {
            str = " " + num;
        } else {
            a.c(t0.f186434a);
            str = "";
        }
        setText(reactions.f188093a + str);
        String reaction = reactions.f188093a;
        Intrinsics.checkNotNullParameter(this, "view");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c cVarB0 = d.f(context).b0();
        CompositeClause compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.chat_bubble_reaction_accessibility_label, null, null, 14), new TextClause(reaction, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), b.a(), null, null, 12);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setContentDescription(c.a(cVarB0, compositeClause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        pd.b.h(this, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleReactionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleReactionView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(l.h(context, 15.0f, new Color.Solid(R$attr.uikit_colorPopoverBackground), i.j(2), new Color.Solid(R$attr.uikit_colorGroupedBackground)));
        jb3.l.e(this, R$attr.internal_textAppearanceBody1);
        setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        setPadding(i.j(10), i.j(4), i.j(10), i.j(4));
    }

    public /* synthetic */ ChatBubbleReactionView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
