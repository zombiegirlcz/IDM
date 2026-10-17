package wj8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f298007c;

    public h(Data profile, Data dataManagementConsent, Data dynamicEditFieldsData) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(dataManagementConsent, "dataManagementConsent");
        Intrinsics.checkNotNullParameter(dynamicEditFieldsData, "dynamicEditFieldsData");
        this.f298005a = profile;
        this.f298006b = dataManagementConsent;
        this.f298007c = dynamicEditFieldsData;
    }

    public static h a(h hVar, Data profile, Data dataManagementConsent, Data dynamicEditFieldsData, int i) {
        if ((i & 1) != 0) {
            profile = hVar.f298005a;
        }
        if ((i & 2) != 0) {
            dataManagementConsent = hVar.f298006b;
        }
        if ((i & 4) != 0) {
            dynamicEditFieldsData = hVar.f298007c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(dataManagementConsent, "dataManagementConsent");
        Intrinsics.checkNotNullParameter(dynamicEditFieldsData, "dynamicEditFieldsData");
        return new h(profile, dataManagementConsent, dynamicEditFieldsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f298005a, hVar.f298005a) && Intrinsics.f(this.f298006b, hVar.f298006b) && Intrinsics.f(this.f298007c, hVar.f298007c);
    }

    public final int hashCode() {
        return this.f298007c.hashCode() + kii.e.c(this.f298006b, this.f298005a.hashCode() * 31, 31);
    }
}
