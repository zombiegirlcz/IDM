package af;

import ag.v;
import android.util.Log;
import androidx.work.impl.WorkerWrapper;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.event_appearance.impl.R$string;
import do3.n;
import efm.k;
import hng.q;
import ie.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;
import pfm.t;
import rfm.o;
import te0.w;
import tim.c;
import v3e.d0;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3810b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f3809a = i;
        this.f3810b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ag.g gVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th10;
        Object dVar;
        int i;
        int i2;
        switch (this.f3809a) {
            case 0:
                e eVar = (e) this.f3810b;
                synchronized (eVar) {
                    ((j) eVar.f3811a.get()).h(System.currentTimeMillis(), ((yf.b) eVar.f3813c.get()).a());
                    break;
                }
                return null;
            case 1:
                v vVar = (v) this.f3810b;
                synchronized (vVar) {
                    gVarA = null;
                    try {
                        fileInputStreamOpenFileInput = vVar.f4743a.openFileInput(vVar.f4744b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th11) {
                        fileInputStreamOpenFileInput = null;
                        th10 = th11;
                    }
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        gVarA = ag.g.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (Throwable th12) {
                        th10 = th12;
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        throw th10;
                    }
                    break;
                }
                return gVarA;
            case 2:
                q qVar = (q) this.f3810b;
                n nVar = (n) qVar.f154116c.get("CACHE_KEY_USER");
                if (nVar != null) {
                    return k.g(nVar);
                }
                o oVar = new o(new h4d.d(qVar, 5));
                Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
                return w.h0(oVar);
            case 3:
                ie.n nVar2 = ((r) this.f3810b).f160558g;
                nVar2.getClass();
                je.d.a();
                cpi.g gVar = nVar2.f160539c;
                oe.c cVar = (oe.c) gVar.f107955c;
                String str = (String) gVar.f107954b;
                cVar.getClass();
                boolean z = true;
                if (new File((File) cVar.f224499c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    }
                    oe.c cVar2 = (oe.c) gVar.f107955c;
                    cVar2.getClass();
                    new File((File) cVar2.f224499c, str).delete();
                } else {
                    String strE = nVar2.e();
                    if (strE == null || !nVar2.f160542j.c(strE)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return ((pv9.d) this.f3810b).g();
            case 5:
                return WorkerWrapper.trySetRunning$lambda$11((WorkerWrapper) this.f3810b);
            case 6:
                return (cr0.h) ((eki.e) this.f3810b).invoke();
            case 7:
                soi.e eVar2 = (soi.e) this.f3810b;
                Boolean bool = (Boolean) eVar2.f264848b.get("ANALYTICS_EVENTS_KEY");
                if (bool != null) {
                    return k.g(bool);
                }
                o oVar2 = new o(new s2i.i(eVar2, 2));
                Intrinsics.checkNotNullExpressionValue(oVar2, "fromCallable(...)");
                return w.h0(oVar2);
            case 8:
                te0.r rVar = (te0.r) this.f3810b;
                boolean zIsInitialized = rVar.isInitialized();
                ihm.j jVar = rVar.f270017b;
                return zIsInitialized ? jVar.startWith(rVar.get()) : jVar;
            case 9:
                String str2 = ((p7l.a) this.f3810b).f233790a;
                if (str2 == null) {
                    return new TextLocalisedClause(R$string.event_appearance_regular_welcome_enter_passcode, null, null, 14);
                }
                int i3 = DateTime.now().hourOfDay().get();
                IntRange intRange = tgi.a.f271181a;
                int i5 = intRange.f186448a;
                if (i3 > intRange.f186449b || i5 > i3) {
                    IntRange intRange2 = tgi.a.f271182b;
                    int i6 = intRange2.f186448a;
                    if (i3 > intRange2.f186449b || i6 > i3) {
                        IntRange intRange3 = tgi.a.f271183c;
                        int i21 = intRange3.f186448a;
                        if (i3 > intRange3.f186449b || i21 > i3) {
                            tgi.b[] bVarArrValues = tgi.b.values();
                            c.Companion random = tim.c.INSTANCE;
                            Intrinsics.checkNotNullParameter(bVarArrValues, "<this>");
                            Intrinsics.checkNotNullParameter(random, "random");
                            if (bVarArrValues.length == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            int length = bVarArrValues.length;
                            random.getClass();
                            dVar = new tgi.d(bVarArrValues[tim.c.f271589b.d(length)]);
                        } else {
                            dVar = new tgi.e(tgi.c.GOOD_EVENING);
                        }
                    } else {
                        dVar = new tgi.e(tgi.c.GOOD_AFTERNOON);
                    }
                } else {
                    dVar = new tgi.e(tgi.c.GOOD_MORNING);
                }
                if (dVar instanceof tgi.e) {
                    int i22 = toj.a.f273230b[((tgi.e) dVar).f271185a.ordinal()];
                    if (i22 == 1) {
                        i2 = R$string.event_appearance_regular_welcome_morning;
                    } else if (i22 == 2) {
                        i2 = R$string.event_appearance_regular_welcome_afternoon;
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$string.event_appearance_regular_welcome_evening;
                    }
                    return new TextLocalisedClause(i2, u.c(str2), null, 12);
                }
                if (!(dVar instanceof tgi.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i32 = toj.a.f273229a[((tgi.d) dVar).f271184a.ordinal()];
                if (i32 == 1) {
                    i = R$string.event_appearance_regular_welcome_back;
                } else if (i32 == 2) {
                    i = R$string.event_appearance_regular_welcome_heythere;
                } else if (i32 == 3) {
                    i = R$string.event_appearance_regular_welcome_nicetoseeyou;
                } else {
                    if (i32 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.event_appearance_regular_welcome_hi;
                }
                return new TextLocalisedClause(i, u.c(str2), null, 12);
            case 10:
                d0 d0Var = (d0) this.f3810b;
                t tVarL = new pfm.n(new s2i.i(d0Var, 12), 1).l(new rzc.b(d0Var, d0Var.P(), 28));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                return tVarL;
            case 11:
                ym.d dVar2 = (ym.d) this.f3810b;
                CopyOnWriteArrayList copyOnWriteArrayList = dVar2.f314826b;
                if (!copyOnWriteArrayList.isEmpty()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = dVar2.f314827c;
                    ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                    int i33 = 0;
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i43 = 0; i43 < readHoldCount; i43++) {
                        lock.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        a0.E(copyOnWriteArrayList, new whi.b(7));
                    } finally {
                        while (i33 < readHoldCount) {
                            lock.lock();
                            i33++;
                        }
                        writeLock.unlock();
                    }
                }
                return efm.r.fromIterable(copyOnWriteArrayList);
            default:
                return ((zf.g) this.f3810b).a("firebase");
        }
    }

    public /* synthetic */ d(p7l.a aVar, toj.b bVar) {
        this.f3809a = 9;
        this.f3810b = aVar;
    }
}
