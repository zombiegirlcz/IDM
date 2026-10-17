package vkj;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f289969a;

    public e(LinkedHashMap userInputs) {
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        this.f289969a = userInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f289969a.equals(((e) obj2).f289969a);
    }

    public final int hashCode() {
        return this.f289969a.hashCode();
    }
}
