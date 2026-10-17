package yhm;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f314183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f314184b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.f314184b == y.f314210a) {
            Function0 function0 = this.f314183a;
            Intrinsics.h(function0);
            this.f314184b = function0.invoke();
            this.f314183a = null;
        }
        return this.f314184b;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f314184b != y.f314210a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
