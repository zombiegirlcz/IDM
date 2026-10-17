package zq5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324373a;

    public e(List sendRecipients) {
        Intrinsics.checkNotNullParameter(sendRecipients, "sendRecipients");
        this.f324373a = sendRecipients;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f324373a, ((e) obj2).f324373a);
    }

    public final int hashCode() {
        return this.f324373a.hashCode();
    }
}
