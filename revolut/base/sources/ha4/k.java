package ha4;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.l0;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f150446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f150447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f150448c;

    public k(ArrayList items, l0 headerModel, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f150446a = items;
        this.f150447b = headerModel;
        this.f150448c = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f150446a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f150446a.equals(kVar.f150446a) && this.f150447b.equals(kVar.f150447b) && this.f150448c.equals(kVar.f150448c);
    }

    public final int hashCode() {
        return this.f150448c.hashCode() + ((this.f150447b.hashCode() + (this.f150446a.hashCode() * 31)) * 31);
    }
}
