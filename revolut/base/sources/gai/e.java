package gai;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f142190a;

    public e(wi0.b selectedCitizenship) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        this.f142190a = selectedCitizenship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f142190a, ((e) obj2).f142190a);
    }

    public final int hashCode() {
        return this.f142190a.f297794a.hashCode();
    }
}
