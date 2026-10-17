package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f264071c;
    public final u d;

    public v(String id10, String taskDefId, t tVar, u uVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.f264069a = id10;
        this.f264070b = taskDefId;
        this.f264071c = tVar;
        this.d = uVar;
    }

    @Override // sl.x
    public final String a() {
        return this.f264070b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f264069a, vVar.f264069a) && Intrinsics.f(this.f264070b, vVar.f264070b) && this.f264071c == vVar.f264071c && Intrinsics.f(this.d, vVar.d);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264069a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f264069a.hashCode() * 31, 31, this.f264070b);
        t tVar = this.f264071c;
        int iHashCode = (iC + (tVar == null ? 0 : tVar.hashCode())) * 31;
        u uVar = this.d;
        return iHashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("RetryTask(id=", this.f264069a, ", taskDefId=", this.f264070b, ", reason=");
        sbM.append(this.f264071c);
        sbM.append(", customTexts=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
