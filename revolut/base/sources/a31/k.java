package a31;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.palette.graphics.Palette;
import androidx.room.RoomRawQuery;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoAccountsState;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import igk.b;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wfk.a;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f976b;

    public /* synthetic */ k(int i, Function1 function1) {
        this.f975a = i;
        this.f976b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f975a;
        Function1 function1 = this.f976b;
        switch (i) {
            case 0:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                List list = subscriptions;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add((qua.p) function1.invoke((qua.p) it8.next()));
                }
                return arrayList;
            case 1:
                Handler handler = a3l.e.f1177a;
                a3l.d dVar = new a3l.d(function1, (Drawable) obj2, 0);
                if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                    dVar.run();
                } else {
                    a3l.e.f1177a.post(dVar);
                }
                return Unit.f186387a;
            case 2:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 3:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it9 = tradingAccounts.f105278a.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        TradingAccount tradingAccount = (TradingAccount) next;
                        if (!((Boolean) function1.invoke(tradingAccount)).booleanValue() || !com.revolut.shared.feature.wealth.models.trading_accounts.d.f(tradingAccount)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return Optional.ofNullable((TradingAccount) next);
            case 4:
                return Float.valueOf(Math.abs(ai7.f.b((qi7.g) function1.invoke(obj2))));
            case 5:
                CryptoAccountsState update = (CryptoAccountsState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ake.a domainState = (ake.a) function1.invoke(update.f89817a);
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return new CryptoAccountsState(domainState);
            case 6:
                return RoomRawQuery.bindingFunction$lambda$1(function1, (SQLiteStatement) obj2);
            case 7:
                bp9.g it10 = (bp9.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                function1.invoke(it10);
                return Unit.f186387a;
            case 8:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                return function1.invoke(accounts);
            case 9:
                c69.i update2 = (c69.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                DirectDebitData directDebitData = (DirectDebitData) function1.invoke(update2.f21729b);
                c69.h mode = update2.f21728a;
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(directDebitData, "directDebitData");
                return new c69.i(mode, directDebitData);
            case 10:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.c) {
                    function1.invoke(((dii.c) result).f115066a.f275445a);
                } else if (!(result instanceof dii.b) && !(result instanceof dii.e) && !(result instanceof dii.f) && !(result instanceof dii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 11:
                return SuspendAnimationKt.callWithFrameNanos$lambda$0(function1, ((Long) obj2).longValue());
            case 12:
                igk.b output = (igk.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, b.a.f161235a)) {
                    throw new NoWhenBranchMatchedException();
                }
                function1.invoke(a.AbstractC1639a.b.f297155a);
                return Unit.f186387a;
            case 13:
                Palette.Swatch it11 = (Palette.Swatch) obj2;
                int i2 = StickerView.f56067s;
                Intrinsics.checkNotNullParameter(it11, "it");
                function1.invoke(Integer.valueOf(it11.getRgb()));
                return Unit.f186387a;
            case 14:
                com.revolut.kompot.common.flow.permissions.a outputData = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                function1.invoke(outputData);
                return Unit.f186387a;
            case 15:
                return SnapshotKt.takeNewSnapshot$lambda$0(function1, (SnapshotIdSet) obj2);
            case 16:
                hk9.j update3 = (hk9.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return (hk9.j) function1.invoke(hk9.j.a(update3, null, null, null, false, 15));
            case 17:
                return OffsetKt.offset$lambda$0(function1, (InspectorInfo) obj2);
            case 18:
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a update4 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.a(update4, null, (FreelancerSalesFilters$CompoundFreelancerSalesFilter) function1.invoke(update4.f74191b), null, false, false, 29);
            case 19:
                sg9.a dropdownChoice = (sg9.a) obj2;
                Intrinsics.checkNotNullParameter(dropdownChoice, "dropdownChoice");
                function1.invoke(new jg9.d(dropdownChoice));
                return Unit.f186387a;
            case 20:
                YearMonth yearMonth = (YearMonth) obj2;
                Intrinsics.checkNotNullParameter(yearMonth, "yearMonth");
                function1.invoke(new jg9.b(yearMonth));
                return Unit.f186387a;
            case 21:
                gii.a outputData2 = (gii.a) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                function1.invoke(outputData2.f144218a);
                return Unit.f186387a;
            case 22:
                og9.f outputData3 = (og9.f) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                sg9.b bVar = outputData3.f225060a;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                function1.invoke(new sg9.a(bVar.f262633a, jg9.u.e(bVar.f262634b)));
                return Unit.f186387a;
            case 23:
                mg9.e outputData4 = (mg9.e) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                sg9.b bVar2 = outputData4.f205197a;
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                function1.invoke(new sg9.a(bVar2.f262633a, jg9.u.e(bVar2.f262634b)));
                return Unit.f186387a;
            case 24:
                kg9.b outputData5 = (kg9.b) obj2;
                Intrinsics.checkNotNullParameter(outputData5, "outputData");
                function1.invoke(Integer.valueOf(outputData5.f183936a));
                return Unit.f186387a;
            case 25:
                yg9.l it12 = (yg9.l) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                function1.invoke(new jg9.p(it12.f313586a));
                return Unit.f186387a;
            case 26:
                AddressFlowContract$OutputData result2 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                function1.invoke(new jg9.n(result2.f60940a));
                return Unit.f186387a;
            case 27:
                yg9.l outputData6 = (yg9.l) obj2;
                Intrinsics.checkNotNullParameter(outputData6, "outputData");
                function1.invoke(new jg9.p(outputData6.f313586a));
                return Unit.f186387a;
            case 28:
                mg9.e outputData7 = (mg9.e) obj2;
                Intrinsics.checkNotNullParameter(outputData7, "outputData");
                function1.invoke(new jg9.o(outputData7.f205197a));
                return Unit.f186387a;
            default:
                yg9.l outputData8 = (yg9.l) obj2;
                Intrinsics.checkNotNullParameter(outputData8, "outputData");
                function1.invoke(new jg9.p(outputData8.f313586a));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ k(ai7.f fVar, Function1 function1) {
        this.f975a = 4;
        this.f976b = function1;
    }
}
