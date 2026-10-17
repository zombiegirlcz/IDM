package ip0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a90 extends koi.b {
    public final LinearLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163414h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(View itemView, in1.a selectListener) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(selectListener, "selectListener");
        View viewFindViewById = itemView.findViewById(R$id.rateButtonsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.leftText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163413g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rightText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163414h = (TextView) viewFindViewById3;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (i < 6) {
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 8.0f);
            layoutParams.setMarginStart(i == 1 ? 0 : iA);
            if (i == 5) {
                iA = 0;
            }
            layoutParams.setMarginEnd(iA);
            layoutParams.weight = 1.0f;
            smallActionButton.setLayoutParams(layoutParams);
            smallActionButton.setContentPadding(0);
            smallActionButton.setText(new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126));
            smallActionButton.setOnClickListener(new b80(selectListener, i, this));
            arrayList.add(smallActionButton);
            this.f.addView(smallActionButton);
            i++;
        }
        this.i = arrayList;
    }
}
