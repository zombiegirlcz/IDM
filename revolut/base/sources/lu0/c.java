package lu0;

import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardCategoryFragment;
import ip0.u90;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;
import zx0.n;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardCategoryFragment f199985b;

    public /* synthetic */ c(ReactionsKeyboardCategoryFragment reactionsKeyboardCategoryFragment, int i) {
        this.f199984a = i;
        this.f199985b = reactionsKeyboardCategoryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ihm.k kVar;
        int i = this.f199984a;
        ReactionsKeyboardCategoryFragment reactionsKeyboardCategoryFragment = this.f199985b;
        switch (i) {
            case 0:
                ReactionsKeyboardCategoryFragment.Companion aVar = ReactionsKeyboardCategoryFragment.INSTANCE;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                ihm.f fVar = reactionsKeyboardCategoryFragment.m0;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 1:
                u90 it8 = (u90) obj2;
                ReactionsKeyboardCategoryFragment.Companion aVar2 = ReactionsKeyboardCategoryFragment.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                d dVar = reactionsKeyboardCategoryFragment.f57487n0;
                if (dVar != null && (kVar = dVar.f199987b) != null) {
                    kVar.onNext(it8);
                }
                return Unit.f186387a;
            case 2:
                ReactionsKeyboardCategoryFragment.Companion aVar3 = ReactionsKeyboardCategoryFragment.INSTANCE;
                Intrinsics.checkNotNullParameter((efm.r) obj2, "it");
                return reactionsKeyboardCategoryFragment.m0;
            default:
                zx0.n nVar = (zx0.n) obj2;
                ReactionsKeyboardCategoryFragment.Companion aVar4 = ReactionsKeyboardCategoryFragment.INSTANCE;
                Intrinsics.h(nVar);
                if (nVar instanceof n.b) {
                    reactionsKeyboardCategoryFragment.z().setVisibility(8);
                    reactionsKeyboardCategoryFragment.B().setVisibility(0);
                    reactionsKeyboardCategoryFragment.A().setVisibility(8);
                } else if (nVar instanceof n.a) {
                    reactionsKeyboardCategoryFragment.z().setVisibility(8);
                    reactionsKeyboardCategoryFragment.B().setVisibility(8);
                    reactionsKeyboardCategoryFragment.A().setVisibility(0);
                } else {
                    if (!(nVar instanceof zx0.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    reactionsKeyboardCategoryFragment.z().setVisibility(0);
                    reactionsKeyboardCategoryFragment.B().setVisibility(8);
                    reactionsKeyboardCategoryFragment.A().setVisibility(8);
                    ArrayList<zx0.i> arrayList = ((zx0.m) nVar).f326006a;
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    for (zx0.i iVar : arrayList) {
                        arrayList2.add(new u90(iVar.f325997a, iVar.f325998b, iVar.f325999c, iVar.d, iVar.e, iVar.f, iVar.f326000g));
                    }
                    reactionsKeyboardCategoryFragment.i0.c(arrayList2);
                }
                return Unit.f186387a;
        }
    }
}
