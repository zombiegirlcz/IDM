package oem;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes23.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tem.a f224653b;

    public a(String name, tem.a type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f224652a = name;
        this.f224653b = type;
        if (d0.W(name)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f224652a, aVar.f224652a) && Intrinsics.f(this.f224653b, aVar.f224653b);
    }

    public final int hashCode() {
        return (this.f224652a.hashCode() * 31) + this.f224653b.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.f224652a;
    }
}
