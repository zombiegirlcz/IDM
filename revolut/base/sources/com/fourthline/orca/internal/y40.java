package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y40 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f35155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f35156b;

    public y40(z addressBundle, List countries) {
        Intrinsics.checkNotNullParameter(addressBundle, "addressBundle");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f35155a = addressBundle;
        this.f35156b = countries;
    }

    @Override // com.fourthline.orca.internal.h0
    public void a(Integer num) {
        this.f35155a.a(num);
    }

    public List b() {
        return this.f35156b;
    }

    @Override // com.fourthline.orca.internal.h0
    public void c(String str) {
        this.f35155a.e(str);
    }

    @Override // com.fourthline.orca.internal.h0
    public void d(String str) {
        this.f35155a.d(str);
    }

    @Override // com.fourthline.orca.internal.h0
    public Integer e() {
        return this.f35155a.i();
    }

    @Override // com.fourthline.orca.internal.h0
    public String f() {
        return this.f35155a.e();
    }

    @Override // com.fourthline.orca.internal.h0
    public boolean g() {
        return true;
    }

    @Override // com.fourthline.orca.internal.h0
    public String h() {
        return this.f35155a.h();
    }

    @Override // com.fourthline.orca.internal.h0
    public String i() {
        return this.f35155a.a();
    }

    @Override // com.fourthline.orca.internal.h0
    public String j() {
        return this.f35155a.j();
    }

    @Override // com.fourthline.orca.internal.h0
    public boolean l() {
        return this.f35155a.f();
    }

    @Override // com.fourthline.orca.internal.h0
    public boolean m() {
        return this.f35155a.k();
    }

    @Override // com.fourthline.orca.internal.h0
    public boolean n() {
        return this.f35155a.l();
    }

    @Override // com.fourthline.orca.internal.h0
    public boolean o() {
        return this.f35155a.b();
    }

    @Override // com.fourthline.orca.internal.h0
    public void a(String str) {
        this.f35155a.f(str);
    }

    @Override // com.fourthline.orca.internal.p40
    public a01 d() {
        Object next;
        Iterator it8 = b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((fd) next).c(), this.f35155a.c())) {
                break;
            }
        }
        return (a01) next;
    }

    @Override // com.fourthline.orca.internal.h0
    public void e(String str) {
        this.f35155a.b(str);
    }

    @Override // com.fourthline.orca.internal.h0
    public boolean a() {
        return l() && m() && g() && n() && o();
    }

    @Override // com.fourthline.orca.internal.m40
    public void a(a01 a01Var) {
        Object next;
        z zVar = this.f35155a;
        Iterator it8 = b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f((fd) next, a01Var)) {
                    break;
                }
            }
        }
        fd fdVar = (fd) next;
        zVar.c(fdVar != null ? fdVar.c() : null);
    }
}
