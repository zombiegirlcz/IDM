package fu8;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentKycFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f138123b;

    public /* synthetic */ h(d dVar, int i) {
        this.f138122a = i;
        this.f138123b = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138122a) {
            case 0:
                List list = (List) obj2;
                Intrinsics.h(list);
                ((ChooseDocumentKycFragment) this.f138123b).setItems(list);
                return Unit.f186387a;
            case 1:
                final a behavior = (a) obj2;
                Intrinsics.checkNotNullParameter(behavior, "behavior");
                final int i = 0;
                return w.D(((RowDelegate) ((ChooseDocumentKycFragment) this.f138123b).g0.getValue()).f53220l, new Function1() { // from class: fu8.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i) {
                            case 0:
                                RowDelegate.Model model = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model, "model");
                                behavior.h(model);
                                return pfm.m.f235744a;
                            case 1:
                                Unit it8 = (Unit) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return behavior.a();
                            case 2:
                                CellDetailsListDelegate.Model model2 = (CellDetailsListDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model2, "model");
                                return behavior.b(model2);
                            default:
                                RowDelegate.Model model3 = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model3, "model");
                                return behavior.c(model3);
                        }
                    }
                });
            case 2:
                final a behavior2 = (a) obj2;
                Intrinsics.checkNotNullParameter(behavior2, "behavior");
                ChooseDocumentKycFragment chooseDocumentKycFragment = (ChooseDocumentKycFragment) this.f138123b;
                efm.r rVarMergeWith = ((RowDelegate) chooseDocumentKycFragment.g0.getValue()).f53218h.mergeWith(((SelectableDelegate) chooseDocumentKycFragment.j0.getValue()).r().map(new fs5.d(6, new ft4.w(10))));
                Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
                final int i2 = 3;
                return w.D(rVarMergeWith, new Function1() { // from class: fu8.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                RowDelegate.Model model = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model, "model");
                                behavior2.h(model);
                                return pfm.m.f235744a;
                            case 1:
                                Unit it8 = (Unit) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return behavior2.a();
                            case 2:
                                CellDetailsListDelegate.Model model2 = (CellDetailsListDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model2, "model");
                                return behavior2.b(model2);
                            default:
                                RowDelegate.Model model3 = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model3, "model");
                                return behavior2.c(model3);
                        }
                    }
                });
            case 3:
                final a behavior3 = (a) obj2;
                Intrinsics.checkNotNullParameter(behavior3, "behavior");
                efm.r map = ((SelectableDelegate) ((ChooseDocumentKycFragment) this.f138123b).f77590k0.getValue()).r().map(new fs5.d(5, new ft4.w(9)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                final int i3 = 2;
                return w.D(map, new Function1() { // from class: fu8.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                RowDelegate.Model model = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model, "model");
                                behavior3.h(model);
                                return pfm.m.f235744a;
                            case 1:
                                Unit it8 = (Unit) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return behavior3.a();
                            case 2:
                                CellDetailsListDelegate.Model model2 = (CellDetailsListDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model2, "model");
                                return behavior3.b(model2);
                            default:
                                RowDelegate.Model model3 = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model3, "model");
                                return behavior3.c(model3);
                        }
                    }
                });
            default:
                final a behavior4 = (a) obj2;
                Intrinsics.checkNotNullParameter(behavior4, "behavior");
                efm.r map2 = ((PromptMarketingContentDelegate) ((ChooseDocumentKycFragment) this.f138123b).i0.getValue()).f53079c.map(new fs5.d(4, new ft4.w(11)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                final int i5 = 1;
                return w.D(map2, new Function1() { // from class: fu8.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i5) {
                            case 0:
                                RowDelegate.Model model = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model, "model");
                                behavior4.h(model);
                                return pfm.m.f235744a;
                            case 1:
                                Unit it8 = (Unit) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return behavior4.a();
                            case 2:
                                CellDetailsListDelegate.Model model2 = (CellDetailsListDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model2, "model");
                                return behavior4.b(model2);
                            default:
                                RowDelegate.Model model3 = (RowDelegate.Model) obj3;
                                Intrinsics.checkNotNullParameter(model3, "model");
                                return behavior4.c(model3);
                        }
                    }
                });
        }
    }
}
