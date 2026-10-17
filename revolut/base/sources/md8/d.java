package md8;

import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentTypeId f204505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Media f204506c;

    public d(String juniorId, ConsentTypeId consentTypeId, Media promptMedia) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consentTypeId, "consentTypeId");
        Intrinsics.checkNotNullParameter(promptMedia, "promptMedia");
        this.f204504a = juniorId;
        this.f204505b = consentTypeId;
        this.f204506c = promptMedia;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f204504a, dVar.f204504a) && Intrinsics.f(this.f204505b, dVar.f204505b) && Intrinsics.f(this.f204506c, dVar.f204506c);
    }

    public final int hashCode() {
        return this.f204506c.hashCode() + ((this.f204505b.hashCode() + (this.f204504a.hashCode() * 31)) * 31);
    }
}
