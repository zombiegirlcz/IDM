package vch;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efl.i f287698a;

    public a0(efl.i quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f287698a = quote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f287698a, ((a0) obj2).f287698a);
    }

    public final int hashCode() {
        return this.f287698a.hashCode();
    }
}
