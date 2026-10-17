package cge;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rge.b f23949a;

    public c(rge.b registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f23949a = registry;
    }

    @Override // dm2.a
    public final Flow a() {
        return new v1(new b(this, null));
    }
}
