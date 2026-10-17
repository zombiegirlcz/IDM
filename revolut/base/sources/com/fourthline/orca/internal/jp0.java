package com.fourthline.orca.internal;

import android.net.Uri;
import com.fourthline.orca.internal.nx;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jp0 implements ox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g8 f29997a;

    public jp0(g8 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f29997a = decoder;
    }

    @Override // com.fourthline.orca.internal.ox
    public nx a(Uri uri2) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        String strA = this.f29997a.a(uri2);
        ip0 ip0Var = Intrinsics.f(strA, "application/pdf") ? ip0.f29666b : ip0.f29665a;
        List listK = zhm.v.k("image/png", "image/jpeg", "application/pdf");
        if ((listK instanceof Collection) && listK.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f((String) it8.next(), strA)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        Long lB = this.f29997a.b(uri2);
        return (lB == null || (((double) lB.longValue()) / 1024.0d) / 1024.0d <= 10.0d) ? z ? new nx.b(ip0Var) : new nx.c(ip0Var) : new nx.a(ip0Var);
    }
}
