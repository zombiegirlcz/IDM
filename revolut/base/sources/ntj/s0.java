package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ns1.a(8)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f219125c;
    public final String d;

    public /* synthetic */ s0(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            qlm.j1.f(q0.f219113a.getDescriptor(), i, 15);
            throw null;
        }
        this.f219123a = str;
        this.f219124b = str2;
        this.f219125c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f219123a, s0Var.f219123a) && Intrinsics.f(this.f219124b, s0Var.f219124b) && Intrinsics.f(this.f219125c, s0Var.f219125c) && Intrinsics.f(this.d, s0Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f219123a.hashCode() * 31, 31, this.f219124b), 31, this.f219125c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public s0(String campaignId, String title, String str, ArrayList eligibilityCriteriaSteps) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(eligibilityCriteriaSteps, "eligibilityCriteriaSteps");
        this.f219123a = campaignId;
        this.f219124b = title;
        this.f219125c = eligibilityCriteriaSteps;
        this.d = str;
    }
}
