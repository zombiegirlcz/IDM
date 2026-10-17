package kse;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189438c;
    public final Integer d;
    public final aal.a e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f189439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f189440h;
    public final av1.c i;

    public a(String id10, String title, String description, Integer num, aal.a aVar, ArrayList originEntities, e state, Instant updatedAt, av1.c type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(originEntities, "originEntities");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f189436a = id10;
        this.f189437b = title;
        this.f189438c = description;
        this.d = num;
        this.e = aVar;
        this.f = originEntities;
        this.f189439g = state;
        this.f189440h = updatedAt;
        this.i = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f189436a, aVar.f189436a) && Intrinsics.f(this.f189437b, aVar.f189437b) && Intrinsics.f(this.f189438c, aVar.f189438c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && this.f.equals(aVar.f) && this.f189439g == aVar.f189439g && Intrinsics.f(this.f189440h, aVar.f189440h) && this.i.equals(aVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f189436a.hashCode() * 31, 31, this.f189437b), 31, this.f189438c);
        Integer num = this.d;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        aal.a aVar = this.e;
        return this.i.hashCode() + r6.b.c((this.f189439g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31)) * 31, 31, this.f189440h);
    }
}
