package xy7;

import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sow.impl.ui.document.other.SowOtherDocumentFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import efm.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y20.i0;
import y20.k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements kfm.o, kfm.g, kfm.p, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f309634b;

    public /* synthetic */ j(int i, Function1 function1) {
        this.f309633a = i;
        this.f309634b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f309633a) {
            case 1:
                ((xyc.k) this.f309634b).invoke(obj2);
                break;
            case 2:
                ((xyc.k) this.f309634b).invoke(obj2);
                break;
            case 13:
                ((xzk.f) this.f309634b).invoke(obj2);
                break;
            case 23:
                ((k0) this.f309634b).invoke(obj2);
                break;
            case 24:
                ((k0) this.f309634b).invoke(obj2);
                break;
            default:
                ((k0) this.f309634b).invoke(obj2);
                break;
        }
    }

    @Override // efm.x
    public w apply(efm.r p0) {
        xlb.o oVar = (xlb.o) this.f309634b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (w) oVar.invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        i0 i0Var = (i0) this.f309634b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) i0Var.invoke(p0)).booleanValue();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f309633a;
        Function1 function1 = this.f309634b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((i) function1).invoke(p0);
            case 1:
            case 2:
            case 13:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((y07.m) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((xyc.j) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((xw9.c) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((xz7.e) function1).invoke(p0);
            case 6:
                int i2 = SowOtherDocumentFragment.g0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CharSequence) ((xx9.f) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xzc.f) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xzc.f) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((xx9.f) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xzk.f) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((xx9.f) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((xx9.f) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((xyc.j) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xel.f) ((a94.e) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((xx9.f) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wo5.a) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((xw9.c) function1).invoke(p0);
                return Boolean.TRUE;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((xyh.n) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((w43.b) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((xyc.j) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((oq3.g) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((xf0.h) function1).invoke(p0);
        }
    }
}
