package fo2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f136795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f136796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FormData f136797c;

    public p(o oVar, m mVar, FormData formData) {
        Intrinsics.checkNotNullParameter(formData, "formData");
        this.f136795a = oVar;
        this.f136796b = mVar;
        this.f136797c = formData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f136795a == pVar.f136795a && Intrinsics.f(this.f136796b, pVar.f136796b) && Intrinsics.f(this.f136797c, pVar.f136797c);
    }

    public final int hashCode() {
        o oVar = this.f136795a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        m mVar = this.f136796b;
        return this.f136797c.hashCode() + ((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }
}
