package ggk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f143728c;

    public h1(String suggestedPlanId, ArrayList plans, i0 i0Var) {
        Intrinsics.checkNotNullParameter(suggestedPlanId, "suggestedPlanId");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f143726a = suggestedPlanId;
        this.f143727b = plans;
        this.f143728c = i0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f143726a, h1Var.f143726a) && this.f143727b.equals(h1Var.f143727b) && Intrinsics.f(this.f143728c, h1Var.f143728c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f143727b, this.f143726a.hashCode() * 31, 31);
        i0 i0Var = this.f143728c;
        return iB + (i0Var == null ? 0 : i0Var.hashCode());
    }
}
