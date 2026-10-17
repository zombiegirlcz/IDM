package vjj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f289765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f289766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f289767c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dm0.b f289768g;

    public j(Data subscription, Data esimProfiles, Data esimInstallationStates, Data phoneNumberSelections, Data giftRecipient, Data userDevices, dm0.b deviceId) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        Intrinsics.checkNotNullParameter(userDevices, "userDevices");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f289765a = subscription;
        this.f289766b = esimProfiles;
        this.f289767c = esimInstallationStates;
        this.d = phoneNumberSelections;
        this.e = giftRecipient;
        this.f = userDevices;
        this.f289768g = deviceId;
    }

    public static j a(j jVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = jVar.f289765a;
        }
        Data subscription = data;
        if ((i & 2) != 0) {
            data2 = jVar.f289766b;
        }
        Data esimProfiles = data2;
        if ((i & 4) != 0) {
            data3 = jVar.f289767c;
        }
        Data esimInstallationStates = data3;
        if ((i & 8) != 0) {
            data4 = jVar.d;
        }
        Data phoneNumberSelections = data4;
        if ((i & 16) != 0) {
            data5 = jVar.e;
        }
        Data giftRecipient = data5;
        if ((i & 32) != 0) {
            data6 = jVar.f;
        }
        Data userDevices = data6;
        dm0.b deviceId = jVar.f289768g;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        Intrinsics.checkNotNullParameter(esimInstallationStates, "esimInstallationStates");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        Intrinsics.checkNotNullParameter(userDevices, "userDevices");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new j(subscription, esimProfiles, esimInstallationStates, phoneNumberSelections, giftRecipient, userDevices, deviceId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f289765a, jVar.f289765a) && Intrinsics.f(this.f289766b, jVar.f289766b) && Intrinsics.f(this.f289767c, jVar.f289767c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f289768g, jVar.f289768g);
    }

    public final int hashCode() {
        return this.f289768g.hashCode() + kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f289767c, kii.e.c(this.f289766b, this.f289765a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
