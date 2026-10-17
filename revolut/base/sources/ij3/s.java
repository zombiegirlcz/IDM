package ij3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f161690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161691c;
    public final String d;
    public final c e;

    public /* synthetic */ s(int i, String str, f fVar, String str2, String str3, c cVar) {
        if (17 != (i & 17)) {
            j1.f(q.f161688a.getDescriptor(), i, 17);
            throw null;
        }
        this.f161689a = str;
        if ((i & 2) == 0) {
            this.f161690b = null;
        } else {
            this.f161690b = fVar;
        }
        if ((i & 4) == 0) {
            this.f161691c = null;
        } else {
            this.f161691c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f161689a, sVar.f161689a) && Intrinsics.f(this.f161690b, sVar.f161690b) && Intrinsics.f(this.f161691c, sVar.f161691c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f161689a.hashCode() * 31;
        f fVar = this.f161690b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f161691c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public s(String id10, f fVar, String str, String str2, c background) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f161689a = id10;
        this.f161690b = fVar;
        this.f161691c = str;
        this.d = str2;
        this.e = background;
    }
}
