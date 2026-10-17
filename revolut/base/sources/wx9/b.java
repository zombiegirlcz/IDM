package wx9;

import a83.z;
import atg.q;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonActivity;
import efm.h0;
import java.util.List;
import java.util.Set;
import kfm.g;
import kfm.h;
import kfm.o;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import qv0.p;
import t9f.n;
import wsg.j;
import wtl.f;
import wvg.d0;
import wvg.r1;
import wyc.w;
import yhm.r;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements o, g, kfm.c, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f300792b;

    public /* synthetic */ b(Function function, int i) {
        this.f300791a = i;
        this.f300792b = function;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        j31.b bVar = (j31.b) this.f300792b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (Set) bVar.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((w) this.f300792b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f300791a;
        Function function = this.f300792b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((d0) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((r1) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((r1) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((f) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((w) function).invoke(p0);
            case 6:
            case 25:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b2i.b) ((x0i.h) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((wzc.g) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((wzc.g) function).invoke(p0);
            case 9:
                int i2 = CardSelectReplaceReasonActivity.f64920w0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p) ((wyc.p) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x03.a) ((wyc.p) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((x03.g) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((wyc.p) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((x03.g) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r) ((x03.i) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wy2.d) ((wyc.p) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((x03.o) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((j) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((x03.o) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (z03.c) ((d0) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w43.b) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wwa.a) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wg9.p) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((q) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((v77.a) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((f) function).invoke(p0);
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        z zVar = (z) this.f300792b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Set) zVar.invoke(p0, p17);
    }
}
