package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import ix0.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.a;
import ty0.c;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleSuggestionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "Lkotlin/Function1;", "Lty0/a;", "", "onClick", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lkotlin/jvm/functions/Function1;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Landroid/widget/TextView;", "b", "Le8/q;", "getTitle", "()Landroid/widget/TextView;", "title", "Landroid/widget/ImageView;", "f", "getIcon", "()Landroid/widget/ImageView;", "icon", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatBubbleSuggestionView extends ConstraintLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f56812g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q icon;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleSuggestionView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.f();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitle$default(ChatBubbleSuggestionView chatBubbleSuggestionView, Clause clause, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        chatBubbleSuggestionView.setTitle(clause, function1);
    }

    public final void setIcon(Image image) {
        if (image == null) {
            getIcon().setVisibility(8);
            getIcon().setImageDrawable(null);
        } else {
            getIcon().setVisibility(0);
            f.e(u.k(this).Q(), image, getIcon(), null, null, 12);
        }
    }

    public final void setTitle(Clause clause, Function1<? super a, Unit> onClick) {
        getTitle().setVisibility(clause != null ? 0 : 8);
        c.b(u.k(this).b0(), clause, getTitle(), onClick, null, 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatBubbleSuggestionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBubbleSuggestionView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.title = kli.a.J(R$id.chatBubbleSuggestion_title, this);
        this.icon = kli.a.J(R$id.chatBubbleSuggestion_icon, this);
        View.inflate(context, R$layout.internal_view_chat_bubble_suggestion, this);
        setBackground(ContextCompat.getDrawable(context, R$drawable.internal_chat_bubble_suggestion_background));
        int iK = kli.a.k(context, 12.0f);
        setPadding(iK, getPaddingTop(), iK, getPaddingBottom());
        setFocusable(true);
        setClickable(true);
        TextView title = getTitle();
        c0 c0Var = c0.f169220a;
        getTitle().setOnTouchListener(new ar0.a(c0Var, this, 3));
        title.setMovementMethod(c0Var);
        setLayerType(2, null);
    }

    public /* synthetic */ ChatBubbleSuggestionView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
