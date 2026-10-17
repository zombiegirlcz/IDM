package g1m;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.TrafficStats;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ulm.j1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139734c;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f139732a = i;
        this.f139733b = obj2;
        this.f139734c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        t0m.b bVar;
        switch (this.f139732a) {
            case 0:
                i this$0 = (i) this.f139733b;
                j1 request = (j1) this.f139734c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                String TAG = this$0.f139741a;
                int i = -1;
                try {
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    z0m.j.e(TAG, "Sending request: %s", request);
                    TrafficStats.setThreadStatsTag(1);
                    OkHttpClient okHttpClient = this$0.f139744g;
                    Response responseExecute = okHttpClient != null ? okHttpClient.b(request).execute() : null;
                    if (responseExecute != null) {
                        ResponseBody responseBody = responseExecute.f226090g;
                        if (responseBody != null) {
                            responseBody.close();
                        }
                        i = responseExecute.d;
                    }
                    break;
                } catch (IOException e) {
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    z0m.j.b(TAG, "Request sending failed: %s", e.toString());
                }
                return Integer.valueOf(i);
            default:
                t0m.d this$02 = (t0m.d) this.f139733b;
                Context context = (Context) this.f139734c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(context, "$context");
                synchronized (t0m.b.Companion) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("com.fourthline.sdk", "namespace");
                    HashMap map = t0m.b.f267052a;
                    if (map.containsKey("com.fourthline.sdk")) {
                        Object obj2 = map.get("com.fourthline.sdk");
                        Intrinsics.h(obj2);
                        bVar = (t0m.b) obj2;
                    } else {
                        String str = "snowplowEvents-" + new Regex("[^a-zA-Z0-9_]+").replace("com.fourthline.sdk", "-") + ".sqlite";
                        t0m.a.a(context, str);
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                        t0m.b bVar2 = new t0m.b(applicationContext, str, null, 1);
                        map.put("com.fourthline.sdk", bVar2);
                        bVar = bVar2;
                    }
                }
                this$02.f267055c = bVar;
                if (!this$02.a()) {
                    t0m.b bVar3 = this$02.f267055c;
                    SQLiteDatabase writableDatabase = bVar3 != null ? bVar3.getWritableDatabase() : null;
                    this$02.f267054b = writableDatabase;
                    if (writableDatabase != null) {
                        writableDatabase.enableWriteAheadLogging();
                    }
                }
                Intrinsics.checkNotNullExpressionValue("d", "TAG");
                SQLiteDatabase sQLiteDatabase = this$02.f267054b;
                z0m.j.a("d", "DB Path: %s", sQLiteDatabase != null ? sQLiteDatabase.getPath() : null);
                return null;
        }
    }
}
