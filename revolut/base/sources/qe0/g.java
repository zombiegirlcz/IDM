package qe0;

import com.revolut.data.model.Data;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants.TrustedMerchantsActivity;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qg7.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements kfm.p, kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f245027b;

    public /* synthetic */ g(int i, Function1 function1) {
        this.f245026a = i;
        this.f245027b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f245026a) {
            case 16:
                ((qi3.c) this.f245027b).invoke(obj2);
                break;
            case 17:
            default:
                ((qjg.h) this.f245027b).invoke(obj2);
                break;
            case 18:
                ((qi3.m) this.f245027b).invoke(obj2);
                break;
            case 19:
                ((qi3.m) this.f245027b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f245026a;
        Function1 function1 = this.f245027b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((qc7.c) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((e1.e) function1).invoke(p0);
            case 3:
            case 9:
            case 16:
            case 18:
            case 19:
            case 24:
            case 26:
            default:
                return (Boolean) ((ql6.s) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((qc7.c) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((csl.a) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((v) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((v) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ChooserScreenContract$Model) ((qc0.w) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((qi3.i) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((qi3.i) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((v) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((v) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((v) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((v) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((qi3.c) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((v) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((v) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((qgf.o) function1).invoke(p0);
            case 23:
                int i2 = TrustedMerchantsActivity.C0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((v) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((qjg.h) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((ib6.j) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((qce.a) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f245026a) {
            case 0:
                qc7.c cVar = (qc7.c) this.f245027b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar.invoke(p0)).booleanValue();
            case 3:
                qc7.c cVar2 = (qc7.c) this.f245027b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) cVar2.invoke(p0)).booleanValue();
            case 9:
                v vVar = (v) this.f245027b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar.invoke(p0)).booleanValue();
            default:
                ql6.s sVar = (ql6.s) this.f245027b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) sVar.invoke(p0)).booleanValue();
        }
    }
}
