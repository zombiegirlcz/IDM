package wl6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298438a;

    public e(Data linkedAccountConsentDetails) {
        Intrinsics.checkNotNullParameter(linkedAccountConsentDetails, "linkedAccountConsentDetails");
        this.f298438a = linkedAccountConsentDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f298438a, ((e) obj2).f298438a);
    }

    public final int hashCode() {
        return this.f298438a.hashCode();
    }
}
