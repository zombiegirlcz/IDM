package jv0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f178760a;

    public r(ArrayList subtitles) {
        Intrinsics.checkNotNullParameter(subtitles, "subtitles");
        this.f178760a = subtitles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f178760a.equals(((r) obj2).f178760a);
    }

    public final int hashCode() {
        return this.f178760a.hashCode();
    }
}
