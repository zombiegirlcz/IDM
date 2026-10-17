package com.revolut.feature.shared.invoices.api.domain.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u9d.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    public static final C0542a Companion = new C0542a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f86417c;
    public final Boolean d;
    public final Boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f86418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86419h;
    public final String i;

    /* JADX INFO: renamed from: com.revolut.feature.shared.invoices.api.domain.model.a$a, reason: collision with other inner class name */
    public static final class C0542a {
        private C0542a() {
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f86415a, aVar.f86415a) && Intrinsics.f(this.f86416b, aVar.f86416b) && Intrinsics.f(this.f86417c, aVar.f86417c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f86418g == aVar.f86418g && Intrinsics.f(this.f86419h, aVar.f86419h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        String str = this.f86415a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86416b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f86417c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.e;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.f86418g;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f86419h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public a(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, List list, b bVar, String str3, String str4) {
        this.f86415a = str;
        this.f86416b = str2;
        this.f86417c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = list;
        this.f86418g = bVar;
        this.f86419h = str3;
        this.i = str4;
    }
}
