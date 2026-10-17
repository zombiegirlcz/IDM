package g1k;

import android.os.Parcelable;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryEntity;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.data.network.models.budgeting.DeleteCustomCategoryDto;
import com.revolut.data.network.models.budgeting.ResetTransactionCategoryDto;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import ft3.q0;
import ip0.gu;
import ip0.kg;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.u20;
import ip0.w20;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import z0h.t1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139701a;

    public /* synthetic */ k(int i) {
        this.f139701a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f139701a) {
            case 0:
                rzj.k it8 = (rzj.k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f258697a;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return w.a();
            case 2:
                return GlobalSnapshot._init_$lambda$0(obj2);
            case 3:
                return SnapshotKt.emptyLambda$lambda$0((SnapshotIdSet) obj2);
            case 4:
                x15.e creditApplicationAccount = (x15.e) obj2;
                Intrinsics.checkNotNullParameter(creditApplicationAccount, "creditApplicationAccount");
                return creditApplicationAccount.f302254c;
            case 5:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new g27.p((List) getDefaultLoadingItems.invoke());
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(1);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 11:
                t1 it9 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new g2d.h(it9);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 13:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 14:
                Byte b4 = (Byte) obj2;
                b4.byteValue();
                return a0.d.v(new Object[]{b4}, 1, "%02x", "format(...)");
            case 15:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new ListSubheaderDelegate.Model("YOUR_GIFT_CARDS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("YOUR_GIFT_CARDS_LOADING_ITEM_LIST_ID", it10.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                return zhm.u.a(eVarB);
            case 17:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 1);
                arrayListP.add(nb0.b(pb0.Companion, "TRANSACTIONS_LOADING_ITEM_ID_0", false, 0, false, 30));
                return arrayListP;
            case 18:
                g2g.l updateState = (g2g.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return g2g.l.a(updateState, null, new TravelExperienceFiltersSelection(31, null), 1);
            case 19:
                g2g.l updateState2 = (g2g.l) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return g2g.l.a(updateState2, null, TravelExperienceFiltersSelection.a(updateState2.f140057b, null, null, null, !r3.d, null, 23), 1);
            case 20:
                g2g.l updateState3 = (g2g.l) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return g2g.l.a(updateState3, null, TravelExperienceFiltersSelection.a(updateState3.f140057b, null, null, null, !r3.d, null, 23), 1);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s0 s0Var = new s0(2);
                s0Var.a(new gu("POPULAR_TITLE_ID", 0, 0, 30));
                ArrayList arrayList2 = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList2.add(new s7(String.valueOf(i), 0, 0, 0, 0, false, null, 126));
                }
                s0Var.b(arrayList2.toArray(new s7[0]));
                ArrayList arrayList3 = s0Var.f186433a;
                List listK = zhm.v.k(arrayList3.toArray(new Object[arrayList3.size()]));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                s0 s0Var2 = new s0(2);
                s0Var2.a(new gu("CATEGORIES_TITLE_ID", 0, 0, 30));
                ArrayList arrayList4 = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList4.add(new pb0(String.valueOf(i2)));
                }
                s0Var2.b(arrayList4.toArray(new pb0[0]));
                ArrayList arrayList5 = s0Var2.f186433a;
                List listK2 = zhm.v.k(arrayList5.toArray(new Object[arrayList5.size()]));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                List listO = i2b.a.o(listK, listK2);
                s0 s0Var3 = new s0(2);
                s0Var3.a(new gu("DURATION_TITLE_ID", 0, 0, 30));
                ArrayList arrayList6 = new ArrayList(3);
                for (int i3 = 0; i3 < 3; i3++) {
                    arrayList6.add(new pb0(String.valueOf(i3)));
                }
                s0Var3.b(arrayList6.toArray(new pb0[0]));
                ArrayList arrayList7 = s0Var3.f186433a;
                List listK3 = zhm.v.k(arrayList7.toArray(new Object[arrayList7.size()]));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                return i2b.a.o(listO, listK3);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList8 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it11 = intRangeO.iterator();
                while (it11.f289625c) {
                    kg kgVar = new kg(a0.d.n("travel_status_overview_loading_", it11.nextInt()), 12);
                    yp0.b.l(kgVar, 0, 0, 0, 0, null, false, 63);
                    arrayList8.add(kgVar);
                }
                return new g2l.l(arrayList8, g2l.h.f140139a);
            case 23:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return d0.E0(g31.h.a(), d0.I0(it12));
            case 24:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return d0.E0(g31.h.a(), d0.I0(it13));
            case 25:
                TransactionCustomCategoryEntity it14 = (TransactionCustomCategoryEntity) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return CustomTransactionCategoryMapperKt.toDomain(it14);
            case 26:
                DeleteCustomCategoryDto it15 = (DeleteCustomCategoryDto) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                List<ResetTransactionCategoryDto> originalTransactionsCategories = it15.getOriginalTransactionsCategories();
                ArrayList arrayList9 = new ArrayList(zhm.w.t(originalTransactionsCategories, 10));
                for (ResetTransactionCategoryDto resetTransactionCategoryDto : originalTransactionsCategories) {
                    arrayList9.add(new Pair(resetTransactionCategoryDto.getTransactionId(), resetTransactionCategoryDto.getCategory()));
                }
                return arrayList9;
            case 27:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 1, 2, 1);
                ArrayList arrayList10 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it16 = intRangeU.iterator();
                while (it16.f289625c) {
                    u20 u20Var = new u20(a0.d.n("application-entry-point-loading-", it16.nextInt()), w20.ICON_60DP);
                    yp0.b.l(u20Var, 0, 0, 0, 0, null, false, 63);
                    arrayList10.add(u20Var);
                }
                return arrayList10;
            case 28:
                q0 it17 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.getF137852c().name();
            default:
                do3.n it18 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return do3.q.y(it18);
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f139701a = i;
    }
}
