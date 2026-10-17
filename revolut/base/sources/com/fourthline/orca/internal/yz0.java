package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f35464a;

    public yz0(List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f35464a = documents;
    }

    public final List a() {
        return this.f35464a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yz0) && Intrinsics.f(this.f35464a, ((yz0) obj2).f35464a);
    }

    public int hashCode() {
        return this.f35464a.hashCode();
    }

    public String toString() {
        return "SecondaryDocumentsBundle(documents=" + this.f35464a + ")";
    }

    public final void a(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f35464a = list;
    }

    public yz0(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zhm.f0.f322471a : list);
    }
}
