package oc9;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224160c;
    public final Set d;
    public final Data e;
    public final Set f;

    public v(Data termsToSign, Data optionalTermsToSign, Data termsToAccept, Set selectedTermsTypes, Data consents, Set confirmedAcknowledgements) {
        Intrinsics.checkNotNullParameter(termsToSign, "termsToSign");
        Intrinsics.checkNotNullParameter(optionalTermsToSign, "optionalTermsToSign");
        Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
        Intrinsics.checkNotNullParameter(selectedTermsTypes, "selectedTermsTypes");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(confirmedAcknowledgements, "confirmedAcknowledgements");
        this.f224158a = termsToSign;
        this.f224159b = optionalTermsToSign;
        this.f224160c = termsToAccept;
        this.d = selectedTermsTypes;
        this.e = consents;
        this.f = confirmedAcknowledgements;
    }

    public static v a(v vVar, Data data, Data data2, Data data3, Set set, Data data4, Set set2, int i) {
        if ((i & 1) != 0) {
            data = vVar.f224158a;
        }
        Data termsToSign = data;
        if ((i & 2) != 0) {
            data2 = vVar.f224159b;
        }
        Data optionalTermsToSign = data2;
        if ((i & 4) != 0) {
            data3 = vVar.f224160c;
        }
        Data termsToAccept = data3;
        if ((i & 8) != 0) {
            set = vVar.d;
        }
        Set selectedTermsTypes = set;
        if ((i & 16) != 0) {
            data4 = vVar.e;
        }
        Data consents = data4;
        if ((i & 32) != 0) {
            set2 = vVar.f;
        }
        Set confirmedAcknowledgements = set2;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(termsToSign, "termsToSign");
        Intrinsics.checkNotNullParameter(optionalTermsToSign, "optionalTermsToSign");
        Intrinsics.checkNotNullParameter(termsToAccept, "termsToAccept");
        Intrinsics.checkNotNullParameter(selectedTermsTypes, "selectedTermsTypes");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(confirmedAcknowledgements, "confirmedAcknowledgements");
        return new v(termsToSign, optionalTermsToSign, termsToAccept, selectedTermsTypes, consents, confirmedAcknowledgements);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f224158a, vVar.f224158a) && Intrinsics.f(this.f224159b, vVar.f224159b) && Intrinsics.f(this.f224160c, vVar.f224160c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, p.a.f(kii.e.c(this.f224160c, kii.e.c(this.f224159b, this.f224158a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }
}
