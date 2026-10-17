package aw;

import androidx.camera.video.Recording;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw.z f10143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kw.d f10144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Recording f10145c;
    public boolean d;

    public c0(bw.z target, kw.d dVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f10143a = target;
        this.f10144b = dVar;
        this.f10145c = null;
        this.d = false;
    }

    public final void a() {
        kw.d dVar = this.f10144b;
        if (dVar != null && dVar.f190182g.compareAndSet(false, true)) {
            dVar.f = false;
            dVar.a();
            dVar.d.clear();
            dVar.e.clear();
        }
        this.f10143a.a();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f10143a.equals(c0Var.f10143a) && Intrinsics.f(this.f10144b, c0Var.f10144b) && Intrinsics.f(this.f10145c, c0Var.f10145c) && this.d == c0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f10143a.hashCode() * 31;
        kw.d dVar = this.f10144b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Recording recording = this.f10145c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (recording != null ? recording.hashCode() : 0)) * 31);
    }
}
