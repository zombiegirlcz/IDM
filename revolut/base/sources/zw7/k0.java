package zw7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f325807a;

    public k0(ArrayList plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f325807a = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f325807a.equals(((k0) obj2).f325807a);
    }

    public final int hashCode() {
        return this.f325807a.hashCode();
    }
}
