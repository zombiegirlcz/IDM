package yo2;

import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f315546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankInformation f315547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankInformation f315548c;
    public final e d;
    public final ArrayList e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wn2.d f315549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f315550h;
    public final ArrayList i;

    public i(mn2.a serviceType, BankInformation fromBank, BankInformation toBank, e status, ArrayList steps, d dVar, wn2.d dVar2, ArrayList documents, ArrayList faq) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        Intrinsics.checkNotNullParameter(toBank, "toBank");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(faq, "faq");
        this.f315546a = serviceType;
        this.f315547b = fromBank;
        this.f315548c = toBank;
        this.d = status;
        this.e = steps;
        this.f = dVar;
        this.f315549g = dVar2;
        this.f315550h = documents;
        this.i = faq;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f315546a == iVar.f315546a && this.f315547b.equals(iVar.f315547b) && this.f315548c.equals(iVar.f315548c) && this.d == iVar.d && this.e.equals(iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f315549g == iVar.f315549g && this.f315550h.equals(iVar.f315550h) && this.i.equals(iVar.i);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((this.f315548c.hashCode() + ((this.f315547b.hashCode() + (this.f315546a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        d dVar = this.f;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        wn2.d dVar2 = this.f315549g;
        return this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f315550h, (iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31);
    }
}
