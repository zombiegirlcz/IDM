package ff8;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_core.impl.services.JuniorAccountService;
import dp4.a1;
import dp4.f1;
import dp4.z0;
import ff4.z;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f134775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f134776h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAccountService f134777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f134778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f134779c;
    public final f01.a d;
    public final x4l.c e;
    public final x4l.c f;

    static {
        Type type = new TypeToken<af8.f>() { // from class: com.revolut.feature.junior_core.impl.repositories.JuniorConfigRepositoryImpl$Companion$JUNIOR_ACCOUNT_CONFIG_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f134775g = type;
        Type type2 = new TypeToken<ef8.a>() { // from class: com.revolut.feature.junior_core.impl.repositories.JuniorConfigRepositoryImpl$Companion$JUNIOR_WALLET_CONFIG_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f134776h = type2;
    }

    public i(JuniorAccountService juniorAccountService, ne0.j memoryCache, ue0.c storage, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(juniorAccountService, "juniorAccountService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f134777a = juniorAccountService;
        this.f134778b = memoryCache;
        this.f134779c = storage;
        this.d = uiKitResources;
        Continuation continuation = null;
        e6d.f fVar = new e6d.f(this, continuation, 7);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: ff8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134774b;

            {
                this.f134774b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (lf8.f) this.f134774b.f134778b.get("KEY_ACCOUNT_CONFIGURATIONS");
                    default:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ne0.j jVar = this.f134774b.f134778b;
                        i.Companion.getClass();
                        return (qf8.a) jVar.get(h.a(it8));
                }
            }
        };
        final int i2 = 1;
        this.e = new x4l.c(fVar, function1, new Function2(this) { // from class: ff8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134772b;

            {
                this.f134772b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String it8 = (String) obj2;
                        qf8.a value = (qf8.a) obj3;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f134772b.f134778b;
                        i.Companion.getClass();
                        jVar.f(h.a(it8), value);
                        break;
                    default:
                        lf8.f value2 = (lf8.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f134772b.f134778b.f("KEY_ACCOUNT_CONFIGURATIONS", value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new z(this, continuation, 2), new z0(this, continuation, 11));
        a1 a1Var = new a1(this, continuation, 26);
        final int i3 = 1;
        Function1 function12 = new Function1(this) { // from class: ff8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134774b;

            {
                this.f134774b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return (lf8.f) this.f134774b.f134778b.get("KEY_ACCOUNT_CONFIGURATIONS");
                    default:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ne0.j jVar = this.f134774b.f134778b;
                        i.Companion.getClass();
                        return (qf8.a) jVar.get(h.a(it8));
                }
            }
        };
        final int i5 = 0;
        this.f = new x4l.c(a1Var, function12, new Function2(this) { // from class: ff8.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f134772b;

            {
                this.f134772b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        String it8 = (String) obj2;
                        qf8.a value = (qf8.a) obj3;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ne0.j jVar = this.f134772b.f134778b;
                        i.Companion.getClass();
                        jVar.f(h.a(it8), value);
                        break;
                    default:
                        lf8.f value2 = (lf8.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f134772b.f134778b.f("KEY_ACCOUNT_CONFIGURATIONS", value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f9d.c(this, continuation, 12), new f1(this, continuation, 15));
    }
}
