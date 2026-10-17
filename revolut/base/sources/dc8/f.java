package dc8;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$AllowancePage;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import om4.d0;
import w4l.i;
import yji.l;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends oki.h implements ali.h {
    public final JuniorAllowancePagerScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f112816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f112817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f112818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f112819s;

    public f(JuniorAllowancePagerScreenContract$Input input, g saveStateDelegate, ang.f userInteractor, d0 juniorAllowancesInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowancesInteractor, "juniorAllowancesInteractor");
        this.o = input;
        this.f112816p = userInteractor;
        this.f112817q = juniorAllowancesInteractor;
        String str = input.f76840b;
        this.f112818r = mra.d.b(this, new b(new Data(null, null, true, 3, null), str, u.c(new JuniorAllowancePagerScreenContract$AllowancePage(str, input.f76841c))), new h(), saveStateDelegate, false, 8);
        this.f112819s = s.b(this, new cwj.h(this, 21));
    }

    public static final ArrayList I2(f fVar, List list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((nb8.b) obj2).k == null) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (Intrinsics.f(((nb8.b) obj3).f214010h.f214013a, str)) {
                arrayList3.add(obj3);
            } else {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((nb8.b) obj4).f214007b == nb8.f.ACTIVE) {
                arrayList5.add(obj4);
            }
        }
        List listP0 = zhm.d0.P0(arrayList5, new a9j.f(new d(), 20));
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (((nb8.b) obj5).f214007b == nb8.f.INACTIVE) {
                arrayList6.add(obj5);
            }
        }
        ArrayList<nb8.b> arrayListE0 = zhm.d0.E0(arrayList3, zhm.d0.E0(arrayList4, zhm.d0.E0(zhm.d0.P0(arrayList6, new e()), listP0)));
        ArrayList arrayList7 = new ArrayList(w.t(arrayListE0, 10));
        for (nb8.b bVar : arrayListE0) {
            arrayList7.add(new JuniorAllowancePagerScreenContract$AllowancePage(bVar.f214006a, bVar.f214010h.f214013a));
        }
        return arrayList7;
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f112819s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, yh5.b.d(this.f112816p.j(w4l.h.f294642c), this.f112817q.g(this.o.f76839a, i.f294643c)), null, new d8j.c(this, (Continuation) null, 9), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f112818r;
    }
}
