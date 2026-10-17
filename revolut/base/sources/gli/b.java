package gli;

import androidx.collection.MutableScatterMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f144702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableScatterMap f144704c = new MutableScatterMap(0, 1, null);

    public final void a(long j2) {
        this.f144702a += j2;
        this.f144703b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b() {
        Intrinsics.checkNotNullParameter("CAPTURED_BY_CHILD", "key");
        return (String) this.f144704c.get("CAPTURED_BY_CHILD");
    }

    public final c c() {
        return new c(this.f144702a, this.f144703b);
    }

    public final void d() {
        Intrinsics.checkNotNullParameter("CAPTURED_BY_CHILD", "key");
        Intrinsics.checkNotNullParameter("CAPTURED_BY_CHILD", "value");
        this.f144704c.set("CAPTURED_BY_CHILD", "CAPTURED_BY_CHILD");
    }
}
