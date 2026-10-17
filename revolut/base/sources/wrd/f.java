package wrd;

import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueHistoryEntry f299557a;

    public f(ValueHistoryEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f299557a = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f299557a, ((f) obj2).f299557a);
    }

    public final int hashCode() {
        return this.f299557a.hashCode();
    }
}
