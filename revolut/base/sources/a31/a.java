package a31;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.transactions.impl.data.network.TransactionsService;
import efm.d0;
import efm.f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kg.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import mg.i0;
import org.json.JSONObject;
import tof.hc;
import xf.m0;
import xf.q0;
import xf.t0;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements OnSuccessListener, OnFailureListener, OnCanceledListener, kfm.o, z8.a, y, kg.s, f0, sri.c, wif.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f955b;

    public a(bo.c function) {
        this.f954a = 3;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    @Override // sri.c
    public FragmentManager a() {
        FragmentManager supportFragmentManager = ((FragmentActivity) this.f955b).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f954a) {
            case 3:
                return ((bo.c) this.f955b).invoke(obj2);
            case 4:
                return ((c0d.j) this.f955b).invoke(obj2);
            case 9:
                return ((bo.c) this.f955b).invoke(obj2);
            case 11:
                return ((bo.c) this.f955b).invoke(obj2);
            case 14:
                return ((bo.c) this.f955b).invoke(obj2);
            case 15:
                return ((bo.c) this.f955b).invoke(obj2);
            case 17:
                return ((Class) this.f955b).cast(obj2);
            case 26:
                return ((qza.x) this.f955b).invoke(obj2);
            default:
                return ((up5.s) this.f955b).invoke(obj2);
        }
    }

    public t0 b() {
        List listUnmodifiableList;
        q0 q0VarNewBuilder = t0.newBuilder();
        q0VarNewBuilder.l(((Trace) this.f955b).d);
        q0VarNewBuilder.j(((Trace) this.f955b).k.f49592a);
        Trace trace = (Trace) this.f955b;
        q0VarNewBuilder.k(trace.k.b(trace.f49588l));
        for (Counter counter : ((Trace) this.f955b).e.values()) {
            q0VarNewBuilder.i(counter.f49580b.get(), counter.f49579a);
        }
        ArrayList arrayList = ((Trace) this.f955b).f49586h;
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                q0VarNewBuilder.h(new a((Trace) it8.next(), 22).b());
            }
        }
        Map<String, String> attributes = ((Trace) this.f955b).getAttributes();
        q0VarNewBuilder.c();
        ((t0) q0VarNewBuilder.f49761b).getMutableCustomAttributesMap().putAll(attributes);
        Trace trace2 = (Trace) this.f955b;
        synchronized (trace2.f49585g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.f49585g) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        m0[] m0VarArrB = PerfSession.b(listUnmodifiableList);
        if (m0VarArrB != null) {
            List listAsList = Arrays.asList(m0VarArrB);
            q0VarNewBuilder.c();
            ((t0) q0VarNewBuilder.f49761b).addAllPerfSessions(listAsList);
        }
        return (t0) q0VarNewBuilder.a();
    }

    @Override // wif.c
    public d0 c(wif.b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return ((TransactionsService) this.f955b).getTransactionDetails(params.b(), params.c() instanceof hc ? ((hc) params.c()).o1() : null, "UPCOMING_REFUNDS");
    }

    @Override // z8.a
    public Object create() {
        e8.q qVar = (e8.q) this.f955b;
        return new e8.m((e8.r) qVar.f123510c, (gpk.c) qVar.d);
    }

    public Object d(kg.u uVar, Type type) {
        kg.o oVar = ((i0) this.f955b).f205084c;
        oVar.getClass();
        TypeToken<?> typeToken = TypeToken.get(type);
        if (uVar == null) {
            return null;
        }
        return oVar.f(new mg.q(uVar), typeToken);
    }

    public String e(Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        qv9.a aVar = (qv9.a) this.f955b;
        byte[] encoded = key.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        return new String(aVar.b(encoded), Charsets.UTF_8);
    }

    public boolean f() {
        return ((jla.h) ((jla.h) this.f955b)).d(y96.c.f311753c.a(), null) == bla.c.ENABLED;
    }

    public d0 g(List recurringPayments) {
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        d0 list = efm.r.fromIterable(recurringPayments).flatMapSingle(new a05.a(new a0.c(this, 9), 26)).toList();
        Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
        return list;
    }

    public d0 h(qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        vua.a aVarC = recurringPayment.c();
        String code = aVarC != null ? aVarC.getCode() : null;
        if (code != null && code.length() != 0) {
            return new rfm.m(((wl3.h) ((cl3.a) this.f955b)).b(code), new a05.a(new a08.o(this, aVarC, recurringPayment), 27), 1).e(recurringPayment).o();
        }
        ufm.b bVarM = d0.m(recurringPayment);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public InputStream i() {
        InputStream inputStream = (InputStream) this.f955b;
        this.f955b = null;
        return inputStream;
    }

    public ae8.c j() {
        return new ae8.c(bla.b.b((jla.h) this.f955b, y96.b.f311752c.a()), 28);
    }

    public PrivateKey k(String encodedPrivateKey) throws InvalidKeySpecException, NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(encodedPrivateKey, "encodedPrivateKey");
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(((qv9.a) this.f955b).a(encodedPrivateKey));
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        Intrinsics.checkNotNullExpressionValue(keyFactory, "getInstance(...)");
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        Intrinsics.checkNotNullExpressionValue(privateKeyGeneratePrivate, "generatePrivate(...)");
        return privateKeyGeneratePrivate;
    }

    public PublicKey l(String encodedPublicKey) throws InvalidKeySpecException, NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(encodedPublicKey, "encodedPublicKey");
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(((qv9.a) this.f955b).a(encodedPublicKey));
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        Intrinsics.checkNotNullExpressionValue(keyFactory, "getInstance(...)");
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(x509EncodedKeySpec);
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "generatePublic(...)");
        return publicKeyGeneratePublic;
    }

    public JSONObject m() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        try {
            File file = (File) this.f955b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(ie.g.i(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    ie.g.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                } catch (Throwable th10) {
                    th = th10;
                    fileInputStream2 = fileInputStream;
                    ie.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                }
                jSONObject = null;
            }
            ie.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            fileInputStream = null;
        } catch (Throwable th11) {
            th = th11;
        }
    }

    public kg.u n(Object obj2) {
        kg.o oVar = ((i0) this.f955b).f205084c;
        oVar.getClass();
        if (obj2 == null) {
            return kg.v.f183890a;
        }
        Class<?> cls = obj2.getClass();
        mg.s sVar = new mg.s();
        oVar.m(obj2, cls, sVar);
        return sVar.y();
    }

    public kg.u o(Object obj2, Class cls) {
        kg.o oVar = ((i0) this.f955b).f205084c;
        oVar.getClass();
        mg.s sVar = new mg.s();
        oVar.m(obj2, cls, sVar);
        return sVar.y();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f955b).countDown();
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        ((efm.d) this.f955b).onError(th10);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        switch (this.f954a) {
            case 1:
                ((CountDownLatch) this.f955b).countDown();
                break;
            default:
                Intrinsics.checkNotNullParameter(exception, "exception");
                skm.l lVar = (skm.l) this.f955b;
                if (!lVar.y()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "ModuleInstaller", j6.a.q("Failed to install module: ", exception.getMessage()), null, null, 16);
                    m.Companion aVar = yhm.m.INSTANCE;
                    lVar.resumeWith(yhm.o.a(exception));
                }
                break;
        }
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        ((efm.d) this.f955b).onSubscribe(cVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f954a) {
            case 1:
                ((CountDownLatch) this.f955b).countDown();
                break;
            default:
                ((efm.d) this.f955b).onComplete();
                break;
        }
    }

    public pfm.f p(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Set set = (Set) this.f955b;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((vx9.t) it8.next()).a(transactions));
        }
        pfm.f fVarR = efm.b.r(arrayList);
        Intrinsics.checkNotNullExpressionValue(fVarR, "mergeDelayError(...)");
        return fVarR;
    }

    public a(bo.c function, byte b4) {
        this.f954a = 9;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public a(bo.c function, char c2) {
        this.f954a = 11;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public a(bo.c function, int i) {
        this.f954a = 14;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public a(bo.c function, short s2) {
        this.f954a = 15;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public a(c0d.j function) {
        this.f954a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f954a = i;
        this.f955b = obj2;
    }

    public a(qza.x function) {
        this.f954a = 26;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public a(up5.s function) {
        this.f954a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f955b = function;
    }

    public a(SharedPreferences sharedPreferences) {
        this.f954a = 10;
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f955b = sharedPreferences;
    }

    public a(ImmutableSet syncHandlers) {
        this.f954a = 25;
        Intrinsics.checkNotNullParameter(syncHandlers, "syncHandlers");
        this.f955b = syncHandlers;
    }

    public a(TransactionsService transactionsService) {
        this.f954a = 28;
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        this.f955b = transactionsService;
    }

    public a(ne0.j memoryCache) {
        this.f954a = 16;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f955b = memoryCache;
    }

    public a(jla.h productCatalogueInteractor) {
        this.f954a = 23;
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f955b = productCatalogueInteractor;
    }

    public a(FragmentActivity activity) {
        this.f954a = 24;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f955b = activity;
    }

    public a(mlm.j format) {
        this.f954a = 8;
        Intrinsics.checkNotNullParameter(format, "format");
        this.f955b = format;
    }

    public a(cl3.a contactsInteractor) {
        this.f954a = 0;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f955b = contactsInteractor;
    }

    public a(qv9.a base64Wrapper) {
        this.f954a = 21;
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f955b = base64Wrapper;
    }

    public a(phm.a provider) {
        this.f954a = 2;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f955b = provider;
    }

    public a(oe.c cVar) {
        this.f954a = 20;
        this.f955b = new File((File) cVar.f224499c, "com.crashlytics.settings.json");
    }

    public a(int i) {
        this.f954a = i;
        switch (i) {
            case 12:
                break;
            default:
                this.f955b = new CountDownLatch(1);
                break;
        }
    }
}
