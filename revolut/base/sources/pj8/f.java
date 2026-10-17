package pj8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236697c;
    public final String d;
    public final i e;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, i iVar) {
        if (31 != (i & 31)) {
            j1.f(d.f236694a.getDescriptor(), i, 31);
            throw null;
        }
        this.f236695a = str;
        this.f236696b = str2;
        this.f236697c = str3;
        this.d = str4;
        this.e = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f236695a, fVar.f236695a) && Intrinsics.f(this.f236696b, fVar.f236696b) && Intrinsics.f(this.f236697c, fVar.f236697c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f236695a.hashCode() * 31, 31, this.f236696b), 31, this.f236697c), 31, this.d);
        i iVar = this.e;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }

    public f(String title, String value, String state, String type, i iVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f236695a = title;
        this.f236696b = value;
        this.f236697c = state;
        this.d = type;
        this.e = iVar;
    }
}
