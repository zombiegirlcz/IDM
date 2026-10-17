package qo5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248040c;
    public final m d;
    public final String e;

    public /* synthetic */ j(int i, String str, String str2, String str3, m mVar, String str4) {
        if (31 != (i & 31)) {
            j1.f(h.f248037a.getDescriptor(), i, 31);
            throw null;
        }
        this.f248038a = str;
        this.f248039b = str2;
        this.f248040c = str3;
        this.d = mVar;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f248038a, jVar.f248038a) && Intrinsics.f(this.f248039b, jVar.f248039b) && Intrinsics.f(this.f248040c, jVar.f248040c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        String str = this.f248038a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f248039b);
        String str2 = this.f248040c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        m mVar = this.d;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public j(String str, String type, String str2, m mVar, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f248038a = str;
        this.f248039b = type;
        this.f248040c = str2;
        this.d = mVar;
        this.e = str3;
    }
}
