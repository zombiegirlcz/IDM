package q1l;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, null, j.c(k.PUBLICATION, new e(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241476c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f241477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f241478h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f241479j;

    public /* synthetic */ h(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        if (15 != (i & 15)) {
            j1.f(f.f241473a.getDescriptor(), i, 15);
            throw null;
        }
        this.f241474a = str;
        this.f241475b = str2;
        this.f241476c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.f241477g = null;
        } else {
            this.f241477g = str7;
        }
        if ((i & 128) == 0) {
            this.f241478h = null;
        } else {
            this.f241478h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.f241479j = null;
        } else {
            this.f241479j = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f241474a, hVar.f241474a) && Intrinsics.f(this.f241475b, hVar.f241475b) && Intrinsics.f(this.f241476c, hVar.f241476c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f241477g, hVar.f241477g) && Intrinsics.f(this.f241478h, hVar.f241478h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f241479j, hVar.f241479j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f241474a.hashCode() * 31, 31, this.f241475b), 31, this.f241476c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f241477g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f241478h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f241479j;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public h(String id10, String name, String tier, String iconUrl, String str, String str2, String str3, String str4, String str5, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f241474a = id10;
        this.f241475b = name;
        this.f241476c = tier;
        this.d = iconUrl;
        this.e = str;
        this.f = str2;
        this.f241477g = str3;
        this.f241478h = str4;
        this.i = str5;
        this.f241479j = list;
    }
}
