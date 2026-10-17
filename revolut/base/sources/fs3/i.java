package fs3;

import dx4.a1;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f137586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137588c;
    public final a1 d;
    public final String e;
    public final List f;

    public i(b type, String str, String str2, a1 a1Var, String str3, List tags) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f137586a = type;
        this.f137587b = str;
        this.f137588c = str2;
        this.d = a1Var;
        this.e = str3;
        this.f = tags;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f137586a == iVar.f137586a && Intrinsics.f(this.f137587b, iVar.f137587b) && Intrinsics.f(this.f137588c, iVar.f137588c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f137586a.hashCode() * 31;
        String str = this.f137587b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137588c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a1 a1Var = this.d;
        int iHashCode4 = (iHashCode3 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
