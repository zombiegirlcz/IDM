package wz2;

import h93.f0;
import i93.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f301354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f301355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f301356c;

    public a(f0 card, e settingsType, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(settingsType, "settingsType");
        this.f301354a = card;
        this.f301355b = settingsType;
        this.f301356c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f301354a, aVar.f301354a) && this.f301355b == aVar.f301355b && this.f301356c == aVar.f301356c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f301356c) + ((this.f301355b.hashCode() + (this.f301354a.hashCode() * 31)) * 31);
    }
}
