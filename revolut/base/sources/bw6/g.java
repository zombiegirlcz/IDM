package bw6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19247c;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data invoice, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            invoice = gVar.f19245a;
        }
        if ((i & 2) != 0) {
            z = gVar.f19246b;
        }
        if ((i & 4) != 0) {
            str = gVar.f19247c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        return new g(invoice, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19245a, gVar.f19245a) && this.f19246b == gVar.f19246b && Intrinsics.f(this.f19247c, gVar.f19247c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f19245a.hashCode() * 31, 31, this.f19246b);
        String str = this.f19247c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public g(Data invoice, String str, boolean z) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        this.f19245a = invoice;
        this.f19246b = z;
        this.f19247c = str;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null), null, false);
    }
}
