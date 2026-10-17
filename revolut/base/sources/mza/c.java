package mza;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f210728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f210729b;

    public c(i storyRequestParams, Locale locale) {
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f210728a = storyRequestParams;
        this.f210729b = locale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f210728a, cVar.f210728a) && Intrinsics.f(this.f210729b, cVar.f210729b);
    }

    public final int hashCode() {
        return this.f210729b.hashCode() + (this.f210728a.hashCode() * 31);
    }
}
