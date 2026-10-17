package fg8;

import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.xc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134937a;

    public /* synthetic */ i0(int i) {
        this.f134937a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f134937a) {
            case 0:
                Throwable error = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 2:
                Throwable th10 = (Throwable) obj2;
                if (((RemoteLoginInvitation) obj3) == null) {
                    return th10;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                hm8.f fVar = (hm8.f) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                NaviCommand naviCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (naviCommand == null) {
                    return error3;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new fhf.g((List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null)));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 10:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 11:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 12:
                Throwable th11 = (Throwable) obj2;
                if (((TradingLegalEntityInformation) obj3) == null) {
                    return th11;
                }
                return null;
            case 13:
                ((Boolean) obj2).booleanValue();
                return zhm.r0.g();
            case 14:
                Throwable error6 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (map == null) {
                    return error6;
                }
                return null;
            case 15:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 16:
                Throwable error7 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list3 == null) {
                    return error7;
                }
                return null;
            case 17:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 18:
                Throwable error8 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list4 == null) {
                    return error8;
                }
                return null;
            case 19:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 20:
                Throwable error9 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list5 == null) {
                    return error9;
                }
                return null;
            case 21:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 22:
                Throwable error10 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list6 == null) {
                    return error10;
                }
                return null;
            case 23:
                ((Boolean) obj2).booleanValue();
                return zhm.r0.g();
            case 24:
                Throwable error11 = (Throwable) obj2;
                Map map2 = (Map) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (map2 == null) {
                    return error11;
                }
                return null;
            case 25:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return zhm.u.c(new xc("ID_TAB_ERROR", (List) defaultError.invoke(new iii.d(12, null, false, true, null)), 0, null, null, 0, 0, 0, 1016));
            case 26:
                Throwable th12 = (Throwable) obj2;
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                if (th12 == null) {
                    return zhm.f0.f322471a;
                }
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th12, h0Var);
                return (List) defaultErrorItems.invoke(new iii.d(8, null, true, true, "SHOPS_COMBINED_STATE_ERROR"));
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 28:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(ynj.h.f315483a);
            default:
                Throwable th13 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th13;
                }
                return null;
        }
    }
}
