package z19;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318769c;
    public final d d;
    public final i e;
    public final ArrayList f;

    public e(String header, String title, String str, d dVar, i iVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f318767a = header;
        this.f318768b = title;
        this.f318769c = str;
        this.d = dVar;
        this.e = iVar;
        this.f = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f318767a, eVar.f318767a) && Intrinsics.f(this.f318768b, eVar.f318768b) && Intrinsics.f(this.f318769c, eVar.f318769c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f.equals(eVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f318767a.hashCode() * 31, 31, this.f318768b);
        String str = this.f318769c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.e;
        return this.f.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
