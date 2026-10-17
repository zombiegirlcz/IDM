package ukc;

import com.revolut.feature.rfi_tool.impl.domain.model.EndDialog;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f280724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f280725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EndDialog f280726c;

    public d(ArrayList contents, boolean z, EndDialog endDialog) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        this.f280724a = contents;
        this.f280725b = z;
        this.f280726c = endDialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f280724a.equals(dVar.f280724a) && this.f280725b == dVar.f280725b && Intrinsics.f(this.f280726c, dVar.f280726c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f280724a.hashCode() * 31, 31, this.f280725b);
        EndDialog endDialog = this.f280726c;
        return iC + (endDialog == null ? 0 : endDialog.hashCode());
    }
}
