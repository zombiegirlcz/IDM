package d0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f110381c;
    public final String d;

    public c0(String campaignId, String title, String str, ArrayList eligibilityCriteriaSteps) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(eligibilityCriteriaSteps, "eligibilityCriteriaSteps");
        this.f110379a = campaignId;
        this.f110380b = title;
        this.f110381c = eligibilityCriteriaSteps;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f110379a, c0Var.f110379a) && Intrinsics.f(this.f110380b, c0Var.f110380b) && this.f110381c.equals(c0Var.f110381c) && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f110381c, p.a.c(this.f110379a.hashCode() * 31, 31, this.f110380b), 31);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
