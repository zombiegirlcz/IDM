package com.fourthline.orca.internal;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28099b;

    public eb(String str, String str2) {
        this.f28098a = str;
        this.f28099b = str2;
    }

    public final String a() {
        return this.f28098a;
    }

    public final void b(String str) {
        this.f28098a = str;
    }

    public final String c() {
        return this.f28099b;
    }

    public final boolean d() {
        String str = this.f28099b;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    public final boolean e() {
        return b() && d();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj2;
        return Intrinsics.f(this.f28098a, ebVar.f28098a) && Intrinsics.f(this.f28099b, ebVar.f28099b);
    }

    public int hashCode() {
        String str = this.f28098a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28099b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactBundle(email=" + this.f28098a + ", mobile=" + this.f28099b + ")";
    }

    private final boolean a(String str) {
        return !kotlin.text.d0.W(str) && new Regex("^\\+?[0-9 ]*$").f(str);
    }

    public final boolean b() {
        String str = this.f28098a;
        if (str != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = str.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null && new Regex("[_\\-a-zA-Z0-9.+]+@[a-zA-Z0-9](\\.?[\\-a-zA-Z0-9]*[a-zA-Z0-9])*").f(lowerCase) && lowerCase.length() <= 254) {
                return true;
            }
        }
        return false;
    }

    public final void c(String str) {
        this.f28099b = str;
    }

    public /* synthetic */ eb(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
