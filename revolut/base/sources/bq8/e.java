package bq8;

import ald.m;
import android.os.Parcelable;
import aw0.g;
import aw0.n6;
import aw0.o9;
import be7.s;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.junior_tasks.api.R$plurals;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import vkm.q;
import vkm.z1;
import wsg.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ChallengesOverviewContract$InputData f17793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hp8.b f17794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f17795n;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f17796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v60.e f17797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f17798r;

    public e(ChallengesOverviewContract$InputData inputData, hp8.b juniorTasksInteractor, n walletInteractor, f mapper, h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f17793l = inputData;
        this.f17794m = juniorTasksInteractor;
        this.f17795n = walletInteractor;
        this.o = mapper;
        this.f17796p = serverErrorParser;
        this.f17797q = serverErrorsProvider;
        this.f17798r = q.b(0, 7, null);
    }

    @Override // bq8.a
    public final ActionsBottomSheetController Z2(List tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.o.getClass();
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        k9 value = k9.Junior;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        int i = R$plurals.junior_challenges_dialog_confirmation_pay_challenges_title;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : tasks) {
            xi0.b bVar = ((dp8.b) obj2).f.f115083b;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            List list = (List) ((Map.Entry) it8.next()).getValue();
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i2 = 0;
            for (Object obj3 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((dp8.b) obj3).f : pyd.c.O(dVarO, ((dp8.b) obj3).f);
                i2 = i3;
            }
            int size = list.size();
            arrayList2.add(new TextLocalisedQuantityClause(i, Integer.valueOf(size), v.k(Integer.valueOf(size), f.a(dVarO)), (Style) null, 24));
        }
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList2), null, null, null, false, 30), new g(new n6(new TextLocalisedClause(R$string.junior_challenges_dialog_confirmation_pay_challenges_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.junior_challenges_dialog_confirmation_pay_challenges_action_pay, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), new AnalyticsProduct.Retail(value), null, null, 24));
        bnj.n block = new bnj.n(11, this, tasks);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    @Override // bq8.a
    public final z1 b3() {
        return this.f17798r;
    }

    @Override // bq8.a
    public final void c3(List tasks, boolean z) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        V2(new m(tasks, this, z, (Continuation) null, 6), new yi5.b(29));
    }

    @Override // bq8.a
    public final boolean d3(Throwable throwable) {
        ServerErrorParams serverErrorParams;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f17796p.a(throwable);
        Continuation continuation = null;
        if (((serverErrorA == null || (serverErrorParams = serverErrorA.f51364c) == null) ? null : serverErrorParams.f51370a) == null || serverErrorA.f51362a != 1006) {
            if (serverErrorA == null || serverErrorA.f51362a != 20008) {
                return false;
            }
            Object objB = ((ao0.a) this.f17797q).b(20008);
            if (objB == null) {
                objB = new v60.b();
            }
            T2(new s(this, objB, continuation, 19), new yi5.b(27));
            return true;
        }
        ServerErrorParams serverErrorParams2 = serverErrorA.f51364c;
        dj0.d amountLacking = serverErrorParams2 != null ? serverErrorParams2.f51370a : null;
        if (amountLacking == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.o.getClass();
        Intrinsics.checkNotNullParameter(amountLacking, "amountLacking");
        yji.n.l2(this, L2(new y0(null, new z(new TextLocalisedClause(R$string.junior_tasks_list_pay_insufficient_balance_title, null, null, 14), new TextLocalisedClause(R$string.junior_tasks_list_pay_insufficient_balance_message, u.c(f.a(amountLacking)), null, 12), new TextLocalisedClause(R$string.junior_tasks_list_pay_insufficient_balance_add_money_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, new c(this, amountLacking, null), 3);
        return true;
    }
}
