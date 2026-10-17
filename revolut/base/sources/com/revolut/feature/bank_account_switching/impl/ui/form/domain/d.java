package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends fo2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63940c;
    public final String d;
    public final FormFieldValue.PhoneNumberField e;

    public d(String id10, String title, boolean z, String str, FormFieldValue.PhoneNumberField phoneNumberField) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63938a = id10;
        this.f63939b = title;
        this.f63940c = z;
        this.d = str;
        this.e = phoneNumberField;
    }

    @Override // fo2.b
    public final FormFieldValue b() {
        return this.e;
    }

    @Override // fo2.b
    public final String c() {
        return this.f63938a;
    }

    @Override // fo2.b
    public final boolean d() {
        return this.f63940c;
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
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f63938a, dVar.f63938a) && Intrinsics.f(this.f63939b, dVar.f63939b) && this.f63940c == dVar.f63940c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f63938a.hashCode() * 31, 31, this.f63939b), 31, this.f63940c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        FormFieldValue.PhoneNumberField phoneNumberField = this.e;
        return iHashCode + (phoneNumberField != null ? phoneNumberField.hashCode() : 0);
    }
}
