package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vr implements fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mi f34438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fi f34439b;

    public vr(mi repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f34438a = repository;
        this.f34439b = new ve();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fourthline.orca.internal.fi d() {
        /*
            r3 = this;
            com.fourthline.orca.internal.mi r0 = r3.f34438a
            com.fourthline.orca.internal.fd r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.c()
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r2 = "ESP"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L29
            com.fourthline.orca.internal.mi r0 = r3.f34438a
            com.fourthline.orca.internal.di r0 = r0.c()
            if (r0 == 0) goto L23
            com.fourthline.core.DocumentType r1 = r0.c()
        L23:
            com.fourthline.core.DocumentType r0 = com.fourthline.core.DocumentType.ID_CARD
            if (r1 != r0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L3c
            com.fourthline.orca.internal.fi r1 = r3.f34439b
            boolean r1 = r1 instanceof com.fourthline.orca.internal.h31
            if (r1 != 0) goto L3c
            com.fourthline.orca.internal.h31 r0 = new com.fourthline.orca.internal.h31
            com.fourthline.orca.internal.mi r1 = r3.f34438a
            r0.<init>(r1)
            r3.f34439b = r0
            goto L4b
        L3c:
            if (r0 != 0) goto L4b
            com.fourthline.orca.internal.fi r0 = r3.f34439b
            boolean r0 = r0 instanceof com.fourthline.orca.internal.ve
            if (r0 != 0) goto L4b
            com.fourthline.orca.internal.ve r0 = new com.fourthline.orca.internal.ve
            r0.<init>()
            r3.f34439b = r0
        L4b:
            com.fourthline.orca.internal.fi r0 = r3.f34439b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.vr.d():com.fourthline.orca.internal.fi");
    }

    @Override // com.fourthline.orca.internal.fi
    public l20 a() {
        return d().a();
    }

    @Override // com.fourthline.orca.internal.fi
    public c81 b() {
        return d().b();
    }

    @Override // com.fourthline.orca.internal.fi
    public gi c() {
        return d().c();
    }
}
