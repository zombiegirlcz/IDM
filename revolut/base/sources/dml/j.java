package dml;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f116197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f116198b;

    public j(ArrayList items, aw0.i actionModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionModel, "actionModel");
        this.f116197a = items;
        this.f116198b = actionModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f116197a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f116197a.equals(jVar.f116197a) && this.f116198b.equals(jVar.f116198b);
    }

    public final int hashCode() {
        return this.f116198b.hashCode() + (this.f116197a.hashCode() * 31);
    }
}
