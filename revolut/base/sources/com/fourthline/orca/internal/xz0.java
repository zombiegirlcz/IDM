package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DocumentType f35115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f35116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f35117c;
    private List d;

    public xz0(DocumentType documentType, Date date, Date date2, List list) {
        this.f35115a = documentType;
        this.f35116b = date;
        this.f35117c = date2;
        this.d = list;
    }

    private final boolean e() {
        return this.f35115a != null;
    }

    public final void a(DocumentType documentType) {
        this.f35115a = documentType;
    }

    public final List b() {
        return this.d;
    }

    public final Date c() {
        return this.f35116b;
    }

    public final DocumentType d() {
        return this.f35115a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xz0)) {
            return false;
        }
        xz0 xz0Var = (xz0) obj2;
        return this.f35115a == xz0Var.f35115a && Intrinsics.f(this.f35116b, xz0Var.f35116b) && Intrinsics.f(this.f35117c, xz0Var.f35117c) && Intrinsics.f(this.d, xz0Var.d);
    }

    public final boolean f() {
        return e() && l8.a(this.f35116b) && l8.a(this.d);
    }

    public int hashCode() {
        DocumentType documentType = this.f35115a;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        Date date = this.f35116b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f35117c;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SecondaryDocumentBundle(type=" + this.f35115a + ", issueDate=" + this.f35116b + ", expirationDate=" + this.f35117c + ", images=" + this.d + ")";
    }

    public final Date a() {
        return this.f35117c;
    }

    public final void a(Date date) {
        this.f35117c = date;
    }

    public final void a(List list) {
        this.d = list;
    }

    public /* synthetic */ xz0(DocumentType documentType, Date date, Date date2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : documentType, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : date2, (i & 8) != 0 ? null : list);
    }
}
