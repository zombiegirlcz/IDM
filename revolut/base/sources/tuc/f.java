package tuc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f274573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DigitizedCard f274574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f274575c;
    public final m d;
    public final do3.n e;

    public f(f0 revolutCard, DigitizedCard digitizedCard, Data transactionsData, m screenType, do3.n nVar) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f274573a = revolutCard;
        this.f274574b = digitizedCard;
        this.f274575c = transactionsData;
        this.d = screenType;
        this.e = nVar;
    }

    public static f a(f fVar, Data data, do3.n nVar, int i) {
        f0 revolutCard = fVar.f274573a;
        DigitizedCard digitizedCard = fVar.f274574b;
        if ((i & 4) != 0) {
            data = fVar.f274575c;
        }
        Data transactionsData = data;
        m screenType = fVar.d;
        if ((i & 16) != 0) {
            nVar = fVar.e;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        return new f(revolutCard, digitizedCard, transactionsData, screenType, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f274573a, fVar.f274573a) && Intrinsics.f(this.f274574b, fVar.f274574b) && Intrinsics.f(this.f274575c, fVar.f274575c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + kii.e.c(this.f274575c, (this.f274574b.hashCode() + (this.f274573a.hashCode() * 31)) * 31, 31)) * 31;
        do3.n nVar = this.e;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
