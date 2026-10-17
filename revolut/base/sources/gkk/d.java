package gkk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f144413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f144414c;
    public final Data d;

    public d(Data familyPlanPricing, Data insuranceDocumentsAvailability, Data user, Data familyLimits) {
        Intrinsics.checkNotNullParameter(familyPlanPricing, "familyPlanPricing");
        Intrinsics.checkNotNullParameter(insuranceDocumentsAvailability, "insuranceDocumentsAvailability");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(familyLimits, "familyLimits");
        this.f144412a = familyPlanPricing;
        this.f144413b = insuranceDocumentsAvailability;
        this.f144414c = user;
        this.d = familyLimits;
    }

    public static d a(d dVar, Data familyPlanPricing, Data insuranceDocumentsAvailability, Data user, Data familyLimits, int i) {
        dVar.getClass();
        if ((i & 2) != 0) {
            familyPlanPricing = dVar.f144412a;
        }
        if ((i & 4) != 0) {
            insuranceDocumentsAvailability = dVar.f144413b;
        }
        if ((i & 8) != 0) {
            user = dVar.f144414c;
        }
        if ((i & 16) != 0) {
            familyLimits = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(familyPlanPricing, "familyPlanPricing");
        Intrinsics.checkNotNullParameter(insuranceDocumentsAvailability, "insuranceDocumentsAvailability");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(familyLimits, "familyLimits");
        return new d(familyPlanPricing, insuranceDocumentsAvailability, user, familyLimits);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f144412a, dVar.f144412a) && Intrinsics.f(this.f144413b, dVar.f144413b) && Intrinsics.f(this.f144414c, dVar.f144414c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f144414c, kii.e.c(this.f144413b, this.f144412a.hashCode() * 31, 31), 31);
    }
}
