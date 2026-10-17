package qw2;

import com.revolut.data.model.Data;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f249752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f249754c;
    public final o5l.g d;

    public k(f0 card, boolean z, Data designConfig, o5l.g screenDensity) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        this.f249752a = card;
        this.f249753b = z;
        this.f249754c = designConfig;
        this.d = screenDensity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f249752a, kVar.f249752a) && this.f249753b == kVar.f249753b && Intrinsics.f(this.f249754c, kVar.f249754c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f249754c, j6.a.c(this.f249752a.hashCode() * 31, 31, this.f249753b), 31);
    }
}
