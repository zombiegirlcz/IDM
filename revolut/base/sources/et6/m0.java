package et6;

import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.ui.activity.container.ContainerActivity;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f129272b;

    public /* synthetic */ m0(int i, Function1 function1) {
        this.f129271a = i;
        this.f129272b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f129271a;
        Function1 function1 = this.f129272b;
        switch (i) {
            case 7:
                ((e4k.m0) function1).invoke(obj2);
                break;
            case 8:
                ((eif.c) function1).invoke(obj2);
                break;
            case 9:
                ((eul.d) function1).invoke(obj2);
                break;
            default:
                ContainerActivity.Companion companion = ContainerActivity.INSTANCE;
                ((eu7.c) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f129271a;
        Function1 function1 = this.f129272b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
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
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
            case 8:
            case 9:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                KProperty[] kPropertyArr = CreditCardStatementScreen.j0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                KProperty[] kPropertyArr2 = AddCardToGooglePayActivity.f64445v0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                KProperty[] kPropertyArr3 = AddCardToGooglePayActivity.f64445v0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                KProperty[] kPropertyArr4 = AddCardToGooglePayActivity.f64445v0;
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
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (Pair) ((exh.a) function1).invoke(p0);
    }
}
