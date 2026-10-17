package jg9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173936b;

    public a(String fieldId, String value) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173935a = fieldId;
        this.f173936b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f173935a, aVar.f173935a) && Intrinsics.f(this.f173936b, aVar.f173936b);
    }

    public final int hashCode() {
        return this.f173936b.hashCode() + (this.f173935a.hashCode() * 31);
    }
}
