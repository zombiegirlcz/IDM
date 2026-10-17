package hj0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152634c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f152635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f152636h;
    public final b i;

    public e(String id10, String title, String key, String str, String str2, String str3, ArrayList actions, h hVar, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f152632a = id10;
        this.f152633b = title;
        this.f152634c = key;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f152635g = actions;
        this.f152636h = hVar;
        this.i = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f152632a, eVar.f152632a) && Intrinsics.f(this.f152633b, eVar.f152633b) && Intrinsics.f(this.f152634c, eVar.f152634c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f152635g.equals(eVar.f152635g) && Intrinsics.f(this.f152636h, eVar.f152636h) && Intrinsics.f(this.i, eVar.i);
    }

    @Override // hj0.f
    public final String getId() {
        return this.f152632a;
    }

    @Override // hj0.f
    public final String getKey() {
        return this.f152634c;
    }

    @Override // hj0.f
    public final String getTitle() {
        return this.f152633b;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f152632a.hashCode() * 31, 31, this.f152633b), 31, this.f152634c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f152635g, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        h hVar = this.f152636h;
        int iHashCode3 = (iB + (hVar == null ? 0 : hVar.hashCode())) * 31;
        b bVar = this.i;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
