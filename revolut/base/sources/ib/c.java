package ib;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aim.f f160067b;

    public c(Throwable error, Thread thread) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(thread, "thread");
        aim.f builder = new aim.f();
        builder.putAll(a1m.e.N(error));
        Intrinsics.checkNotNullParameter(thread, "<this>");
        aim.f builder2 = new aim.f();
        builder2.put("threadName", a1m.e.R(1024, thread.getName()));
        builder2.put("threadId", Long.valueOf(thread.getId()));
        Intrinsics.checkNotNullParameter(builder2, "builder");
        builder.putAll(builder2.b());
        builder.put("isFatal", Boolean.TRUE);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f160067b = builder.b();
    }

    @Override // ib.f
    public final Map getAttributes() {
        return this.f160067b;
    }

    @Override // ib.f
    public final String getEventName() {
        return "app_error";
    }

    @Override // ib.f
    public final String getSchema() {
        return "iglu:com.fourthline.sdk/app_error/jsonschema/1-0-0";
    }
}
