package pq0;

import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.zf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends koi.b {
    public final zf f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f238648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View itemView, zf rowDelegateViewHolder) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(rowDelegateViewHolder, "rowDelegateViewHolder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = rowDelegateViewHolder;
        View viewFindViewById = itemView.findViewById(R$id.rowMetadata_rowContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f238648g = (FrameLayout) viewFindViewById;
    }

    public final FrameLayout F() {
        return this.f238648g;
    }

    public final zf H() {
        return this.f;
    }
}
