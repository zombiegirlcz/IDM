package pz4;

import androidx.arch.core.util.Function;
import androidx.camera.lifecycle.LifecycleCameraProviderImpl;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.work.ListenableWorker;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.selfserve.sow.impl.ui.amount.SowAmountFragment;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.utils.job.workers.FetchAndSaveTransactionWorker;
import com.revolut.utils.job.workers.ProfileLocationWorker;
import com.revolut.utils.job.workers.TransactionLocationWorker;
import efm.h0;
import java.util.List;
import kfm.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import pth.l;
import pth.m;
import pyc.p;
import q09.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements o, kfm.g, Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f240888b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f240887a = i;
        this.f240888b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f240887a) {
            case 1:
                ((pz7.f) this.f240888b).invoke(obj2);
                break;
            case 2:
            case 3:
            default:
                ((pza.d) this.f240888b).invoke(obj2);
                break;
            case 4:
                ((pz7.f) this.f240888b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f240887a;
        Function1 function1 = this.f240888b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((m) function1).invoke(p0);
            case 1:
            case 4:
            case 7:
            default:
                KProperty[] kPropertyArr = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((q09.b) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((pz7.f) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((l) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((l) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((m) function1).invoke(p0);
            case 8:
                int i2 = SowAmountFragment.f85960h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((p) function1).invoke(p0);
            case 9:
                int i3 = SowAmountFragment.f85960h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((p) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pzc.e) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pzc.e) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((pzc.e) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pzc.e) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pzc.e) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((pzc.e) function1).invoke(p0);
            case 16:
                KProperty[] kPropertyArr2 = ConsolidatedStatementScreen.V;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((p) function1).invoke(p0);
            case 17:
                FetchAndSaveTransactionWorker.Companion aVar = FetchAndSaveTransactionWorker.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ListenableWorker.Result) ((p) function1).invoke(p0);
            case 18:
                ProfileLocationWorker.Companion aVar2 = ProfileLocationWorker.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((l) function1).invoke(p0);
            case 19:
                TransactionLocationWorker.Companion aVar3 = TransactionLocationWorker.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((m) function1).invoke(p0);
            case 20:
                return LifecycleCameraProviderImpl.initAsync$lambda$0$4((pza.d) function1, p0);
            case 21:
                return ProcessCameraProvider.Companion.getInstance$lambda$1((p) function1, p0);
            case 22:
                KProperty[] kPropertyArr3 = RevolutCardSettingsController.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((p) function1).invoke(p0);
            case 23:
                return (Boolean) ((p) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((p) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yt8.i) ((p) function1).invoke(p0);
            case 26:
                KProperty[] kPropertyArr4 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q09.p) ((q09.a) function1).invoke(p0);
            case 27:
                KProperty[] kPropertyArr5 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((q09.a) function1).invoke(p0);
                return q09.o.f241206a;
            case 28:
                KProperty[] kPropertyArr6 = LessonScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q09.m) ((q09.a) function1).invoke(p0);
        }
    }
}
