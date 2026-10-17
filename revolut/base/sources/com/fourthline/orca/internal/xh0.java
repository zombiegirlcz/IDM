package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xh0 implements k80, b80, rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg0 f34995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b80 f34996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rz0 f34997c;
    private String d;

    public xh0(sg0 tracker, b80 moduleAnalytics, rz0 screenAnalytics) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(moduleAnalytics, "moduleAnalytics");
        Intrinsics.checkNotNullParameter(screenAnalytics, "screenAnalytics");
        this.f34995a = tracker;
        this.f34996b = moduleAnalytics;
        this.f34997c = screenAnalytics;
    }

    private final boolean e(String str) {
        return kotlin.text.d0.J(str, "workflow_", false) || a().b(ib.b.Flow) != null;
    }

    private final void f(String str) {
        ib.b bVarB = a().b(ib.b.Flow);
        if (bVarB != null) {
            if (Intrinsics.f(str, "document_country")) {
                bVarB.clear("document_country");
                bVarB.clear("document_type");
            } else if (Intrinsics.f(str, "document_type")) {
                bVarB.clear("document_type");
            }
        }
    }

    @Override // com.fourthline.orca.internal.b80
    public void a(c80 analyticsContext, kh0 error) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f34996b.a(analyticsContext, error);
    }

    @Override // com.fourthline.orca.internal.b80
    public void b(c80 analyticsContext) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        this.f34996b.b(analyticsContext);
    }

    @Override // com.fourthline.orca.internal.rz0
    public void c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f34997c.c(name);
    }

    @Override // com.fourthline.orca.internal.rz0
    public void d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!e(name)) {
            this.d = name;
        } else {
            f(name);
            this.f34997c.d(name);
        }
    }

    @Override // com.fourthline.orca.internal.rz0
    public void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f34997c.a(name);
    }

    @Override // com.fourthline.orca.internal.rz0
    public void b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f34997c.b(name);
    }

    private final void b() {
        ib.b bVarB = a().b(ib.b.Features);
        jx jxVar = bVarB instanceof jx ? (jx) bVarB : null;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // com.fourthline.orca.internal.k80
    public /* bridge */ boolean a(c80 c80Var, oy oyVar) {
        return super.a(c80Var, oyVar);
    }

    @Override // com.fourthline.orca.internal.k80
    public /* bridge */ boolean a(c80 c80Var, oy oyVar, ny nyVar) {
        return super.a(c80Var, oyVar, nyVar);
    }

    public /* synthetic */ xh0(sg0 sg0Var, b80 b80Var, rz0 rz0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sg0Var, (i & 2) != 0 ? new wh0(sg0Var) : b80Var, (i & 4) != 0 ? new qi0(sg0Var) : rz0Var);
    }

    @Override // com.fourthline.orca.internal.k80
    public /* bridge */ boolean a(c80 c80Var) {
        return super.a(c80Var);
    }

    @Override // com.fourthline.orca.internal.k80
    public /* bridge */ boolean a(String str, String str2) {
        return super.a(str, str2);
    }

    @Override // com.fourthline.orca.internal.k80
    public sg0 a() {
        return this.f34995a;
    }

    @Override // com.fourthline.orca.internal.b80
    public void a(c80 analyticsContext, ny nyVar) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        b();
        this.f34996b.a(analyticsContext, nyVar);
        String str = this.d;
        if (str != null) {
            this.f34997c.d(str);
            this.d = null;
        }
    }
}
