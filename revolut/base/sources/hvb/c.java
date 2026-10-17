package hvb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(10)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155797c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f155798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155799h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f155800j;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        if (1023 != (i & 1023)) {
            j1.f(a.f155794a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f155795a = str;
        this.f155796b = str2;
        this.f155797c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f155798g = str7;
        this.f155799h = str8;
        this.i = list;
        this.f155800j = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f155795a, cVar.f155795a) && Intrinsics.f(this.f155796b, cVar.f155796b) && Intrinsics.f(this.f155797c, cVar.f155797c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f155798g, cVar.f155798g) && Intrinsics.f(this.f155799h, cVar.f155799h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f155800j, cVar.f155800j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f155795a.hashCode() * 31, 31, this.f155796b), 31, this.f155797c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f155798g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f155799h;
        int iD = p.a.d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i);
        String str5 = this.f155800j;
        return iD + (str5 != null ? str5.hashCode() : 0);
    }

    public c(String id10, String name, String description, String image, String str, String str2, String str3, String str4, ArrayList nextBids, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(nextBids, "nextBids");
        this.f155795a = id10;
        this.f155796b = name;
        this.f155797c = description;
        this.d = image;
        this.e = str;
        this.f = str2;
        this.f155798g = str3;
        this.f155799h = str4;
        this.i = nextBids;
        this.f155800j = str5;
    }
}
