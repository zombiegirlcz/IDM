package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import fo2.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends fo2.b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63943c;
    public final String d;
    public final FormFieldValue.TextField e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f63945h;
    public final Regex i;

    public e(String id10, String title, boolean z, String str, FormFieldValue.TextField textField, String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63941a = id10;
        this.f63942b = title;
        this.f63943c = z;
        this.d = str;
        this.e = textField;
        this.f = str2;
        this.f63944g = str3;
        this.f63945h = num;
        this.i = str3 != null ? new Regex(str3) : null;
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
        return this.f63941a;
    }

    @Override // fo2.b
    public final boolean d() {
        return this.f63943c;
    }

    @Override // fo2.b
    public final boolean e(FormFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Regex regex = this.i;
        if (regex != null) {
            return regex.f(value.getF63921a());
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f63941a, eVar.f63941a) && Intrinsics.f(this.f63942b, eVar.f63942b) && this.f63943c == eVar.f63943c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f63944g, eVar.f63944g) && Intrinsics.f(this.f63945h, eVar.f63945h);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f63941a.hashCode() * 31, 31, this.f63942b), 31, this.f63943c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        FormFieldValue.TextField textField = this.e;
        int iHashCode2 = (iHashCode + (textField == null ? 0 : textField.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63944g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f63945h;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }
}
