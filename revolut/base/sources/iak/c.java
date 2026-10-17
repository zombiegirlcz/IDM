package iak;

import a9j.k;
import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f160048b;

    public /* synthetic */ c(d dVar, int i) {
        this.f160047a = i;
        this.f160048b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f160047a) {
            case 0:
                Object it8 = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f160048b.getClass();
                if (!(it8 instanceof SetUpPdaActivityContract$Step.Eof)) {
                    if (it8 instanceof SetUpPdaActivityContract$Step.Intro) {
                        it8 = new SetUpPdaActivityContract$Step.Eof(false);
                    } else if (it8 instanceof SetUpPdaActivityContract$Step.SelectBeneficiary) {
                        it8 = SetUpPdaActivityContract$Step.Intro.f102381a;
                    } else {
                        if (!(it8 instanceof SetUpPdaActivityContract$Step.Confirmation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        it8 = SetUpPdaActivityContract$Step.SelectBeneficiary.f102382a;
                    }
                }
                ufm.b bVarM = d0.m(it8);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                return new n(new k(this.f160048b, 9, str, str2), 1);
        }
    }
}
