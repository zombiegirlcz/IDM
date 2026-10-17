package hkk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f152942b;

    public e(Data subscribeDetails, Data insuranceDocumentsAvailability) {
        Intrinsics.checkNotNullParameter(subscribeDetails, "subscribeDetails");
        Intrinsics.checkNotNullParameter(insuranceDocumentsAvailability, "insuranceDocumentsAvailability");
        this.f152941a = subscribeDetails;
        this.f152942b = insuranceDocumentsAvailability;
    }

    public static e a(e eVar, Data subscribeDetails, Data insuranceDocumentsAvailability, int i) {
        if ((i & 1) != 0) {
            subscribeDetails = eVar.f152941a;
        }
        if ((i & 2) != 0) {
            insuranceDocumentsAvailability = eVar.f152942b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(subscribeDetails, "subscribeDetails");
        Intrinsics.checkNotNullParameter(insuranceDocumentsAvailability, "insuranceDocumentsAvailability");
        return new e(subscribeDetails, insuranceDocumentsAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f152941a, eVar.f152941a) && Intrinsics.f(this.f152942b, eVar.f152942b);
    }

    public final int hashCode() {
        return this.f152942b.hashCode() + (this.f152941a.hashCode() * 31);
    }
}
