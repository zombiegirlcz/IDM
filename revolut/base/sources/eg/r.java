package eg;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.PreferencesFactory;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.ProcessUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends kotlin.jvm.internal.u implements Function1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f125485h;
    public static final r i;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        f125485h = new r(i2, 0);
        i = new r(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String processName;
        String processName2;
        switch (this.f) {
            case 0:
                CorruptionException ex4 = (CorruptionException) obj2;
                Intrinsics.checkNotNullParameter(ex4, "ex");
                StringBuilder sb6 = new StringBuilder("CorruptionException in settings DataStore in ");
                if (Build.VERSION.SDK_INT > 33) {
                    processName = Process.myProcessName();
                    Intrinsics.checkNotNullExpressionValue(processName, "myProcessName()");
                } else {
                    processName = Application.getProcessName();
                    if (processName == null && (processName = ProcessUtils.getMyProcessName()) == null) {
                        processName = "";
                    }
                }
                sb6.append(processName);
                sb6.append(CoreConstants.DOT);
                sb6.toString();
                break;
            default:
                CorruptionException ex8 = (CorruptionException) obj2;
                Intrinsics.checkNotNullParameter(ex8, "ex");
                StringBuilder sb9 = new StringBuilder("CorruptionException in sessions DataStore in ");
                if (Build.VERSION.SDK_INT > 33) {
                    processName2 = Process.myProcessName();
                    Intrinsics.checkNotNullExpressionValue(processName2, "myProcessName()");
                } else {
                    processName2 = Application.getProcessName();
                    if (processName2 == null && (processName2 = ProcessUtils.getMyProcessName()) == null) {
                        processName2 = "";
                    }
                }
                sb9.append(processName2);
                sb9.append(CoreConstants.DOT);
                sb9.toString();
                break;
        }
        return PreferencesFactory.createEmpty();
    }
}
