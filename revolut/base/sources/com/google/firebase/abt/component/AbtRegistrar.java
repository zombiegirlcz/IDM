package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import ce.c;
import ce.n;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pd.h;
import rd.a;
import td.b;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.c(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ce.b> getComponents() {
        ce.a aVarB = ce.b.b(a.class);
        aVarB.f23279a = "fire-abt";
        aVarB.a(n.c(Context.class));
        aVarB.a(n.a(b.class));
        aVarB.f = new h(9);
        return Arrays.asList(aVarB.b(), mo3.a.d("fire-abt", "21.1.1"));
    }
}
