package beb;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputChecklistDelegate.Model f14747b;

    public /* synthetic */ n(InputChecklistDelegate.Model model, int i) {
        this.f14746a = i;
        this.f14747b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        iha.a aVar;
        switch (this.f14746a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, null, null, null, !this.f14747b.f52521c, 15);
            case 1:
                fz4.g updateState = (fz4.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return fz4.g.a(updateState, null, !this.f14747b.f52521c, 1);
            case 2:
                ilk.d updateState2 = (ilk.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                iha.a[] aVarArrValues = iha.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        aVar = aVarArrValues[i];
                        if (!Intrinsics.f(aVar.name(), this.f14747b.f52519a)) {
                            i++;
                        }
                    } else {
                        aVar = null;
                    }
                }
                return ilk.d.a(updateState2, null, aVar, 1);
            case 3:
                iug.e update2 = (iug.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return iug.e.a(update2, null, !this.f14747b.f52521c, 3);
            case 4:
                ieg.a it8 = (ieg.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Intrinsics.f(it8, this.f14747b.i) ? ieg.a.a(it8, !it8.f160708b) : it8;
            case 5:
                poe.f updateState3 = (poe.f) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                Object obj3 = this.f14747b.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.tax_residency.api.models.TaxResidencyRationale");
                return poe.f.a(updateState3, null, (zme.h) obj3, 1);
            case 6:
                r84.e updateState4 = (r84.e) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return r84.e.a(updateState4, null, null, !this.f14747b.f52521c, 11);
            default:
                t48.i updateState5 = (t48.i) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return t48.i.a(updateState5, null, null, null, null, null, this.f14747b.f52521c ? t48.h.NOT_AGREED : t48.h.AGREED, 63);
        }
    }
}
