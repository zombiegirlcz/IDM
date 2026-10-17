package zc8;

import aii.e;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentTypeId.DataManagementConsentId f321259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieImage f321260c;

    public b(String juniorId, ConsentTypeId.DataManagementConsentId consentTypeId, LottieImage promptMedia) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consentTypeId, "consentTypeId");
        Intrinsics.checkNotNullParameter(promptMedia, "promptMedia");
        this.f321258a = juniorId;
        this.f321259b = consentTypeId;
        this.f321260c = promptMedia;
    }

    public final ConsentTypeId b() {
        return this.f321259b;
    }

    public final String c() {
        return this.f321258a;
    }

    public final Media d() {
        return this.f321260c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f321258a, bVar.f321258a) && this.f321259b.equals(bVar.f321259b) && this.f321260c.equals(bVar.f321260c);
    }

    public final int hashCode() {
        return this.f321260c.hashCode() + ((this.f321259b.hashCode() + (this.f321258a.hashCode() * 31)) * 31);
    }
}
