package ip0;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hp0 extends koi.b {
    public final z4l.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RecyclerView f164588h;
    public final TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(View itemView, z4l.j adapter) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = adapter;
        View viewFindViewById = itemView.findViewById(R$id.weekdayPicker_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f164587g = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.weekdayPicker_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164588h = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.weekdayPicker_bottomText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
    }
}
