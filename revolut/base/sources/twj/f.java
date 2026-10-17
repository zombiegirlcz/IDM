package twj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.impl.userauth.network.services.UserAuthService;
import fwj.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import tna.p;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements t0j.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f275036j = new TypeToken<rwj.c>() { // from class: com.revolut.retail.feature.impl.userauth.repositories.UserAuthRepositoryImpl$Companion$USER_AUTH_ANSWERS_TYPE$1
    }.getType();
    public static final ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserAuthService f275037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f275038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f275039c;
    public final gte.a d;
    public final a e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f275040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f275041h;
    public final j2 i;

    public f(UserAuthService userAuthService, j memoryCache, ue0.c storage, gte.a featureToggleInteractor, a userAuthElementNameMapper, i userOnboardedStateHolder, o gson) {
        Intrinsics.checkNotNullParameter(userAuthService, "userAuthService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userAuthElementNameMapper, "userAuthElementNameMapper");
        Intrinsics.checkNotNullParameter(userOnboardedStateHolder, "userOnboardedStateHolder");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f275037a = userAuthService;
        this.f275038b = memoryCache;
        this.f275039c = storage;
        this.d = featureToggleInteractor;
        this.e = userAuthElementNameMapper;
        this.f = userOnboardedStateHolder;
        this.f275040g = gson;
        this.f275041h = new AtomicBoolean(false);
        this.i = q.c(k);
    }

    public static final List a(f fVar, List list, o0j.c cVar) {
        if (list == null) {
            return u.c(cVar);
        }
        int size = list.size();
        ArrayList arrayListF1 = d0.f1(list);
        Iterator it8 = arrayListF1.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (((o0j.c) it8.next()).getClass().equals(cVar.getClass())) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            arrayListF1.set(i, cVar);
            return arrayListF1;
        }
        arrayListF1.add(size, cVar);
        return arrayListF1;
    }

    public final Flow b() {
        tse.c cVar = new tse.c(this.i, this, 5);
        p0 p0Var = p0.f264001a;
        return q.C(cVar, elm.f.f127540b);
    }

    public final Object c(o0j.c cVar, n nVar) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new p(this, cVar, null, 24), nVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // od0.e
    public final void clear() {
        this.i.setValue(k);
        this.f275039c.clear();
        this.f275038b.clear();
        this.f.a();
    }

    public final ufm.i d(String str) {
        efm.d0 d0VarFirstOrError = rd0.e.c(b(), kotlin.coroutines.g.f186406a).firstOrError();
        ts5.o oVar = new ts5.o(24, new twg.a(this, str, 4));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, oVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.i iVar2 = new ufm.i(iVar, new ts5.o(22, new c(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
