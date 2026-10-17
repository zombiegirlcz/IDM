package com.google.mlkit.common.internal;

import af.f;
import bh.c;
import bh.d;
import ce.a;
import ce.b;
import ce.n;
import ch.h;
import ch.i;
import ch.l;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b bVar = l.f24039b;
        a aVarB = b.b(dh.a.class);
        aVarB.a(n.c(h.class));
        aVarB.f = new ah.a(20);
        b bVarB = aVarB.b();
        a aVarB2 = b.b(i.class);
        aVarB2.f = new ch.b(20);
        b bVarB2 = aVarB2.b();
        a aVarB3 = b.b(d.class);
        aVarB3.a(new n(c.class, 2, 0));
        aVarB3.f = new dfm.c(20);
        b bVarB3 = aVarB3.b();
        a aVarB4 = b.b(ch.d.class);
        aVarB4.a(new n(i.class, 1, 1));
        aVarB4.f = new qf.b(20);
        b bVarB4 = aVarB4.b();
        a aVarB5 = b.b(ch.a.class);
        aVarB5.f = new f(21);
        b bVarB5 = aVarB5.b();
        a aVarB6 = b.b(ch.b.class);
        aVarB6.a(n.c(ch.a.class));
        aVarB6.f = new ah.a(21);
        b bVarB6 = aVarB6.b();
        a aVarB7 = b.b(ah.a.class);
        aVarB7.a(n.c(h.class));
        aVarB7.f = new ch.b(21);
        b bVarB7 = aVarB7.b();
        a aVarB8 = b.b(c.class);
        aVarB8.e = 1;
        aVarB8.a(new n(ah.a.class, 1, 1));
        aVarB8.f = new dfm.c(21);
        return zzaf.zzi(bVar, bVarB, bVarB2, bVarB3, bVarB4, bVarB5, bVarB6, bVarB7, aVarB8.b());
    }
}
