package lii;

import kotlin.jvm.internal.Intrinsics;
import tji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195529a;

    public c(String buttonTag) {
        Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
        this.f195529a = buttonTag;
    }

    public final String a() {
        return this.f195529a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f195529a, ((c) obj2).f195529a);
    }

    public final int hashCode() {
        return this.f195529a.hashCode();
    }
}
