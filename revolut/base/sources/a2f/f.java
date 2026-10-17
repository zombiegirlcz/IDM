package a2f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f811c;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data agent, String externalId, e eVar, int i) {
        if ((i & 1) != 0) {
            agent = fVar.f809a;
        }
        if ((i & 2) != 0) {
            externalId = fVar.f810b;
        }
        if ((i & 4) != 0) {
            eVar = fVar.f811c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        return new f(agent, externalId, eVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f809a, fVar.f809a) && Intrinsics.f(this.f810b, fVar.f810b) && Intrinsics.f(this.f811c, fVar.f811c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f809a.hashCode() * 31, 31, this.f810b);
        e eVar = this.f811c;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }

    public f(Data agent, String externalId, e eVar) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        this.f809a = agent;
        this.f810b = externalId;
        this.f811c = eVar;
    }

    public /* synthetic */ f(int i) {
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this(data, "", null);
    }
}
