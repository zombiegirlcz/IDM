package xpi;

import com.revolut.retail.common.ui.R$id;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f307976c;
    public static final f d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f307977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f307978b;

    static {
        int i = R$id.navBarWithToolbar;
        f307976c = new f(i, true);
        d = new f(i, false);
    }

    public f(int i, boolean z) {
        this.f307977a = i;
        this.f307978b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f307977a == fVar.f307977a && this.f307978b == fVar.f307978b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307978b) + (Integer.hashCode(this.f307977a) * 31);
    }
}
