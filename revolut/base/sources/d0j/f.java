package d0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f110391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110393c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    public f(ArrayList header, int i, int i2, ArrayList challenges, ArrayList internalCampaigns, ArrayList quests) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        Intrinsics.checkNotNullParameter(internalCampaigns, "internalCampaigns");
        Intrinsics.checkNotNullParameter(quests, "quests");
        this.f110391a = header;
        this.f110392b = i;
        this.f110393c = i2;
        this.d = challenges;
        this.e = internalCampaigns;
        this.f = quests;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f110391a.equals(fVar.f110391a) && this.f110392b == fVar.f110392b && this.f110393c == fVar.f110393c && this.d.equals(fVar.d) && this.e.equals(fVar.e) && this.f.equals(fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.b(this.f110393c, j6.a.b(this.f110392b, this.f110391a.hashCode() * 31, 31), 31), 31), 31);
    }
}
