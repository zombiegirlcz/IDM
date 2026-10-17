package jg9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173953b;

    public m(String fieldId, String value) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173952a = fieldId;
        this.f173953b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f173952a, mVar.f173952a) && Intrinsics.f(this.f173953b, mVar.f173953b);
    }

    public final int hashCode() {
        return this.f173953b.hashCode() + (this.f173952a.hashCode() * 31);
    }
}
