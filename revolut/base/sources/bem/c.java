package bem;

import aem.i0;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import wim.r;
import wim.t;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14878c;

    public c(EnumSet tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        this.f14876a = tlsVersions;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Intrinsics.checkNotNullParameter(x509TrustManager, "<set-?>");
                    this.f14877b = x509TrustManager;
                    s0m.g gVar = new s0m.g(c());
                    Intrinsics.checkNotNullParameter(gVar, "<set-?>");
                    this.f14878c = gVar;
                    return;
                }
            }
            throw new IllegalStateException(("Unexpected default trust managers:" + Arrays.toString(trustManagers)).toString());
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (KeyStoreException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
        }
    }

    @Override // aem.i0
    public Object a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object objInvoke = ((Function0) this.f14876a).invoke();
        block.invoke(objInvoke);
        return new d((oem.a) this.f14878c, objInvoke, (Function1) this.f14877b);
    }

    @Override // aem.i0
    public void b(Object obj2, vdm.b client) {
        d plugin = (d) obj2;
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(client, "scope");
        plugin.getClass();
        Intrinsics.checkNotNullParameter(client, "scope");
        b bVar = new b(plugin.f14879a, client, plugin.f14880b);
        plugin.f14881c.invoke(bVar);
        plugin.d = bVar.d;
        for (e eVar : bVar.f14875c) {
            eVar.getClass();
            Intrinsics.checkNotNullParameter(client, "client");
            eVar.f14882a.c(client, eVar.f14883b);
        }
    }

    public String[] c() {
        EnumSet enumSet = (EnumSet) this.f14876a;
        String[] strArr = new String[enumSet.size()];
        Iterator it8 = enumSet.iterator();
        int i = 0;
        while (it8.hasNext()) {
            strArr[i] = ((s0m.h) it8.next()).toString();
            i++;
        }
        return strArr;
    }

    @Override // aem.i0
    public oem.a getKey() {
        return (oem.a) this.f14878c;
    }

    public c(String name, Function0 createConfiguration, Function1 body) {
        KType kTypeC;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f14876a = createConfiguration;
        this.f14877b = body;
        p0 p0Var = o0.f186429a;
        KClass kClassB = p0Var.b(d.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            r rVarP = p0Var.p(p0Var.b(c.class), t.INVARIANT);
            p0Var.n(rVarP, Collections.singletonList(o0.b(Object.class)));
            KType kTypeO = p0Var.o(rVarP, Collections.EMPTY_LIST, false);
            companion.getClass();
            kTypeC = o0.c(d.class, KTypeProjection.Companion.a(kTypeO));
        } catch (Throwable unused) {
            kTypeC = null;
        }
        this.f14878c = new oem.a(name, new tem.a(kClassB, kTypeC));
    }
}
