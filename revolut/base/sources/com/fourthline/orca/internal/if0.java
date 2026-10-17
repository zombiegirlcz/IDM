package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.hd0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class if0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f29566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj0 f29567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cd0 f29568c;
    private final tf0 d;
    private boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29569g;

    public if0(gj bundle, yj0 personBundle, cd0 resultToBundleMapper, tf0 keyFactory, boolean z) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(resultToBundleMapper, "resultToBundleMapper");
        Intrinsics.checkNotNullParameter(keyFactory, "keyFactory");
        this.f29566a = bundle;
        this.f29567b = personBundle;
        this.f29568c = resultToBundleMapper;
        this.d = keyFactory;
        this.e = z;
        this.f = e();
    }

    public void a(boolean z) {
        this.e = z;
    }

    @Override // com.fourthline.orca.internal.hf0
    public DocumentType b() {
        return ij.b(this.f29566a).c();
    }

    @Override // com.fourthline.orca.internal.hf0
    public kf0 c() {
        return this.d.a(this.f29566a, this.f29567b);
    }

    @Override // com.fourthline.orca.internal.hf0
    public gd0 d() {
        return this.f29566a.e();
    }

    @Override // com.fourthline.orca.internal.hf0
    public boolean e() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.hf0
    public ad0 f() {
        return this.f29566a.i();
    }

    @Override // com.fourthline.orca.internal.hf0
    public int g() {
        return this.f29566a.j().size();
    }

    @Override // com.fourthline.orca.internal.hf0
    public void h() {
        this.f29569g = 0;
        a(this.f);
    }

    @Override // com.fourthline.orca.internal.hf0
    public fd a() {
        return this.f29566a.g();
    }

    @Override // com.fourthline.orca.internal.hf0
    public void a(ad0 ad0Var) {
        gj gjVar = this.f29566a;
        if (ad0Var != null) {
            this.f29568c.a(ad0Var, b());
        } else {
            ad0Var = null;
        }
        gjVar.a(ad0Var);
    }

    @Override // com.fourthline.orca.internal.hf0
    public void a(hd0 error) {
        ib.b bVarB;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f29566a.j().add(error);
        if (e() && ((error instanceof hd0.e) || (error instanceof hd0.d))) {
            int i = this.f29569g;
            this.f29569g = i + 1;
            if (i >= 2) {
                a(false);
            }
        }
        ib.h hVar = hb.a.f150532a;
        if (hVar == null || (bVarB = hVar.b(ib.b.Flow)) == null) {
            return;
        }
        bVarB.set("nfc_error_count", Integer.valueOf(this.f29566a.j().size()));
    }
}
