package neh;

import ael.l0;
import androidx.collection.LruCache;
import com.revolut.feature.wealth.options.ui.impl.data.network.OptionsApiService;
import com.revolut.shared.feature.wealth.models.options.Option;
import hx7.q;
import java.util.ArrayList;
import java.util.List;
import k3c.l;
import k50.b2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mc9.n;
import meh.f;
import mqc.p;
import mtj.k;
import n8i.e;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OptionsApiService f214541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f214542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f214543c;
    public final x4l.c d;
    public final LruCache e;
    public final x4l.c f;

    public b(OptionsApiService apiService, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f214541a = apiService;
        this.f214542b = memoryCache;
        this.f214543c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 8), new n7h.c(this, 22), new e(this, 10), new p(2, 8, null), new l(3, 29, continuation));
        this.e = new LruCache(10);
        int i = 4;
        this.f = new x4l.c(new k(this, continuation, 7), new nb6.p(1, this, b.class, "fromOptionsChainMemory", "fromOptionsChainMemory(Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainParams;)Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainPage;", 0, 6), new b2(2, this, b.class, "toOptionsChainMemory", "toOptionsChainMemory(Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainParams;Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainPage;)V", 0, 13), new n(2, this, b.class, "fromOptionsChainStorage", "fromOptionsChainStorage(Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainParams;)Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainPage;", i, 23), new l0(3, this, b.class, "toOptionsChainStorage", "toOptionsChainStorage(Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainParams;Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainPage;)V", i, 26), new n(2, this, b.class, "removeOptionsChain", "removeOptionsChain(Lcom/revolut/feature/wealth/options/ui/impl/domain/model/chain/OptionsChainParams;)V", i, 24));
    }

    public static List a(b bVar, String instrumentRef) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        j jVar = bVar.f214542b;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Object obj2 = jVar.get("Options-ExpirationDates-" + instrumentRef);
        if (obj2 instanceof List) {
            return (List) obj2;
        }
        return null;
    }

    public static Unit b(b bVar, String instrumentRef, List dates) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(dates, "dates");
        j jVar = bVar.f214542b;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        jVar.f("Options-ExpirationDates-" + instrumentRef, dates);
        return Unit.f186387a;
    }

    public static final teh.a c(b bVar, teh.c cVar) {
        bVar.getClass();
        Companion.getClass();
        meh.c cVar2 = (meh.c) j6.a.k(meh.c.class, bVar.f214543c, a.a(cVar));
        if (cVar2 != null) {
            return q.h0(cVar2);
        }
        return null;
    }

    public static final Unit d(b bVar, teh.c cVar) {
        bVar.getClass();
        Companion.getClass();
        String strA = a.a(cVar);
        bVar.e.remove(strA);
        bVar.f214543c.I0(strA);
        return Unit.f186387a;
    }

    public static final Unit e(b bVar, teh.c cVar, teh.a aVar) {
        bVar.getClass();
        Companion.getClass();
        String strA = a.a(cVar);
        c cVar2 = bVar.f214543c;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f270097a;
        String string = aVar.f270098b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str2 = aVar.f270099c.f306286a;
        String str3 = aVar.e;
        String str4 = aVar.f;
        ArrayList<Option> arrayList = aVar.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Option option : arrayList) {
            String str5 = option.f105138a;
            String plainString = option.f105139b.f126703a.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            arrayList2.add(new f(option.e, str5, plainString, option.d.name(), option.f105141g.name()));
        }
        cVar2.G(new meh.c(str, string, str2, str3, str4, arrayList2), strA, z.d(o0.b(meh.c.class)));
        return Unit.f186387a;
    }

    public static final teh.a f(b bVar, teh.c cVar) {
        bVar.getClass();
        Companion.getClass();
        return (teh.a) bVar.e.get(a.a(cVar));
    }

    public static final void g(b bVar, teh.c cVar, teh.a aVar) {
        LruCache lruCache = bVar.e;
        Companion.getClass();
        lruCache.put(a.a(cVar), aVar);
    }
}
