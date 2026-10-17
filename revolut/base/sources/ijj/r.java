package ijj;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.feature.wealth.ui.impl.trade_redesign.screen.TradeScreenContract$ModalStep;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161824a;

    public /* synthetic */ r(int i) {
        this.f161824a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f161824a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(ynj.h.f315483a);
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 3:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list3 == null) {
                    return error4;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 7:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                List list4 = (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
                m70.a.c(t0.f186434a);
                return new cii.b(null, list4, new lw0.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return iii.c.c(5);
            case 9:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 11:
                Throwable error5 = (Throwable) obj2;
                List list5 = (List) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list5 == null) {
                    return error5;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 13:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TradeScreenContract$ModalStep step = (TradeScreenContract$ModalStep) data;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, TradeScreenContract$ModalStep.PlaceholderModal.f96034a)) {
                    throw new IllegalStateException("Placeholder modal not implemented");
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 15:
                Throwable error6 = (Throwable) obj2;
                hha.d dVar = (hha.d) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dVar == null) {
                    return error6;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 17:
                Boolean bool2 = (Boolean) data;
                bool2.booleanValue();
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return bool2;
            case 18:
                Boolean bool3 = (Boolean) data;
                bool3.booleanValue();
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return bool3;
            case 19:
                Throwable error7 = (Throwable) obj2;
                List list6 = (List) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list6 == null) {
                    return error7;
                }
                return null;
            case 20:
                Throwable error8 = (Throwable) obj2;
                List list7 = (List) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list7 == null) {
                    return error8;
                }
                return null;
            case 21:
                Throwable error9 = (Throwable) obj2;
                List list8 = (List) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list8 == null) {
                    return error9;
                }
                return null;
            case 22:
                Throwable error10 = (Throwable) obj2;
                uib.a aVar = (uib.a) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (aVar == null) {
                    return error10;
                }
                return null;
            case 23:
                Throwable error11 = (Throwable) obj2;
                TeenProfile teenProfile = (TeenProfile) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (teenProfile == null) {
                    return error11;
                }
                return null;
            case 24:
                Throwable error12 = (Throwable) obj2;
                List list9 = (List) data;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list9 == null) {
                    return error12;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 28:
                Context context = (Context) obj2;
                fsi.g coreActivityApi = (fsi.g) data;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
                phm.a aVar2 = (phm.a) ue0.e.j(context).a().get(o41.a.class);
                b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar3 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", o41.a.class, " is not found"));
                }
                o41.a aVar4 = ((o41.a) aVar3.b()).I;
                coreActivityApi.getClass();
                return new o41.c(aVar4, new xoi.a(), new xoi.j(), coreActivityApi);
            default:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AccountCellItemDelegate.Model);
        }
    }
}
