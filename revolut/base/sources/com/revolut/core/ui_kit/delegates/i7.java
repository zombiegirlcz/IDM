package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import ip0.iq;
import ip0.jq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i7 extends koi.b {
    public InputChecklistDelegate.Model f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f54280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f54281h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputText f54282j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fp0.p f54283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f54284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public iq f54285n;
    public jq o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.inputChecklist_tickIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f54280g = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.inputChecklist_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54281h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.inputChecklist_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.inputChecklist_inputText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        InputText inputText = (InputText) viewFindViewById4;
        this.f54282j = inputText;
        View viewFindViewById5 = itemView.findViewById(R$id.inputChecklist_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById5;
        this.k = imageView;
        fp0.p.Companion.getClass();
        this.f54283l = fp0.m.a(imageView, gp0.b.f145198a);
        View viewFindViewById6 = itemView.findViewById(R$id.inputChecklist_inputTextBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54284m = viewFindViewById6;
        inputText.getInnerEditText().a(new au0.m4(this, 4));
    }
}
