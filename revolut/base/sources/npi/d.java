package npi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f218226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f218227c;
    public final CharSequence d;
    public final CharSequence e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f218228g;

    public d(String dialogId, String str, String str2, String positive, String str3, Object obj2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? "" : str3;
        boolean z = (i & 32) == 0;
        obj2 = (i & 128) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(positive, "positive");
        this.f218225a = dialogId;
        this.f218226b = str;
        this.f218227c = str2;
        this.d = positive;
        this.e = str3;
        this.f = z;
        this.f218228g = obj2;
    }

    public final boolean a() {
        return this.f;
    }

    public final CharSequence b() {
        return this.e;
    }

    public final CharSequence c() {
        return this.d;
    }

    public final CharSequence d() {
        return this.f218227c;
    }

    public final CharSequence e() {
        return this.f218226b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f218225a.equals(dVar.f218225a) && Intrinsics.f(this.f218226b, dVar.f218226b) && Intrinsics.f(this.f218227c, dVar.f218227c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f218228g, dVar.f218228g);
    }

    public final int hashCode() {
        int iHashCode = this.f218225a.hashCode() * 31;
        CharSequence charSequence = this.f218226b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f218227c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31;
        CharSequence charSequence3 = this.e;
        int iC = j6.a.c(j6.a.c((iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31, 31, this.f), 31, false);
        Object obj2 = this.f218228g;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }
}
