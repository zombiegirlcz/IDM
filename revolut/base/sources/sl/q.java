package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264062c;
    public final boolean d;

    public q(String id10, String taskDefId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.f264060a = id10;
        this.f264061b = taskDefId;
        this.f264062c = z;
        this.d = z3;
    }

    @Override // sl.x
    public final String a() {
        return this.f264061b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f264060a, qVar.f264060a) && Intrinsics.f(this.f264061b, qVar.f264061b) && this.f264062c == qVar.f264062c && this.d == qVar.d;
    }

    @Override // sl.x
    public final String getId() {
        return this.f264060a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f264060a.hashCode() * 31, 31, this.f264061b), 31, this.f264062c);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("FaceVideoTask(id=", this.f264060a, ", taskDefId=", this.f264061b, ", showIntro=");
        sbM.append(this.f264062c);
        sbM.append(", showVideoConfirmation=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
