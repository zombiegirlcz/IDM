package qc0;

import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.ChooserItem;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import com.revolut.feature.backend_flow.domain.models.TimeInputItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f244461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f244462c;
    public final /* synthetic */ String d;

    public /* synthetic */ m(String str, j0 j0Var, String str2, int i) {
        this.f244460a = i;
        this.f244462c = str;
        this.f244461b = j0Var;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FormScreen it8 = (FormScreen) obj2;
        switch (this.f244460a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                aa0.z zVar = this.f244461b.f244443h;
                String code = this.d;
                Intrinsics.checkNotNullParameter(code, "code");
                xi0.b.Companion.getClass();
                return zVar.c(it8, this.f244462c, new aa0.t0(xi0.a.a(code)));
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244461b.f244455y.c(it8, this.f244462c, this.d);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "screen");
                String str = this.f244462c;
                InputItem inputItemO = foh.i.o(it8, str);
                boolean z = inputItemO instanceof TextInputItem;
                j0 j0Var = this.f244461b;
                String str2 = this.d;
                if (z) {
                    return ((TextInputItem) inputItemO).k != null ? it8 : j0Var.k.c(it8, str, new aa0.e1(str2, true, true));
                }
                if (inputItemO instanceof SignatureInputItem) {
                    return j0Var.f244445l.c(it8, str, new aa0.e1(str2, true, true));
                }
                if (inputItemO instanceof CheckboxTextInputItem) {
                    return j0Var.i.c(it8, str, new aa0.z0(str2));
                }
                if (inputItemO instanceof RadioButtonTextInputItem) {
                    return j0Var.f244442g.c(it8, str, new aa0.z0(str2));
                }
                if (inputItemO instanceof SelectionItem) {
                    return j0Var.E.c(it8, str, new aa0.z0(str2));
                }
                if (inputItemO instanceof MoneyInputItem) {
                    return j0Var.f244443h.c(it8, str, new aa0.s0(str2));
                }
                if ((inputItemO instanceof DateInputItem) || (inputItemO instanceof ChooserItem) || (inputItemO instanceof TimeInputItem)) {
                    return it8;
                }
                throw new IllegalArgumentException("Can't process onTextChanged from item: " + inputItemO);
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244461b.f244453w.c(it8, this.f244462c, new aa0.x0(this.d));
            case 4:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244461b.f244448p.c(it8, this.f244462c, this.d);
            case 5:
                Intrinsics.checkNotNullParameter(it8, "screen");
                String str3 = this.f244462c;
                InputItem inputItemO2 = foh.i.o(it8, str3);
                if (inputItemO2 instanceof TextInputItem) {
                    return this.f244461b.k.c(it8, str3, new aa0.e1(this.d, true, true));
                }
                throw new IllegalArgumentException("Can't process for item: " + inputItemO2);
            case 6:
                Intrinsics.checkNotNullParameter(it8, "screen");
                return this.f244461b.F.c(it8, this.f244462c, new aa0.r(this.d));
            case 7:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244461b.B.c(it8, this.f244462c, this.d);
            case 8:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244461b.f244447n.c(it8, this.f244462c, this.d);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244461b.P.c(it8, this.f244462c, this.d);
        }
    }

    public /* synthetic */ m(j0 j0Var, String str, String str2, int i) {
        this.f244460a = i;
        this.f244461b = j0Var;
        this.f244462c = str;
        this.d = str2;
    }
}
