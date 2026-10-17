package ip0;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x30 extends koi.b {
    public final ProgressBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatTextView f167090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f167091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167090g = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167091h = (AppCompatTextView) viewFindViewById3;
    }
}
