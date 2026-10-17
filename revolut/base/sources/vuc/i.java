package vuc;

import com.revolut.feature.security_hub.api.models.DigitizedCard;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f292323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DigitizedCard f292324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f292325c;
    public final tuc.m d;

    public i(f0 revolutCard, DigitizedCard digitizedCard, g entryPoint, tuc.m screenType) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f292323a = revolutCard;
        this.f292324b = digitizedCard;
        this.f292325c = entryPoint;
        this.d = screenType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f292323a, iVar.f292323a) && Intrinsics.f(this.f292324b, iVar.f292324b) && this.f292325c == iVar.f292325c && this.d == iVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f292325c.hashCode() + ((this.f292324b.hashCode() + (this.f292323a.hashCode() * 31)) * 31)) * 31);
    }
}
