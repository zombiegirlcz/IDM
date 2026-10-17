package ae;

import ag.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.collection.ArrayMap;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import ce.f;
import ch.qos.logback.core.CoreConstants;
import clm.g;
import clm.k;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import efm.e;
import efm.u;
import gc.c;
import gc.d;
import gc.h;
import gc.i;
import gc.j;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.b1;
import skm.d0;
import skm.e0;
import skm.p0;
import tfm.z0;
import w3c.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements f, SuccessContinuation, Continuation, cf.a, u, hc.a, h, ListenerSet.Event, Consumer, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3471c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f3469a = i;
        this.f3470b = obj2;
        this.f3471c = obj3;
    }

    @Override // efm.u
    public void a(z0 emitter) {
        switch (this.f3469a) {
            case 4:
                CoroutineContext coroutineContext = (CoroutineContext) this.f3470b;
                Flow flow = (Flow) this.f3471c;
                emitter.d(new g(e0.B(b1.f263958a, p0.f264003c.plus(coroutineContext), d0.ATOMIC, new k(flow, emitter, (kotlin.coroutines.Continuation) null, 0))));
                break;
            default:
                d80.h hVar = (d80.h) this.f3470b;
                d80.f fVar = (d80.f) this.f3471c;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                d80.e eVar = new d80.e(new a31.a(emitter, 5));
                SensorManager sensorManager = hVar.f112110a;
                Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
                if (eVar.e == null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    eVar.e = defaultSensor;
                    if (defaultSensor != null) {
                        eVar.d = sensorManager;
                        sensorManager.registerListener(eVar, defaultSensor, 0);
                    }
                }
                eVar.f112106b = fVar.a();
                emitter.d(new d80.g(eVar, 0));
                break;
        }
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj2) {
        ((MediaSourceEventListener.EventDispatcher) this.f3470b).lambda$downstreamFormatChanged$5((MediaLoadData) this.f3471c, (MediaSourceEventListener) obj2);
    }

    @Override // gc.h, kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        j jVar = (j) this.f3470b;
        zb.j jVar2 = (zb.j) this.f3471c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
        gc.a aVar = jVar.d;
        ArrayList arrayListH = jVar.h(sQLiteDatabase, jVar2, aVar.f142277b);
        for (wb.e eVar : wb.e.values()) {
            if (eVar != jVar2.f320782c) {
                int size = aVar.f142277b - arrayListH.size();
                if (size <= 0) {
                    break;
                }
                arrayListH.addAll(jVar.h(sQLiteDatabase, jVar2.b(eVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb6 = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListH.size(); i++) {
            sb6.append(((gc.b) arrayListH.get(i)).f142279a);
            if (i < arrayListH.size() - 1) {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb6.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j2 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j2));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j2), hashSet);
                }
                hashSet.add(new i(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th10) {
                cursorQuery.close();
                throw th10;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListH.listIterator();
        while (listIterator.hasNext()) {
            gc.b bVar = (gc.b) listIterator.next();
            long j3 = bVar.f142279a;
            if (map.containsKey(Long.valueOf(j3))) {
                zb.h hVarC = bVar.f142281c.c();
                for (i iVar : (Set) map.get(Long.valueOf(j3))) {
                    hVarC.a(iVar.f142289a, iVar.f142290b);
                }
                listIterator.set(new gc.b(j3, bVar.f142280b, hVarC.b()));
            }
        }
        return arrayListH;
    }

    @Override // cf.a
    public void b(cf.b bVar) {
        cf.a aVar = (cf.a) this.f3470b;
        cf.a aVar2 = (cf.a) this.f3471c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    @Override // efm.e
    public void d(pfm.g emitter) {
        w4l.f fVar = (w4l.f) this.f3470b;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Object obj2 = this.f3471c;
        fVar.c(null, (1 & 2) == 0, new sx4.b(obj2, 12));
        fVar.a(fVar.f294634a.invoke(obj2), obj2, new vt3.a(emitter, 10), new n(emitter, 5));
    }

    @Override // hc.a
    public Object execute() {
        switch (this.f3469a) {
            case 7:
                fc.g gVar = (fc.g) this.f3470b;
                Iterable iterable = (Iterable) this.f3471c;
                j jVar = (j) ((d) gVar.f133581c);
                jVar.getClass();
                if (iterable.iterator().hasNext()) {
                    jVar.d().compileStatement("DELETE FROM events WHERE _id in " + j.k(iterable)).execute();
                    break;
                }
                break;
            default:
                fc.g gVar2 = (fc.g) this.f3470b;
                Iterator it8 = ((HashMap) this.f3471c).entrySet().iterator();
                while (it8.hasNext()) {
                    ((j) ((c) gVar2.i)).i(((Integer) r2.getValue()).intValue(), cc.d.INVALID_PAYLOD, (String) ((Map.Entry) it8.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        switch (this.f3469a) {
            case 11:
                ((AnalyticsListener) obj2).onTracksChanged((AnalyticsListener.EventTime) this.f3470b, (Tracks) this.f3471c);
                break;
            case 12:
                ((AnalyticsListener) obj2).onDownstreamFormatChanged((AnalyticsListener.EventTime) this.f3470b, (MediaLoadData) this.f3471c);
                break;
            case 13:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$59((AnalyticsListener.EventTime) this.f3470b, (VideoSize) this.f3471c, (AnalyticsListener) obj2);
                break;
            default:
                ((AnalyticsListener) obj2).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.f3470b, (Player.Commands) this.f3471c);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // ce.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(ce.v r5) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.a.m(ce.v):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        ag.e eVar = (ag.e) this.f3470b;
        ag.g gVar = (ag.g) this.f3471c;
        synchronized (eVar) {
            eVar.f4684c = Tasks.forResult(gVar);
        }
        return Tasks.forResult(gVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f3469a) {
            case 2:
                m mVar = (m) this.f3470b;
                Date date = (Date) this.f3471c;
                ag.u uVar = mVar.f4709h;
                if (task.isSuccessful()) {
                    uVar.p(date);
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                            uVar.q();
                        } else {
                            uVar.o();
                        }
                    }
                }
                return task;
            default:
                com.google.firebase.messaging.k kVar = (com.google.firebase.messaging.k) this.f3470b;
                String str = (String) this.f3471c;
                synchronized (kVar) {
                    ((ArrayMap) kVar.f49508b).remove(str);
                    break;
                }
                return task;
        }
    }
}
