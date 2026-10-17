package l15;

import kotlin.jvm.internal.Intrinsics;
import l15.f;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f191462a;

    public h(i financialDifficultyContent) {
        Intrinsics.checkNotNullParameter(financialDifficultyContent, "financialDifficultyContent");
        this.f191462a = financialDifficultyContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f191462a, ((h) obj2).f191462a);
    }

    public final int hashCode() {
        return this.f191462a.hashCode();
    }
}
