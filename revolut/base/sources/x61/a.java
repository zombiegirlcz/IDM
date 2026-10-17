package x61;

import com.revolut.domain.models.openbanking.JointDataSharingConsentState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f303007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f303008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f303009c;
    public final JointDataSharingConsentState d;
    public final Long e;

    public a(List authorizedPocketsIds, List authorizedLoansIds, ArrayList permissions, JointDataSharingConsentState jointDataSharingConsentState, Long l2) {
        Intrinsics.checkNotNullParameter(authorizedPocketsIds, "authorizedPocketsIds");
        Intrinsics.checkNotNullParameter(authorizedLoansIds, "authorizedLoansIds");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(jointDataSharingConsentState, "jointDataSharingConsentState");
        this.f303007a = authorizedPocketsIds;
        this.f303008b = authorizedLoansIds;
        this.f303009c = permissions;
        this.d = jointDataSharingConsentState;
        this.e = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f303007a, aVar.f303007a) && Intrinsics.f(this.f303008b, aVar.f303008b) && this.f303009c.equals(aVar.f303009c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f303009c, p.a.d(this.f303007a.hashCode() * 31, 31, this.f303008b), 31)) * 31;
        Long l2 = this.e;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
