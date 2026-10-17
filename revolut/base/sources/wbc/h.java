package wbc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296110c;
    public final String d;

    public h(String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f296108a = name;
        this.f296109b = str;
        this.f296110c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f296108a, hVar.f296108a) && Intrinsics.f(this.f296109b, hVar.f296109b) && Intrinsics.f(this.f296110c, hVar.f296110c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f296108a.hashCode() * 31;
        String str = this.f296109b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f296110c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
