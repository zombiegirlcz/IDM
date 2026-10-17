package so6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f264794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264796c;
    public final ArrayList d;

    public e(String str, String str2, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f264794a = z;
        this.f264795b = str;
        this.f264796c = str2;
        this.d = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f264794a == eVar.f264794a && Intrinsics.f(this.f264795b, eVar.f264795b) && Intrinsics.f(this.f264796c, eVar.f264796c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f264794a) * 31;
        String str = this.f264795b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f264796c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
