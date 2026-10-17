package dej;

import com.revolut.retail.feature.esim.api.model.EsimHelpItem$Action;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimIcon f113516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimHelpItem$Action f113518c;
    public final c0 d;

    public d0(EsimIcon esimIcon, String label, EsimHelpItem$Action action, c0 style) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f113516a = esimIcon;
        this.f113517b = label;
        this.f113518c = action;
        this.d = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f113516a, d0Var.f113516a) && Intrinsics.f(this.f113517b, d0Var.f113517b) && Intrinsics.f(this.f113518c, d0Var.f113518c) && this.d == d0Var.d;
    }

    public final int hashCode() {
        EsimIcon esimIcon = this.f113516a;
        return this.d.hashCode() + ((this.f113518c.hashCode() + p.a.c((esimIcon == null ? 0 : esimIcon.hashCode()) * 31, 31, this.f113517b)) * 31);
    }
}
