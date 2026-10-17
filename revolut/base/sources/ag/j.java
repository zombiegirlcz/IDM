package ag;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.f0;
import com.google.gson.internal.z;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import eg.s0;
import eg.t0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements SuccessContinuation, s7.e, kfm.p, kfm.o, ce.f, Continuation, OnCompleteListener, com.google.gson.internal.r, kfm.g, wb.g, hc.a, cf.a, OnApplyWindowInsetsListener, ReorderingBufferQueue.OutputConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4700b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f4699a = i;
        this.f4700b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((cwl.a) this.f4700b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f4699a) {
            case 3:
                akl.s sVar = (akl.s) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) sVar.invoke(p0);
            case 4:
                c86.a aVar = (c86.a) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 5:
                c86.a aVar2 = (c86.a) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar2.invoke(p0);
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                an0.e eVar = (an0.e) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) eVar.invoke(p0);
            case 7:
                akl.s sVar2 = (akl.s) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mm0.o) sVar2.invoke(p0);
            case 14:
                an0.e eVar2 = (an0.e) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) eVar2.invoke(p0);
            case 15:
                akl.s sVar3 = (akl.s) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar3.invoke(p0);
            case 17:
                s0 s0Var = (s0) p0;
                ((eg.m) this.f4700b).getClass();
                String strA = t0.f125494b.a(s0Var);
                Intrinsics.checkNotNullExpressionValue(strA, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                String str = "Session Event Type: " + s0Var.f125490a.name();
                byte[] bytes = strA.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return bytes;
            case 18:
                akl.s sVar4 = (akl.s) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar4.invoke(p0);
            case 25:
                an0.e eVar3 = (an0.e) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hh0.b) eVar3.invoke(p0);
            case 26:
                hn.b bVar = (hn.b) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
        }
    }

    @Override // cf.a
    public void b(cf.b bVar) {
        switch (this.f4699a) {
            case 21:
                fe.a aVar = (fe.a) this.f4700b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                aVar.f134426b.set((fe.a) bVar.get());
                break;
            default:
                fe.b bVar2 = (fe.b) this.f4700b;
                com.google.firebase.messaging.t tVar = ((zf.g) ((cg.a) bVar.get())).a("firebase").i;
                ((Set) tVar.e).add(bVar2);
                Task taskB = ((e) tVar.f49543b).b();
                taskB.addOnSuccessListener((Executor) tVar.d, new bg.a(tVar, 0, taskB, bVar2));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                break;
        }
    }

    @Override // com.google.gson.internal.r
    public Object construct() {
        int i = this.f4699a;
        Object obj2 = this.f4700b;
        switch (i) {
            case 11:
                Constructor constructor = (Constructor) obj2;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    te0.w wVar = og.c.f224953a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + og.c.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + og.c.b(constructor) + "' with no args", e4.getCause());
                }
            default:
                Class cls = (Class) obj2;
                try {
                    return z.f49663a.a(cls);
                } catch (Exception e5) {
                    throw new RuntimeException(a0.d.q("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e5);
                }
        }
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j2, ParsableByteArray parsableByteArray) {
        ((FragmentedMp4Extractor) this.f4700b).lambda$new$2(j2, parsableByteArray);
    }

    @Override // hc.a
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseD;
        int i = this.f4699a;
        Object obj2 = this.f4700b;
        switch (i) {
            case 19:
                gc.j jVar = (gc.j) ((gc.c) obj2);
                jVar.getClass();
                int i2 = cc.a.e;
                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(3, false);
                tVar.f49544c = null;
                tVar.d = new ArrayList();
                tVar.e = null;
                tVar.f49543b = "";
                HashMap map = new HashMap();
                sQLiteDatabaseD = jVar.d();
                sQLiteDatabaseD.beginTransaction();
                try {
                    cc.a aVar = (cc.a) gc.j.l(sQLiteDatabaseD.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new p(jVar, 6, map, tVar));
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            default:
                gc.j jVar2 = (gc.j) ((gc.c) ((fc.g) obj2).i);
                sQLiteDatabaseD = jVar2.d();
                sQLiteDatabaseD.beginTransaction();
                try {
                    sQLiteDatabaseD.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseD.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + jVar2.f142292b.b()).execute();
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    @Override // s7.e
    public Object getValue() {
        return (PorterDuffColorFilter) this.f4700b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:4|(3:6|(1:8)(1:9)|10)(1:11)|12|(1:14)(1:15)|16|(1:18)|(1:20)(1:21)|22|(34:26|42|(1:44)|45|(0)|47|(4:50|(3:168|52|171)(1:170)|169|48)|167|53|162|54|(1:56)|57|58|(1:60)|61|(1:63)|(1:65)(1:66)|67|(4:70|(2:72|173)(1:174)|73|68)|172|74|(2:77|75)|175|78|(1:80)(1:81)|(1:83)(1:84)|85|(5:90|(1:92)|93|465|97)(1:89)|98|(13:109|105|110|(2:112|(1:114))(2:115|(2:142|143))|117|164|118|158|119|120|121|(3:136|(1:138)|139)(3:129|(1:131)|132)|141)(13:102|(1:104)(2:106|(1:108)(0))|105|110|(0)(0)|117|164|118|158|119|120|121|(6:123|125|136|(0)|139|141)(0))|149|(2:151|(1:153))|154)(3:27|(3:31|39|(1:41))(4:32|(2:35|33)|166|36)|37)|38|45|(0)|47|(1:48)|167|53|162|54|(0)|57|58|(0)|61|(0)|(0)(0)|67|(1:68)|172|74|(1:75)|175|78|(0)(0)|(0)(0)|85|(5:87|90|(0)|93|465)(0)|149|(0)|154) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0666, code lost:
    
        r11 = r3;
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0466 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a4 A[LOOP:3: B:75:0x039e->B:77:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x044d  */
    @Override // ce.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(ce.v r49) {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.j.m(ce.v):java.lang.Object");
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return StoriesPagerView.j((StoriesPagerView) this.f4700b, view, windowInsetsCompat);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f4699a) {
            case 9:
                ((f0) this.f4700b).f49495b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f4700b).cancel(false);
                break;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f4699a) {
            case 2:
                an0.e eVar = (an0.e) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) eVar.invoke(p0)).booleanValue();
            case 23:
                an0.e eVar2 = (an0.e) this.f4700b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) eVar2.invoke(p0)).booleanValue();
            default:
                return ((Boolean) ((an0.e) this.f4700b).invoke(p0)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((ce.v) this.f4700b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String str = "Unexpected response: " + bundle;
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        return Tasks.forResult((k) this.f4700b);
    }
}
