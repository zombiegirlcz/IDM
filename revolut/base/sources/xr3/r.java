package xr3;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f308236b;

    public /* synthetic */ r(u uVar, int i) {
        this.f308235a = i;
        this.f308236b = uVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xp3.b bVar;
        int i = this.f308235a;
        u uVar = this.f308236b;
        switch (i) {
            case 0:
                t cacheKey = (t) obj2;
                Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                return (xp3.c) uVar.f308242c.get(cacheKey.f308238b);
            case 1:
                w4l.f fVar = uVar.e;
                Unit unit = Unit.f186387a;
                od0.i.Companion.getClass();
                fVar.j(unit, od0.i.f224256b);
                return unit;
            case 2:
                tt3.a it8 = (tt3.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return uVar.f308240a.p(it8);
            case 3:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (od0.i) uVar.f308242c.get("CREDIT_LIMIT_INCREASE_OFFER_KEY");
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                od0.h hVar = od0.i.Companion;
                ve0.c cVar = uVar.d;
                Type CREDIT_LIMIT_INCREASE_OFFER_TYPE = u.f308239g;
                Intrinsics.checkNotNullExpressionValue(CREDIT_LIMIT_INCREASE_OFFER_TYPE, "CREDIT_LIMIT_INCREASE_OFFER_TYPE");
                tr3.b bVar2 = (tr3.b) cVar.T2("CREDIT_LIMIT_INCREASE_OFFER_KEY", CREDIT_LIMIT_INCREASE_OFFER_TYPE);
                if (bVar2 != null) {
                    Object obj3 = vr3.a.f291469a;
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    bVar = new xp3.b(bVar2.getId(), bVar2.getDescription(), (xp3.a) u1.t(bVar2.getState(), xp3.a.HIDDEN, vr3.a.f291469a));
                } else {
                    bVar = null;
                }
                hVar.getClass();
                return od0.h.a(bVar);
        }
    }
}
