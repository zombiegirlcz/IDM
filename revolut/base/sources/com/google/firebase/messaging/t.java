package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import bjl.p0;
import com.google.firebase.messaging.t;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.data.network.GlobalMarketsService;
import com.revolut.feature.wealth.impl.data.network.eodrates.EodRatesService;
import com.revolut.sso.impl.network.services.SignOutService;
import ecm.b1;
import ecm.c1;
import ecm.q;
import efm.d0;
import gcm.b3;
import gcm.g6;
import gcm.k3;
import gcm.z5;
import ip0.v7;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import no.f2;
import org.bouncycastle.asn1.BERTags;
import s77.m;
import t73.y2;
import t73.z2;
import uo.r0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class t implements wc.n {
    public static t f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f49543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f49544c;
    public Object d;
    public Object e;

    public /* synthetic */ t(int i, boolean z) {
        this.f49542a = i;
    }

    public static synchronized t h() {
        try {
            if (f == null) {
                f = new t(0);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f;
    }

    public synchronized void a(c8.g gVar, e8.z zVar) {
        e8.b bVar = (e8.b) ((HashMap) this.f49544c).put(gVar, new e8.b(gVar, zVar, (ReferenceQueue) this.d));
        if (bVar != null) {
            bVar.a();
        }
    }

    public void b(e8.b bVar) {
        e8.e0 e0Var;
        synchronized (this) {
            ((HashMap) this.f49544c).remove(bVar.f123433a);
            if (bVar.f123434b && (e0Var = bVar.f123435c) != null) {
                ((e8.s) this.e).e(bVar.f123433a, new e8.z(e0Var, true, false, bVar.f123433a, (e8.s) this.e));
            }
        }
    }

    public HashSet c() {
        String[] list = ((oj.a) this.f49543b).f225708a.list();
        if (list == null) {
            list = oj.a.f225707c;
        }
        HashSet hashSet = new HashSet();
        for (String str : list) {
            hashSet.add(((lj.c) this.d).d(str));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #1 {Exception -> 0x009e, blocks: (B:38:0x0096, B:40:0x009b), top: B:45:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qj.a d(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            lj.c r0 = (lj.c) r0
            java.lang.String r0 = r0.j(r11)
            java.lang.Object r1 = r10.f49543b
            oj.a r1 = (oj.a) r1
            java.io.File r2 = new java.io.File
            java.io.File r3 = r1.f225709b
            java.lang.String r4 = ".bak"
            java.lang.String r4 = a0.d.r(r0, r4)
            r2.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.io.File r1 = r1.f225708a
            r3.<init>(r1, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L43
            boolean r0 = r3.exists()
            if (r0 != 0) goto L2d
            goto L30
        L2d:
            r3.delete()
        L30:
            boolean r0 = r2.exists()
            if (r0 != 0) goto L37
            goto L43
        L37:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L40
            r3.delete()
        L40:
            r2.renameTo(r3)
        L43:
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.lang.String r0 = "r"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8b
            java.nio.channels.FileChannel r4 = r2.getChannel()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L84
            long r0 = r2.length()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            r6 = 0
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            java.nio.MappedByteBuffer r1 = r4.map(r5, r6, r8)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            r1.get(r0)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7c
            r2.close()     // Catch: java.lang.Exception -> L69
            r4.close()     // Catch: java.lang.Exception -> L69
        L69:
            java.lang.Object r1 = r10.e
            lj.e r1 = (lj.e) r1
            byte[] r0 = r1.b(r0)
            qj.a r1 = new qj.a
            r2 = 1
            r1.<init>(r2, r11, r0)
            return r1
        L78:
            r0 = move-exception
            r11 = r0
        L7a:
            r1 = r2
            goto L94
        L7c:
            r0 = move-exception
            r11 = r0
            r1 = r4
            goto L8e
        L80:
            r0 = move-exception
            r11 = r0
            r4 = r1
            goto L7a
        L84:
            r0 = move-exception
            r11 = r0
            goto L8e
        L87:
            r0 = move-exception
            r11 = r0
            r4 = r1
            goto L94
        L8b:
            r0 = move-exception
            r11 = r0
            r2 = r1
        L8e:
            com.ironz.binaryprefs.exception.FileOperationException r0 = new com.ironz.binaryprefs.exception.FileOperationException     // Catch: java.lang.Throwable -> L80
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L80
        L94:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.lang.Exception -> L9e
        L99:
            if (r4 == 0) goto L9e
            r4.close()     // Catch: java.lang.Exception -> L9e
        L9e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.t.d(java.lang.String):qj.a");
    }

    public tm.g e(Function0 completable) {
        Intrinsics.checkNotNullParameter(completable, "completable");
        return f(new ac1.b(19, completable));
    }

    public tm.g f(Function1 completable) {
        Intrinsics.checkNotNullParameter(completable, "completable");
        return new tm.g(new tm.a(0, completable), (ifm.b) this.e, (ym.d) this.f49544c, (um.c) this.d, (cn.e) this.f49543b);
    }

    public tm.g g(Function1 single) {
        Intrinsics.checkNotNullParameter(single, "single");
        return new tm.g(single, (ifm.b) this.e, (ym.d) this.f49544c, (um.c) this.d, (cn.e) this.f49543b);
    }

    public cfm.b i(String str) {
        if (!((ConcurrentHashMap) this.e).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.e).containsKey(str)) {
                        try {
                            InputStream inputStreamC = ((yem.b) this.f49543b).c(str);
                            ((bfm.b) this.f49544c).getClass();
                            for (yem.k kVar : bfm.b.a(inputStreamC)) {
                                ao.h hVar = (ao.h) this.d;
                                cpi.g gVar = (cpi.g) hVar.f7848c;
                                if (z92.f.r((String) ((cfm.a) gVar.f107955c).d(kVar))) {
                                    gVar.f(kVar);
                                } else {
                                    ((cpi.g) hVar.f7847b).f(kVar);
                                }
                            }
                            ((ConcurrentHashMap) this.e).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file " + str, e);
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        return (ao.h) this.d;
    }

    public boolean j(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (((Boolean) this.f49544c).booleanValue() || Log.isLoggable("FirebaseMessaging", 3)) {
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean k(Context context) {
        if (((Boolean) this.f49544c) == null) {
            this.f49544c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (((Boolean) this.f49544c).booleanValue() || Log.isLoggable("FirebaseMessaging", 3)) {
        }
        return ((Boolean) this.f49544c).booleanValue();
    }

    public efm.r l(Object params) {
        Intrinsics.checkNotNullParameter(params, "params");
        efm.r rVarStartWith = ((ne0.k) this.e).a(params).map(new w38.w(6, xx4.a.f309395a)).startWith(new Data(((Function1) this.f49544c).invoke(params), null, true, 2, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return ue0.e.H(rVarStartWith, h0.f322473a, new xub.e(22));
    }

    public void m() {
        ((Lock) this.f49544c).unlock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (((android.content.res.XmlResourceParser) r0.f124861b).getName().equals("manifest") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r5 = ((android.content.res.XmlResourceParser) r0.f124861b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r6 = ((android.content.res.XmlResourceParser) r0.f124861b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r5 = java.lang.Integer.parseInt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r6 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r5 = (((long) java.lang.Integer.parseInt(r6)) << 32) | (((long) r5) & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(j6.a.q("Couldn't parse versionCodeMajor to int: ", r13.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(j6.a.q("Couldn't parse versionCode to int: ", r13.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(java.io.File[] r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.t.n(java.io.File[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        r0 = "Downloaded split " + r6 + " is not signed.";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(java.io.File[] r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.t.o(java.io.File[]):boolean");
    }

    @Override // wc.n
    public Object zza() {
        switch (this.f49542a) {
            case 19:
                return new vc.d((vc.i) ((wc.n) this.f49543b).zza(), (vc.t) ((wc.n) this.f49544c).zza(), (vc.r) ((wc.n) this.d).zza(), (vc.k) ((wc.n) this.e).zza());
            default:
                return new yc.a(((r8.o) ((qm.e) this.f49543b).f247740b).f252294a, (File) ((wc.n) this.f49544c).zza(), (vc.r) ((wc.n) this.d).zza(), wc.l.a((yf.c) this.e));
        }
    }

    public /* synthetic */ t(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f49542a = i;
        this.f49543b = obj2;
        this.f49544c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public t(Context context, uc.c cVar) {
        this.f49542a = 20;
        ecm.q qVar = new ecm.q(29, false);
        this.f49543b = cVar;
        this.f49544c = context;
        this.d = qVar;
    }

    public t(mp.r accessibilityProvider, go.h themingProvider, gpk.c permissionsProvider, r0 extensionsProvider) {
        this.f49542a = 12;
        Intrinsics.checkNotNullParameter(accessibilityProvider, "accessibilityProvider");
        Intrinsics.checkNotNullParameter(themingProvider, "themingProvider");
        Intrinsics.checkNotNullParameter(permissionsProvider, "permissionsProvider");
        Intrinsics.checkNotNullParameter(extensionsProvider, "extensionsProvider");
        this.f49543b = accessibilityProvider;
        this.f49544c = themingProvider;
        this.d = permissionsProvider;
        this.e = extensionsProvider;
    }

    public t(Function1 fromStorage, Function1 fromMemory, Function2 toMemory) {
        this.f49542a = 21;
        Intrinsics.checkNotNullParameter(fromStorage, "fromStorage");
        Intrinsics.checkNotNullParameter(fromMemory, "fromMemory");
        Intrinsics.checkNotNullParameter(toMemory, "toMemory");
        this.f49543b = fromStorage;
        this.f49544c = fromMemory;
        this.d = toMemory;
        this.e = new ne0.k(new f2(this, 26), null);
    }

    public t(SignOutService signOutService, uil.a revolutAccountsManager, p0 dependenciesProvider, jn0.d signatureInteractor) {
        this.f49542a = 1;
        Intrinsics.checkNotNullParameter(signOutService, "signOutService");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(signatureInteractor, "signatureInteractor");
        this.f49543b = signOutService;
        this.f49544c = revolutAccountsManager;
        this.d = dependenciesProvider;
        this.e = signatureInteractor;
    }

    public t(cn.e actionResultDispatcher, ym.d loadingDispatcher, um.c errorsDispatcher, ifm.b compositeDisposable) {
        this.f49542a = 18;
        Intrinsics.checkNotNullParameter(actionResultDispatcher, "actionResultDispatcher");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(errorsDispatcher, "errorsDispatcher");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f49543b = actionResultDispatcher;
        this.f49544c = loadingDispatcher;
        this.d = errorsDispatcher;
        this.e = compositeDisposable;
    }

    public t(GlobalMarketsService service, n77.d dao, a31.a cache, b80.c networkStateRepository) {
        this.f49542a = 16;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f49543b = service;
        this.f49544c = dao;
        this.d = cache;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: t77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268589b;

            {
                this.f268589b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String ref2 = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        d0<m> indexDetails = ((GlobalMarketsService) this.f268589b.f49543b).getIndexDetails(ref2);
                        z2 z2Var = new z2(new y2(12), 7);
                        indexDetails.getClass();
                        ufm.i iVar = new ufm.i(indexDetails, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        a31.a aVar = (a31.a) this.f268589b.d;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(ref2, "symbol");
                        return (k77.i) v7.r("index_details_", ref2, (j) aVar.f955b);
                    default:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        n77.f fVarA = ((n77.d) this.f268589b.f49544c).a(ref2);
                        if (fVarA != null) {
                            return boh.f.y(fVarA);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: t77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268589b;

            {
                this.f268589b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String ref2 = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        d0<m> indexDetails = ((GlobalMarketsService) this.f268589b.f49543b).getIndexDetails(ref2);
                        z2 z2Var = new z2(new y2(12), 7);
                        indexDetails.getClass();
                        ufm.i iVar = new ufm.i(indexDetails, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        a31.a aVar = (a31.a) this.f268589b.d;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(ref2, "symbol");
                        return (k77.i) v7.r("index_details_", ref2, (j) aVar.f955b);
                    default:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        n77.f fVarA = ((n77.d) this.f268589b.f49544c).a(ref2);
                        if (fVarA != null) {
                            return boh.f.y(fVarA);
                        }
                        return null;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: t77.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268591b;

            {
                this.f268591b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String symbol = (String) obj2;
                k77.i indexDetails = (k77.i) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(symbol, "ref");
                        Intrinsics.checkNotNullParameter(indexDetails, "indexDetails");
                        a31.a aVar = (a31.a) this.f268591b.d;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        Intrinsics.checkNotNullParameter(indexDetails, "indexDetails");
                        ((j) aVar.f955b).f("index_details_" + symbol, indexDetails);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(symbol, "<unused var>");
                        Intrinsics.checkNotNullParameter(indexDetails, "assets");
                        ((n77.d) this.f268591b.f49544c).b(boh.f.F(indexDetails));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: t77.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268589b;

            {
                this.f268589b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String ref2 = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        d0<m> indexDetails = ((GlobalMarketsService) this.f268589b.f49543b).getIndexDetails(ref2);
                        z2 z2Var = new z2(new y2(12), 7);
                        indexDetails.getClass();
                        ufm.i iVar = new ufm.i(indexDetails, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        a31.a aVar = (a31.a) this.f268589b.d;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(ref2, "symbol");
                        return (k77.i) v7.r("index_details_", ref2, (j) aVar.f955b);
                    default:
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        n77.f fVarA = ((n77.d) this.f268589b.f49544c).a(ref2);
                        if (fVarA != null) {
                            return boh.f.y(fVarA);
                        }
                        return null;
                }
            }
        };
        final int i6 = 1;
        this.e = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: t77.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268591b;

            {
                this.f268591b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String symbol = (String) obj2;
                k77.i indexDetails = (k77.i) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(symbol, "ref");
                        Intrinsics.checkNotNullParameter(indexDetails, "indexDetails");
                        a31.a aVar = (a31.a) this.f268591b.d;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        Intrinsics.checkNotNullParameter(indexDetails, "indexDetails");
                        ((j) aVar.f955b).f("index_details_" + symbol, indexDetails);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(symbol, "<unused var>");
                        Intrinsics.checkNotNullParameter(indexDetails, "assets");
                        ((n77.d) this.f268591b.f49544c).b(boh.f.F(indexDetails));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public t(GlobalMarketsService service, n77.i dao, ecm.q cache, b80.c networkStateRepository) {
        this.f49542a = 17;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f49543b = service;
        this.f49544c = dao;
        this.d = cache;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: t77.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268593b;

            {
                this.f268593b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<s77.t> marketAssets = ((GlobalMarketsService) this.f268593b.f49543b).getMarketAssets();
                        z2 z2Var = new z2(new y2(13), 8);
                        marketAssets.getClass();
                        ufm.i iVar = new ufm.i(marketAssets, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) ((j) ((q) this.f268593b.d).f124861b).get("market_assets");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ArrayList arrayListA = r77.b.a(((n77.i) this.f268593b.f49544c).a());
                        if (arrayListA.isEmpty()) {
                            return null;
                        }
                        return arrayListA;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: t77.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268593b;

            {
                this.f268593b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<s77.t> marketAssets = ((GlobalMarketsService) this.f268593b.f49543b).getMarketAssets();
                        z2 z2Var = new z2(new y2(13), 8);
                        marketAssets.getClass();
                        ufm.i iVar = new ufm.i(marketAssets, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) ((j) ((q) this.f268593b.d).f124861b).get("market_assets");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ArrayList arrayListA = r77.b.a(((n77.i) this.f268593b.f49544c).a());
                        if (arrayListA.isEmpty()) {
                            return null;
                        }
                        return arrayListA;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: t77.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268595b;

            {
                this.f268595b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                List marketAssets = (List) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(marketAssets, "assets");
                        q qVar = (q) this.f268595b.d;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(marketAssets, "marketAssets");
                        ((j) qVar.f124861b).f("market_assets", marketAssets);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(marketAssets, "assets");
                        ((n77.i) this.f268595b.f49544c).c(r77.b.b(marketAssets));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: t77.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268593b;

            {
                this.f268593b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<s77.t> marketAssets = ((GlobalMarketsService) this.f268593b.f49543b).getMarketAssets();
                        z2 z2Var = new z2(new y2(13), 8);
                        marketAssets.getClass();
                        ufm.i iVar = new ufm.i(marketAssets, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) ((j) ((q) this.f268593b.d).f124861b).get("market_assets");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ArrayList arrayListA = r77.b.a(((n77.i) this.f268593b.f49544c).a());
                        if (arrayListA.isEmpty()) {
                            return null;
                        }
                        return arrayListA;
                }
            }
        };
        final int i6 = 1;
        this.e = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: t77.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f268595b;

            {
                this.f268595b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                List marketAssets = (List) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(marketAssets, "assets");
                        q qVar = (q) this.f268595b.d;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(marketAssets, "marketAssets");
                        ((j) qVar.f124861b).f("market_assets", marketAssets);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(marketAssets, "assets");
                        ((n77.i) this.f268595b.f49544c).c(r77.b.b(marketAssets));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public t(EodRatesService eodRatesService, i8h.c eodRatesStorage, a7h.b eodRatesCache) {
        this.f49542a = 7;
        Intrinsics.checkNotNullParameter(eodRatesService, "eodRatesService");
        Intrinsics.checkNotNullParameter(eodRatesStorage, "eodRatesStorage");
        Intrinsics.checkNotNullParameter(eodRatesCache, "eodRatesCache");
        this.f49543b = eodRatesService;
        this.f49544c = eodRatesStorage;
        this.d = eodRatesCache;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: e8h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.messaging.t f123689b;

            {
                this.f123689b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        i8h.c cVar = (i8h.c) this.f123689b.f49544c;
                        b9h.a params = (b9h.a) obj2;
                        List<xzg.p> content = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(content, "content");
                        for (xzg.p pVar : content) {
                            Pair params2 = new Pair(kotlin.jvm.internal.s.l(pVar), params);
                            i8h.a value = mif.e0.K(pVar);
                            Intrinsics.checkNotNullParameter(params2, "params");
                            Intrinsics.checkNotNullParameter(value, "value");
                            cVar.f159540a.G(value, foh.i.c("EodRatesStorage", params2), wim.z.d(kotlin.jvm.internal.o0.b(i8h.a.class)));
                        }
                        LinkedHashSet validKeyDates = foh.i.M(params);
                        Intrinsics.checkNotNullParameter(validKeyDates, "validKeyDates");
                        ue0.c cVar2 = cVar.f159540a;
                        nkm.g gVar = new nkm.g(nkm.y.o(nkm.y.n(zhm.d0.Q(cVar2.keys()), new i6j.p(15)), new an9.t(validKeyDates, 8)));
                        while (gVar.hasNext()) {
                            cVar2.I0((String) gVar.next());
                        }
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b9h.a params3 = (b9h.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List listA = params3.a();
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = listA.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            com.google.firebase.messaging.t tVar = this.f123689b;
                            if (!zHasNext) {
                                Map mapT = zhm.r0.t(arrayList);
                                ufm.c cVar3 = new ufm.c(new a9j.k(zhm.d0.B0(params3.a(), mapT.keySet()), 8, tVar, params3), 2);
                                Intrinsics.checkNotNullExpressionValue(cVar3, "let(...)");
                                ufm.i iVar = new ufm.i(cVar3, new c(4, new d27.g0(params3, 26, mapT, tVar)), 0);
                                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                return iVar;
                            }
                            Pair pair = (Pair) it8.next();
                            a7h.b bVar = (a7h.b) tVar.d;
                            Pair params4 = new Pair(pair, params3);
                            Intrinsics.checkNotNullParameter(params4, "params");
                            xzg.p pVar2 = (xzg.p) bVar.f1906a.get(foh.i.c("EodRatesCache", params4));
                            Pair pair2 = pVar2 != null ? new Pair(pair, pVar2) : null;
                            if (pair2 != null) {
                                arrayList.add(pair2);
                            }
                        }
                        break;
                    default:
                        b9h.a params5 = (b9h.a) obj2;
                        List content2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(content2, "content");
                        List<xzg.p> list = content2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.p value2 : list) {
                            a7h.b bVar2 = (a7h.b) this.f123689b.d;
                            Pair params6 = new Pair(kotlin.jvm.internal.s.l(value2), params5);
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(params6, "params");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            bVar2.f1906a.f(foh.i.c("EodRatesCache", params6), value2);
                            arrayList2.add(Unit.f186387a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: e8h.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.messaging.t f123685b;

            {
                this.f123685b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                b9h.a params = (b9h.a) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<Pair> listA = params.a();
                        ArrayList arrayList = new ArrayList();
                        for (Pair pair : listA) {
                            i8h.c cVar = (i8h.c) this.f123685b.f49544c;
                            Pair params2 = new Pair(pair, params);
                            Intrinsics.checkNotNullParameter(params2, "params");
                            i8h.a aVar = (i8h.a) yh5.b.u(cVar.f159540a, foh.i.c("EodRatesStorage", params2), i8h.c.f159539b);
                            xzg.p pVarH = aVar != null ? mif.e0.H(aVar) : null;
                            if (pVarH != null) {
                                arrayList.add(pVarH);
                            }
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<Pair> listA2 = params.a();
                        ArrayList arrayList2 = new ArrayList();
                        for (Pair pair2 : listA2) {
                            a7h.b bVar = (a7h.b) this.f123685b.d;
                            Pair params3 = new Pair(pair2, params);
                            Intrinsics.checkNotNullParameter(params3, "params");
                            xzg.p pVar = (xzg.p) bVar.f1906a.get(foh.i.c("EodRatesCache", params3));
                            if (pVar != null) {
                                arrayList2.add(pVar);
                            }
                        }
                        return arrayList2;
                }
            }
        };
        final int i2 = 2;
        Function2 function22 = new Function2(this) { // from class: e8h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.messaging.t f123689b;

            {
                this.f123689b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        i8h.c cVar = (i8h.c) this.f123689b.f49544c;
                        b9h.a params = (b9h.a) obj2;
                        List<xzg.p> content = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(content, "content");
                        for (xzg.p pVar : content) {
                            Pair params2 = new Pair(kotlin.jvm.internal.s.l(pVar), params);
                            i8h.a value = mif.e0.K(pVar);
                            Intrinsics.checkNotNullParameter(params2, "params");
                            Intrinsics.checkNotNullParameter(value, "value");
                            cVar.f159540a.G(value, foh.i.c("EodRatesStorage", params2), wim.z.d(kotlin.jvm.internal.o0.b(i8h.a.class)));
                        }
                        LinkedHashSet validKeyDates = foh.i.M(params);
                        Intrinsics.checkNotNullParameter(validKeyDates, "validKeyDates");
                        ue0.c cVar2 = cVar.f159540a;
                        nkm.g gVar = new nkm.g(nkm.y.o(nkm.y.n(zhm.d0.Q(cVar2.keys()), new i6j.p(15)), new an9.t(validKeyDates, 8)));
                        while (gVar.hasNext()) {
                            cVar2.I0((String) gVar.next());
                        }
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b9h.a params3 = (b9h.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List listA = params3.a();
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = listA.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            com.google.firebase.messaging.t tVar = this.f123689b;
                            if (!zHasNext) {
                                Map mapT = zhm.r0.t(arrayList);
                                ufm.c cVar3 = new ufm.c(new a9j.k(zhm.d0.B0(params3.a(), mapT.keySet()), 8, tVar, params3), 2);
                                Intrinsics.checkNotNullExpressionValue(cVar3, "let(...)");
                                ufm.i iVar = new ufm.i(cVar3, new c(4, new d27.g0(params3, 26, mapT, tVar)), 0);
                                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                return iVar;
                            }
                            Pair pair = (Pair) it8.next();
                            a7h.b bVar = (a7h.b) tVar.d;
                            Pair params4 = new Pair(pair, params3);
                            Intrinsics.checkNotNullParameter(params4, "params");
                            xzg.p pVar2 = (xzg.p) bVar.f1906a.get(foh.i.c("EodRatesCache", params4));
                            Pair pair2 = pVar2 != null ? new Pair(pair, pVar2) : null;
                            if (pair2 != null) {
                                arrayList.add(pair2);
                            }
                        }
                        break;
                    default:
                        b9h.a params5 = (b9h.a) obj2;
                        List content2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(content2, "content");
                        List<xzg.p> list = content2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.p value2 : list) {
                            a7h.b bVar2 = (a7h.b) this.f123689b.d;
                            Pair params6 = new Pair(kotlin.jvm.internal.s.l(value2), params5);
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(params6, "params");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            bVar2.f1906a.f(foh.i.c("EodRatesCache", params6), value2);
                            arrayList2.add(Unit.f186387a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 0;
        this.e = new w4l.f(function2, function1, function22, new Function1(this) { // from class: e8h.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.messaging.t f123685b;

            {
                this.f123685b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                b9h.a params = (b9h.a) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<Pair> listA = params.a();
                        ArrayList arrayList = new ArrayList();
                        for (Pair pair : listA) {
                            i8h.c cVar = (i8h.c) this.f123685b.f49544c;
                            Pair params2 = new Pair(pair, params);
                            Intrinsics.checkNotNullParameter(params2, "params");
                            i8h.a aVar = (i8h.a) yh5.b.u(cVar.f159540a, foh.i.c("EodRatesStorage", params2), i8h.c.f159539b);
                            xzg.p pVarH = aVar != null ? mif.e0.H(aVar) : null;
                            if (pVarH != null) {
                                arrayList.add(pVarH);
                            }
                        }
                        return arrayList;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List<Pair> listA2 = params.a();
                        ArrayList arrayList2 = new ArrayList();
                        for (Pair pair2 : listA2) {
                            a7h.b bVar = (a7h.b) this.f123685b.d;
                            Pair params3 = new Pair(pair2, params);
                            Intrinsics.checkNotNullParameter(params3, "params");
                            xzg.p pVar = (xzg.p) bVar.f1906a.get(foh.i.c("EodRatesCache", params3));
                            if (pVar != null) {
                                arrayList2.add(pVar);
                            }
                        }
                        return arrayList2;
                }
            }
        }, new Function2(this) { // from class: e8h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.messaging.t f123689b;

            {
                this.f123689b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        i8h.c cVar = (i8h.c) this.f123689b.f49544c;
                        b9h.a params = (b9h.a) obj2;
                        List<xzg.p> content = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(content, "content");
                        for (xzg.p pVar : content) {
                            Pair params2 = new Pair(kotlin.jvm.internal.s.l(pVar), params);
                            i8h.a value = mif.e0.K(pVar);
                            Intrinsics.checkNotNullParameter(params2, "params");
                            Intrinsics.checkNotNullParameter(value, "value");
                            cVar.f159540a.G(value, foh.i.c("EodRatesStorage", params2), wim.z.d(kotlin.jvm.internal.o0.b(i8h.a.class)));
                        }
                        LinkedHashSet validKeyDates = foh.i.M(params);
                        Intrinsics.checkNotNullParameter(validKeyDates, "validKeyDates");
                        ue0.c cVar2 = cVar.f159540a;
                        nkm.g gVar = new nkm.g(nkm.y.o(nkm.y.n(zhm.d0.Q(cVar2.keys()), new i6j.p(15)), new an9.t(validKeyDates, 8)));
                        while (gVar.hasNext()) {
                            cVar2.I0((String) gVar.next());
                        }
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b9h.a params3 = (b9h.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        List listA = params3.a();
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = listA.iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            com.google.firebase.messaging.t tVar = this.f123689b;
                            if (!zHasNext) {
                                Map mapT = zhm.r0.t(arrayList);
                                ufm.c cVar3 = new ufm.c(new a9j.k(zhm.d0.B0(params3.a(), mapT.keySet()), 8, tVar, params3), 2);
                                Intrinsics.checkNotNullExpressionValue(cVar3, "let(...)");
                                ufm.i iVar = new ufm.i(cVar3, new c(4, new d27.g0(params3, 26, mapT, tVar)), 0);
                                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                return iVar;
                            }
                            Pair pair = (Pair) it8.next();
                            a7h.b bVar = (a7h.b) tVar.d;
                            Pair params4 = new Pair(pair, params3);
                            Intrinsics.checkNotNullParameter(params4, "params");
                            xzg.p pVar2 = (xzg.p) bVar.f1906a.get(foh.i.c("EodRatesCache", params4));
                            Pair pair2 = pVar2 != null ? new Pair(pair, pVar2) : null;
                            if (pair2 != null) {
                                arrayList.add(pair2);
                            }
                        }
                        break;
                    default:
                        b9h.a params5 = (b9h.a) obj2;
                        List content2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(content2, "content");
                        List<xzg.p> list = content2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                        for (xzg.p value2 : list) {
                            a7h.b bVar2 = (a7h.b) this.f123689b.d;
                            Pair params6 = new Pair(kotlin.jvm.internal.s.l(value2), params5);
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(params6, "params");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            bVar2.f1906a.f(foh.i.c("EodRatesCache", params6), value2);
                            arrayList2.add(Unit.f186387a);
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public t(oj.a aVar, ao.h hVar, lj.c cVar, lj.e eVar) {
        this.f49542a = 14;
        this.f49543b = aVar;
        this.f49544c = (Lock) hVar.f7848c;
        this.e = eVar;
        this.d = cVar;
    }

    public t(yem.b bVar, bfm.b bVar2, ao.h hVar) {
        this.f49542a = 4;
        this.f49543b = bVar;
        this.f49544c = bVar2;
        this.d = hVar;
        this.e = new ConcurrentHashMap();
    }

    public t(gcm.k kVar, b3 b3Var) {
        this.f49542a = 9;
        this.e = kVar;
        this.f49543b = b3Var;
        c1 c1Var = kVar.f142702a;
        String str = kVar.f142703b;
        b1 b1VarB = c1Var.b(str);
        this.d = b1VarB;
        if (b1VarB != null) {
            this.f49544c = b1VarB.a(b3Var);
            return;
        }
        throw new IllegalStateException(p.a.p("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
    }

    public t(int i) {
        this.f49542a = i;
        switch (i) {
            case 6:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new e8.a(0));
                this.f49544c = new HashMap();
                this.d = new ReferenceQueue();
                this.f49543b = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new com.bumptech.glide.k(this, 1));
                break;
            case 10:
                this.f49544c = z5.l();
                this.d = z5.l();
                this.e = z5.l();
                this.f49543b = g6.f142663a;
                break;
            default:
                this.f49543b = null;
                this.f49544c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public t(k3 k3Var) {
        this.f49542a = 11;
        this.e = k3Var;
        this.f49543b = new Object();
        this.f49544c = new HashSet();
    }
}
