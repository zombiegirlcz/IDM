package n97;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import efm.r;
import i97.l;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import mx0.x8;
import n1g.p;
import o97.k0;
import o97.l0;
import o97.m;
import o97.y;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements z87.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f213601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f213602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f213603c;
    public final ConcurrentHashMap d;
    public Set e;
    public volatile g f;

    public k(Map delegateProviderMap, l dataExtractor) {
        Intrinsics.checkNotNullParameter(delegateProviderMap, "delegateProviderMap");
        Intrinsics.checkNotNullParameter(dataExtractor, "dataExtractor");
        this.f213601a = delegateProviderMap;
        this.f213602b = dataExtractor;
        this.f213603c = yhm.j.b(new x8(this, 20));
        this.d = new ConcurrentHashMap();
    }

    /* JADX WARN: Path cross not found for [B:28:0x0066, B:39:0x0089], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00b9 -> B:49:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(n97.k r6, efm.r r7, n97.g r8, gim.c r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n97.k.m(n97.k, efm.r, n97.g, gim.c):java.lang.Object");
    }

    @Override // z87.e
    public final m a() {
        return (m) this.f213603c.getValue();
    }

    @Override // z87.f
    public final boolean b() {
        return true;
    }

    @Override // z87.f
    public final void d() {
        this.f = null;
    }

    @Override // z87.e
    public final r e(String searchQuery, GlobalSearchContext context, r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        g gVar = this.f;
        if (gVar != null) {
            oji.i iVar = (oji.i) gVar.e.f225800a.getValue();
            obj = (String) (iVar != null ? iVar.f225798a : null);
        }
        return rd0.e.c(new p(Intrinsics.f(obj, searchQuery) ? gVar.f213593g : new v1(new mp6.j(this, remoteObservable, gVar, searchQuery, (Continuation) null, 4)), this, 13), kotlin.coroutines.g.f186406a);
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.e = extensions;
    }

    @Override // z87.f
    public final o97.r h() {
        return o97.r.SMART_TILES;
    }

    @Override // z87.f
    public final Object k(o97.b bVar) {
        g gVar = this.f;
        if (gVar == null) {
            return o97.e.f223096a;
        }
        l0 l0Var = new l0(bVar, k0.HIDE);
        gVar.a(l0Var);
        return l0Var;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar.f;
        g gVar = obj2 instanceof g ? (g) obj2 : null;
        return gVar != null ? gVar.b(yVar, (gim.c) continuation) : o97.e.f223096a;
    }

    public final a97.g n(String str) {
        a97.g gVar;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object obj2 = this.d.get(str);
        ref$ObjectRef.f186409a = obj2;
        if (obj2 != null) {
            return (a97.g) obj2;
        }
        synchronized (this) {
            try {
                Object obj3 = this.d.get(str);
                ref$ObjectRef.f186409a = obj3;
                if (obj3 == null) {
                    phm.a aVar = (phm.a) this.f213601a.get(str);
                    if (aVar == null || (gVar = (a97.g) aVar.get()) == null) {
                        gVar = null;
                    } else {
                        this.d.put(str, new b(gVar));
                    }
                    ref$ObjectRef.f186409a = gVar;
                    if (gVar != null) {
                        Set set = this.e;
                        if (set == null) {
                            Intrinsics.r("extensions");
                            throw null;
                        }
                        gVar.g(set);
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        a97.g gVar2 = (a97.g) ref$ObjectRef.f186409a;
        if (gVar2 != null) {
            return gVar2;
        }
        throw new IllegalStateException(p.a.p("Tile impl not found [", str, "]"));
    }
}
