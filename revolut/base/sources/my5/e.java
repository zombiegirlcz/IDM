package my5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import ny5.j;
import pfm.m;
import te0.r;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f210344b;

    public /* synthetic */ e(i iVar, int i) {
        this.f210343a = i;
        this.f210344b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f210343a) {
            case 0:
                SortingType sortingType = (SortingType) obj2;
                Intrinsics.checkNotNullParameter(sortingType, "sortingType");
                i iVar = this.f210344b;
                opi.d dVar = iVar.i;
                iVar.f210349j.getClass();
                ((opi.b) dVar).b0(j.a(sortingType));
                return Unit.f186387a;
            case 1:
                ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f52708a;
                if (!Intrinsics.f(str, "CRYPTO_SUBHEADER_ID") && !Intrinsics.f(str, "RatesListSubheader")) {
                    m mVar = m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                i iVar2 = this.f210344b;
                a aVar = iVar2.f210348h.f210342b;
                d0 d0VarFirstOrError = ((r) aVar.K()).b(((r) aVar.o()).get()).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new pfm.h(new ufm.f(o70.a.i(d0VarFirstOrError), new bc(new e(iVar2, 4), 16), 3), 4);
            case 2:
                Intrinsics.checkNotNullParameter((LargeActionButtonDelegate.Model) obj2, "<unused var>");
                i iVar3 = this.f210344b;
                opi.d.c(iVar3.i);
                return iVar3.f210348h.a();
            case 3:
                SingleChoiceDelegate.Model it8 = (SingleChoiceDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8.f53324a, "id_sorting_dialog")) {
                    return m.f235744a;
                }
                d dVar2 = this.f210344b.f210348h;
                Object obj3 = it8.f;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cryptocommodity_invest.models.SortingType");
                return dVar2.b((SortingType) obj3);
            default:
                SortingType sortingType2 = (SortingType) obj2;
                i iVar4 = this.f210344b;
                opi.d dVar3 = iVar4.i;
                j jVar = iVar4.f210349j;
                Intrinsics.h(sortingType2);
                jVar.getClass();
                ((opi.b) dVar3).Z(j.a(sortingType2));
                return Unit.f186387a;
        }
    }
}
