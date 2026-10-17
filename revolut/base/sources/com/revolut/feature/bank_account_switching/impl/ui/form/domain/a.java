package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends fo2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63928c;
    public final String d;
    public final FormFieldValue.DateField e;

    public a(String id10, String title, boolean z, String str, FormFieldValue.DateField dateField) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63926a = id10;
        this.f63927b = title;
        this.f63928c = z;
        this.d = str;
        this.e = dateField;
    }

    @Override // fo2.b
    public final FormFieldValue b() {
        return this.e;
    }

    @Override // fo2.b
    public final String c() {
        return this.f63926a;
    }

    @Override // fo2.b
    public final boolean d() {
        return this.f63928c;
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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f63926a, aVar.f63926a) && Intrinsics.f(this.f63927b, aVar.f63927b) && this.f63928c == aVar.f63928c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f63926a.hashCode() * 31, 31, this.f63927b), 31, this.f63928c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        FormFieldValue.DateField dateField = this.e;
        return iHashCode + (dateField != null ? dateField.hashCode() : 0);
    }
}
