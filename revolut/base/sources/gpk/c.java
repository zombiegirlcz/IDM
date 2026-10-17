package gpk;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SynchronizedPool;
import b90.e;
import c8.k;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.base.Preconditions;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.feature.twofa.exceptions.UserFailedTwoFaException;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.api.exceptions.UserCancelledSsoException;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import com.revolut.sso.api.navigation.RevolutSsoOperationBoundAuthenticationDestination;
import e8.e0;
import ecm.q;
import ecm.q1;
import ecm.z0;
import efm.r;
import ei3.o;
import go.d;
import icm.m;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.zip.Adler32;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import no.w2;
import okhttp3.Response;
import retrofit2.HttpException;
import skm.p0;
import ulm.j1;
import ulm.x0;
import zb.j;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements q8.a, Pools$Pool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f145463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f145464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f145465c;

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4) {
        this.f145463a = obj2;
        this.f145464b = obj3;
        this.f145465c = obj4;
    }

    public void a(q1 q1Var, z0 z0Var) {
        Preconditions.checkNotNull(q1Var, "key");
        Preconditions.checkNotNull(z0Var, "value");
        int length = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f145465c;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (q1Var.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, ((Object[][]) this.f145465c).length + 1, 2);
            Object[][] objArr3 = (Object[][]) this.f145465c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f145465c = objArr2;
            length = objArr2.length - 1;
        }
        ((Object[][]) this.f145465c)[length] = new Object[]{q1Var, z0Var};
    }

    @Override // androidx.core.util.Pools$Pool
    public Object acquire() {
        Object objAcquire = ((Pools$SynchronizedPool) this.f145465c).acquire();
        if (objAcquire == null) {
            objAcquire = ((z8.a) this.f145463a).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                String str = "Created new " + objAcquire.getClass();
            }
        }
        if (objAcquire instanceof z8.b) {
            ((z8.b) objAcquire).b().f320030a = false;
        }
        return objAcquire;
    }

    public void b() {
        synchronized (((HashMap) this.f145464b)) {
            try {
                Iterator it8 = ((HashMap) this.f145464b).entrySet().iterator();
                while (it8.hasNext()) {
                    ((ifm.c) ((Map.Entry) it8.next()).getValue()).dispose();
                }
                ((HashMap) this.f145464b).clear();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public CoroutineScope c() {
        return (CoroutineScope) (((q) this.f145465c).i() ? this.f145464b : this.f145463a);
    }

    @Override // q8.a
    public e0 d(e0 e0Var, k kVar) {
        Drawable drawable = (Drawable) e0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((m) this.f145464b).d(l8.c.c(((BitmapDrawable) drawable).getBitmap(), (f8.a) this.f145463a), kVar);
        }
        if (drawable instanceof GifDrawable) {
            return ((q8.c) this.f145465c).d(e0Var, kVar);
        }
        return null;
    }

    public go.a e(w2 permission) {
        wl0.c cVar = (wl0.c) this.f145464b;
        y80.a aVar = (y80.a) this.f145463a;
        Intrinsics.checkNotNullParameter(permission, "permission");
        boolean zAreNotificationsEnabled = false;
        switch (d.f145064b[permission.ordinal()]) {
            case 1:
                zAreNotificationsEnabled = ((e) this.f145465c).f13523a.areNotificationsEnabled();
                return new go.a(permission, zAreNotificationsEnabled);
            case 2:
                zAreNotificationsEnabled = aVar.c("android.permission.READ_CONTACTS");
                return new go.a(permission, zAreNotificationsEnabled);
            case 3:
                int i = d.f145063a[cVar.d().ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zAreNotificationsEnabled = true;
                }
                return new go.a(permission, zAreNotificationsEnabled);
            case 4:
                int i2 = d.f145063a[cVar.d().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        zAreNotificationsEnabled = true;
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new go.a(permission, zAreNotificationsEnabled);
            case 5:
                zAreNotificationsEnabled = aVar.c("android.permission.RECORD_AUDIO");
                return new go.a(permission, zAreNotificationsEnabled);
            case 6:
                zAreNotificationsEnabled = aVar.c("android.permission.RECORD_AUDIO");
                return new go.a(permission, zAreNotificationsEnabled);
            case 7:
                zAreNotificationsEnabled = aVar.b();
                return new go.a(permission, zAreNotificationsEnabled);
            case 8:
                zAreNotificationsEnabled = aVar.c("android.permission.READ_CALENDAR");
                return new go.a(permission, zAreNotificationsEnabled);
            case 9:
                zAreNotificationsEnabled = aVar.c("android.permission.ACCESS_COARSE_LOCATION");
                return new go.a(permission, zAreNotificationsEnabled);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public String f() {
        return (String) ((Lazy) this.f145465c).getValue();
    }

    public r g(Throwable throwable) {
        Response responseRaw;
        j1 j1Var;
        x0 x0Var;
        String str;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof UserCancelledSsoException) {
            r rVarError = r.error(new UserDeclinedTwoFaException());
            Intrinsics.checkNotNullExpressionValue(rVarError, "error(...)");
            return rVarError;
        }
        if (throwable instanceof UserFailedSsoException) {
            r rVarError2 = r.error(new UserFailedTwoFaException());
            Intrinsics.checkNotNullExpressionValue(rVarError2, "error(...)");
            return rVarError2;
        }
        if (!(throwable instanceof HttpException)) {
            r rVarError3 = r.error(throwable);
            Intrinsics.checkNotNullExpressionValue(rVarError3, "error(...)");
            return rVarError3;
        }
        o oVar = (o) this.f145463a;
        HttpException exception = (HttpException) throwable;
        Intrinsics.checkNotNullParameter(exception, "exception");
        retrofit2.Response<?> response = exception.response();
        Continuation continuation = null;
        pql.c cVarA = oVar.a(response != null ? response.errorBody() : null);
        if (!(cVarA instanceof pql.a)) {
            if (!(cVarA instanceof pql.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVarA = new pql.b(exception, ((pql.b) cVarA).a());
        }
        if (!(cVarA instanceof pql.a)) {
            r rVarError4 = r.error(throwable);
            Intrinsics.checkNotNullExpressionValue(rVarError4, "error(...)");
            return rVarError4;
        }
        retrofit2.Response<?> response2 = exception.response();
        if (response2 == null || (responseRaw = response2.raw()) == null || (j1Var = responseRaw.f226087a) == null || (x0Var = j1Var.f281095a) == null || (str = x0Var.i) == null) {
            r rVarError5 = r.error(throwable);
            Intrinsics.checkNotNullExpressionValue(rVarError5, "error(...)");
            return rVarError5;
        }
        pql.a aVar = (pql.a) cVarA;
        ((sri.m) this.f145465c).c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new RevolutSsoOperationBoundAuthenticationDestination(str, aVar.b(), aVar.a(), djl.c.QUIT), false, (Integer) null, 0, 61)));
        return nz8.d.r(p0.f264003c, new e38.c(this, throwable, continuation, 16));
    }

    public void h(j jVar, int i, boolean z) {
        fc.a aVar = (fc.a) this.f145465c;
        Context context = (Context) this.f145463a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar.f320780a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(jc.a.a(jVar.f320782c)).array());
        byte[] bArr = jVar.f320781b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it8 = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                JobInfo next = it8.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        nim.a.j(jVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((gc.j) ((gc.d) this.f145464b)).d().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{jVar.f320780a, String.valueOf(jc.a.a(jVar.f320782c))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            wb.e eVar = jVar.f320782c;
            builder.setMinimumLatency(aVar.a(eVar, jLongValue, i));
            Set set = ((fc.b) aVar.f133566b.get(eVar)).f133569c;
            if (set.contains(fc.c.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(fc.c.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(fc.c.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", jVar.f320780a);
            persistableBundle.putInt("priority", jc.a.a(eVar));
            byte[] bArr2 = jVar.f320781b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(aVar.a(eVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th10) {
            cursorRawQuery.close();
            throw th10;
        }
    }

    public void i(List list) {
        Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
        this.f145463a = Collections.unmodifiableList(new ArrayList(list));
    }

    public ak.a j(Runnable runnable) {
        return ((ck.a) this.f145465c).l(((ExecutorService) this.f145464b).submit(runnable), (mj.a) this.f145463a);
    }

    @Override // androidx.core.util.Pools$Pool
    public boolean release(Object obj2) {
        if (obj2 instanceof z8.b) {
            ((z8.b) obj2).b().f320030a = true;
        }
        ((z8.c) this.f145464b).e(obj2);
        return ((Pools$SynchronizedPool) this.f145465c).release(obj2);
    }

    public c(Pools$SynchronizedPool pools$SynchronizedPool, z8.a aVar, z8.c cVar) {
        this.f145465c = pools$SynchronizedPool;
        this.f145463a = aVar;
        this.f145464b = cVar;
    }
}
