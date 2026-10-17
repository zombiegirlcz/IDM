package yii;

import elm.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements od0.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f314330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f314331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd0.d f314332c;

    public c(CoroutineScope scope, e storage, fd0.d cache) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f314330a = scope;
        this.f314331b = storage;
        this.f314332c = cache;
    }

    @Override // od0.e
    public final void clear() {
        this.f314332c.i(-1);
        p0 p0Var = p0.f264001a;
        e0.C(this.f314330a, f.f127540b, null, new b(this, null, 0), 2);
    }
}
