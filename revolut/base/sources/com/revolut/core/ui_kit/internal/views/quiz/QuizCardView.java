package com.revolut.core.ui_kit.internal.views.quiz;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import e8.q;
import kli.a;
import knm.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/quiz/QuizCardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "a", "Le8/q;", "getHeaderGradientView", "()Landroid/view/View;", "headerGradientView", "b", "getFooterGradientView", "footerGradientView", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuizCardView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q headerGradientView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q footerGradientView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getFooterGradientView() {
        return this.footerGradientView.f();
    }

    private final View getHeaderGradientView() {
        return this.headerGradientView.f();
    }

    public final void a() {
        b.z(getFooterGradientView(), false, 100L, 12);
    }

    public final void b() {
        b.z(getHeaderGradientView(), false, 100L, 12);
    }

    public final void c() {
        b.z(getFooterGradientView(), true, 100L, 12);
    }

    public final void d() {
        b.z(getHeaderGradientView(), true, 100L, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizCardView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.headerGradientView = a.J(R$id.quizCard_headerGradient, this);
        this.footerGradientView = a.J(R$id.quizCard_footerGradient, this);
        View.inflate(context, R$layout.internal_view_quiz_card, this);
    }

    public /* synthetic */ QuizCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
