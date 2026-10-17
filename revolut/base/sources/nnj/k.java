package nnj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f217693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217694c;
    public final Data d;
    public final Data e;
    public final Data f;

    public k(Data user, j reasonInput, String str, Data onlyManualInstallationAvailable, Data esimSubscriptions, Data esimInstallationStates) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(reasonInput, "reasonInput");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        this.f217692a = user;
        this.f217693b = reasonInput;
        this.f217694c = str;
        this.d = onlyManualInstallationAvailable;
        this.e = esimSubscriptions;
        this.f = esimInstallationStates;
    }

    public static k a(k kVar, Data data, j jVar, String str, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = kVar.f217692a;
        }
        Data user = data;
        if ((i & 2) != 0) {
            jVar = kVar.f217693b;
        }
        j reasonInput = jVar;
        if ((i & 4) != 0) {
            str = kVar.f217694c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            data2 = kVar.d;
        }
        Data onlyManualInstallationAvailable = data2;
        if ((i & 16) != 0) {
            data3 = kVar.e;
        }
        Data esimSubscriptions = data3;
        if ((i & 32) != 0) {
            data4 = kVar.f;
        }
        Data esimInstallationStates = data4;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(reasonInput, "reasonInput");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        return new k(user, reasonInput, str2, onlyManualInstallationAvailable, esimSubscriptions, esimInstallationStates);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f217692a, kVar.f217692a) && Intrinsics.f(this.f217693b, kVar.f217693b) && Intrinsics.f(this.f217694c, kVar.f217694c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f217693b.hashCode() + (this.f217692a.hashCode() * 31)) * 31;
        String str = this.f217694c;
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }
}
