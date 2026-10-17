package xj0;

import akl.s;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import ulm.q;
import ulm.t;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
public interface i {
    static OkHttpClient a(i iVar, Long l2, boolean z, boolean z3, List interceptors, List networkInterceptors, List sslPinningEntries, int i) {
        Object obj2 = null;
        if ((i & 1) != 0) {
            l2 = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            interceptors = f0.f322471a;
        }
        if ((i & 16) != 0) {
            networkInterceptors = f0.f322471a;
        }
        if ((i & 32) != 0) {
            sslPinningEntries = f0.f322471a;
        }
        dk0.c cVar = (dk0.c) iVar;
        ij0.a aVar = cVar.d;
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(sslPinningEntries, "sslPinningEntries");
        d dVar = cVar.f115421h;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        OkHttpClient.a aVar2 = new OkHttpClient.a();
        ref$ObjectRef.f186409a = aVar2;
        aVar2.a(cVar.f115430t);
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115427q);
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115420g);
        ((OkHttpClient.a) ref$ObjectRef.f186409a).f226076l = cVar.o.a();
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115419c);
        ((OkHttpClient.a) ref$ObjectRef.f186409a).b(cVar.f115417a);
        if (z) {
            Optional optional = cVar.z;
            final s sVar = new s(ref$ObjectRef, 8);
            final int i2 = 0;
            optional.ifPresent(new Consumer() { // from class: dk0.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj3) {
                    switch (i2) {
                        case 0:
                            ((s) sVar).invoke(obj3);
                            break;
                        default:
                            ((s) sVar).invoke(obj3);
                            break;
                    }
                }
            });
            Optional optional2 = cVar.f115433y;
            final s sVar2 = new s(cVar, ref$ObjectRef);
            final int i3 = 1;
            optional2.ifPresent(new Consumer() { // from class: dk0.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj3) {
                    switch (i3) {
                        case 0:
                            ((s) sVar2).invoke(obj3);
                            break;
                        default:
                            ((s) sVar2).invoke(obj3);
                            break;
                    }
                }
            });
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a(dVar);
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115431w);
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.v);
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115423l);
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115422j);
        }
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.k);
        ((a5.a) aVar.getMandatoryInterceptorsProvider()).getClass();
        Iterator it8 = f0.f322471a.iterator();
        while (it8.hasNext()) {
            ((OkHttpClient.a) ref$ObjectRef.f186409a).b((Interceptor) it8.next());
        }
        Iterator it9 = networkInterceptors.iterator();
        while (it9.hasNext()) {
            ((OkHttpClient.a) ref$ObjectRef.f186409a).b((Interceptor) it9.next());
        }
        cVar.f115432x.a((OkHttpClient.a) ref$ObjectRef.f186409a);
        Iterator it10 = interceptors.iterator();
        while (it10.hasNext()) {
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a((Interceptor) it10.next());
        }
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.e);
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f);
        long jLongValue = l2 != null ? l2.longValue() : 20L;
        OkHttpClient.a aVar3 = (OkHttpClient.a) ref$ObjectRef.f186409a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar3.h(jLongValue, timeUnit);
        aVar3.f(jLongValue, timeUnit);
        aVar3.d(jLongValue, timeUnit);
        ref$ObjectRef.f186409a = aVar3;
        q qVar = new q();
        for (fk0.b bVar : sslPinningEntries) {
            String str = bVar.f135704a;
            String[] strArr = (String[]) bVar.f135705b.toArray(new String[0]);
            qVar.a(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String sslHostPattern = aVar.getSslHostPattern();
        String[] strArr2 = (String[]) aVar.getSslPins().toArray(new String[0]);
        qVar.a(sslHostPattern, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        aVar3.c(new t(d0.i1(qVar.f281123a), null));
        if (z && aVar.signRequests()) {
            ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.u);
        }
        ((OkHttpClient.a) ref$ObjectRef.f186409a).a(cVar.f115426p);
        if (aVar.getLogEnabled() && !z3) {
            OkHttpClient.a aVar4 = (OkHttpClient.a) ref$ObjectRef.f186409a;
            Object value = cVar.f115429s.f135703a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            if (!((SharedPreferences) value).getBoolean("PROXY_SETTINGS_ENABLED", false)) {
                cVar.f115424m.a(aVar4);
                aVar4.b(cVar.i);
            }
        }
        ((OkHttpClient.a) ref$ObjectRef.f186409a).b(cVar.f115428r);
        Object obj3 = ref$ObjectRef.f186409a;
        OkHttpClient.a aVar5 = (OkHttpClient.a) obj3;
        ulm.d authenticator = cVar.f115418b;
        aVar5.getClass();
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        aVar5.f226074h = authenticator;
        OkHttpClient.a okHttpClientBuilder = (OkHttpClient.a) ref$ObjectRef.f186409a;
        Intrinsics.checkNotNullParameter(okHttpClientBuilder, "okHttpClientBuilder");
        ArrayList arrayList = okHttpClientBuilder.d;
        Iterator it11 = arrayList.iterator();
        while (true) {
            if (!it11.hasNext()) {
                break;
            }
            Object next = it11.next();
            if (((Interceptor) next) instanceof ek0.a) {
                obj2 = next;
                break;
            }
        }
        if (obj2 == null || (d0.m0(arrayList) instanceof ek0.a)) {
            return new OkHttpClient(okHttpClientBuilder);
        }
        throw new IllegalStateException("ProgressInterceptor should be added in the end to track upload correctly");
    }
}
