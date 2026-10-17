package ysj;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new j1(17)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f316499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316501c;
    public final q d;

    public /* synthetic */ t(int i, v vVar, String str, String str2, q qVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(r.f316498a.getDescriptor(), i, 15);
            throw null;
        }
        this.f316499a = vVar;
        this.f316500b = str;
        this.f316501c = str2;
        this.d = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f316499a == tVar.f316499a && Intrinsics.f(this.f316500b, tVar.f316500b) && Intrinsics.f(this.f316501c, tVar.f316501c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f316499a.hashCode() * 31;
        String str = this.f316500b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f316501c);
        q qVar = this.d;
        return iC + (qVar != null ? qVar.hashCode() : 0);
    }

    public t(v type, String str, String description, q qVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f316499a = type;
        this.f316500b = str;
        this.f316501c = description;
        this.d = qVar;
    }
}
