package sii;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends com.revolut.kompot.common.flow.permissions.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f263632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f263633b;

    public c(LinkedHashMap result, boolean z) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f263632a = result;
        this.f263633b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f263632a.equals(cVar.f263632a) && this.f263633b == cVar.f263633b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263633b) + (this.f263632a.hashCode() * 31);
    }
}
