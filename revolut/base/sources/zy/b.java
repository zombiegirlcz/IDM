package zy;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f326353a;

    public b(Locale selectedLocale) {
        Intrinsics.checkNotNullParameter(selectedLocale, "selectedLocale");
        this.f326353a = selectedLocale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f326353a, ((b) obj2).f326353a);
    }

    public final int hashCode() {
        return this.f326353a.hashCode();
    }
}
