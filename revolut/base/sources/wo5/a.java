package wo5;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import efm.d0;
import k4l.r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import yxb.s;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f298879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f298880c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, Object obj3, boolean z, int i) {
        this.f298878a = i;
        this.f298880c = obj2;
        this.d = obj3;
        this.f298879b = z;
    }

    private final Object a(Object obj2) {
        c49.f fVar = ((z39.b) this.f298880c).f319220a;
        String owner = (String) this.d;
        LocationDomain locationOne = (LocationDomain) obj2;
        Intrinsics.checkNotNullParameter(locationOne, "location");
        if (!this.f298879b) {
            return fVar.b(owner, locationOne);
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(locationOne, "location");
        ue0.c cVar = fVar.e;
        Class cls = Double.TYPE;
        Double d = (Double) j6.a.k(cls, cVar, "LAST_KNOWN_LOCATION_LAT");
        Double d5 = (Double) j6.a.k(cls, cVar, "LAST_KNOWN_LOCATION_LON");
        LocationDomain locationTwo = null;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (d5 != null) {
                locationTwo = new LocationDomain(dDoubleValue, d5.doubleValue());
            }
        }
        if (locationTwo != null) {
            d49.a aVar = fVar.d;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(locationOne, "locationOne");
            Intrinsics.checkNotNullParameter(locationTwo, "locationTwo");
            if (aVar.a(locationOne.f78066a, locationOne.f78067b, locationTwo.f78066a, locationTwo.f78067b) <= 500.0f) {
                m mVar = m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
        }
        return fVar.b(owner, locationOne);
    }

    private final Object b(Object obj2) {
        zk9.c cVar = (zk9.c) this.f298880c;
        jf0.c cVar2 = (jf0.c) this.d;
        Boolean available = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(available, "available");
        if (!available.booleanValue()) {
            return efm.b.n(new IllegalArgumentException(p.a.p("Pay later feature is disabled, deeplinkUri=", cVar2.f173629c, " can't be handled")));
        }
        d0 d0VarB = cVar.b(cVar2, this.f298879b);
        zg8.d dVar = new zg8.d(1, cVar, zk9.c.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 4);
        int i = 4;
        pfm.a aVar = new pfm.a(d0VarB, new zii.e(dVar, i), i);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0aa6  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 3348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo5.a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(Object obj2, boolean z, Object obj3, int i) {
        this.f298878a = i;
        this.f298880c = obj2;
        this.f298879b = z;
        this.d = obj3;
    }

    public /* synthetic */ a(String str, ydf.b bVar, r0 r0Var, boolean z) {
        this.f298878a = 3;
        this.f298880c = str;
        this.d = r0Var;
        this.f298879b = z;
    }

    public /* synthetic */ a(jf0.c cVar, s sVar, boolean z) {
        this.f298878a = 6;
        this.d = cVar;
        this.f298880c = sVar;
        this.f298879b = z;
    }

    public /* synthetic */ a(boolean z, z39.b bVar, String str) {
        this.f298878a = 8;
        this.f298879b = z;
        this.f298880c = bVar;
        this.d = str;
    }
}
