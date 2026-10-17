package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f186402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f186403b;

    public b(f baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f186402a = safeCast;
        this.f186403b = baseKey instanceof b ? ((b) baseKey).f186403b : baseKey;
    }
}
