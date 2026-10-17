package com.onfido.android.sdk.capture.ui.documentselection;

import android.view.View;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.ui.documentselection.DocumentAdapter;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.zf;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50057c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f50055a = i;
        this.f50056b = obj2;
        this.f50057c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f50055a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f50057c;
        Object obj5 = this.f50056b;
        switch (i) {
            case 0:
                DocumentAdapter.DocumentViewHolder.bind$lambda$2$lambda$1((Function3) obj5, (DocumentDisplayItem) obj4, (String) obj3, (DocumentPages) obj2, view);
                break;
            default:
                RowDelegate.Model model = (RowDelegate.Model) obj3;
                RowDelegate.Companion companion = RowDelegate.INSTANCE;
                View itemView = ((zf) obj4).itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                RowDelegate.C(itemView, model);
                ((RowDelegate) obj5).f53221m.onNext(new Pair(model, ((RowDelegate.Model.c.a) obj2).f53269a));
                break;
        }
    }
}
