package com.revolut.cards.shared.ui.flow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import i10.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lki.c;
import nkm.g;
import nkm.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/cards/shared/ui/flow/ControllerContainerCardsCarouselFlowLayout;", "Lcom/revolut/kompot/view/ControllerContainerFrameLayout;", "Llki/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ControllerContainerCardsCarouselFlowLayout extends ControllerContainerFrameLayout implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f50949c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCardsCarouselFlowLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // lki.c
    public final void B(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f50949c = block;
        g gVar = new g(y.n(ViewGroupKt.getChildren(this), a.f157525a));
        while (gVar.hasNext()) {
            ((c) gVar.next()).B(block);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        Function0 function0 = this.f50949c;
        if (function0 != null) {
            c cVar = view instanceof c ? (c) view : null;
            if (cVar != null) {
                cVar.B(function0);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCardsCarouselFlowLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCardsCarouselFlowLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ControllerContainerCardsCarouselFlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
