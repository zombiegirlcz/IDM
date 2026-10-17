package uw2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283535a;

    public j(Data cardOtpDataList) {
        Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
        this.f283535a = cardOtpDataList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f283535a, ((j) obj2).f283535a);
    }

    public final int hashCode() {
        return this.f283535a.hashCode();
    }
}
