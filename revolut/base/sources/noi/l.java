package noi;

import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements p, kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f218060b;

    public /* synthetic */ l(int i, Function1 function1) {
        this.f218059a = i;
        this.f218060b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f218059a;
        Function1 function1 = this.f218060b;
        switch (i) {
            case 6:
                ((nr0.a) function1).invoke(obj2);
                break;
            case 7:
                ((nr0.a) function1).invoke(obj2);
                break;
            case 8:
                ((nr0.a) function1).invoke(obj2);
                break;
            case 9:
                AnimatedNumbersView.Companion companion = AnimatedNumbersView.INSTANCE;
                ((ns0.c) function1).invoke(obj2);
                break;
            case 10:
                AnimatedNumbersView.Companion companion2 = AnimatedNumbersView.INSTANCE;
                ((ns0.c) function1).invoke(obj2);
                break;
            case 22:
                ((nwl.b) function1).invoke(obj2);
                break;
            default:
                AmountEditView.Companion aVar = AmountEditView.INSTANCE;
                ((nrd.g) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f218059a;
        pfm.m mVar = pfm.m.f235744a;
        Function1 function1 = this.f218060b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 22:
            case 24:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((nx7.h) function1).invoke(p0);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                int i2 = nu0.c.f219166y;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                AmountEditView.Companion aVar = AmountEditView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((nx7.h) function1).invoke(p0);
                break;
        }
        return mVar;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f218059a;
        Function1 function1 = this.f218060b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((nnf.h) function1).invoke(p0)).booleanValue();
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((nnf.h) function1).invoke(p0)).booleanValue();
            default:
                AmountEditView.Companion aVar = AmountEditView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((nuc.n) function1).invoke(p0)).booleanValue();
        }
    }
}
