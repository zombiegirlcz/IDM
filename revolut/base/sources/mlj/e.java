package mlj;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f206982a;

    public e(LinkedHashMap userInputs) {
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        this.f206982a = userInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f206982a.equals(((e) obj2).f206982a);
    }

    public final int hashCode() {
        return this.f206982a.hashCode();
    }
}
