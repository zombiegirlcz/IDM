package fva;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f138391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138392c;
    public final String d;

    public c(String str, f fVar, String str2, String str3) {
        this.f138390a = str;
        this.f138391b = fVar;
        this.f138392c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138390a, cVar.f138390a) && Intrinsics.f(this.f138391b, cVar.f138391b) && Intrinsics.f(this.f138392c, cVar.f138392c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        String str = this.f138390a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.f138391b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.f138392c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
