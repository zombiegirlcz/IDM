package vuc;

import com.revolut.feature.security_hub.api.models.DigitizedCards;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DigitizedCards f292314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f292315c;

    public d(List cards, DigitizedCards digitizedCards, boolean z) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(digitizedCards, "digitizedCards");
        this.f292313a = cards;
        this.f292314b = digitizedCards;
        this.f292315c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f292313a, dVar.f292313a) && Intrinsics.f(this.f292314b, dVar.f292314b) && this.f292315c == dVar.f292315c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f292315c) + ((this.f292314b.hashCode() + (this.f292313a.hashCode() * 31)) * 31);
    }
}
