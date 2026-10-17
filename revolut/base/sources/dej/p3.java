package dej;

import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimHyperText f113619c;

    public p3(List subscriptions, String str, EsimHyperText esimHyperText) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f113617a = subscriptions;
        this.f113618b = str;
        this.f113619c = esimHyperText;
    }

    public static p3 a(p3 p3Var, List subscriptions) {
        String str = p3Var.f113618b;
        EsimHyperText esimHyperText = p3Var.f113619c;
        p3Var.getClass();
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        return new p3(subscriptions, str, esimHyperText);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f113617a, p3Var.f113617a) && Intrinsics.f(this.f113618b, p3Var.f113618b) && Intrinsics.f(this.f113619c, p3Var.f113619c);
    }

    public final int hashCode() {
        int iHashCode = this.f113617a.hashCode() * 31;
        String str = this.f113618b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EsimHyperText esimHyperText = this.f113619c;
        return iHashCode2 + (esimHyperText != null ? esimHyperText.hashCode() : 0);
    }
}
