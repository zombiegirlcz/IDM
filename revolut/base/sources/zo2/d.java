package zo2;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormState f323858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f323859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn2.a f323860c;
    public final wn2.a d;
    public final wn2.d e;
    public final Data f;

    public d(FormState formState, LocalDate localDate, mn2.a serviceType, wn2.a targetAccountType, wn2.d dVar, Data content) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f323858a = formState;
        this.f323859b = localDate;
        this.f323860c = serviceType;
        this.d = targetAccountType;
        this.e = dVar;
        this.f = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f323858a, dVar.f323858a) && Intrinsics.f(this.f323859b, dVar.f323859b) && this.f323860c == dVar.f323860c && this.d == dVar.d && this.e == dVar.e && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f323858a.hashCode() * 31;
        LocalDate localDate = this.f323859b;
        int iHashCode2 = (this.d.hashCode() + ((this.f323860c.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31)) * 31;
        wn2.d dVar = this.e;
        return this.f.hashCode() + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }
}
