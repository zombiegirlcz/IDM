package wlm;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mmm.s0;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f298549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f298550c;
    public final /* synthetic */ o d;

    public k(o oVar, String key, long j2, ArrayList sources, long[] lengths) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(lengths, "lengths");
        this.d = oVar;
        this.f298548a = key;
        this.f298549b = j2;
        this.f298550c = sources;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it8 = this.f298550c.iterator();
        while (it8.hasNext()) {
            vlm.h.f((s0) it8.next());
        }
    }
}
