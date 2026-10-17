package vuc;

import com.revolut.feature.security_hub.api.models.DigitizedCard;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f292316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DigitizedCard f292317b;

    public e(f0 revolutCard, DigitizedCard digitizedCard) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
        this.f292316a = revolutCard;
        this.f292317b = digitizedCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f292316a, eVar.f292316a) && Intrinsics.f(this.f292317b, eVar.f292317b);
    }

    public final int hashCode() {
        return this.f292317b.hashCode() + (this.f292316a.hashCode() * 31);
    }
}
