package l16;

import com.revolut.feature.defi.accounts.impl.data.network.DeFiAccountsService;
import do3.q;
import java.util.ArrayList;
import java.util.List;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import krc.h;
import org.jetbrains.annotations.NotNull;
import qe0.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f16.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAccountsService f191476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f191477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h16.a f191478c;
    public final CoroutineScope d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f191479g;

    public e(DeFiAccountsService service, ne0.d memoryCache, h16.a accountsDao, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(accountsDao, "accountsDao");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f191476a = service;
        this.f191477b = memoryCache;
        this.f191478c = accountsDao;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        final int i = 0;
        x4l.c cVar = new x4l.c(new x(this, continuation, 12), new Function1(this) { // from class: l16.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191471b;

            {
                this.f191471b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (e16.b) this.f191471b.f191477b.get(e.b(params.f191474a));
                    default:
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        List all2 = this.f191471b.f191477b.getAll();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : all2) {
                            if (obj3 instanceof e16.b) {
                                arrayList.add(obj3);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: l16.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191473b;

            {
                this.f191473b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        c params = (c) obj2;
                        e16.b account = (e16.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(account, "account");
                        this.f191473b.f191477b.f(e.b(params.f191474a), account);
                        break;
                    default:
                        List<e16.b> accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        for (e16.b bVar : accounts) {
                            this.f191473b.f191477b.f(e.b(bVar.f121886a), bVar);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new h(this, continuation, 29), new l05.b(this, continuation, 3));
        this.e = cVar;
        q.f(cVar, appCoroutineScope);
        final int i2 = 1;
        x4l.c cVar2 = new x4l.c(new x(this, continuation, 13), new Function1(this) { // from class: l16.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191471b;

            {
                this.f191471b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (e16.b) this.f191471b.f191477b.get(e.b(params.f191474a));
                    default:
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        List all2 = this.f191471b.f191477b.getAll();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : all2) {
                            if (obj3 instanceof e16.b) {
                                arrayList.add(obj3);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: l16.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f191473b;

            {
                this.f191473b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        c params = (c) obj2;
                        e16.b account = (e16.b) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(account, "account");
                        this.f191473b.f191477b.f(e.b(params.f191474a), account);
                        break;
                    default:
                        List<e16.b> accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        for (e16.b bVar : accounts) {
                            this.f191473b.f191477b.f(e.b(bVar.f121886a), bVar);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new ko2.b(this, continuation, 19), new l05.b(this, continuation, 4));
        this.f = cVar2;
        this.f191479g = q.f(cVar2, appCoroutineScope);
    }

    public static String b(String str) {
        return j6.a.q("DEFI_ACCOUNT_", str);
    }
}
