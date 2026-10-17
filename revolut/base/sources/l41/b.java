package l41;

import com.revolut.ProtectedRevolutApplication;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends q implements Function0 {
    public static final b f = new b();

    public b() {
        super(0, ProtectedRevolutApplication.BuildConfig.class, "getRtcStatus", "getRtcStatus()Lcom/dexprotector/rtc/RtcStatus;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ProtectedRevolutApplication.BuildConfig.GChEy();
    }
}
