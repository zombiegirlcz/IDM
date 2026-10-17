package mtc;

import cli.o;
import ip0.p10;
import ip0.s7;
import ip0.t10;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r86.b f208818a;

    public n(r86.b deviceDetailsInfoMapper) {
        Intrinsics.checkNotNullParameter(deviceDetailsInfoMapper, "deviceDetailsInfoMapper");
        this.f208818a = deviceDetailsInfoMapper;
    }

    public static ArrayList a() {
        t10 t10Var = new t10("SECOND_DEVICE_LOGIN_BANNER_LIST_ID", p10.f165755a);
        yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.n("LOADING_STATE_ID_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        IntRange intRange2 = new IntRange(4, 5, 1);
        ArrayList arrayList2 = new ArrayList(w.t(intRange2, 10));
        vim.f it9 = intRange2.iterator();
        while (it9.f289625c) {
            arrayList2.add(new s7(a0.d.n("LOADING_STATE_ID_", it9.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return ue0.e.J(t10Var, w.u(v.k(arrayList, arrayList2)));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f208805a, new msb.c(this, 6), new mqg.a(16), new mgh.i(this, 6));
    }
}
