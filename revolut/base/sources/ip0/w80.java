package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import com.revolut.core.ui_kit.R$id;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w80 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166953h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f166954j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f166955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f166956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f166957n;
    public final List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rateEmoji_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rateEmoji_imageFirst);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f166952g = imageView;
        View viewFindViewById3 = itemView.findViewById(R$id.rateEmoji_labelFirst);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(R$id.rateEmoji_imageSecond);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = itemView.findViewById(R$id.rateEmoji_labelSecond);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        View viewFindViewById6 = itemView.findViewById(R$id.rateEmoji_imageThird);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        View viewFindViewById7 = itemView.findViewById(R$id.rateEmoji_labelThird);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        View viewFindViewById8 = itemView.findViewById(R$id.rateEmoji_labelFourth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById8;
        this.f166953h = textView;
        View viewFindViewById9 = itemView.findViewById(R$id.rateEmoji_imageFourth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById9;
        this.i = imageView2;
        View viewFindViewById10 = itemView.findViewById(R$id.rateEmoji_labelFifth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById10;
        this.f166954j = textView2;
        View viewFindViewById11 = itemView.findViewById(R$id.rateEmoji_imageFifth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById11;
        this.k = imageView3;
        View viewFindViewById12 = itemView.findViewById(R$id.rateEmoji_bottomButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f166955l = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.rateEmoji_closeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f166956m = viewFindViewById13;
        List<ImageView> listK = zhm.v.k(imageView, (ImageView) viewFindViewById4, (ImageView) viewFindViewById6, imageView2, imageView3);
        this.f166957n = listK;
        this.o = zhm.v.k((TextView) viewFindViewById3, (TextView) viewFindViewById5, (TextView) viewFindViewById7, textView, textView2);
        for (ImageView imageView4 : listK) {
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView4.setBackgroundResource(kli.a.x(R$attr.selectableItemBackgroundBorderless, context));
        }
        TextView textView3 = this.f166955l;
        textView3.setOnTouchListener(new j01.e(new View[]{textView3}));
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(this.f166956m, "getContext(...)", 16.0f);
        or0.u.l(this.f166956m, iA, iA, iA, iA);
    }

    public final ArrayList F() {
        ArrayList<Pair> arrayListL1 = zhm.d0.l1(this.o, this.f166957n);
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListL1, 10));
        for (Pair pair : arrayListL1) {
            arrayList.add(new m80((TextView) pair.f186385a, (ImageView) pair.f186386b));
        }
        return arrayList;
    }
}
