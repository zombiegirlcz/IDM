package tl6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f272003a;

    public e(Data inactiveConsents) {
        Intrinsics.checkNotNullParameter(inactiveConsents, "inactiveConsents");
        this.f272003a = inactiveConsents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f272003a, ((e) obj2).f272003a);
    }

    public final int hashCode() {
        return this.f272003a.hashCode();
    }
}
