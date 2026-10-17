package yg5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f313523a;

    public e(ArrayList currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f313523a = currencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f313523a.equals(((e) obj2).f313523a);
    }

    public final int hashCode() {
        return this.f313523a.hashCode();
    }
}
