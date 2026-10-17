package jk4;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputAmountScreen f175069b;

    public /* synthetic */ b(InputAmountScreen inputAmountScreen, int i) {
        this.f175068a = i;
        this.f175069b = inputAmountScreen;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f175068a;
        InputAmountScreen inputAmountScreen = this.f175069b;
        switch (i) {
            case 0:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = InputAmountScreen.U;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj4 = data.f51981p;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj4, (u80.d) inputAmountScreen.M.getValue(), null, new f61.a(inputAmountScreen, 25), false, false, 0, false, null, 1928);
            default:
                AmountEditDelegate.Model data2 = (AmountEditDelegate.Model) obj2;
                AmountEditView field2 = (AmountEditView) obj3;
                KProperty[] kPropertyArr2 = InputAmountScreen.U;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText2 = field2.getEditText();
                Object obj5 = data2.f51629j;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText2, (xi0.b) obj5, (u80.d) inputAmountScreen.M.getValue(), null, new fkg.a(inputAmountScreen, 20), false, false, 0, false, null, 1928);
        }
    }
}
