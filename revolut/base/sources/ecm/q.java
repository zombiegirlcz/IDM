package ecm;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.io.BaseEncoding;
import com.google.gson.reflect.TypeToken;
import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.push_to_card.impl.data.network.PushToCardAddCardService;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements z8.a, OnCompleteListener, kfm.o, c8.d, kz0.b, efm.l, so.b, sri.f, wc.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q f124859c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f124861b;

    public /* synthetic */ q(int i, boolean z) {
        this.f124860a = i;
    }

    public static synchronized q d() {
        try {
            if (f124859c == null) {
                q qVar = new q(0, false);
                qVar.f124861b = Collections.EMPTY_LIST;
                f124859c = qVar;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f124859c;
    }

    public static final int q(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) hb9.b.K(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        p.a.z(iIntValue, "addAssetPath completed with ", "SplitCompat");
        return iIntValue;
    }

    @Override // kz0.b
    public kz0.a a(long j2) {
        return new kz0.i((Activity) this.f124861b, j2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f124860a) {
            case 11:
                break;
            case 16:
                break;
        }
        return ((bo.c) this.f124861b).invoke(obj2);
    }

    @Override // sri.f
    public boolean b() {
        return false;
    }

    public boolean c(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((SharedPreferences) this.f124861b).getBoolean(key, z);
    }

    @Override // z8.a
    public Object create() {
        oe.c cVar = (oe.c) this.f124861b;
        return new e8.v((h8.e) cVar.f224497a, (h8.e) cVar.f224498b, (h8.e) cVar.f224499c, (h8.e) cVar.d, (e8.s) cVar.e, (e8.s) cVar.f, (gpk.c) cVar.f224500g);
    }

    @Override // sri.f
    public Fragment e(String className, ClassLoader classLoader, String str) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        Fragment fragmentInstantiate = ((FragmentFactory) this.f124861b).instantiate(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "instantiate(...)");
        return fragmentInstantiate;
    }

    public Object f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(String.class, "clazz");
        String string = ((SharedPreferences) this.f124861b).getString(key, null);
        if (string == null) {
            return null;
        }
        kg.o oVarA = GsonHolder.a();
        Type type = new TypeToken<Object>() { // from class: com.revolut.feature.retail.prefs.impl.RetailPreferencesInteractorImpl$getObject$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(string, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return objD;
    }

    public void g(String tag2, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        if (i() && (throwable instanceof FailFastAnalyticsException)) {
            throw throwable;
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, tag2, String.valueOf(throwable.getMessage()), throwable, h0Var);
    }

    @Override // c8.d
    public boolean h(Object obj2, File file, c8.k kVar) throws Throwable {
        InputStream inputStream = (InputStream) obj2;
        f8.f fVar = (f8.f) this.f124861b;
        byte[] bArr = (byte[]) fVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        fVar.g(bArr);
                        return false;
                    } catch (Throwable th10) {
                        th = th10;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        fVar.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                fVar.g(bArr);
                return true;
            } catch (IOException e2) {
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    public boolean i() {
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.e() || od0.a.i()) {
            return false;
        }
        return ((jte.d) ((com.revolut.retail.analytics.tracking.impl.a) this.f124861b).f98545a).c(AnalyticsFeatureToggles.AnalyticsFailFast.f98541a);
    }

    public ufm.n j(String firstNineDigits, bqa.a transferPurpose, wpa.a aVar) {
        Intrinsics.checkNotNullParameter(firstNineDigits, "firstNineDigits");
        Intrinsics.checkNotNullParameter(transferPurpose, "transferPurpose");
        efm.d0<lqa.t> eligibility = ((PushToCardAddCardService) this.f124861b).getEligibility(new mqa.c(firstNineDigits, transferPurpose.name(), aVar != null ? aVar.name() : null));
        hp5.b bVar = new hp5.b(new hp3.r(this, 27), 13);
        eligibility.getClass();
        ufm.i iVar = new ufm.i(eligibility, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public vkm.d k(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.f124861b;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(((w4l.f) tVar.e).e(ref2, loadingStrategy));
    }

    public void l(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((SharedPreferences) this.f124861b).edit().putBoolean(key, z).commit();
    }

    public ux4.b m(rx4.b agreements, String loanId) {
        Intrinsics.checkNotNullParameter(agreements, "agreements");
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        return tx4.a.a(agreements, new c55.b(((ij0.a) this.f124861b).getBaseUrl(), loanId, 0));
    }

    public void n(m1 m1Var, byte[] bArr) {
        dfm.b.c();
        try {
            String str = "/" + ((hcm.p) this.f124861b).f151301j.f124857b;
            if (bArr != null) {
                ((hcm.p) this.f124861b).f151306q = true;
                str = str + "?" + BaseEncoding.base64().encode(bArr);
            }
            synchronized (((hcm.p) this.f124861b).f151304n.f151298x) {
                hcm.o.j(((hcm.p) this.f124861b).f151304n, m1Var, str);
            }
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public synchronized void o(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            q(assets, (File) it8.next());
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it8) {
        switch (this.f124860a) {
            case 6:
                Intrinsics.checkNotNullParameter(it8, "it");
                ei0.g gVar = (ei0.g) this.f124861b;
                ei0.e eVar = gVar.f126341b;
                if (eVar != null) {
                    ((ModuleInstallClient) gVar.f126340a.getValue()).unregisterListener(eVar);
                }
                gVar.f126341b = null;
                break;
            default:
                rfm.c cVar = (rfm.c) this.f124861b;
                Intrinsics.checkNotNullParameter(it8, "task");
                try {
                    Object objS = rd0.e.s(it8);
                    if (objS != null) {
                        cVar.a(objS);
                    } else {
                        cVar.onComplete();
                    }
                } catch (Exception e) {
                    if (cVar.isDisposed() || cVar.b(e)) {
                        return;
                    }
                    mo3.a.m(e);
                    return;
                }
                break;
        }
    }

    @Override // efm.l
    public void onError(Throwable th10) {
        ((efm.l) ((rfm.b) this.f124861b).f253917b).onError(th10);
    }

    @Override // efm.l
    public void onSubscribe(ifm.c cVar) {
        lfm.d.e((rfm.b) this.f124861b, cVar);
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        ((efm.l) ((rfm.b) this.f124861b).f253917b).onSuccess(obj2);
    }

    @Override // wc.n
    public Object zza() {
        vc.t tVarB = vc.t.b(((r8.o) this.f124861b).f252294a);
        if (tVarB != null) {
            return tVarB;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public q(bo.c function) {
        this.f124860a = 11;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f124861b = function;
    }

    public q(bo.c function, byte b4) {
        this.f124860a = 16;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f124861b = function;
    }

    public q(bo.c function, char c2) {
        this.f124860a = 21;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f124861b = function;
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f124860a = i;
        this.f124861b = obj2;
    }

    public /* synthetic */ q(r8.o oVar) {
        this.f124860a = 27;
        qm.e eVar = new qm.e(oVar, 7);
        wc.n nVarB = wc.l.b(new vc.j(eVar));
        wc.n nVarB2 = wc.l.b(new q(oVar, 26));
        wc.n nVarB3 = wc.l.b(new qm.e(eVar, 9));
        wc.n nVarB4 = wc.l.b(new com.google.firebase.messaging.t(nVarB, nVarB2, nVarB3, wc.l.b(new vc.e(eVar, 1)), 19));
        wc.n nVarB5 = wc.l.b(new vc.e(eVar, 0));
        this.f124861b = wc.l.b(new qm.e(wc.l.b(new jpf.a(nVarB4, wc.l.b(new com.google.firebase.messaging.t(eVar, nVarB5, nVarB3, new yf.c(nVarB5, 29), 22)), nVarB5)), 8));
    }

    @Override // efm.l
    public void onComplete() {
        ((efm.l) ((rfm.b) this.f124861b).f253917b).onComplete();
    }

    public q(Activity activity) {
        this.f124860a = 17;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f124861b = activity;
    }

    public q(rfm.c emitter) {
        this.f124860a = 19;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f124861b = emitter;
    }

    public q(SharedPreferences sharedPreferences) {
        this.f124860a = 8;
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f124861b = sharedPreferences;
    }

    public q(gte.a featureToggleInteractor) {
        this.f124860a = 7;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f124861b = featureToggleInteractor;
    }

    public q(com.revolut.retail.analytics.tracking.impl.a analyticsToggles) {
        this.f124860a = 23;
        Intrinsics.checkNotNullParameter(analyticsToggles, "analyticsToggles");
        this.f124861b = analyticsToggles;
    }

    public q(ne0.j memoryCache) {
        this.f124860a = 18;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f124861b = memoryCache;
    }

    public q(ij0.a networkConfiguration) {
        this.f124860a = 4;
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f124861b = networkConfiguration;
    }

    public q(lr9.j recentsRepository) {
        this.f124860a = 20;
        Intrinsics.checkNotNullParameter(recentsRepository, "recentsRepository");
        this.f124861b = recentsRepository;
    }

    public q(com.google.firebase.messaging.t repository) {
        this.f124860a = 1;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f124861b = repository;
    }

    public q(String str, Map map) {
        Set set;
        this.f124860a = 15;
        if (map.containsKey(str)) {
            set = (Set) map.get(str);
        } else {
            ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
            map.put(str, concurrentSkipListSet);
            set = concurrentSkipListSet;
        }
        this.f124861b = set;
    }

    public q(PushToCardAddCardService pushToCardAddCardService, p96.a cardEligibilityDtoMapper) {
        this.f124860a = 13;
        Intrinsics.checkNotNullParameter(pushToCardAddCardService, "pushToCardAddCardService");
        Intrinsics.checkNotNullParameter(cardEligibilityDtoMapper, "cardEligibilityDtoMapper");
        this.f124861b = pushToCardAddCardService;
    }

    public q(FragmentFactory factory) {
        this.f124860a = 24;
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f124861b = factory;
    }

    public q(Context context) {
        this.f124860a = 9;
        this.f124861b = new g8.d(context);
    }

    public q(KompotFragment fragment) {
        this.f124860a = 2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f124861b = fragment;
    }

    public q(Function0 accessor) {
        this.f124860a = 3;
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        this.f124861b = accessor;
    }

    public q(int i) {
        this.f124860a = i;
        switch (i) {
            case 28:
                this.f124861b = new HashMap();
                break;
            default:
                this.f124861b = new AtomicLong();
                break;
        }
    }
}
