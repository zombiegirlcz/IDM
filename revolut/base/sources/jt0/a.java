package jt0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountForDualEditView f178263b;

    public /* synthetic */ a(AmountForDualEditView amountForDualEditView, int i) {
        this.f178262a = i;
        this.f178263b = amountForDualEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f178262a;
        AmountForDualEditView amountForDualEditView = this.f178263b;
        switch (i) {
            case 0:
                amountForDualEditView.f56914p.onNext(Unit.f186387a);
                break;
            default:
                int i2 = AmountForDualEditView.C;
                amountForDualEditView.e();
                break;
        }
    }
}
