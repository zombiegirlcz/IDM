package jk5;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175090a;

    public a(String urlToDisplay) {
        Intrinsics.checkNotNullParameter(urlToDisplay, "urlToDisplay");
        this.f175090a = urlToDisplay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f175090a, ((a) obj2).f175090a);
    }

    public final int hashCode() {
        return this.f175090a.hashCode();
    }
}
