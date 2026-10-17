package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xg1 f30388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30389c;
    private cw0.a.C0180a.c d;
    private List e;

    public kt0(String workflowId, xg1 xg1Var, String str, cw0.a.C0180a.c cVar, List list) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f30387a = workflowId;
        this.f30388b = xg1Var;
        this.f30389c = str;
        this.d = cVar;
        this.e = list;
    }

    public final String a() {
        return this.f30389c;
    }

    public final cw0.a.C0180a.c b() {
        return this.d;
    }

    public final xg1 c() {
        return this.f30388b;
    }

    public final List d() {
        return this.e;
    }

    public final String e() {
        return this.f30387a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kt0)) {
            return false;
        }
        kt0 kt0Var = (kt0) obj2;
        return Intrinsics.f(this.f30387a, kt0Var.f30387a) && Intrinsics.f(this.f30388b, kt0Var.f30388b) && Intrinsics.f(this.f30389c, kt0Var.f30389c) && Intrinsics.f(this.d, kt0Var.d) && Intrinsics.f(this.e, kt0Var.e);
    }

    public int hashCode() {
        int iHashCode = this.f30387a.hashCode() * 31;
        xg1 xg1Var = this.f30388b;
        int iHashCode2 = (iHashCode + (xg1Var == null ? 0 : xg1Var.hashCode())) * 31;
        String str = this.f30389c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        cw0.a.C0180a.c cVar = this.d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "QesFlowDataBundle(workflowId=" + this.f30387a + ", qtspChallengeData=" + this.f30388b + ", maskedPhoneNumber=" + this.f30389c + ", otpSettings=" + this.d + ", signDocumentNames=" + this.e + ")";
    }

    public final void a(String str) {
        this.f30389c = str;
    }

    public final void a(cw0.a.C0180a.c cVar) {
        this.d = cVar;
    }

    public final void a(List list) {
        this.e = list;
    }

    public /* synthetic */ kt0(String str, xg1 xg1Var, String str2, cw0.a.C0180a.c cVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, xg1Var, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : cVar, (i & 16) != 0 ? null : list);
    }
}
