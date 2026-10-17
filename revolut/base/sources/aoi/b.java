package aoi;

import com.google.firebase.perf.metrics.Trace;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Trace f7990c;

    public b(Trace trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f7990c = trace;
    }

    @Override // aoi.h
    public final void a(String attribute, String value) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7990c.putAttribute(attribute, value);
    }

    @Override // aoi.a
    public final void b() {
        this.f7990c.start();
    }

    @Override // aoi.a
    public final void c() {
        this.f7990c.stop();
    }

    @Override // aoi.h
    public final String getAttribute(String attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return this.f7990c.getAttribute(attribute);
    }
}
