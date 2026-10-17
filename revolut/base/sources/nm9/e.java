package nm9;

import com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecipientsPaymentsSettingsRequest$Recipient f217218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f217220c;

    public e(RecipientsPaymentsSettingsRequest$Recipient recipient, String name) {
        Set recipients = y0.b(recipient);
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f217218a = recipient;
        this.f217219b = name;
        this.f217220c = recipients;
    }

    @Override // nm9.f
    public final Set a() {
        return this.f217220c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f217218a, eVar.f217218a) && Intrinsics.f(this.f217219b, eVar.f217219b) && Intrinsics.f(this.f217220c, eVar.f217220c);
    }

    public final int hashCode() {
        return this.f217220c.hashCode() + p.a.c(this.f217218a.hashCode() * 31, 31, this.f217219b);
    }
}
