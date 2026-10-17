package aoi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f7991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7992b;

    public d(e eVar, b trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.f7992b = eVar;
        this.f7991a = trace;
    }

    @Override // aoi.h
    public final void a(String attribute, String value) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7991a.a(attribute, value);
    }

    @Override // aoi.h
    public final String getAttribute(String attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return this.f7991a.getAttribute(attribute);
    }

    @Override // aoi.h
    public final long getDuration() {
        return this.f7991a.getDuration();
    }

    @Override // aoi.h
    public final void start() {
        this.f7991a.start();
    }

    @Override // aoi.h
    public final void stop() {
        String str = this.f7992b.d;
        if (str != null) {
            this.f7991a.a("USER_ID", str);
        }
        this.f7991a.stop();
    }
}
