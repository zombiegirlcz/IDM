package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d8 implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f209651c;
    public final d01.f d;
    public final boolean e;
    public final Object f;

    public d8(String listId, Clause text, Clause clause, d01.f style, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f209649a = listId;
        this.f209650b = text;
        this.f209651c = clause;
        this.d = style;
        this.e = z;
        this.f = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getZ() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj2;
        return Intrinsics.f(this.f209649a, d8Var.f209649a) && Intrinsics.f(this.f209650b, d8Var.f209650b) && Intrinsics.f(this.f209651c, d8Var.f209651c) && this.d == d8Var.d && this.e == d8Var.e && Intrinsics.f(this.f, d8Var.f);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f209649a.hashCode() * 31, 31, this.f209650b);
        Clause clause = this.f209651c;
        int iC = j6.a.c((this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.e);
        Object obj2 = this.f;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ d8(String str, Clause clause, dj0.d dVar, int i) {
        this(str, clause, null, d01.f.DEFAULT, true, (i & 32) != 0 ? null : dVar);
    }
}
