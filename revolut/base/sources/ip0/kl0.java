package ip0;

import android.view.View;
import com.revolut.core.ui_kit.views.ToDoItemView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kl0 extends koi.b {
    public final ToDoItemView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (ToDoItemView) itemView;
    }
}
