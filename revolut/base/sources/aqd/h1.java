package aqd;

import android.view.View;
import au0.c2;
import com.revolut.core.ui_kit.views.navbar.AvatarModelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem;
import ip0.xc;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ro0.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8346a;

    public /* synthetic */ h1(int i) {
        this.f8346a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f8346a) {
            case 0:
                m old2 = (m) obj2;
                m mVar = (m) data;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(mVar, "new");
                return Boolean.valueOf(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e.I2(old2.d).equals(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e.I2(mVar.d)));
            case 1:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new q0((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, false, null)), o0.f8380a, j0.f8354a);
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ar0.e);
            case 4:
                Throwable error = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 5:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new arf.e(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)), false);
            case 6:
                Pair pair = (Pair) obj2;
                Pair pair2 = (Pair) data;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                io3.d dVar = (io3.d) pair.f186385a;
                Double d = (Double) pair.f186386b;
                io3.d dVar2 = (io3.d) pair2.f186385a;
                return Boolean.valueOf(Intrinsics.f(dVar.f163145a, dVar2.f163145a) && dVar.i == dVar2.i && Intrinsics.c(d, (Double) pair2.f186386b));
            case 7:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 8:
                ((Boolean) obj2).getClass();
                return zhm.f0.f322471a;
            case 9:
                Throwable error3 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list3 == null) {
                    return error3;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.f0.f322471a;
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof au0.g1);
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof c2);
            case 14:
                View view = (View) obj2;
                ro0.e0 target = (ro0.e0) data;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(target, "target");
                ro0.q.Companion.getClass();
                return q.a.a(view, target);
            case 15:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AvatarNavBarMenuItem);
            case 16:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AvatarModelNavBarMenuItem);
            case 17:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(ivi.a.f168867a);
            case 18:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                List listB = iii.c.b(null, null, 6, true);
                yp0.b.q(listB, 0, 0, 0, 0, 15);
                return listB;
            case 19:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 20:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 21:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return avk.o.f10116a;
            case 24:
                Function1 errorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return (List) errorItems.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return zhm.u.c(new xc("ERROR_PAGE", (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)), 0, null, null, 0, 0, 0, 1020));
            case 28:
                Function1 defaultErrorItemsProvider = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return (List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null));
            default:
                axd.d validate = (axd.d) obj2;
                axd.d it8 = (axd.d) data;
                Intrinsics.checkNotNullParameter(validate, "$this$validate");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new axd.a(validate.R0(), validate.Q0());
        }
    }

    public /* synthetic */ h1(Object obj2, int i) {
        this.f8346a = i;
    }
}
