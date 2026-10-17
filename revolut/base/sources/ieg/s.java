package ieg;

import i9g.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b f160733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ afi.a f160734c;

    public /* synthetic */ s(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar, afi.a aVar, int i) {
        this.f160732a = i;
        this.f160733b = bVar;
        this.f160734c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f160732a) {
            case 0:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                i9g.l lVar = this.f160733b.f94018p;
                lVar.getClass();
                afi.a draft = this.f160734c;
                Intrinsics.checkNotNullParameter(draft, "draft");
                Intrinsics.checkNotNullParameter(user, "user");
                n0 n0Var = lVar.f159812b;
                String strA = n0Var.a(user);
                String strB = n0Var.b(user);
                String str = user.i;
                String str2 = user.f116411g;
                if (str2 == null) {
                    m70.a.c(t0.f186434a);
                    str2 = "";
                }
                return lVar.e(afi.a.a(draft, null, strA, strB, str, str2, null, 1087));
            default:
                xag.c filters = (xag.c) obj2;
                Intrinsics.checkNotNullParameter(filters, "filters");
                afi.a aVar = this.f160734c;
                Intrinsics.h(aVar);
                cgi.c cVar = new cgi.c(aVar.f4101b.f97981a, aVar.f4102c, aVar.d, hx7.a.F(aVar.e));
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = this.f160733b;
                return nim.a.w(bVar.f94019q.d(cVar), new i25.e(bVar, filters, 21)).map(new icc.c(new t(filters, 0), 22));
        }
    }
}
