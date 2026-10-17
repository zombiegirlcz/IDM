package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264049c;
    public final String d;

    public m(String id10, String taskDefId, String moduleConfig, String moduleInput) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        Intrinsics.checkNotNullParameter(moduleConfig, "moduleConfig");
        Intrinsics.checkNotNullParameter(moduleInput, "moduleInput");
        this.f264047a = id10;
        this.f264048b = taskDefId;
        this.f264049c = moduleConfig;
        this.d = moduleInput;
    }

    @Override // sl.x
    public final String a() {
        return this.f264048b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f264047a, mVar.f264047a) && Intrinsics.f(this.f264048b, mVar.f264048b) && Intrinsics.f(this.f264049c, mVar.f264049c) && Intrinsics.f(this.d, mVar.d);
    }

    @Override // sl.x
    public final String getId() {
        return this.f264047a;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f264047a.hashCode() * 31, 31, this.f264048b), 31, this.f264049c);
    }

    public final String toString() {
        return j6.a.w(v0.a.m("CaptureSdkModuleTask(id=", this.f264047a, ", taskDefId=", this.f264048b, ", moduleConfig="), this.f264049c, ", moduleInput=", this.d, ")");
    }
}
