package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264059c;

    public p(String id10, String taskDefId, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taskDefId, "taskDefId");
        this.f264057a = id10;
        this.f264058b = taskDefId;
        this.f264059c = z;
    }

    @Override // sl.x
    public final String a() {
        return this.f264058b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f264057a, pVar.f264057a) && Intrinsics.f(this.f264058b, pVar.f264058b) && this.f264059c == pVar.f264059c;
    }

    @Override // sl.x
    public final String getId() {
        return this.f264057a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264059c) + p.a.c(this.f264057a.hashCode() * 31, 31, this.f264058b);
    }

    public final String toString() {
        return com.google.android.gms.internal.mlkit_vision_face.a.t(v0.a.m("FacePhotoTask(id=", this.f264057a, ", taskDefId=", this.f264058b, ", showIntro="), this.f264059c, ")");
    }
}
