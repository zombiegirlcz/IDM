package ew6;

import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f130098c;

    public d(String str, String str2, boolean z) {
        this.f130096a = str;
        this.f130097b = str2;
        this.f130098c = z;
    }

    public static d a(d dVar, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = dVar.f130096a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.f130097b;
        }
        dVar.getClass();
        return new d(str, str2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f130096a, dVar.f130096a) && Intrinsics.f(this.f130097b, dVar.f130097b) && this.f130098c == dVar.f130098c;
    }

    public final int hashCode() {
        String str = this.f130096a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f130097b;
        return Boolean.hashCode(this.f130098c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
