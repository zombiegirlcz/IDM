package uyl;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.text.masked.MaskedEditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends koi.b {
    public final MaskedEditText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f284455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f284456h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProgressBar f284457j;
    public final AppCompatRadioButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qyl.c f284458l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.editor);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (MaskedEditText) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.editor_wrapper);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f284455g = (ImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.underline_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f284456h = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.text_counter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f284457j = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.radio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.k = (AppCompatRadioButton) viewFindViewById7;
    }
}
