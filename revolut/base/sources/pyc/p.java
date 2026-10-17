package pyc;

import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.work.ListenableWorker;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.selfserve.sow.impl.ui.amount.SowAmountFragment;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.utils.job.workers.FetchAndSaveTransactionWorker;
import com.revolut.utils.job.workers.ProfileLocationWorker;
import com.revolut.utils.job.workers.TransactionLocationWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240794a;

    public /* synthetic */ p(int i) {
        this.f240794a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        ParcelableDestination parcelableDestination;
        switch (this.f240794a) {
            case 0:
                List transactionsWithState = (List) obj2;
                Intrinsics.checkNotNullParameter(transactionsWithState, "transactionsWithState");
                List list = transactionsWithState;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add((hyc.c) ((Pair) it8.next()).f186386b);
                }
                return (arrayList.contains(null) || arrayList.contains(hyc.c.UPDATE_REQUESTED)) ? zyc.e.UNKNOWN : arrayList.contains(hyc.c.UPDATE_REQUIRED) ? zyc.e.ACTION_REQUIRED : arrayList.contains(hyc.c.UNDER_REVIEW) ? zyc.e.IN_REVIEW : arrayList.contains(hyc.c.UPLOADED) ? zyc.e.SUBMITTED : zyc.e.VERIFIED;
            case 1:
                hyc.f it9 = (hyc.f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f156783a;
            case 2:
                od0.i text = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                String str = (String) text.g();
                return str == null ? "" : str;
            case 3:
                return h30.l.q("it", (od0.i) obj2);
            case 4:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!it10.isEmpty());
            case 5:
                List files = (List) obj2;
                Intrinsics.checkNotNullParameter(files, "files");
                return Boolean.valueOf(!files.isEmpty());
            case 6:
                String description = (String) obj2;
                Intrinsics.checkNotNullParameter(description, "description");
                if (description.length() > 0 && description.length() <= 250) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                String note = (String) obj2;
                Intrinsics.checkNotNullParameter(note, "note");
                return Boolean.valueOf(note.length() <= 250);
            case 8:
                String text2 = (String) obj2;
                Intrinsics.checkNotNullParameter(text2, "text");
                int length = text2.length();
                if (3 <= length && length < 251) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ((Boolean) pair.f186385a).booleanValue() ? j.STORIES : ((Boolean) pair.f186386b).booleanValue() ? j.HOME : j.STATUS;
            case 10:
                Boolean it11 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.booleanValue() ? j.HOME : j.STATUS;
            case 11:
                NaviCommand it12 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ngm.n.g((FragmentNavigateCommand) it12);
            case 12:
                yoj.a learnFeature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(learnFeature, "learnFeature");
                q06.h hVar = yoj.b.k(learnFeature) ? new q06.h(new LearnKompotFeatureConfig.Home.Destination(null), new q06.b(ibb.c.f160140a, null)) : null;
                return (hVar == null || (parcelableDestination = hVar.f241169a) == null) ? DummyCommand.f98635a : u0.e(parcelableDestination);
            case 13:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    MoneyRequest moneyRequest = (MoneyRequest) obj3;
                    if (Intrinsics.f(moneyRequest.f60316c, MoneyRequestChannel.Wero.f60336b) && f6k.a.c(moneyRequest)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 14:
                CharSequence it13 = (CharSequence) obj2;
                int i = SowAmountFragment.f85960h0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.toString();
            case 15:
                int i2 = SowAmountFragment.f85960h0;
                Intrinsics.checkNotNullParameter((AmountEditDelegate.Model) obj2, "it");
                return Unit.f186387a;
            case 16:
                g6 it14 = (g6) obj2;
                KProperty[] kPropertyArr = ConsolidatedStatementScreen.V;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f54199a;
            case 17:
                pzd.p update = (pzd.p) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return pzd.p.a(update, null, null, null, null, null, new Data(null, null, true, 3, null), 383);
            case 18:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                throw e;
            case 19:
                FetchAndSaveTransactionWorker.Companion aVar = FetchAndSaveTransactionWorker.INSTANCE;
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return ListenableWorker.Result.success();
            case 20:
                ProfileLocationWorker.Companion aVar2 = ProfileLocationWorker.INSTANCE;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return ListenableWorker.Result.failure();
            case 21:
                TransactionLocationWorker.Companion aVar3 = TransactionLocationWorker.INSTANCE;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return ListenableWorker.Result.failure();
            case 22:
                return ProcessCameraProvider.Companion.getInstance$lambda$0((Void) obj2);
            case 23:
                LargeActionButtonDelegate.Model it15 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = RevolutCardSettingsController.X;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f52613a;
            case 24:
                return Boolean.valueOf(((h93.y) obj2).f150170a == h93.x.PENDING_ACTIVATION);
            case 25:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Integer.valueOf(it16.size());
            case 26:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it17);
            case 27:
                yt8.c it18 = (yt8.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f316662a;
            case 28:
                yt8.c it19 = (yt8.c) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f316662a;
            default:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
        }
    }

    public /* synthetic */ p(pyj.a aVar) {
        this.f240794a = 12;
    }
}
