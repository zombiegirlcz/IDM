package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265902a;

    public f(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f265902a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f265902a, ((f) obj2).f265902a);
    }

    public final int hashCode() {
        return this.f265902a.hashCode();
    }
}
