package py4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240659c;
    public final String d;

    public a() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f240657a, aVar.f240657a) && Intrinsics.f(this.f240658b, aVar.f240658b) && Intrinsics.f(this.f240659c, aVar.f240659c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        String str = this.f240657a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f240658b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f240659c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public a(String str, String str2, String str3, String str4) {
        this.f240657a = str;
        this.f240658b = str2;
        this.f240659c = str3;
        this.d = str4;
    }
}
