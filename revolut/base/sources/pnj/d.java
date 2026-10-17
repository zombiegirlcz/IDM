package pnj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f237833b;

    public d(Data revolutTermsUrl, Data partnerTermsUrl) {
        Intrinsics.checkNotNullParameter(revolutTermsUrl, "revolutTermsUrl");
        Intrinsics.checkNotNullParameter(partnerTermsUrl, "partnerTermsUrl");
        this.f237832a = revolutTermsUrl;
        this.f237833b = partnerTermsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f237832a, dVar.f237832a) && Intrinsics.f(this.f237833b, dVar.f237833b);
    }

    public final int hashCode() {
        return this.f237833b.hashCode() + (this.f237832a.hashCode() * 31);
    }
}
