package mv5;

import android.view.View;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.views.InputTravelAirportSearchItemView;
import com.revolut.core.ui_kit.views.NumpadView;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import i3g.k;
import ip0.ti0;
import ip0.ui0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.ya;
import myg.l;
import op0.q;
import yhm.r;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209151a;

    public /* synthetic */ h(int i) {
        this.f209151a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        ArrayList arrayListE0;
        boolean z = false;
        switch (this.f209151a) {
            case 0:
                return new SplitAccountsItemGroup.ErrorGroup(new SplitAccountsItemGroup.ErrorItem());
            case 1:
                Throwable error = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (pair == null) {
                    return error;
                }
                return null;
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof mx0.i) && ((mx0.i) data).f209745b == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof com.revolut.core.ui_kit.views.c) && ((com.revolut.core.ui_kit.views.c) data).f59027b == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof mx0.i) && ((mx0.i) data).f209745b == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof com.revolut.core.ui_kit.views.c) && ((com.revolut.core.ui_kit.views.c) data).f59027b == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof com.revolut.core.ui_kit.views.c) && ((com.revolut.core.ui_kit.views.c) data).f59027b == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                if ((data instanceof mx0.i) && ((mx0.i) data).f209745b == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                String origin = (String) obj2;
                String destination = (String) data;
                int i = InputTravelAirportSearchItemView.f;
                Intrinsics.checkNotNullParameter(origin, "origin");
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (d0.W(origin) && d0.W(destination)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                int iIntValue = ((Integer) obj2).intValue();
                NumpadView.Companion companion = NumpadView.INSTANCE;
                Intrinsics.checkNotNullParameter((View) data, "<unused var>");
                if (iIntValue != 9 && iIntValue != 11) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof ya);
            case 11:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.FALSE;
            case 12:
                Throwable error2 = (Throwable) obj2;
                od0.i iVar = (od0.i) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (iVar == null) {
                    return error2;
                }
                return null;
            case 13:
                Throwable error3 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 14:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 15:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 16:
                Data activeData = (Data) obj2;
                Data pastData = (Data) data;
                Intrinsics.checkNotNullParameter(activeData, "activeData");
                Intrinsics.checkNotNullParameter(pastData, "pastData");
                Data dataT = t1.t(activeData, pastData);
                try {
                    Object content = dataT.getContent();
                    if (content != null) {
                        Pair pair2 = (Pair) content;
                        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) pair2.f186385a;
                        arrayListE0 = zhm.d0.E0(((ActiveOrPastInvitesInfo) pair2.f186386b).f81705a, activeOrPastInvitesInfo.f81705a);
                    } else {
                        arrayListE0 = null;
                    }
                    return new Data(arrayListE0, dataT.getError(), dataT.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, dataT.getLoading());
                }
            case 17:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                Intrinsics.checkNotNullParameter("PERFORMANCE_WIDGET_LIST_ID", "listId");
                return uyg.a.a("PERFORMANCE_WIDGET_LIST_ID", q.SMALL);
            case 18:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                Intrinsics.checkNotNullParameter("PNL_WIDGET_ID", "listId");
                return uyg.a.a("PNL_WIDGET_ID", q.SMALL);
            case 19:
                l.a aVar = l.Companion;
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                Intrinsics.checkNotNullParameter("TOTAL_VALUE_ID", "listId");
                return uyg.a.a("TOTAL_VALUE_ID", q.MEDIUM);
            case 20:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return u.c(new ui0("ERROR_ITEM_ID", (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), (ti0) null, 12));
            case 21:
                Throwable error6 = (Throwable) obj2;
                List list4 = (List) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list4 == null) {
                    return error6;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                e0i.a aVar2 = (e0i.a) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar2 == null) {
                    return error7;
                }
                return null;
            case 23:
                Throwable error8 = (Throwable) obj2;
                r rVar = (r) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (rVar == null) {
                    return error8;
                }
                return null;
            case 24:
                Throwable error9 = (Throwable) obj2;
                List list5 = (List) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list5 == null) {
                    return error9;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Throwable error10 = (Throwable) obj2;
                Pair pair3 = (Pair) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (pair3 == null) {
                    return error10;
                }
                return null;
            case 27:
                Throwable error11 = (Throwable) obj2;
                zw7.d0 d0Var = (zw7.d0) data;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (d0Var == null) {
                    return error11;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Throwable th11 = (Throwable) obj2;
                if (((od0.i) data) == null) {
                    return th11;
                }
                return null;
        }
    }

    public /* synthetic */ h(k kVar) {
        this.f209151a = 20;
    }
}
