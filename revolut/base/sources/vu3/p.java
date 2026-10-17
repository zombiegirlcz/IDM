package vu3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f292235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f292237c;
    public final List d;
    public final q e;
    public final g f;

    public p(ArrayList widgetSections, String str, s sVar, ArrayList arrayList, q qVar, g gVar) {
        Intrinsics.checkNotNullParameter(widgetSections, "widgetSections");
        this.f292235a = widgetSections;
        this.f292236b = str;
        this.f292237c = sVar;
        this.d = arrayList;
        this.e = qVar;
        this.f = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f292235a.equals(pVar.f292235a) && Intrinsics.f(this.f292236b, pVar.f292236b) && Intrinsics.f(this.f292237c, pVar.f292237c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f292235a.hashCode() * 31;
        String str = this.f292236b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s sVar = this.f292237c;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        q qVar = this.e;
        int iHashCode5 = (iHashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        g gVar = this.f;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }
}
