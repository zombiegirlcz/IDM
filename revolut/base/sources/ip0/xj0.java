package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xj0 extends koi.b {
    public final TagView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (TagView) itemView.findViewById(R$id.tag_view);
    }
}
