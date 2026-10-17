package sk8;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f263778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263779b;

    public a(d referrerReward, String termsUrl) {
        Intrinsics.checkNotNullParameter(referrerReward, "referrerReward");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f263778a = referrerReward;
        this.f263779b = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f263778a, aVar.f263778a) && Intrinsics.f(this.f263779b, aVar.f263779b);
    }

    public final int hashCode() {
        return this.f263779b.hashCode() + (this.f263778a.hashCode() * 31);
    }
}
