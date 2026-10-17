package rnj;

import aii.r;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255706b;

    public d(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f255705a = type;
        this.f255706b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        String str = dVar.f255705a;
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        return Intrinsics.f(this.f255705a, str) && Intrinsics.f(this.f255706b, dVar.f255706b);
    }

    public final int hashCode() {
        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
        int iHashCode = this.f255705a.hashCode() * 31;
        String str = this.f255706b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
