package ylh;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends yji.d implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f314718c;
    public final j d;
    public final DoublePickerDelegate e;
    public final PickerDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InputTextDelegate f314719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FullScreenStateDelegate f314720h;
    public final SingleChoiceDelegate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DatePickerDelegate f314721j;

    public p(j60.a bottomExpandableExtension, j statementPeriodSelectorModel) {
        Intrinsics.checkNotNullParameter(bottomExpandableExtension, "bottomExpandableExtension");
        Intrinsics.checkNotNullParameter(statementPeriodSelectorModel, "statementPeriodSelectorModel");
        this.f314718c = bottomExpandableExtension;
        this.d = statementPeriodSelectorModel;
        this.e = new DoublePickerDelegate();
        this.f = new PickerDelegate();
        this.f314719g = new InputTextDelegate(null);
        this.f314720h = new FullScreenStateDelegate();
        this.i = new SingleChoiceDelegate();
        this.f314721j = new DatePickerDelegate();
    }

    @Override // yji.d
    public final void M() {
        DoublePickerDelegate doublePickerDelegate = this.e;
        yji.d.H(this, rd0.e.b(doublePickerDelegate.f52193c), new l(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(doublePickerDelegate.d), new l(this, null, 1), 3);
        yji.d.H(this, rd0.e.b(this.f.f52922c), new l(this, null, 2), 3);
        InputTextDelegate inputTextDelegate = this.f314719g;
        yji.d.H(this, vkm.q.J(rd0.e.b(inputTextDelegate.f52575g.f121375b), rd0.e.b(inputTextDelegate.i.f121375b)), new m(this, null), 3);
        yji.d.H(this, rd0.e.b(this.f314720h.f52371h.f121375b), new n(this, null), 3);
        yji.d.H(this, rd0.e.b(this.i.p()), new o(2, 4, j.class, this.d, "onSingleChoiceClick", "onSingleChoiceClick(Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate$Model;)V"), 3);
        yji.d.H(this, rd0.e.b(this.f314721j.f52176c.f121375b), new woc.p(2, this.d, j.class, "onDatePickerClicked", "onDatePickerClicked(Lcom/revolut/core/ui_kit/delegates/DatePickerDelegate$ClickData;)V", 4, 24), 3);
    }

    @Override // yji.d
    public final void onCreate() {
        this.f314718c.d(zhm.v.k(this.i, this.f314721j));
    }
}
