package rz0;

import i8.b0;
import i8.u;
import i8.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru0.d f258460a;

    public a() {
        this(0);
    }

    @Override // i8.v
    public final u a(b0 multiFactory) {
        Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
        return new b(this.f258460a);
    }

    public a(int i) {
        ru0.d okHttpClient = new ru0.d(1);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f258460a = okHttpClient;
    }
}
