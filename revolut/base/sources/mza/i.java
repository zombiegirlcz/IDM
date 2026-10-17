package mza;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f210743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f210744c;

    public i(String storyId, Map substitutionData, boolean z) {
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        this.f210742a = storyId;
        this.f210743b = substitutionData;
        this.f210744c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f210742a, iVar.f210742a) && Intrinsics.f(this.f210743b, iVar.f210743b) && this.f210744c == iVar.f210744c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210744c) + p.a.e(this.f210742a.hashCode() * 31, 31, this.f210743b);
    }
}
