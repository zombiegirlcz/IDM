package n30;

import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardActivity;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements kfm.o, kfm.c, kfm.p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f211616b;

    public /* synthetic */ d(Function function, int i) {
        this.f211615a = i;
        this.f211616b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((n33.i0) this.f211616b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f211615a;
        Function function = this.f211616b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n1j.t) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n1j.t) function).invoke(p0);
            case 2:
                KProperty[] kPropertyArr = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n33.t) ((n33.c) function).invoke(p0);
            case 3:
                KProperty[] kPropertyArr2 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((n1j.t) function).invoke(p0);
            case 4:
                KProperty[] kPropertyArr3 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((n1j.t) function).invoke(p0);
            case 5:
                KProperty[] kPropertyArr4 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((n1j.t) function).invoke(p0);
            case 6:
                KProperty[] kPropertyArr5 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((n1j.t) function).invoke(p0);
            case 7:
                KProperty[] kPropertyArr6 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n33.t) ((n33.c) function).invoke(p0);
            case 8:
                KProperty[] kPropertyArr7 = OrderNewCardActivity.J0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n33.t) ((n33.c) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((n33.c) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) ((n33.c) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n33.i0) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n09.j0) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((n09.j0) function).invoke(p0);
            case 16:
            case 18:
            case 19:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((lph.c) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) ((n33.c) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((n33.i0) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.c) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((n33.i0) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((n33.i0) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n33.h) ((n33.c) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        n33.c cVar = (n33.c) this.f211616b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) cVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        n0c.v vVar = (n0c.v) this.f211616b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (n33.q) vVar.invoke(p0, p17);
    }
}
