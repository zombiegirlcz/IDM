package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ul0 implements tl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f34121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj0 f34122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34123c;
    private boolean d;
    private final boolean e;

    public ul0(gj bundle, yj0 personBundle, int i) {
        MrzInfo mrzInfoF;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        this.f34121a = bundle;
        this.f34122b = personBundle;
        this.f34123c = i;
        ub0 ub0VarH = bundle.f().h();
        this.e = (ub0VarH == null || (mrzInfoF = ub0VarH.f()) == null) ? false : !mrzInfoF.getValidationErrors().contains(MrtdMrzInfoValidationError.TRUNCATED_NAMES);
    }

    @Override // com.fourthline.orca.internal.tl0
    public void a(boolean z) {
        this.d = z;
    }

    @Override // com.fourthline.orca.internal.tl0
    public void b(String str) {
        this.f34122b.t().b(str);
    }

    @Override // com.fourthline.orca.internal.tl0
    public String c() {
        return this.f34122b.c();
    }

    @Override // com.fourthline.orca.internal.tl0
    public Date d() {
        return this.f34122b.d();
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean e() {
        return oe.a(this.f34122b.t().d(), g());
    }

    @Override // com.fourthline.orca.internal.tl0
    public Gender f() {
        return this.f34122b.f();
    }

    @Override // com.fourthline.orca.internal.tl0
    public int g() {
        return this.f34123c;
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean h() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean i() {
        return this.f34122b.l();
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean j() {
        return this.f34121a.i() != null && this.e;
    }

    @Override // com.fourthline.orca.internal.tl0
    public /* bridge */ boolean k() {
        return super.k();
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean l() {
        return this.f34122b.m();
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean m() {
        return this.f34121a.i() != null && this.e;
    }

    @Override // com.fourthline.orca.internal.tl0
    public String a() {
        return this.f34122b.a();
    }

    @Override // com.fourthline.orca.internal.tl0
    public boolean b() {
        return this.f34122b.g();
    }

    @Override // com.fourthline.orca.internal.tl0
    public void a(String str) {
        this.f34122b.t().c(str);
    }

    @Override // com.fourthline.orca.internal.tl0
    public void a(Gender gender) {
        this.f34122b.t().a(gender);
    }

    @Override // com.fourthline.orca.internal.tl0
    public void a(Date date) {
        this.f34122b.t().a(date);
    }
}
