package jof;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import com.revolut.data.model.Data;
import efm.h0;
import efm.w;
import java.util.List;
import jtk.i;
import jtk.m;
import ju0.j;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f176946b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f176945a = i;
        this.f176946b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f176945a;
        Function1 function1 = this.f176946b;
        switch (i) {
            case 8:
                ((je2.d) function1).invoke(obj2);
                break;
            case 13:
                ((jpl.e) function1).invoke(obj2);
                break;
            case 16:
                ((jlh.g) function1).invoke(obj2);
                break;
            case 22:
                int i2 = AmountForDualEditView.C;
                ((jlh.g) function1).invoke(obj2);
                break;
            default:
                j.a aVar = j.Companion;
                ((ju0.e) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f176945a;
        Function1 function1 = this.f176946b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TextDelegate.Model) ((jlh.g) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((je2.d) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((j2c.o) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) ((jn2.a) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((j2c.o) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TextDelegate.Model) ((aqd.g) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mha.j) ((je2.d) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((jlh.g) function1).invoke(p0);
            case 8:
            case 13:
            case 16:
            case 18:
            case 22:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((m) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((jn2.a) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (jp3.e) ((jp3.b) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((jqj.i) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((jqj.i) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jqk.f) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jqk.f) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jp3.b) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hra.a) ((jpl.e) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kqa.a) ((jb8.a) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((i5f.g) function1).invoke(p0);
            case 24:
                int i2 = AmountForDualEditView.C;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((jpl.e) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((jt2.d) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f176945a;
        Function1 function1 = this.f176946b;
        switch (i) {
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                int i2 = AmountForDualEditView.C;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                j.a aVar2 = j.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((ju0.e) function1).invoke(p0)).booleanValue();
    }
}
