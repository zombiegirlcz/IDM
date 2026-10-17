package i93;

import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f159565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f159566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f159567c;
    public final i d;
    public final i e;
    public final i f;

    public k(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6) {
        this.f159565a = iVar;
        this.f159566b = iVar2;
        this.f159567c = iVar3;
        this.d = iVar4;
        this.e = iVar5;
        this.f = iVar6;
    }

    public static k a(k kVar, i iVar, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6, int i) {
        if ((i & 1) != 0) {
            iVar = kVar.f159565a;
        }
        i iVar7 = iVar;
        if ((i & 2) != 0) {
            iVar2 = kVar.f159566b;
        }
        i iVar8 = iVar2;
        if ((i & 4) != 0) {
            iVar3 = kVar.f159567c;
        }
        i iVar9 = iVar3;
        if ((i & 8) != 0) {
            iVar4 = kVar.d;
        }
        i iVar10 = iVar4;
        if ((i & 16) != 0) {
            iVar5 = kVar.e;
        }
        i iVar11 = iVar5;
        if ((i & 32) != 0) {
            iVar6 = kVar.f;
        }
        return new k(iVar7, iVar8, iVar9, iVar10, iVar11, iVar6);
    }

    public final i b(e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (j.f159564a[type.ordinal()]) {
            case 1:
                return this.f159566b;
            case 2:
                return this.f;
            case 3:
                return this.e;
            case 4:
                return this.f159565a;
            case 5:
                return this.f159567c;
            case 6:
                return this.d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final k c(e type, i option) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(option, "option");
        switch (j.f159564a[type.ordinal()]) {
            case 1:
                return a(this, null, option, null, null, null, null, 61);
            case 2:
                return a(this, null, null, null, null, null, option, 31);
            case 3:
                return a(this, null, null, null, null, option, null, 47);
            case 4:
                return a(this, option, null, null, null, null, null, 62);
            case 5:
                return a(this, null, null, option, null, null, null, 59);
            case 6:
                return a(this, null, null, null, option, null, null, 55);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f159565a, kVar.f159565a) && Intrinsics.f(this.f159566b, kVar.f159566b) && Intrinsics.f(this.f159567c, kVar.f159567c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        i iVar = this.f159565a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        i iVar2 = this.f159566b;
        int iHashCode2 = (iHashCode + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        i iVar3 = this.f159567c;
        int iHashCode3 = (iHashCode2 + (iVar3 == null ? 0 : iVar3.hashCode())) * 31;
        i iVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (iVar4 == null ? 0 : iVar4.hashCode())) * 31;
        i iVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (iVar5 == null ? 0 : iVar5.hashCode())) * 31;
        i iVar6 = this.f;
        return iHashCode5 + (iVar6 != null ? iVar6.hashCode() : 0);
    }
}
