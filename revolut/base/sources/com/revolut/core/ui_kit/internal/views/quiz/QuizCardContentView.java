package com.revolut.core.ui_kit.internal.views.quiz;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.delegates.quiz.QuizHeaderDelegate;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ihm.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku0.e;
import o31.b;
import org.jetbrains.annotations.NotNull;
import v0.a;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/quiz/QuizCardContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuizCardContentView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsyncDiffRecyclerView f57463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputChecklistDelegate f57464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f57465c;
    public final f d;
    public final Handler e;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.quiz.QuizCardContentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizCardContentView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57463a.addOnScrollListener(this.f57465c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f57463a.removeOnScrollListener(this.f57465c);
        this.e.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizCardContentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizCardContentView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        AsyncDiffRecyclerView asyncDiffRecyclerView = new AsyncDiffRecyclerView(context, null, 6, 0);
        this.f57463a = asyncDiffRecyclerView;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.f57464b = inputChecklistDelegate;
        this.f57465c = new e();
        this.d = a.d("create(...)");
        this.e = new Handler(Looper.getMainLooper());
        asyncDiffRecyclerView.setAdapter(new j(7, v.k(new TextDelegate(), new QuizHeaderDelegate(), inputChecklistDelegate), false));
        asyncDiffRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        asyncDiffRecyclerView.setItemAnimator(null);
        asyncDiffRecyclerView.setNestedScrollingEnabled(false);
        asyncDiffRecyclerView.setOverScrollMode(2);
        asyncDiffRecyclerView.setFocusableInTouchMode(false);
        asyncDiffRecyclerView.addItemDecoration(new b());
        int iK = kli.a.k(context, 24.0f);
        asyncDiffRecyclerView.setPadding(iK, iK, iK, iK);
        asyncDiffRecyclerView.setClipToPadding(false);
        asyncDiffRecyclerView.setTag("QUIZ_RECYCLER_VIEW_TAG");
        addView(asyncDiffRecyclerView);
    }

    public /* synthetic */ QuizCardContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
