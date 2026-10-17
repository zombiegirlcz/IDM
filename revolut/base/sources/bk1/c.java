package bk1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16217c;
    public final String d;
    public final String e;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5) {
        if (29 != (i & 29)) {
            j1.f(a.f16214a.getDescriptor(), i, 29);
            throw null;
        }
        this.f16215a = str;
        if ((i & 2) == 0) {
            this.f16216b = "airtip_learn";
        } else {
            this.f16216b = str2;
        }
        this.f16217c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f16215a, cVar.f16215a) && Intrinsics.f(this.f16216b, cVar.f16216b) && Intrinsics.f(this.f16217c, cVar.f16217c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f16215a.hashCode() * 31, 31, this.f16216b), 31, this.f16217c), 31, this.d);
    }

    public c(String id10, String typeId, String title, String subtitle, String assistantQuery) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(assistantQuery, "assistantQuery");
        this.f16215a = id10;
        this.f16216b = typeId;
        this.f16217c = title;
        this.d = subtitle;
        this.e = assistantQuery;
    }
}
