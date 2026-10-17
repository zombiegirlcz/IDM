package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v30 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166761g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (TextView) itemView.findViewById(R$id.profile_topText);
        this.f166761g = (TextView) itemView.findViewById(R$id.profile_bottomText);
    }
}
