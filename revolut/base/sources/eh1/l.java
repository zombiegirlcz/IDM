package eh1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f125695a;

    public l(Data cardOtpDataList) {
        Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
        this.f125695a = cardOtpDataList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f125695a, ((l) obj2).f125695a);
    }

    public final int hashCode() {
        return this.f125695a.hashCode();
    }
}
