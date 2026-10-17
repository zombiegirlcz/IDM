package sii;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends com.revolut.kompot.common.flow.permissions.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f263634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f263635b;

    public d(LinkedHashMap result, boolean z) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f263634a = result;
        this.f263635b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f263634a.equals(dVar.f263634a) && this.f263635b == dVar.f263635b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263635b) + (this.f263634a.hashCode() * 31);
    }
}
