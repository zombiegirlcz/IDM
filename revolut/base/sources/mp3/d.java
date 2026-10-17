package mp3;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class d implements h {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fs3.b f207724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207725c;
    public final String d;
    public final jo3.a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f207726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f207727h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f207728j;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{null, yhm.j.c(kVar, new mp.e(25)), null, null, null, null, null, null, null, yhm.j.c(kVar, new mp.e(26))};
    }

    public /* synthetic */ d(int i, String str, fs3.b bVar, String str2, String str3, jo3.a aVar, String str4, boolean z, Integer num, String str5, List list) {
        if (1023 != (i & 1023)) {
            j1.f(b.f207722a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f207723a = str;
        this.f207724b = bVar;
        this.f207725c = str2;
        this.d = str3;
        this.e = aVar;
        this.f = str4;
        this.f207726g = z;
        this.f207727h = num;
        this.i = str5;
        this.f207728j = list;
    }

    @Override // mp3.h
    public final fs3.b a() {
        return this.f207724b;
    }

    @Override // mp3.h
    public final String b() {
        return this.i;
    }

    @Override // mp3.h
    public final String c() {
        return this.d;
    }

    @Override // mp3.h
    public final Integer d() {
        return this.f207727h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f207723a, dVar.f207723a) && this.f207724b == dVar.f207724b && Intrinsics.f(this.f207725c, dVar.f207725c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f207726g == dVar.f207726g && Intrinsics.f(this.f207727h, dVar.f207727h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f207728j, dVar.f207728j);
    }

    @Override // mp3.h
    public final String getTitle() {
        return this.f207725c;
    }

    public final int hashCode() {
        int iHashCode = (this.f207724b.hashCode() + (this.f207723a.hashCode() * 31)) * 31;
        String str = this.f207725c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iJ = v7.j(this.e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        int iC = j6.a.c((iJ + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f207726g);
        Integer num = this.f207727h;
        int iHashCode3 = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.i;
        return this.f207728j.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Override // mp3.h
    public final List p() {
        return this.f207728j;
    }

    public d(String itemId, fs3.b entryPoint, String str, String str2, jo3.a creditLimit, String str3, boolean z, Integer num, String str4, ArrayList tags) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f207723a = itemId;
        this.f207724b = entryPoint;
        this.f207725c = str;
        this.d = str2;
        this.e = creditLimit;
        this.f = str3;
        this.f207726g = z;
        this.f207727h = num;
        this.i = str4;
        this.f207728j = tags;
    }
}
