package quj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no3.b f249464c;
    public final String d;

    public /* synthetic */ c(int i, String str, String str2, String str3, no3.b bVar) {
        if (3 != (i & 3)) {
            j1.f(a.f249461a.getDescriptor(), i, 3);
            throw null;
        }
        this.f249462a = str;
        this.f249463b = str2;
        if ((i & 4) == 0) {
            this.f249464c = null;
        } else {
            this.f249464c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f249462a, cVar.f249462a) && Intrinsics.f(this.f249463b, cVar.f249463b) && Intrinsics.f(this.f249464c, cVar.f249464c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f249462a.hashCode() * 31, 31, this.f249463b);
        no3.b bVar = this.f249464c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public c(String name, String date, String str, no3.b bVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f249462a = name;
        this.f249463b = date;
        this.f249464c = bVar;
        this.d = str;
    }
}
