package hae;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f150486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f150487b;

    public f(Clause title, Data transactionsData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f150486a = title;
        this.f150487b = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f150486a, fVar.f150486a) && Intrinsics.f(this.f150487b, fVar.f150487b);
    }

    public final int hashCode() {
        return this.f150487b.hashCode() + (this.f150486a.hashCode() * 31);
    }
}
