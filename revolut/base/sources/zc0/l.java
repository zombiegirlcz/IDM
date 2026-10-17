package zc0;

import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackendScreenFragment f321077b;

    public /* synthetic */ l(BackendScreenFragment backendScreenFragment, int i) {
        this.f321076a = i;
        this.f321077b = backendScreenFragment;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f321076a) {
            case 0:
                AmountEditDelegate.Model data = (AmountEditDelegate.Model) obj2;
                AmountEditView field = (AmountEditView) obj3;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj4 = data.f51629j;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                xi0.b bVar = (xi0.b) obj4;
                BackendScreenFragment backendScreenFragment = this.f321077b;
                return new zp0.d(editText, bVar, (u80.d) backendScreenFragment.f51331d0.getValue(), null, new p(backendScreenFragment, data), false, false, 0, false, null, 1928);
            default:
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj5 = model.P;
                boolean z = obj5 instanceof p3;
                BackendScreenFragment backendScreenFragment2 = this.f321077b;
                if (z) {
                    return new zp0.d(field2.getInnerEditText(), ((p3) obj5).f321107c, (u80.d) backendScreenFragment2.f51331d0.getValue(), null, null, false, false, 0, false, null, 1912);
                }
                if (obj5 instanceof d3) {
                    return new g3(((s80.b) backendScreenFragment2.D().i()).b(), field2, new z8g.q(backendScreenFragment2, model, 24), ((d3) obj5).f321037c);
                }
                if (obj5 instanceof v3) {
                    String str = ((v3) obj5).f321143b;
                    if (str != null) {
                        List listC = zhm.u.c(zp0.m.a());
                        return new zp0.y(field2.getInnerEditText(), listC, str, new n(backendScreenFragment2, 3), model.f52580a, null, false, 96);
                    }
                } else if (obj5 instanceof w3) {
                    return new zp0.b0(field2.getInnerEditText(), new yrk.e(backendScreenFragment2, 14, model, field2));
                }
                return null;
        }
    }
}
