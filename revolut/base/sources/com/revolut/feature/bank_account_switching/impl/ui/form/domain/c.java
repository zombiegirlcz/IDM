package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import fo2.q;
import fo2.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends fo2.b implements s {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cnm.b f63933h = new cnm.b(cnm.b.f25473b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63936c;
    public final String d;
    public final FormFieldValue.TextField e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63937g;

    public c(String id10, String title, boolean z, String str, FormFieldValue.TextField textField, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63934a = id10;
        this.f63935b = title;
        this.f63936c = z;
        this.d = str;
        this.e = textField;
        this.f = str2;
        this.f63937g = str3;
    }

    @Override // fo2.s
    public final String a() {
        return this.f;
    }

    @Override // fo2.b
    public final FormFieldValue b() {
        return this.e;
    }

    @Override // fo2.b
    public final String c() {
        return this.f63934a;
    }

    @Override // fo2.b
    public final boolean d() {
        return this.f63936c;
    }

    @Override // fo2.b
    public final boolean e(FormFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = ((FormFieldValue.TextField) value).f63922b;
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return f63933h.a(a0.D(str, " ", "", false));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f63934a, cVar.f63934a) && Intrinsics.f(this.f63935b, cVar.f63935b) && this.f63936c == cVar.f63936c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f63937g, cVar.f63937g);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f63934a.hashCode() * 31, 31, this.f63935b), 31, this.f63936c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        FormFieldValue.TextField textField = this.e;
        int iHashCode2 = (iHashCode + (textField == null ? 0 : textField.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63937g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
