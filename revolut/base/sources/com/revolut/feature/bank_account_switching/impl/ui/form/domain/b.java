package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends fo2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63931c;
    public final String d;
    public final FormFieldValue.DropdownField e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f63932g;

    public b(String id10, String title, boolean z, String str, FormFieldValue.DropdownField dropdownField, String str2, ArrayList choices) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(choices, "choices");
        this.f63929a = id10;
        this.f63930b = title;
        this.f63931c = z;
        this.d = str;
        this.e = dropdownField;
        this.f = str2;
        this.f63932g = choices;
    }

    @Override // fo2.b
    public final FormFieldValue b() {
        return this.e;
    }

    @Override // fo2.b
    public final String c() {
        return this.f63929a;
    }

    @Override // fo2.b
    public final boolean d() {
        return this.f63931c;
    }

    @Override // fo2.b
    public final boolean e(FormFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f63929a, bVar.f63929a) && Intrinsics.f(this.f63930b, bVar.f63930b) && this.f63931c == bVar.f63931c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f63932g.equals(bVar.f63932g);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f63929a.hashCode() * 31, 31, this.f63930b), 31, this.f63931c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        FormFieldValue.DropdownField dropdownField = this.e;
        int iHashCode2 = (iHashCode + (dropdownField == null ? 0 : dropdownField.f63916a.hashCode())) * 31;
        String str2 = this.f;
        return this.f63932g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
