package g1m;

import android.content.Context;
import java.util.EnumSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ulm.e0;

/* JADX INFO: loaded from: classes23.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f139736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f139737c;
    public EnumSet d;
    public int e;
    public OkHttpClient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f139738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f139739h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f139740j;

    public h(String uri2, Context context) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f139735a = uri2;
        this.f139736b = context;
        d dVar = s0m.d.f259016a;
        this.f139737c = s0m.d.f259016a;
        this.d = s0m.d.d;
        this.e = s0m.d.f259021j;
        this.i = false;
    }

    public final void a(d httpMethod) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.f139737c = httpMethod;
    }

    public final void b(EnumSet versions) {
        Intrinsics.checkNotNullParameter(versions, "versions");
        this.d = versions;
    }
}
