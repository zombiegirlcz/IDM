package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f227231j;
    public final TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f227231j = (ImageView) itemView.findViewById(R$id.draggableActionWidget_image);
        this.k = (TextView) itemView.findViewById(R$id.draggableActionWidget_title);
    }
}
