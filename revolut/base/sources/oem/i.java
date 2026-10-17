package oem;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i implements Map.Entry, pim.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f224666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f224667b;

    public i(Object obj2, Object obj3) {
        this.f224666a = obj2;
        this.f224667b = obj3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 != null && (obj2 instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj2;
            if (Intrinsics.f(entry.getKey(), this.f224666a) && Intrinsics.f(entry.getValue(), this.f224667b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f224666a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f224667b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj2 = this.f224666a;
        Intrinsics.h(obj2);
        int iHashCode = obj2.hashCode() + 527;
        Object obj3 = this.f224667b;
        Intrinsics.h(obj3);
        return iHashCode + obj3.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        this.f224667b = obj2;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f224666a);
        sb6.append('=');
        sb6.append(this.f224667b);
        return sb6.toString();
    }
}
