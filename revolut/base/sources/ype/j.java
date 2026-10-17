package ype;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f315853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f315854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f315855c;
    public final aw0.i d;

    public j(ArrayList items, Clause title, Clause secondDescription, aw0.i actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f315853a = items;
        this.f315854b = title;
        this.f315855c = secondDescription;
        this.d = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f315853a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f315853a.equals(jVar.f315853a) && this.f315854b.equals(jVar.f315854b) && this.f315855c.equals(jVar.f315855c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.a(p.a.b(this.f315853a.hashCode() * 31, 31, this.f315854b), 31, this.f315855c), 31, true);
    }
}
