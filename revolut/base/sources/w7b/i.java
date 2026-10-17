package w7b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295498a;

    public i(Data valueReminderData) {
        Intrinsics.checkNotNullParameter(valueReminderData, "valueReminderData");
        this.f295498a = valueReminderData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f295498a, ((i) obj2).f295498a);
    }

    public final int hashCode() {
        return this.f295498a.hashCode();
    }
}
