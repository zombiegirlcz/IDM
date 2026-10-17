package pnb;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237681a;

    public c(Data taxForms) {
        Intrinsics.checkNotNullParameter(taxForms, "taxForms");
        this.f237681a = taxForms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f237681a, ((c) obj2).f237681a);
    }

    public final int hashCode() {
        return this.f237681a.hashCode();
    }
}
