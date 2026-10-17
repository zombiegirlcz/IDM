package c69;

import com.revolut.feature.masav.impl.model.DirectDebitData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitData f21730a;

    public j(DirectDebitData directDebitData) {
        Intrinsics.checkNotNullParameter(directDebitData, "directDebitData");
        this.f21730a = directDebitData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f21730a, ((j) obj2).f21730a);
    }

    public final int hashCode() {
        return this.f21730a.hashCode();
    }
}
