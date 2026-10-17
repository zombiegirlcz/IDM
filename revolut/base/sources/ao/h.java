package ao;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewbinding.ViewBinding;
import c8.n;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.revolut.analytics.db.AqueductDatabase;
import e8.e0;
import e8.j0;
import e8.k;
import e8.m;
import e8.p;
import efm.c0;
import efm.f0;
import efm.r;
import i8.t;
import ie.u;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;
import ljl.n1;
import nkm.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pfm.z;
import qlm.l;
import qlm.r1;
import qlm.s;
import qlm.x0;
import retrofit2.Call;
import retrofit2.CallAdapter;
import zhm.d0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements cfm.b, com.bumptech.glide.load.data.d, SuccessContinuation, n, sim.d, f0, efm.d, CallAdapter, r1, re.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7848c;

    public /* synthetic */ h(int i, Object obj2, boolean z, Object obj3) {
        this.f7846a = i;
        this.f7847b = obj2;
        this.f7848c = obj3;
    }

    public static List i(h hVar) {
        Sequence sequenceH;
        List all2 = ((ne0.j) hVar.f7848c).getAll();
        List listJ = null;
        if (all2.size() < Integer.MAX_VALUE) {
            all2 = null;
        }
        if (all2 != null && (sequenceH = y.H(y.F(y.F(d0.Q(all2), new ll3.c()), new ll3.d()), Integer.MAX_VALUE)) != null) {
            listJ = y.J(sequenceH);
        }
        if (listJ != null) {
            return listJ;
        }
        ArrayList arrayListT = t(((ml3.a) hVar.f7847b).j());
        ((ne0.j) hVar.f7848c).t1(arrayListT, new n1(21));
        return arrayListT;
    }

    public static ArrayList t(List list) {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            ml3.i iVar = (ml3.i) obj2;
            String strD = iVar.d();
            if (strD == null || (objValueOf = m70.a.l(strD)) == null) {
                objValueOf = Long.valueOf(iVar.i());
            }
            if (hashSet.add(objValueOf)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // qlm.r1
    public KSerializer a(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj2 = ((s) this.f7848c).get(nim.a.o(key));
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        x0 x0Var = (x0) obj2;
        Object objA = x0Var.f247725a.get();
        if (objA == null) {
            objA = x0Var.a(new bjm.d(this, key));
        }
        return ((l) objA).f247673a;
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        CallAdapter callAdapter = (CallAdapter) this.f7847b;
        qbm.a aVar = (qbm.a) this.f7848c;
        return callAdapter.adapt(new qbm.c(call, aVar.f244379c, aVar.d));
    }

    public void b(ArrayList contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        ((ml3.a) this.f7847b).b(contacts);
        Iterator it8 = contacts.iterator();
        while (it8.hasNext()) {
            ml3.i iVar = (ml3.i) it8.next();
            ((ne0.j) this.f7848c).f(iVar.n(), iVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory c(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h.c(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(Object obj2) {
        j0 j0Var = (j0) this.f7848c;
        t tVar = (t) this.f7847b;
        t tVar2 = j0Var.f;
        if (tVar2 == null || tVar2 != tVar) {
            return;
        }
        j0 j0Var2 = (j0) this.f7848c;
        t tVar3 = (t) this.f7847b;
        p pVar = j0Var2.f123481a.f123470p;
        if (obj2 != null && pVar.c(tVar3.f159400c.b())) {
            j0Var2.e = obj2;
            j0Var2.f123482b.l(k.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m mVar = j0Var2.f123482b;
            c8.g gVar = tVar3.f159398a;
            com.bumptech.glide.load.data.e eVar = tVar3.f159400c;
            mVar.a(gVar, obj2, eVar, eVar.b(), j0Var2.f123484g);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(Exception exc2) {
        j0 j0Var = (j0) this.f7848c;
        t tVar = (t) this.f7847b;
        t tVar2 = j0Var.f;
        if (tVar2 == null || tVar2 != tVar) {
            return;
        }
        j0 j0Var2 = (j0) this.f7848c;
        t tVar3 = (t) this.f7847b;
        m mVar = j0Var2.f123482b;
        e8.e eVar = j0Var2.f123484g;
        com.bumptech.glide.load.data.e eVar2 = tVar3.f159400c;
        mVar.c(eVar, exc2, eVar2, eVar2.b());
    }

    public Object f(f8.h hVar) {
        HashMap map = (HashMap) this.f7848c;
        f8.c cVar = (f8.c) map.get(hVar);
        if (cVar == null) {
            cVar = new f8.c(hVar);
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        f8.c cVar2 = cVar.d;
        cVar2.f132668c = cVar.f132668c;
        cVar.f132668c.d = cVar2;
        f8.c cVar3 = (f8.c) this.f7847b;
        cVar.d = cVar3;
        f8.c cVar4 = cVar3.f132668c;
        cVar.f132668c = cVar4;
        cVar4.d = cVar;
        cVar.d.f132668c = cVar;
        ArrayList arrayList = cVar.f132667b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f132667b.remove(size - 1);
        }
        return null;
    }

    public dg.d g(ag.g gVar) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = gVar.f4692g;
        long j2 = gVar.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2);
                }
                String strOptString = jSONArray2.optString(0, "");
                ag.g gVarC = ((ag.e) this.f7847b).c();
                String string3 = null;
                if (gVarC == null) {
                    string = null;
                } else {
                    try {
                        string = gVarC.f4690b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    ag.g gVarC2 = ((ag.e) this.f7848c).c();
                    if (gVarC2 != null) {
                        try {
                            string3 = gVarC2.f4690b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = dg.e.f114560a;
                dg.b bVar = new dg.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f114554a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f114555b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f114556c = strOptString;
                bVar.d = string;
                bVar.e = j2;
                bVar.f = (byte) (bVar.f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new dg.d(hashSet);
    }

    @Override // c8.d
    public boolean h(Object obj2, File file, c8.k kVar) {
        return ((l8.b) this.f7848c).h(new l8.c(((BitmapDrawable) ((e0) obj2).get()).getBitmap(), (f8.a) this.f7847b), file, kVar);
    }

    public com.bumptech.glide.n j(Context context, com.bumptech.glide.b bVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        y8.l.a();
        y8.l.a();
        HashMap map = (HashMap) this.f7847b;
        com.bumptech.glide.n nVar = (com.bumptech.glide.n) map.get(lifecycle);
        if (nVar != null) {
            return nVar;
        }
        r8.i iVar = new r8.i(lifecycle);
        com.bumptech.glide.n nVarC = ((qf.b) this.f7848c).c(bVar, iVar, new dfm.c(this, fragmentManager, 12), context);
        map.put(lifecycle, nVarC);
        iVar.d(new r8.k(this, lifecycle));
        if (z) {
            nVarC.onStart();
        }
        return nVarC;
    }

    public efm.d0 k(Object obj2) {
        efm.d0 d0VarFirstOrError = ((ne0.k) this.f7848c).a(obj2).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    @Override // sim.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ViewBinding getValue(com.revolut.kompot.navigable.a thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        ViewBinding viewBinding = (ViewBinding) this.f7848c;
        if (viewBinding != null) {
            return viewBinding;
        }
        ViewBinding viewBinding2 = (ViewBinding) ((Function1) this.f7847b).invoke(thisRef.D2());
        this.f7848c = viewBinding2;
        return viewBinding2;
    }

    public r m(String juniorId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        fe8.i iVar = (fe8.i) ((fe8.a) this.f7847b);
        iVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return iVar.e.f(juniorId, z);
    }

    @Override // re.a
    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        re.a[] aVarArr = (re.a[]) this.f7847b;
        StackTraceElement[] stackTraceElementArrN = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            re.a aVar = aVarArr[i];
            if (stackTraceElementArrN.length <= 1024) {
                break;
            }
            stackTraceElementArrN = aVar.n(stackTraceElementArr);
        }
        return stackTraceElementArrN.length > 1024 ? ((ah.a) this.f7848c).n(stackTraceElementArrN) : stackTraceElementArrN;
    }

    public r o() {
        return rd0.e.c(new ae8.c(bla.b.b((jla.h) this.f7848c, vd8.g.d.a()), 0), kotlin.coroutines.g.f186406a);
    }

    @Override // efm.d
    public void onComplete() {
        Object objCall;
        switch (this.f7846a) {
            case 22:
                ((efm.d) this.f7848c).onComplete();
                break;
            default:
                f0 f0Var = (f0) this.f7847b;
                z zVar = (z) this.f7848c;
                Callable callable = (Callable) zVar.d;
                if (callable != null) {
                    try {
                        objCall = callable.call();
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        f0Var.onError(th10);
                        return;
                    }
                } else {
                    objCall = zVar.f235779b;
                }
                if (objCall != null) {
                    f0Var.onSuccess(objCall);
                } else {
                    f0Var.onError(new NullPointerException("The value supplied is null"));
                }
                break;
        }
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        switch (this.f7846a) {
            case 21:
                ((f0) this.f7848c).onError(th10);
                break;
            case 22:
                ((efm.d) this.f7848c).onError(th10);
                break;
            default:
                ((f0) this.f7847b).onError(th10);
                break;
        }
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        switch (this.f7846a) {
            case 21:
                lfm.d.c((AtomicReference) this.f7847b, cVar);
                break;
            case 22:
                lfm.d.c((ofm.h) this.f7847b, cVar);
                break;
            default:
                ((f0) this.f7847b).onSubscribe(cVar);
                break;
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        ((f0) this.f7848c).onSuccess(obj2);
    }

    @Override // c8.n
    public c8.c p(c8.k kVar) {
        return c8.c.TRANSFORMED;
    }

    public a83.j0 q(vd8.j productCatalogue) {
        Intrinsics.checkNotNullParameter(productCatalogue, "productCatalogue");
        return new a83.j0(new ae8.c(bla.b.b((jla.h) this.f7848c, productCatalogue.a()), 0), 2);
    }

    public void r(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ge.b bVar = "clx".equals(bundle2.getString("_o")) ? (jpf.a) this.f7847b : (mp.r) this.f7848c;
            if (bVar == null) {
                return;
            }
            bVar.g(bundle2, string);
        }
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return ((CallAdapter) this.f7847b).responseType();
    }

    public void s(f8.h hVar, Object obj2) {
        HashMap map = (HashMap) this.f7848c;
        f8.c cVar = (f8.c) map.get(hVar);
        if (cVar == null) {
            cVar = new f8.c(hVar);
            cVar.d = cVar;
            f8.c cVar2 = (f8.c) this.f7847b;
            cVar.d = cVar2.d;
            cVar.f132668c = cVar2;
            cVar2.d = cVar;
            cVar.d.f132668c = cVar;
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        if (cVar.f132667b == null) {
            cVar.f132667b = new ArrayList();
        }
        cVar.f132667b.add(obj2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        Boolean bool = (Boolean) obj2;
        ie.n nVar = (ie.n) this.f7848c;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            boolean zBooleanValue = bool.booleanValue();
            u uVar = nVar.f160538b;
            if (zBooleanValue) {
                uVar.f160575h.trySetResult(null);
                return ((Task) this.f7847b).onSuccessTask(nVar.e.f173167a, new yf.c(this, 11));
            }
            uVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        oe.c cVar = nVar.f160540g;
        Iterator it8 = oe.c.m(((File) cVar.f224499c).listFiles(ie.n.f160535r)).iterator();
        while (it8.hasNext()) {
            ((File) it8.next()).delete();
        }
        oe.c cVar2 = ((oe.a) nVar.f160544m.f224498b).f224494b;
        oe.a.a(oe.c.m(((File) cVar2.e).listFiles()));
        oe.a.a(oe.c.m(((File) cVar2.f).listFiles()));
        oe.a.a(oe.c.m(((File) cVar2.f224500g).listFiles()));
        nVar.f160547q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f7846a) {
            case 11:
                StringBuilder sb6 = new StringBuilder("GroupedLinkedMap( ");
                f8.c cVar = (f8.c) this.f7847b;
                f8.c cVar2 = cVar.f132668c;
                boolean z = false;
                while (!cVar2.equals(cVar)) {
                    sb6.append(CoreConstants.CURLY_LEFT);
                    sb6.append(cVar2.f132666a);
                    sb6.append(CoreConstants.COLON_CHAR);
                    ArrayList arrayList = cVar2.f132667b;
                    sb6.append(arrayList != null ? arrayList.size() : 0);
                    sb6.append("}, ");
                    cVar2 = cVar2.f132668c;
                    z = true;
                }
                if (z) {
                    sb6.delete(sb6.length() - 2, sb6.length());
                }
                sb6.append(" )");
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    public Object u() {
        f8.c cVar = (f8.c) this.f7847b;
        f8.c cVar2 = cVar.d;
        while (true) {
            boolean zEquals = cVar2.equals(cVar);
            Object obj2 = cVar2.f132666a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = cVar2.f132667b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? cVar2.f132667b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            f8.c cVar3 = cVar2.d;
            cVar3.f132668c = cVar2.f132668c;
            cVar2.f132668c.d = cVar3;
            ((HashMap) this.f7848c).remove(obj2);
            ((f8.h) obj2).a();
            cVar2 = cVar2.d;
        }
    }

    public /* synthetic */ h(int i, boolean z) {
        this.f7846a = i;
    }

    public /* synthetic */ h(Context context, int i) {
        this.f7846a = i;
        this.f7848c = null;
        this.f7847b = context;
    }

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f7846a = i;
        this.f7848c = obj2;
        this.f7847b = obj3;
    }

    public h(ml3.a contactDao, ne0.j memoryCache) {
        this.f7846a = 18;
        Intrinsics.checkNotNullParameter(contactDao, "contactDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f7847b = contactDao;
        this.f7848c = memoryCache;
    }

    public h(f86.a deviceLockProtectionChecker, ue0.c deviceLockProtectionStorage) {
        this.f7846a = 4;
        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
        Intrinsics.checkNotNullParameter(deviceLockProtectionStorage, "deviceLockProtectionStorage");
        this.f7847b = deviceLockProtectionChecker;
        this.f7848c = deviceLockProtectionStorage;
    }

    public h(fe8.a repository, jla.h productCatalogueInteractor) {
        this.f7846a = 2;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f7847b = repository;
        this.f7848c = productCatalogueInteractor;
    }

    public h(qf.b bVar) {
        this.f7846a = 26;
        this.f7847b = new HashMap();
        this.f7848c = bVar;
    }

    public h(String str, jpf.a aVar, Map map, Map map2) {
        ReadWriteLock readWriteLock;
        Lock lock;
        this.f7846a = 28;
        File file = (File) aVar.f177269c;
        if (map.containsKey(str)) {
            readWriteLock = (ReadWriteLock) map.get(str);
        } else {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
            map.put(str, reentrantReadWriteLock);
            readWriteLock = reentrantReadWriteLock;
        }
        this.f7847b = readWriteLock;
        if (map2.containsKey(str)) {
            lock = (Lock) map2.get(str);
        } else {
            rj.a aVar2 = new rj.a(new File(file, a0.d.r(str, ".lock")));
            map2.put(str, aVar2);
            lock = aVar2;
        }
        this.f7848c = lock;
    }

    public h(com.revolut.kompot.navigable.a controller, Function1 viewBindingProvider) {
        this.f7846a = 19;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(viewBindingProvider, "viewBindingProvider");
        this.f7847b = viewBindingProvider;
        controller.F.addObserver(new mki.c(this, 0));
    }

    public h(re.a[] aVarArr) {
        this.f7846a = 27;
        this.f7847b = aVarArr;
        this.f7848c = new ah.a(14);
    }

    public h(int i) {
        this.f7846a = i;
        switch (i) {
            case 11:
                this.f7847b = new f8.c(null);
                this.f7848c = new HashMap();
                break;
            case 15:
                this.f7847b = new AtomicInteger();
                this.f7848c = new AtomicInteger();
                break;
            case 29:
                this.f7847b = new AtomicReference();
                this.f7848c = new ArrayMap();
                break;
            default:
                this.f7847b = new cpi.g(new af.f(2));
                this.f7848c = new cpi.g(new qf.b(1));
                break;
        }
    }

    public h(String id10, com.revolut.kompot.navigable.b controllerManager) {
        this.f7846a = 7;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        this.f7847b = id10;
        this.f7848c = controllerManager;
    }

    public h(AqueductDatabase aqueductDatabase) {
        this.f7846a = 0;
        this.f7847b = aqueductDatabase;
        this.f7848c = new g(0);
    }

    public h(cfm.c cVar, yf.c cVar2, bfm.b bVar) {
        this.f7846a = 6;
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t((yem.b) cVar2, bVar, new h(5));
        this.f7847b = cVar;
        this.f7848c = tVar;
    }

    public h(int i, Function1 compute) {
        this.f7846a = i;
        switch (i) {
            case 25:
                Intrinsics.checkNotNullParameter(compute, "compute");
                this.f7847b = compute;
                this.f7848c = new s();
                break;
            default:
                Intrinsics.checkNotNullParameter(compute, "load");
                c0 c0Var = hhm.f.f152431c;
                Intrinsics.checkNotNullParameter(compute, "load");
                this.f7847b = compute;
                this.f7848c = new ne0.k(new akl.s(this, 28), c0Var);
                break;
        }
    }
}
