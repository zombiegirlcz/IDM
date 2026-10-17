package com.google.firebase;

import af.e;
import af.f;
import af.g;
import af.i;
import android.content.Context;
import android.os.Build;
import ce.a;
import ce.b;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import pd.h;
import zsc.p;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(p.SPACE_CHAR, '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        a aVarB = b.b(yf.b.class);
        aVarB.a(new n(yf.a.class, 2, 0));
        aVarB.f = new h(21);
        arrayList.add(aVarB.b());
        t tVar = new t(vd.a.class, Executor.class);
        a aVar = new a(e.class, new Class[]{g.class, i.class});
        aVar.a(n.c(Context.class));
        aVar.a(n.c(pd.g.class));
        aVar.a(new n(f.class, 2, 0));
        aVar.a(new n(yf.b.class, 1, 1));
        aVar.a(new n(tVar, 1, 0));
        aVar.f = new af.b(tVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(mo3.a.d("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(mo3.a.d("fire-core", "21.0.0"));
        arrayList.add(mo3.a.d("device-name", a(Build.PRODUCT)));
        arrayList.add(mo3.a.d("device-model", a(Build.DEVICE)));
        arrayList.add(mo3.a.d("device-brand", a(Build.BRAND)));
        arrayList.add(mo3.a.i("android-target-sdk", new h(0)));
        arrayList.add(mo3.a.i("android-min-sdk", new h(1)));
        arrayList.add(mo3.a.i("android-platform", new h(2)));
        arrayList.add(mo3.a.i("android-installer", new h(3)));
        try {
            string = yhm.h.e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(mo3.a.d("kotlin", string));
        }
        return arrayList;
    }
}
