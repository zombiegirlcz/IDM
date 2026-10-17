package anf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.q f7738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.f f7739b;

    public i(k71.q extraData, thf.f formattingOptions) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        this.f7738a = extraData;
        this.f7739b = formattingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f7738a, iVar.f7738a) && Intrinsics.f(this.f7739b, iVar.f7739b);
    }

    public final int hashCode() {
        return this.f7739b.hashCode() + (this.f7738a.hashCode() * 31);
    }
}
