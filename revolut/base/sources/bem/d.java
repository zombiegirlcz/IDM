package bem;

import aem.v;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oem.a f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f14881c;
    public Function0 d;

    public d(oem.a key, Object config, Function1 body) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f14879a = key;
        this.f14880b = config;
        this.f14881c = body;
        this.d = new v(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.invoke();
    }
}
