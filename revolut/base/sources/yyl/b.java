package yyl;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ryl.f;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f318007b;

    public /* synthetic */ b(c cVar, int i) {
        this.f318006a = i;
        this.f318007b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f318006a) {
            case 0:
                f model = (f) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                model.getClass();
                this.f318007b.e.invoke(model);
                return Unit.f186387a;
            case 1:
                ryl.a model2 = (ryl.a) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                boolean zA = model2.a();
                c cVar = this.f318007b;
                if (zA) {
                    BottomSheetDialog bottomSheetDialog = cVar.i;
                    if (bottomSheetDialog == null) {
                        Intrinsics.r("dialog");
                        throw null;
                    }
                    bottomSheetDialog.dismiss();
                }
                cVar.e.invoke(model2);
                return Unit.f186387a;
            case 2:
                ryl.a model3 = (ryl.a) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                boolean zA2 = model3.a();
                c cVar2 = this.f318007b;
                if (zA2) {
                    BottomSheetDialog bottomSheetDialog2 = cVar2.i;
                    if (bottomSheetDialog2 == null) {
                        Intrinsics.r("dialog");
                        throw null;
                    }
                    bottomSheetDialog2.dismiss();
                }
                cVar2.e.invoke(model3);
                return Unit.f186387a;
            default:
                ryl.a model4 = (ryl.a) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                c cVar3 = this.f318007b;
                BottomSheetDialog bottomSheetDialog3 = cVar3.i;
                if (bottomSheetDialog3 == null) {
                    Intrinsics.r("dialog");
                    throw null;
                }
                bottomSheetDialog3.dismiss();
                cVar3.e.invoke(model4);
                return Unit.f186387a;
        }
    }
}
