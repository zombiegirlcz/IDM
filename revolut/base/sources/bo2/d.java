package bo2;

import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDigits f17272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2.a f17273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17274c;
    public final FormData d;

    public d(CardDigits cardDigits, wn2.a targetAccountType, boolean z, FormData formData) {
        Intrinsics.checkNotNullParameter(cardDigits, "cardDigits");
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        Intrinsics.checkNotNullParameter(formData, "formData");
        this.f17272a = cardDigits;
        this.f17273b = targetAccountType;
        this.f17274c = z;
        this.d = formData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f17272a, dVar.f17272a) && this.f17273b == dVar.f17273b && this.f17274c == dVar.f17274c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f17273b.hashCode() + (this.f17272a.hashCode() * 31)) * 31, 31, this.f17274c);
    }
}
