package hq8;

import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f154630c;
    public final JuniorTasksTransferTaxes d;

    public h(String juniorId, List tasks, dj0.d reward, JuniorTasksTransferTaxes taxes) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f154628a = juniorId;
        this.f154629b = tasks;
        this.f154630c = reward;
        this.d = taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154628a, hVar.f154628a) && Intrinsics.f(this.f154629b, hVar.f154629b) && Intrinsics.f(this.f154630c, hVar.f154630c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.d(this.f154628a.hashCode() * 31, 31, this.f154629b), 31, this.f154630c);
    }
}
