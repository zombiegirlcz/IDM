package krc;

import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalarySwitchPreview f188845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188846b;

    public a(SalarySwitchPreview salarySwitchPreview, String currencyCode) {
        Intrinsics.checkNotNullParameter(salarySwitchPreview, "salarySwitchPreview");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f188845a = salarySwitchPreview;
        this.f188846b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f188845a, aVar.f188845a) && Intrinsics.f(this.f188846b, aVar.f188846b);
    }

    public final int hashCode() {
        return this.f188846b.hashCode() + (this.f188845a.hashCode() * 31);
    }
}
