package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e9 {

    @NotNull
    public static final d9 Companion = new d9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153084c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153086h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h9 f153087j;

    public /* synthetic */ e9(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, h9 h9Var) {
        if (1023 != (i & 1023)) {
            qlm.j1.f(c9.f153052a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f153082a = str;
        this.f153083b = str2;
        this.f153084c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f153085g = str7;
        this.f153086h = str8;
        this.i = str9;
        this.f153087j = h9Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj2;
        return Intrinsics.f(this.f153082a, e9Var.f153082a) && Intrinsics.f(this.f153083b, e9Var.f153083b) && Intrinsics.f(this.f153084c, e9Var.f153084c) && Intrinsics.f(this.d, e9Var.d) && Intrinsics.f(this.e, e9Var.e) && Intrinsics.f(this.f, e9Var.f) && Intrinsics.f(this.f153085g, e9Var.f153085g) && Intrinsics.f(this.f153086h, e9Var.f153086h) && Intrinsics.f(this.i, e9Var.i) && Intrinsics.f(this.f153087j, e9Var.f153087j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f153082a.hashCode() * 31, 31, this.f153083b), 31, this.f153084c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f153085g;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f153086h);
        String str2 = this.i;
        return this.f153087j.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public e9(String documentId, String type, String group, String title, String description, String hint, String str, String state, String str2, h9 requirements) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.f153082a = documentId;
        this.f153083b = type;
        this.f153084c = group;
        this.d = title;
        this.e = description;
        this.f = hint;
        this.f153085g = str;
        this.f153086h = state;
        this.i = str2;
        this.f153087j = requirements;
    }
}
