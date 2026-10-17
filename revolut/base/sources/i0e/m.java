package i0e;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit.delegates.DropDownLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends yji.d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f157370c;
    public final g d;
    public final DoublePickerDelegate e;
    public final PickerDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InputTextDelegate f157371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FullScreenStateDelegate f157372h;
    public final SingleChoiceDelegate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DatePickerDelegate f157373j;

    public m(j60.a bottomExpandableExtension, g statementPeriodSelectorModel) {
        Intrinsics.checkNotNullParameter(bottomExpandableExtension, "bottomExpandableExtension");
        Intrinsics.checkNotNullParameter(statementPeriodSelectorModel, "statementPeriodSelectorModel");
        this.f157370c = bottomExpandableExtension;
        this.d = statementPeriodSelectorModel;
        this.e = new DoublePickerDelegate();
        this.f = new PickerDelegate();
        this.f157371g = new InputTextDelegate(null);
        this.f157372h = new FullScreenStateDelegate();
        this.i = new SingleChoiceDelegate();
        this.f157373j = new DatePickerDelegate();
    }

    @Override // yji.d
    public final void M() {
        DoublePickerDelegate doublePickerDelegate = this.e;
        yji.d.H(this, rd0.e.b(doublePickerDelegate.f52193c), new i(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(doublePickerDelegate.d), new i(this, null, 1), 3);
        yji.d.H(this, rd0.e.b(this.f.f52922c), new i(this, null, 2), 3);
        InputTextDelegate inputTextDelegate = this.f157371g;
        yji.d.H(this, h30.l.y(inputTextDelegate.i.f121375b, inputTextDelegate.f52575g.f121375b, "merge(...)"), new j(2, 4, g.class, this.d, "onInputTextClicked", "onInputTextClicked(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;)V"), 3);
        yji.d.H(this, rd0.e.b(this.f157372h.f52371h.f121375b), new k(2, 4, g.class, this.d, "onMainActionClick", "onMainActionClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        yji.d.H(this, rd0.e.b(this.i.p()), new l(2, 4, g.class, this.d, "onSingleChoiceClick", "onSingleChoiceClick(Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate$Model;)V"), 3);
        yji.d.H(this, rd0.e.b(this.f157373j.f52176c.f121375b), new hp4.e(2, this.d, g.class, "onDatePickerClicked", "onDatePickerClicked(Lcom/revolut/core/ui_kit/delegates/DatePickerDelegate$ClickData;)V", 4, 7), 3);
    }

    public final List Q() {
        return zhm.v.k(this.e, this.f, this.f157371g, this.f157372h, new DropDownLoadingDelegate());
    }

    @Override // yji.d
    public final void onCreate() {
        this.f157370c.d(zhm.v.k(this.i, this.f157373j));
    }
}
