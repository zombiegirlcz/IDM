package go7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.MtaQuote;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kl7.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f145091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsurableCar f145092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdditionalDriver f145093c;
    public final Survey.Licence d;
    public final MtaQuote e;
    public final do3.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f145094g;

    public f(a1 mtaType, InsurableCar insurableCar, AdditionalDriver additionalDriver, Survey.Licence licence, MtaQuote mtaQuote, do3.n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        Intrinsics.checkNotNullParameter(mtaQuote, "mtaQuote");
        this.f145091a = mtaType;
        this.f145092b = insurableCar;
        this.f145093c = additionalDriver;
        this.d = licence;
        this.e = mtaQuote;
        this.f = nVar;
        this.f145094g = z;
    }

    public static f a(f fVar, do3.n nVar, boolean z, int i) {
        a1 mtaType = fVar.f145091a;
        InsurableCar insurableCar = fVar.f145092b;
        AdditionalDriver additionalDriver = fVar.f145093c;
        Survey.Licence licence = fVar.d;
        MtaQuote mtaQuote = fVar.e;
        if ((i & 32) != 0) {
            nVar = fVar.f;
        }
        do3.n nVar2 = nVar;
        if ((i & 64) != 0) {
            z = fVar.f145094g;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        Intrinsics.checkNotNullParameter(mtaQuote, "mtaQuote");
        return new f(mtaType, insurableCar, additionalDriver, licence, mtaQuote, nVar2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f145091a == fVar.f145091a && Intrinsics.f(this.f145092b, fVar.f145092b) && Intrinsics.f(this.f145093c, fVar.f145093c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f145094g == fVar.f145094g;
    }

    public final int hashCode() {
        int iHashCode = this.f145091a.hashCode() * 31;
        InsurableCar insurableCar = this.f145092b;
        int iHashCode2 = (iHashCode + (insurableCar == null ? 0 : insurableCar.hashCode())) * 31;
        AdditionalDriver additionalDriver = this.f145093c;
        int iHashCode3 = (iHashCode2 + (additionalDriver == null ? 0 : additionalDriver.hashCode())) * 31;
        Survey.Licence licence = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (licence == null ? 0 : licence.hashCode())) * 31)) * 31;
        do3.n nVar = this.f;
        return Boolean.hashCode(this.f145094g) + ((iHashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31);
    }
}
