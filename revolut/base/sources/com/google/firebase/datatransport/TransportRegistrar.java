package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ce.b;
import ce.c;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pd.h;
import wb.i;
import xb.a;
import zb.s;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<b> getComponents() {
        ce.a aVarB = b.b(i.class);
        aVarB.f23279a = "fire-transport";
        aVarB.a(n.c(Context.class));
        aVarB.f = new h(10);
        b bVarB = aVarB.b();
        ce.a aVarA = b.a(new t(te.a.class, i.class));
        aVarA.a(n.c(Context.class));
        aVarA.f = new h(11);
        b bVarB2 = aVarA.b();
        ce.a aVarA2 = b.a(new t(te.b.class, i.class));
        aVarA2.a(n.c(Context.class));
        aVarA2.f = new h(12);
        return Arrays.asList(bVarB, bVarB2, aVarA2.b(), mo3.a.d("fire-transport", "19.0.0"));
    }
}
