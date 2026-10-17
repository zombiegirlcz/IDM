package qg9;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245704b;

    public e(String fieldName, String str) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        this.f245703a = fieldName;
        this.f245704b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f245703a, eVar.f245703a) && Intrinsics.f(this.f245704b, eVar.f245704b);
    }

    public final int hashCode() {
        int iHashCode = this.f245703a.hashCode() * 31;
        String str = this.f245704b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
