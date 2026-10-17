package op0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.customview.poolingcontainer.PoolingContainer;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.y8;
import ip0.nw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b3 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f227189j;
    public final y8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(View itemView, MapPlainDelegate mapDelegate) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mapDelegate, "mapDelegate");
        View viewFindViewById = itemView.findViewById(R$id.mapWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227189j = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.mapWidget_mapContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        y8 y8VarG = mapDelegate.g(frameLayout);
        this.k = y8VarG;
        frameLayout.addView(y8VarG.itemView);
        PoolingContainer.addPoolingContainerListener(itemView, new nw(this, 2));
        frameLayout.setOutlineProvider(new a3());
        frameLayout.setClipToOutline(true);
    }
}
