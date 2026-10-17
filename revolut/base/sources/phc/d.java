package phc;

import a3e.s;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.core.ui_kit.delegates.h9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.BackendFlowExitDialog;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination;
import com.revolut.utils.job.workers.IncrementBeneficiaryTransactionsWorker;
import efm.d0;
import ehc.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import pxc.k;
import pxc.m;
import pyc.g0;
import qc0.f1;
import qc0.j0;
import qc0.q;
import qc0.u;
import qc0.y;
import qce.o0;
import qjg.n;
import te0.w;
import tof.a3;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f236256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f236257c;

    public /* synthetic */ d(FormScreen formScreen, String str) {
        this.f236255a = 11;
        this.f236257c = str;
        this.f236256b = formScreen;
    }

    @Override // kfm.a
    public final void run() {
        int i = 0;
        int i2 = 2;
        int i3 = 1;
        switch (this.f236255a) {
            case 0:
                ((j) this.f236256b).f236279m.j((String) this.f236257c, Boolean.TRUE);
                return;
            case 1:
                j jVar = (j) this.f236256b;
                r rVar = (r) this.f236257c;
                jVar.i.j(new ohc.a(rVar.getId(), true), ghc.e.f(rVar));
                return;
            case 2:
                ((pxc.i) this.f236256b).f240607a.c((FeatureCommand) this.f236257c);
                return;
            case 3:
                ((k) this.f236256b).f240608a.c((FeatureCommand) this.f236257c);
                return;
            case 4:
                ((m) this.f236256b).f240610a.c(u0.f(new EntityConfigDestination(new EntityConfigDestination.InputData.Ticket(((jf0.c) this.f236257c).e(2)))));
                return;
            case 5:
                g0 g0Var = (g0) this.f236256b;
                IncomeSource incomeSource = (IncomeSource) this.f236257c;
                hn.h hVar = g0Var.f;
                int i5 = R$string.sow_add_income_sources_remove_all_attachments_confirmation_title;
                t70.g localization = g0Var.d;
                String strG = uc0.b.g(i5, localization);
                int i6 = com.revolut.retail.common.ui.R$string.common_action_confirm;
                Intrinsics.checkNotNullParameter(localization, "localization");
                String string = localization.getString(i6);
                int i21 = com.revolut.retail.common.ui.R$string.common_action_cancel;
                Intrinsics.checkNotNullParameter(localization, "localization");
                npi.d configuration = new npi.d("CHANGE_INCOME_SOURCE_ID", null, strG, string, localization.getString(i21), incomeSource, 66);
                hVar.getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                hVar.f154012b.onNext(configuration);
                return;
            case 6:
                pyj.h hVar2 = (pyj.h) this.f236256b;
                NaviCommand naviCommand = (NaviCommand) this.f236257c;
                sri.m mVar = hVar2.f240850a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return;
            case 7:
                ((pz4.c) this.f236256b).f240891a.c((NaviCommand) this.f236257c);
                return;
            case 8:
                ((k39.b) this.f236256b).b((NaviCommand) this.f236257c);
                return;
            case 9:
                q2k.e eVar = (q2k.e) this.f236256b;
                String beneficiaryId = (String) this.f236257c;
                nzl.a aVar = (nzl.a) eVar.e;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
                OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) IncrementBeneficiaryTransactionsWorker.class).setConstraints(aVar.b());
                Pair[] pairArr = {new Pair("BENEFICIARY_ID_KEY", beneficiaryId)};
                Data.Builder builder = new Data.Builder();
                Pair pair = pairArr[0];
                builder.put((String) pair.f186385a, pair.f186386b);
                aVar.f221092a.enqueueUniqueWork("Increment Beneficiary Transactions", ExistingWorkPolicy.APPEND_OR_REPLACE, constraints.setInputData(builder.build()).build());
                return;
            case 10:
                com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar2 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) this.f236256b;
                aVar2.H2(aVar2.v, new s((lk0.g) this.f236257c, 12));
                return;
            case 11:
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Can't find item with id=", (String) this.f236257c, " on current FormScreen ", ((FormScreen) this.f236256b).f63467a));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            case 12:
                j0 j0Var = (j0) this.f236256b;
                File file = (File) this.f236257c;
                ifm.b bVar = j0Var.d;
                d0 d0VarB = j0Var.f244441c.b(file);
                eli.j jVar2 = j0Var.K;
                ca0.a aVar3 = j0Var.L;
                jVar2.getClass();
                d0 d0VarG = d0VarB.g(new eli.a(jVar2, aVar3));
                Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
                pfm.a aVar4 = new pfm.a(new z(new ufm.i(ue0.e.t(d0VarG, h0.f322473a), new u(new qb5.a(9), 10), 1), i3, new q2j.k(8), fValueOf), new u(new q(j0Var, file, i3), 11), 4);
                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                pfm.a aVar5 = new pfm.a(aVar4, new lhi.b(22, new pzc.g(new BreadcrumbException(), 18)), i2);
                Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar5.w(new m3l.d(20, qc0.z.f244512a), y.f244501a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(bVar, hVarW);
                return;
            case 13:
                ((j0) this.f236256b).W.onNext((rp0.y) this.f236257c);
                return;
            case 14:
                ((j0) this.f236256b).X.onNext((BackendFlowExitDialog) this.f236257c);
                return;
            case 15:
                ((f1) this.f236256b).j().r0().set((Stack) this.f236257c);
                return;
            case 16:
                ((o0) this.f236256b).S((fva.e) this.f236257c);
                return;
            case 17:
                qua.q qVar = (qua.q) this.f236256b;
                o0 o0Var = (o0) this.f236257c;
                int i22 = qce.u.f244771b[qVar.ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, o0Var.f244746m);
                    return;
                } else {
                    cqi.h hVar3 = o0Var.k;
                    o0Var.f244753w.getClass();
                    ((cqi.j) hVar3).R(new cqi.d(new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_action_cancel_direct_debit_reason_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_action_cancel_direct_debit_reason_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), null, cqi.c.HORIZONTAL, null, 1412));
                    return;
                }
            case 18:
                qe0.f fVar = (qe0.f) this.f236256b;
                qe0.d dVar = (qe0.d) this.f236257c;
                synchronized (fVar) {
                    try {
                        ArrayList arrayList = fVar.d;
                        Iterator it8 = arrayList.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                i = -1;
                            } else if (!((qe0.c) it8.next()).f245017a.equals(dVar)) {
                                i++;
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return;
            case 19:
                n nVar = (n) this.f236256b;
                Object obj2 = this.f236257c;
                ((opi.b) nVar.f246878m).Z(((fjg.a) nVar.f246880p).a((TrustedMerchant) obj2, "TRUSTED_MERCHANTS_DELEGATES_KEY"));
                return;
            case 20:
                qpf.d dVar2 = (qpf.d) this.f236256b;
                NaviCommand naviCommand2 = (NaviCommand) this.f236257c;
                sri.m mVar2 = dVar2.f248383a;
                Intrinsics.h(naviCommand2);
                mVar2.c(naviCommand2);
                return;
            case 21:
                ((qxj.d) this.f236256b).f250101a.a((KompotDestination) this.f236257c);
                return;
            case 22:
                qz5.b bVar2 = (qz5.b) this.f236256b;
                String str = (String) this.f236257c;
                Intrinsics.h(str);
                synchronized (bVar2) {
                    bVar2.f250367b.f("KEY_ACCESS_TOKEN", str);
                    Unit unit = Unit.f186387a;
                }
                return;
            case 23:
                com.revolut.feature.remote_stories.impl.ui.b bVar3 = (com.revolut.feature.remote_stories.impl.ui.b) this.f236256b;
                RemoteStoriesContract$Config.Key key = (RemoteStoriesContract$Config.Key) this.f236257c;
                kza.a aVar6 = bVar3.f;
                RemoteStoriesKey key2 = key.f81967a;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(key2, "key");
                aVar6.f191080b.a(mo3.a.q(key2));
                return;
            case 24:
                com.revolut.feature.remote_stories.impl.ui.b bVar4 = (com.revolut.feature.remote_stories.impl.ui.b) this.f236256b;
                String storyId = (String) this.f236257c;
                kza.a aVar7 = bVar4.f;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(storyId, "storyId");
                z3e.c cVar = aVar7.f191080b;
                Intrinsics.checkNotNullParameter(storyId, "storyId");
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar.f319258a, j6.a.q("STORY_ID_SHOWN_", storyId), Boolean.TRUE);
                return;
            case 25:
                ((r21.h) this.f236256b).f251038b.d((f5j.a) this.f236257c);
                return;
            case 26:
                ((rc9.c) this.f236256b).f253237l.c((CompositeCommand) this.f236257c);
                return;
            case 27:
                MultiTargetFanChartDelegate.a aVar8 = (MultiTargetFanChartDelegate.a) this.f236256b;
                rdj.j jVar3 = (rdj.j) this.f236257c;
                h9 h9Var = aVar8 instanceof h9 ? (h9) aVar8 : null;
                fValueOf = h9Var != null ? Float.valueOf(h9Var.f54237a) : null;
                ihm.b bVar5 = ((rdj.h) jVar3.f253475b).f253471c;
                od0.i.Companion.getClass();
                bVar5.onNext(od0.h.a(fValueOf));
                return;
            case 28:
                ((rm.f) this.f236256b).a().onNext(this.f236257c);
                return;
            default:
                ((ru5.z) this.f236256b).C2((a3) this.f236257c);
                return;
        }
    }

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f236255a = i;
        this.f236256b = obj2;
        this.f236257c = obj3;
    }
}
