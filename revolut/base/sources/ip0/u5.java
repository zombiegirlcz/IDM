package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u5 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f166595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f166596h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        View viewFindViewById2 = itemView.findViewById(R$id.subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166595g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final ImageView imageView = (ImageView) viewFindViewById3;
        this.f166596h = imageView;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: yp0.g0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
                TextView textView2 = textView;
                ImageView imageView2 = imageView;
                imageView2.setTranslationY(((textView2.getLayout().getLineDescent(0) - textView2.getLayout().getLineAscent(0)) / 2.0f) - (imageView2.getHeight() / 2.0f));
            }
        });
    }
}
