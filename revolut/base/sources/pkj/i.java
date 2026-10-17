package pkj;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f237203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f237205c;

    public i(ArrayList items, boolean z, f navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f237203a = items;
        this.f237204b = z;
        this.f237205c = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f237203a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f237203a.equals(iVar.f237203a) && this.f237204b == iVar.f237204b && this.f237205c.equals(iVar.f237205c);
    }

    public final int hashCode() {
        return this.f237205c.hashCode() + j6.a.c(this.f237203a.hashCode() * 31, 31, this.f237204b);
    }
}
