package androidx.compose.ui.platform;

import androidx.camera.core.Logger;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7316a;

    public /* synthetic */ b(int i) {
        this.f7316a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7316a) {
            case 0:
                AndroidComposeView.Companion.addNotificationForSysPropsChange$lambda$0();
                break;
            case 1:
                int i = AlarmManagerSchedulerBroadcastReceiver.f37251a;
                break;
            case 2:
                DefaultSurfaceProcessor.lambda$executeSafely$11();
                break;
            case 3:
                DualSurfaceProcessor.lambda$executeSafely$7();
                break;
            case 4:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", "onInitialized", null, null, 16);
                Unit unit = Unit.f186387a;
                break;
            case 5:
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", "onConsentsGiven", null, null, 16);
                Unit unit2 = Unit.f186387a;
                break;
            case 6:
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", "onCredentialEntered", null, null, 16);
                Unit unit3 = Unit.f186387a;
                break;
            case 7:
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", "onReset", null, null, 16);
                Unit unit4 = Unit.f186387a;
                break;
            case 8:
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", "onRedirect", null, null, 16);
                Unit unit5 = Unit.f186387a;
                break;
            case 9:
                Logger.d("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                break;
            case 10:
                Unit unit6 = Unit.f186387a;
                break;
            case 11:
                break;
            default:
                Unit unit7 = Unit.f186387a;
                break;
        }
    }
}
