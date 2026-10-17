package ezk;

import cli.p;
import ehe.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f130977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f130978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.spinnerPicker.c f130979c;

    public c(ArrayList items, aw0.e footer, com.revolut.core.ui_kit.views.spinnerPicker.c cVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f130977a = items;
        this.f130978b = footer;
        this.f130979c = cVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f130977a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f130977a.equals(cVar.f130977a) && this.f130978b.equals(cVar.f130978b) && Intrinsics.f(this.f130979c, cVar.f130979c);
    }

    public final int hashCode() {
        int iC = n.c(this.f130978b, this.f130977a.hashCode() * 31, 31);
        com.revolut.core.ui_kit.views.spinnerPicker.c cVar = this.f130979c;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
