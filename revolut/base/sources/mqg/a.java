package mqg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import com.revolut.core.ui_kit.models.IndexBarModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.salary_switch.impl.R$string;
import do3.n;
import ip0.zj;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.g1;
import ms0.h0;
import mtc.i;
import nel.w0;
import zbb.f;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207995a;

    public /* synthetic */ a(int i) {
        this.f207995a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        List listC;
        switch (this.f207995a) {
            case 0:
                Throwable error = (Throwable) obj2;
                bcb.b bVar = (bcb.b) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                f fVar = (f) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                bcb.d dVar = (bcb.d) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 3:
                Throwable error4 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 4:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                if (tj0.a.a((Throwable) obj2)) {
                    listC = iii.c.e(6, null, true);
                } else {
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_LIST_ID", new TextLocalisedClause(R$string.salary_switch_mx_status_error_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_mx_status_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    listC = u.c(model);
                }
                return new mrc.d(listC);
            case 6:
                Throwable error6 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list3 == null) {
                    return error6;
                }
                return null;
            case 7:
                Throwable error7 = (Throwable) obj2;
                Set set = (Set) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (set == null) {
                    return error7;
                }
                return null;
            case 8:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof h0);
            case 9:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.internal.views.d);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof IndexBarModel);
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof g1);
            case 12:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qw0.b);
            case 13:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof qw0.d);
            case 14:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof com.revolut.core.ui_kit.internal.views.floatingbottombar.b);
            case 15:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof FloatingBottomBarExpandedView.ItemDelegate.Model);
            case 16:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new i((List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null)), false);
            case 17:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 18:
                Throwable error8 = (Throwable) obj2;
                w0 w0Var = (w0) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (w0Var == null) {
                    return error8;
                }
                return null;
            case 19:
                Throwable error9 = (Throwable) obj2;
                List list4 = (List) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list4 == null) {
                    return error9;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 21:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new mu4.f((List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)));
            case 23:
                Throwable error10 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (pair == null) {
                    return error10;
                }
                return null;
            case 24:
                Throwable error11 = (Throwable) obj2;
                n nVar = (n) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (nVar == null) {
                    return error11;
                }
                return null;
            case 25:
                Throwable error12 = (Throwable) obj2;
                List list5 = (List) data;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list5 == null) {
                    return error12;
                }
                return null;
            case 26:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 27:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
            case 28:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            default:
                Throwable error13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error13, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error13, h0Var);
                return null;
        }
    }
}
