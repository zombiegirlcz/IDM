package gu1;

import com.revolut.feature.apm.core.models.blik.EntryChecksResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d12.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EntryChecksResult f146656a;

    public a(EntryChecksResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f146656a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f146656a, ((a) obj2).f146656a);
    }

    public final int hashCode() {
        return this.f146656a.hashCode();
    }
}
