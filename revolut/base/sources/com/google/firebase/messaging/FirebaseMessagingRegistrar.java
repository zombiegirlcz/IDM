package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ce.t tVar, ce.c cVar) {
        pd.g gVar = (pd.g) cVar.a(pd.g.class);
        if (cVar.a(bf.a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.c(yf.b.class), cVar.c(af.i.class), (df.e) cVar.a(df.e.class), cVar.e(tVar), (ze.c) cVar.a(ze.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ce.b> getComponents() {
        ce.t tVar = new ce.t(te.b.class, wb.i.class);
        ce.a aVarB = ce.b.b(FirebaseMessaging.class);
        aVarB.f23279a = "fire-fcm";
        aVarB.a(ce.n.c(pd.g.class));
        aVarB.a(new ce.n(bf.a.class, 0, 0));
        aVarB.a(ce.n.a(yf.b.class));
        aVarB.a(ce.n.a(af.i.class));
        aVarB.a(ce.n.c(df.e.class));
        aVarB.a(new ce.n(tVar, 0, 1));
        aVarB.a(ce.n.c(ze.c.class));
        aVarB.f = new af.b(tVar, 1);
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), mo3.a.d("fire-fcm", "24.1.1"));
    }
}
