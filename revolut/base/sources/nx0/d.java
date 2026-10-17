package nx0;

import android.view.View;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditView f220045b;

    public /* synthetic */ d(AmountEditView amountEditView, int i) {
        this.f220044a = i;
        this.f220045b = amountEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f220044a;
        AmountEditView amountEditView = this.f220045b;
        switch (i) {
            case 0:
                AmountEditView.a aVar = AmountEditView.Companion;
                amountEditView.j0();
                break;
            case 1:
                amountEditView.f58932b.onNext(Unit.f186387a);
                break;
            case 2:
                amountEditView.f.onNext(Unit.f186387a);
                break;
            default:
                amountEditView.f.onNext(Unit.f186387a);
                break;
        }
    }
}
