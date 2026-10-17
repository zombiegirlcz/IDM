package hel;

import a0.d;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f151716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f151718c;
    public final b d;
    public final Links e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f151719g;

    public a(ArrayList forbiddenCountries, String registeredIdentityId, long j2, b context, Links links, String onboardingStoryId, boolean z) {
        Intrinsics.checkNotNullParameter(forbiddenCountries, "forbiddenCountries");
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(onboardingStoryId, "onboardingStoryId");
        this.f151716a = forbiddenCountries;
        this.f151717b = registeredIdentityId;
        this.f151718c = j2;
        this.d = context;
        this.e = links;
        this.f = onboardingStoryId;
        this.f151719g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f151716a.equals(aVar.f151716a) && Intrinsics.f(this.f151717b, aVar.f151717b) && this.f151718c == aVar.f151718c && this.d == aVar.d && this.e.equals(aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f151719g == aVar.f151719g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151719g) + p.a.c((this.e.hashCode() + ((this.d.hashCode() + d.c(p.a.c(this.f151716a.hashCode() * 31, 31, this.f151717b), 31, this.f151718c)) * 31)) * 31, 31, this.f);
    }
}
