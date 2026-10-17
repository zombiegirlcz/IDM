package mlc;

import alc.l;
import com.revolut.feature.robo.impl.data.network.RoboAccountService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lrk.h;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import w4l.f;
import wim.z;
import zlc.b;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoboAccountService f206667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rlc.c f206668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wlc.b f206669c;
    public final nlc.a d;
    public final b80.c e;

    public b(RoboAccountService service, rlc.c networkMapper, ylc.b storageMapper, wlc.b storage, nlc.a cache, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storageMapper, "storageMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f206667a = service;
        this.f206668b = networkMapper;
        this.f206669c = storage;
        this.d = cache;
        this.e = connectivityRepository;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f get() {
        uj0.b bVarK0 = w.k0(this.e, new h(1, this, b.class, "fromNetwork", "fromNetwork(Lkotlin/Unit;)Lio/reactivex/Single;", 0, 25));
        h hVar = new h(1, this, b.class, "fromStorage", "fromStorage(Lkotlin/Unit;)Lcom/revolut/feature/robo/api/model/RoboAccount;", 0, 26);
        h hVar2 = new h(1, this, b.class, "fromMemory", "fromMemory(Lkotlin/Unit;)Lcom/revolut/feature/robo/api/model/RoboAccount;", 0, 27);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: mlc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f206666b;

            {
                this.f206666b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                b.a aVar;
                Unit unit = (Unit) obj2;
                l data = (l) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        b bVar = this.f206666b;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        nlc.a aVar2 = bVar.d;
                        Unit unit2 = Unit.f186387a;
                        aVar2.A(unit2, data);
                        return unit2;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(data, "model");
                        int i2 = ylc.a.f314685b[data.f6204a.ordinal()];
                        if (i2 == 1) {
                            aVar = b.a.NONE;
                        } else if (i2 == 2) {
                            aVar = b.a.PENDING;
                        } else if (i2 == 3) {
                            aVar = b.a.COMPLETED;
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = b.a.FAILED;
                        }
                        zlc.b accountInformation = new zlc.b(aVar, hx7.a.A(data.f6205b), hx7.a.A(data.f6206c));
                        wlc.b bVar2 = this.f206666b.f206669c;
                        Intrinsics.checkNotNullParameter(accountInformation, "accountInformation");
                        bVar2.f298470a.G(accountInformation, "ROBO_ACCOUNT_INFORMATION", z.d(o0.b(zlc.b.class)));
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        return new f(bVarK0, hVar2, function2, hVar, new Function2(this) { // from class: mlc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f206666b;

            {
                this.f206666b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                b.a aVar;
                Unit unit = (Unit) obj2;
                l data = (l) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        b bVar = this.f206666b;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        nlc.a aVar2 = bVar.d;
                        Unit unit2 = Unit.f186387a;
                        aVar2.A(unit2, data);
                        return unit2;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(data, "model");
                        int i22 = ylc.a.f314685b[data.f6204a.ordinal()];
                        if (i22 == 1) {
                            aVar = b.a.NONE;
                        } else if (i22 == 2) {
                            aVar = b.a.PENDING;
                        } else if (i22 == 3) {
                            aVar = b.a.COMPLETED;
                        } else {
                            if (i22 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar = b.a.FAILED;
                        }
                        zlc.b accountInformation = new zlc.b(aVar, hx7.a.A(data.f6205b), hx7.a.A(data.f6206c));
                        wlc.b bVar2 = this.f206666b.f206669c;
                        Intrinsics.checkNotNullParameter(accountInformation, "accountInformation");
                        bVar2.f298470a.G(accountInformation, "ROBO_ACCOUNT_INFORMATION", z.d(o0.b(zlc.b.class)));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
