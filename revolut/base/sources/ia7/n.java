package ia7;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements e {

    @NotNull
    public static final h Companion = new h();
    public static final Set k = y0.b("XX");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.d f159965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f159966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OkHttpClient f159967c;
    public final z70.a d;
    public final n8b.a e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f159968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bk0.e f159969h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f159970j;

    public n(ne0.d memoryCache, ue0.c storage, OkHttpClient okHttpClient, z70.a contextProvider, n8b.a countryInteractor, l80.e dateProvider, o tripsMapBitmapGenerator, a geoJsonPathParser, zk0.b fileSystemRepository, bk0.e revolutHeadersProvider) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(tripsMapBitmapGenerator, "tripsMapBitmapGenerator");
        Intrinsics.checkNotNullParameter(geoJsonPathParser, "geoJsonPathParser");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        this.f159965a = memoryCache;
        this.f159966b = storage;
        this.f159967c = okHttpClient;
        this.d = contextProvider;
        this.e = countryInteractor;
        this.f = tripsMapBitmapGenerator;
        this.f159968g = geoJsonPathParser;
        this.f159969h = revolutHeadersProvider;
        Continuation continuation = null;
        final int i = 0;
        this.i = new x4l.c(new k(this, continuation, 1), new f(this, 1), new Function2(this) { // from class: ia7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f159958b;

            {
                this.f159958b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                n nVar = this.f159958b;
                Unit unit = (Unit) obj2;
                j content = (j) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        ne0.d dVar = nVar.f159965a;
                        c cVar = d.Companion;
                        dVar.f(nVar.b().f(), content);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        ne0.d dVar2 = nVar.f159965a;
                        c cVar2 = d.Companion;
                        dVar2.f(nVar.b().c(), content);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l(this, null, 1), new m(this, null, 1));
        final int i2 = 1;
        this.f159970j = new x4l.c(new k(this, continuation, 0), new f(this, 2), new Function2(this) { // from class: ia7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f159958b;

            {
                this.f159958b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                n nVar = this.f159958b;
                Unit unit = (Unit) obj2;
                j content = (j) obj3;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        ne0.d dVar = nVar.f159965a;
                        c cVar = d.Companion;
                        dVar.f(nVar.b().f(), content);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(content, "content");
                        ne0.d dVar2 = nVar.f159965a;
                        c cVar2 = d.Companion;
                        dVar2.f(nVar.b().c(), content);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l(this, null, 0), new m(this, null, 0));
    }

    public final i a(String str, String str2, String str3) throws IOException {
        Type type = l21.d.f;
        Intrinsics.checkNotNullExpressionValue(type, "<get-LONG_TYPE>(...)");
        ue0.c cVar = this.f159966b;
        Long l2 = (Long) cVar.T2(str3, type);
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        i1 i1Var = new i1();
        i1Var.e(str);
        String strString = null;
        i1Var.c("GET", null);
        ulm.n cacheControl = ulm.n.f281107n;
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        cacheControl.getClass();
        String strE = vlm.f.e(cacheControl);
        if (strE.length() == 0) {
            i1Var.d("Cache-Control");
        } else {
            i1Var.b("Cache-Control", strE);
        }
        String str4 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), g0m.a.f139502a).format(DateTimeFormatter.RFC_1123_DATE_TIME);
        Intrinsics.checkNotNullExpressionValue(str4, "httpFormat(...)");
        i1Var.a("If-Modified-Since", str4);
        bk0.e eVar = this.f159969h;
        for (Map.Entry entry : r0.q(r0.q(eVar.e(), eVar.f()), eVar.c()).entrySet()) {
            i1Var.b((String) entry.getKey(), (String) entry.getValue());
        }
        Response responseExecute = FirebasePerfOkHttpClient.execute(this.f159967c.b(new j1(i1Var)));
        if (responseExecute.d == 304) {
            return new i((String) cVar.T2(str2, l21.d.d), jLongValue, false);
        }
        try {
            strString = responseExecute.f226090g.string();
        } catch (IllegalStateException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        return new i(strString, System.currentTimeMillis(), true);
    }

    public final d b() {
        return ((o8b.c) this.e).g() ? d.INDIA : d.DEFAULT;
    }
}
