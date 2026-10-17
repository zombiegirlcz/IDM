package com.revolut.feature.insurance_home.impl.data.model;

import com.revolut.feature.insurance_common.data.model.Banner;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lw7.j;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final j Companion = new j();
    public static final Lazy[] f = {null, null, yhm.j.c(k.PUBLICATION, new lv4.b(18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Header f76212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76213c;
    public final Footer d;
    public final Banner e;

    public /* synthetic */ f(int i, String str, Header header, List list, Footer footer, Banner banner) {
        if (31 != (i & 31)) {
            j1.f(e.f76210a.getDescriptor(), i, 31);
            throw null;
        }
        this.f76211a = str;
        this.f76212b = header;
        this.f76213c = list;
        this.d = footer;
        this.e = banner;
    }

    public final boolean a() {
        Iterable iterable = this.f76213c;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            List list = ((lw7.d) it8.next()).f200420b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    if (((d) it9.next()).e.f76167a != lw7.a.UNKNOWN) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f76211a, fVar.f76211a) && Intrinsics.f(this.f76212b, fVar.f76212b) && Intrinsics.f(this.f76213c, fVar.f76213c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        String str = this.f76211a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Header header = this.f76212b;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        List list = this.f76213c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Footer footer = this.d;
        int iHashCode4 = (iHashCode3 + (footer == null ? 0 : footer.hashCode())) * 31;
        Banner banner = this.e;
        return iHashCode4 + (banner != null ? banner.hashCode() : 0);
    }
}
