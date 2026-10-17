package pmh;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f237575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f237576b;

    public f(ArrayList swipeableAssets, LinkedHashMap instrumentsByFundClass) {
        Intrinsics.checkNotNullParameter(instrumentsByFundClass, "instrumentsByFundClass");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f237575a = instrumentsByFundClass;
        this.f237576b = swipeableAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f237575a.equals(fVar.f237575a) && this.f237576b.equals(fVar.f237576b);
    }

    public final int hashCode() {
        return this.f237576b.hashCode() + (this.f237575a.hashCode() * 31);
    }
}
