package ri4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GiveConsentConfiguration f254539b;

    public e(Data giveConsentContent, GiveConsentConfiguration configuration) {
        Intrinsics.checkNotNullParameter(giveConsentContent, "giveConsentContent");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f254538a = giveConsentContent;
        this.f254539b = configuration;
    }

    public static e a(e eVar, Data giveConsentContent, GiveConsentConfiguration configuration, int i) {
        if ((i & 1) != 0) {
            giveConsentContent = eVar.f254538a;
        }
        if ((i & 2) != 0) {
            configuration = eVar.f254539b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(giveConsentContent, "giveConsentContent");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new e(giveConsentContent, configuration);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f254538a, eVar.f254538a) && Intrinsics.f(this.f254539b, eVar.f254539b);
    }

    public final int hashCode() {
        return this.f254539b.hashCode() + (this.f254538a.hashCode() * 31);
    }
}
