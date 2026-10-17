package j6k;

import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.shared.feature.payments.money_request.domain.impl.data.network.MoneyRequestService;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import g48.r0;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.q;
import rfm.s;
import rfm.y;
import skm.p0;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f171817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyRequestService f171818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y8l.l f171819c;
    public final r0 d;
    public final c e;
    public final ne0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue0.c f171820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f171821h;
    public final w4l.f i;

    public o(q userProfileIdsProvider, MoneyRequestService moneyRequestService, y8l.l moneyRequestDao, r0 jointAccountInteractor, c moneyRequestContactNameMapper, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(userProfileIdsProvider, "userProfileIdsProvider");
        Intrinsics.checkNotNullParameter(moneyRequestService, "moneyRequestService");
        Intrinsics.checkNotNullParameter(moneyRequestDao, "moneyRequestDao");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestContactNameMapper, "moneyRequestContactNameMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f171817a = userProfileIdsProvider;
        this.f171818b = moneyRequestService;
        this.f171819c = moneyRequestDao;
        this.d = jointAccountInteractor;
        this.e = moneyRequestContactNameMapper;
        this.f = memoryCache;
        this.f171820g = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: j6k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f171805b;

            {
                this.f171805b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: j6k.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        d dVar = new d(this, 5);
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: j6k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f171805b;

            {
                this.f171805b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: j6k.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        final int i3 = 2;
        this.f171821h = new w4l.f(function2, dVar, function22, null, new Function2(this) { // from class: j6k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f171805b;

            {
                this.f171805b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: j6k.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, new d(this, 6), null, 168);
        final int i5 = 3;
        final int i6 = 4;
        this.i = new w4l.f(new Function2(this) { // from class: j6k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f171805b;

            {
                this.f171805b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: j6k.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new d(this, 7), new Function2(this) { // from class: j6k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f171805b;

            {
                this.f171805b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: j6k.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static MoneyRequestDirection b(String str, String str2, Set set, String str3) {
        return (d0.T(set, str) || !(str3 == null || str2 == null || !str2.equals(str3))) ? MoneyRequestDirection.OUTGOING : MoneyRequestDirection.INCOMING;
    }

    public final s a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.k kVarFirstElement = m70.a.g(d(false), null, new j0g.b(27), 1).firstElement();
        j4e.c cVar = new j4e.c(20, new ik3.a(id10, 25));
        kVarFirstElement.getClass();
        rfm.m mVar = new rfm.m(kVarFirstElement, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        efm.k kVarW = e().w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        efm.k kVarW2 = c().w();
        Intrinsics.checkNotNullExpressionValue(kVarW2, "toMaybe(...)");
        efm.k kVarE0 = w.E0(mVar, kVarW, kVarW2);
        j4e.c cVar2 = new j4e.c(21, new e(this, id10, 1));
        dfm.c cVar3 = mfm.f.d;
        s sVar = new s(new y(kVarE0, cVar3, cVar2, cVar3, mfm.f.f205043c));
        Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
        return sVar;
    }

    public final efm.d0 c() {
        r map = m70.a.g(rd0.e.c(this.d.h(w4l.h.f294642c), kotlin.coroutines.g.f186406a), null, new j0g.b(25), 1).map(new j4e.c(17, new j3f.d(24)));
        od0.i.Companion.getClass();
        efm.d0 d0VarFirst = map.first(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final sfm.b d(boolean z) {
        sfm.b bVar = new sfm.b(w.H0(e(), c()), new j4e.c(18, new gae.a(this, z, 19)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final efm.d0 e() {
        efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.f171817a.a0(), p0.f264003c), null, new j0g.b(26), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
