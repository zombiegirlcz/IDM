package dej;

import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimHyperText f113587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2 f113589c;

    public l2(EsimHyperText content, String str, m2 severity) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.f113587a = content;
        this.f113588b = str;
        this.f113589c = severity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f113587a, l2Var.f113587a) && Intrinsics.f(this.f113588b, l2Var.f113588b) && this.f113589c == l2Var.f113589c;
    }

    public final int hashCode() {
        int iHashCode = this.f113587a.hashCode() * 31;
        String str = this.f113588b;
        return this.f113589c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
