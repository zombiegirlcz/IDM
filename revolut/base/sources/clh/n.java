package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f25006a;

    public n(w widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f25006a = widgetType;
    }

    @Override // clh.o
    public final w a() {
        return this.f25006a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f25006a == ((n) obj2).f25006a;
    }

    public final int hashCode() {
        return this.f25006a.hashCode();
    }
}
