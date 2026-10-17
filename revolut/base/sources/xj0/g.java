package xj0;

import e8.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import xda.z;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class g {
    public static List f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f306448b = {o0.f186429a.j(new h0(g.class, "interceptors", "getInterceptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f306447a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f306449c = new a();
    public static final List d = u.c("com.revolut.instrumentation_test_core.libs.mock.network.aclient.InstrumentationTestInterceptor");
    public static final List e = v.k("com.revolut.instrumentation_test_core.libs.offline.ForceOfflineModeInterceptor", "com.revolut.instrumentation_test_core.libs.mock.network.aclient.InstrumentationTestInterceptor", "com.revolut.instrumentation_test_core.libs.record_replay.internal.interceptors.BeforeOkReplayRecordInterceptor", "com.revolut.instrumentation_test_core.libs.record_replay.internal.interceptors.OkReplayRecordInterceptor", "com.revolut.instrumentation_test_core.libs.record_replay.internal.interceptors.AfterOkReplayRecordInterceptor");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f306450g = new r((Function0) new z(27));

    public static final class a {
    }

    private g() {
    }
}
