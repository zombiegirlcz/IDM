package qf;

import ag.w;
import android.content.Context;
import c0m.c;
import ce.f;
import ce.g;
import ce.v;
import ch.i;
import com.bumptech.glide.n;
import com.google.firebase.components.ComponentRegistrar;
import e8.j;
import gcm.b6;
import gcm.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kfm.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import r8.h;
import yem.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements cfm.a, ReceiverValue, b6, g, d, qe.d, z8.a, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f245204b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245205a;

    public /* synthetic */ b(int i) {
        this.f245205a = i;
    }

    @Override // qe.d
    public qe.b a(ch.b bVar, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        w wVar = jSONObject.has(ib.b.Session) ? new w(jSONObject.getJSONObject(ib.b.Session).optInt("max_custom_exception_events", 8)) : new w(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject(ib.b.Features);
        return new qe.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (((long) iOptInt) * 1000) + System.currentTimeMillis(), wVar, new j(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // gcm.b6
    public void b(Object obj2) {
        ((ExecutorService) ((Executor) obj2)).shutdown();
    }

    public n c(com.bumptech.glide.b bVar, h hVar, r8.n nVar, Context context) {
        switch (this.f245205a) {
            case 2:
                return new c(bVar, hVar, nVar, context);
            default:
                return new n(bVar, hVar, nVar, context);
        }
    }

    @Override // gcm.b6
    public Object create() {
        switch (this.f245205a) {
            case 5:
                return Executors.newCachedThreadPool(p1.e("grpc-okhttp-%d"));
            default:
                return new ArrayList();
        }
    }

    @Override // cfm.a
    public Object d(k kVar) {
        return kVar.getId();
    }

    @Override // ce.g
    public List e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (ce.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f23283a;
            if (str != null) {
                bVar = new ce.b(str, bVar.f23284b, bVar.f23285c, bVar.d, bVar.e, new ae.a(str, bVar, 10), bVar.f23286g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // ce.f
    public Object m(v vVar) {
        return new ch.d(vVar.c(i.class));
    }

    @Override // kfm.d
    public boolean test(Object obj2, Object obj3) {
        return mfm.f.a(obj2, obj3);
    }

    public b(ij0.a coreNetworkConfiguration, j30.c chatFeatureToggles, gi0.a mobileServicesProvider, kf3.a hostsConfiguration, rf3.i chatVersionProvider) {
        this.f245205a = 10;
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        Intrinsics.checkNotNullParameter(hostsConfiguration, "hostsConfiguration");
        Intrinsics.checkNotNullParameter(chatVersionProvider, "chatVersionProvider");
    }
}
