package l21;

import a08.o0;
import android.content.Context;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.data.utils.gson.GsonHolder;
import cpi.g;
import efm.r;
import ihm.f;
import ij.e;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import wfm.x;
import yhm.j;
import zhm.p;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements ue0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f191604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je0.d f191606c;
    public final int d;
    public final List e;
    public final yk0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f191607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f191608h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f191609j;

    public c(Context context, String fileName, je0.d jsonMapper, int i, List migrationList, yk0.a databaseSessionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(jsonMapper, "jsonMapper");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        this.f191604a = context;
        this.f191605b = fileName;
        this.f191606c = jsonMapper;
        this.d = i;
        this.e = migrationList;
        this.f = databaseSessionProvider;
        this.f191607g = new x();
        Intrinsics.checkNotNullExpressionValue(new f(), "create(...)");
        final int i2 = 0;
        this.f191608h = j.b(new Function0(this) { // from class: l21.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f191602b;

            {
                this.f191602b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f191602b.f.getToken();
                    case 1:
                        c cVar = this.f191602b;
                        byte[] bytes = ((String) cVar.f191608h.getValue()).getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        byte[] bArrM = p.m(bytes, 0, 16);
                        Context context2 = cVar.f191604a;
                        ij.d dVar = new ij.d(context2);
                        dVar.f161654l = ij.b.LAZY;
                        String str = cVar.f191605b;
                        dVar.f161653j = str;
                        dVar.f161655m = new g(bArrM);
                        dVar.f161656n = new lj.b(bArrM);
                        dVar.f161652h.f192417a.add(context2.getSharedPreferences(str, 0));
                        dVar.k = true;
                        ij.a aVarA = dVar.a();
                        ((we0.c) cVar.f191609j.getValue()).a(aVarA);
                        return aVarA;
                    default:
                        we0.b bVar = we0.c.Companion;
                        c cVar2 = this.f191602b;
                        String str2 = cVar2.f191605b;
                        int i3 = cVar2.d;
                        List list = cVar2.e;
                        je0.d dVar2 = cVar2.f191606c;
                        bVar.getClass();
                        return we0.b.a(str2, i3, list, dVar2);
                }
            }
        });
        final int i3 = 1;
        this.i = j.b(new Function0(this) { // from class: l21.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f191602b;

            {
                this.f191602b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.f191602b.f.getToken();
                    case 1:
                        c cVar = this.f191602b;
                        byte[] bytes = ((String) cVar.f191608h.getValue()).getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        byte[] bArrM = p.m(bytes, 0, 16);
                        Context context2 = cVar.f191604a;
                        ij.d dVar = new ij.d(context2);
                        dVar.f161654l = ij.b.LAZY;
                        String str = cVar.f191605b;
                        dVar.f161653j = str;
                        dVar.f161655m = new g(bArrM);
                        dVar.f161656n = new lj.b(bArrM);
                        dVar.f161652h.f192417a.add(context2.getSharedPreferences(str, 0));
                        dVar.k = true;
                        ij.a aVarA = dVar.a();
                        ((we0.c) cVar.f191609j.getValue()).a(aVarA);
                        return aVarA;
                    default:
                        we0.b bVar = we0.c.Companion;
                        c cVar2 = this.f191602b;
                        String str2 = cVar2.f191605b;
                        int i32 = cVar2.d;
                        List list = cVar2.e;
                        je0.d dVar2 = cVar2.f191606c;
                        bVar.getClass();
                        return we0.b.a(str2, i32, list, dVar2);
                }
            }
        });
        final int i5 = 2;
        this.f191609j = j.b(new Function0(this) { // from class: l21.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f191602b;

            {
                this.f191602b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f191602b.f.getToken();
                    case 1:
                        c cVar = this.f191602b;
                        byte[] bytes = ((String) cVar.f191608h.getValue()).getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        byte[] bArrM = p.m(bytes, 0, 16);
                        Context context2 = cVar.f191604a;
                        ij.d dVar = new ij.d(context2);
                        dVar.f161654l = ij.b.LAZY;
                        String str = cVar.f191605b;
                        dVar.f161653j = str;
                        dVar.f161655m = new g(bArrM);
                        dVar.f161656n = new lj.b(bArrM);
                        dVar.f161652h.f192417a.add(context2.getSharedPreferences(str, 0));
                        dVar.k = true;
                        ij.a aVarA = dVar.a();
                        ((we0.c) cVar.f191609j.getValue()).a(aVarA);
                        return aVarA;
                    default:
                        we0.b bVar = we0.c.Companion;
                        c cVar2 = this.f191602b;
                        String str2 = cVar2.f191605b;
                        int i32 = cVar2.d;
                        List list = cVar2.e;
                        je0.d dVar2 = cVar2.f191606c;
                        bVar.getClass();
                        return we0.b.a(str2, i32, list, dVar2);
                }
            }
        });
    }

    @Override // ue0.c
    public final void G(Object value, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        e eVarEdit = a().edit();
        eVarEdit.g(key, GsonHolder.a().k(value));
        eVarEdit.commit();
    }

    @Override // ue0.c
    public final boolean I0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e eVarEdit = a().edit();
        eVarEdit.i(key);
        return eVarEdit.commit();
    }

    @Override // ue0.c
    public final Object T2(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        String string = a().getString(key, null);
        if (string != null) {
            return GsonHolder.a().d(string, type);
        }
        return null;
    }

    public final ij.a a() {
        Object value = this.i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ij.a) value;
    }

    @Override // od0.e
    public final void clear() {
        r rVarSubscribeOn = r.fromCallable(new h4d.d(this, 16)).subscribeOn(this.f191607g);
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        k65.d dVar = new k65.d(1, gom.e.f145194a, gom.c.class, "w", "w(Ljava/lang/Throwable;)V", 0, 29);
        r rVarOnErrorResumeNext = rVarSubscribeOn.onErrorResumeNext(new kgm.c(new j2i.c(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new o0(28, b.f191603a), new o0(28, dVar)), "subscribe(...)");
    }

    @Override // ue0.c
    public final Set keys() {
        Set setB = a().b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        return setB;
    }

    @Override // ue0.c
    public final Object v0(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        Object objT2 = T2(key, type);
        return objT2 == null ? obj2 : objT2;
    }
}
