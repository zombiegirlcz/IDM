package x0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f301586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoTopUpState f301587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f301588c;
    public final aue.a d;
    public final boolean e;

    public h(Data externalCard, AutoTopUpState autoTopUpState, Data userCountryCode, aue.a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(externalCard, "externalCard");
        Intrinsics.checkNotNullParameter(autoTopUpState, "autoTopUpState");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        this.f301586a = externalCard;
        this.f301587b = autoTopUpState;
        this.f301588c = userCountryCode;
        this.d = aVar;
        this.e = z;
    }

    public static h a(h hVar, Data data, AutoTopUpState autoTopUpState, Data data2, aue.a aVar, int i) {
        if ((i & 1) != 0) {
            data = hVar.f301586a;
        }
        Data externalCard = data;
        if ((i & 2) != 0) {
            autoTopUpState = hVar.f301587b;
        }
        AutoTopUpState autoTopUpState2 = autoTopUpState;
        if ((i & 4) != 0) {
            data2 = hVar.f301588c;
        }
        Data userCountryCode = data2;
        if ((i & 8) != 0) {
            aVar = hVar.d;
        }
        boolean z = hVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(externalCard, "externalCard");
        Intrinsics.checkNotNullParameter(autoTopUpState2, "autoTopUpState");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        return new h(externalCard, autoTopUpState2, userCountryCode, aVar, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f301586a, hVar.f301586a) && Intrinsics.f(this.f301587b, hVar.f301587b) && Intrinsics.f(this.f301588c, hVar.f301588c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f301588c, (this.f301587b.hashCode() + (this.f301586a.hashCode() * 31)) * 31, 31);
        aue.a aVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
