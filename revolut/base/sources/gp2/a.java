package gp2;

import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankInformation f145223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankInformation f145224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145225c;
    public final ArrayList d;
    public final ArrayList e;

    public a(BankInformation fromBank, BankInformation toBank, String secondaryHolderName, ArrayList sections, ArrayList terms) {
        Intrinsics.checkNotNullParameter(fromBank, "fromBank");
        Intrinsics.checkNotNullParameter(toBank, "toBank");
        Intrinsics.checkNotNullParameter(secondaryHolderName, "secondaryHolderName");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f145223a = fromBank;
        this.f145224b = toBank;
        this.f145225c = secondaryHolderName;
        this.d = sections;
        this.e = terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f145223a.equals(aVar.f145223a) && this.f145224b.equals(aVar.f145224b) && Intrinsics.f(this.f145225c, aVar.f145225c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c((this.f145224b.hashCode() + (this.f145223a.hashCode() * 31)) * 31, 31, this.f145225c), 31);
    }
}
