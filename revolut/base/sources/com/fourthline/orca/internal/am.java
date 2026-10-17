package com.fourthline.orca.internal;

import com.fourthline.orca.internal.w2;
import com.fourthline.orca.internal.y20;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class am implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gl0 f26840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i80 f26841b;

    public am(gl0 repository, i80 nationalityValidator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(nationalityValidator, "nationalityValidator");
        this.f26840a = repository;
        this.f26841b = nationalityValidator;
    }

    @Override // com.fourthline.orca.internal.w2
    public w2.a a(a01 selection) {
        Object next;
        String strC;
        Intrinsics.checkNotNullParameter(selection, "selection");
        Iterator it8 = this.f26840a.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((fd) next).f(), selection.getName())) {
                break;
            }
        }
        fd fdVar = (fd) next;
        if (fdVar == null) {
            return new w2.a.C0303a(new y20.d());
        }
        if (!this.f26841b.a(fdVar, this.f26840a.c())) {
            return new w2.a.C0303a(new y20.b.C0314b(fdVar));
        }
        fd fdVarK = this.f26840a.k();
        return (fdVarK == null || (strC = fdVarK.c()) == null) ? true : Intrinsics.f(fdVar.c(), strC) ? w2.a.b.f34494a : new w2.a.C0303a(new y20.b.a(fdVar));
    }
}
