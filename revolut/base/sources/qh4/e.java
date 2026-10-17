package qh4;

import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import skm.a2;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f246455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f246456b;

    public e(y0 dialog, a2 timeoutJob) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
        this.f246455a = dialog;
        this.f246456b = timeoutJob;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f246455a.equals(eVar.f246455a) && this.f246456b.equals(eVar.f246456b);
    }

    public final int hashCode() {
        return this.f246456b.hashCode() + (this.f246455a.hashCode() * 31);
    }
}
