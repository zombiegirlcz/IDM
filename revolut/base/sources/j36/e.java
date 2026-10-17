package j36;

import aim.f;
import com.revolut.feature.defi.currency.impl.data.network.DeFiCurrencyService;
import iw6.l;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiCurrencyService f170977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f170978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f170979c;
    public final d4m.a d;

    public e(DeFiCurrencyService service, ue0.c storage, j memoryCache, d4m.a currencyDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        this.f170977a = service;
        this.f170978b = storage;
        this.f170979c = memoryCache;
        this.d = currencyDao;
        Continuation continuation = null;
        final int i = 0;
        new x4l.c(new l(this, continuation, 4), new Function1(this) { // from class: j36.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f170973b;

            {
                this.f170973b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Set<String> assetIds = (Set) obj2;
                        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
                        f builder = new f();
                        for (String str : assetIds) {
                            xi0.c cVar = (xi0.c) this.f170973b.f170979c.get(str);
                            if (cVar != null) {
                                builder.put(str, cVar);
                            }
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        f fVarB = builder.b();
                        if (fVarB.i == assetIds.size()) {
                            return fVarB;
                        }
                        return null;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Map) this.f170973b.f170979c.get("KEY_TOP_DEFI_CURRENCIES");
                }
            }
        }, new Function2(this) { // from class: j36.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f170975b;

            {
                this.f170975b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        Map currencies = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f170975b.a(currencies);
                        break;
                    default:
                        Map currencies2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies2, "currencies");
                        e eVar = this.f170975b;
                        eVar.f170979c.f("KEY_TOP_DEFI_CURRENCIES", currencies2);
                        eVar.a(currencies2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iug.j(this, continuation, 17), new d(this, continuation, 0));
        final int i2 = 1;
        new x4l.c(new ghl.l(this, continuation, 19), new Function1(this) { // from class: j36.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f170973b;

            {
                this.f170973b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Set<String> assetIds = (Set) obj2;
                        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
                        f builder = new f();
                        for (String str : assetIds) {
                            xi0.c cVar = (xi0.c) this.f170973b.f170979c.get(str);
                            if (cVar != null) {
                                builder.put(str, cVar);
                            }
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        f fVarB = builder.b();
                        if (fVarB.i == assetIds.size()) {
                            return fVarB;
                        }
                        return null;
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Map) this.f170973b.f170979c.get("KEY_TOP_DEFI_CURRENCIES");
                }
            }
        }, new Function2(this) { // from class: j36.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f170975b;

            {
                this.f170975b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        Map currencies = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Set) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        this.f170975b.a(currencies);
                        break;
                    default:
                        Map currencies2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(currencies2, "currencies");
                        e eVar = this.f170975b;
                        eVar.f170979c.f("KEY_TOP_DEFI_CURRENCIES", currencies2);
                        eVar.a(currencies2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j2c.b(this, continuation, 3), new d(this, continuation, 1));
    }

    public final void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f170979c.f((String) entry.getKey(), (xi0.c) entry.getValue());
        }
    }
}
