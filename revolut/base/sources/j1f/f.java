package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170377c;
    public final String d;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(d.f170373a.getDescriptor(), i, 15);
            throw null;
        }
        this.f170375a = str;
        this.f170376b = str2;
        this.f170377c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f170375a, fVar.f170375a) && Intrinsics.f(this.f170376b, fVar.f170376b) && Intrinsics.f(this.f170377c, fVar.f170377c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f170375a.hashCode() * 31, 31, this.f170376b), 31, this.f170377c);
    }

    public f(String product, String loyaltyProgrammeId, String externalId, String primaryAgent) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(loyaltyProgrammeId, "loyaltyProgrammeId");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(primaryAgent, "primaryAgent");
        this.f170375a = product;
        this.f170376b = loyaltyProgrammeId;
        this.f170377c = externalId;
        this.d = primaryAgent;
    }
}
