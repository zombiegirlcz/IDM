package wwi;

import ip0.s7;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wwi.f;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxi.a f300694a;

    public t(hxi.a airportListItemBuilder) {
        Intrinsics.checkNotNullParameter(airportListItemBuilder, "airportListItemBuilder");
        this.f300694a = airportListItemBuilder;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f300677a;
        f fVar = domainState.f300678b;
        if (fVar instanceof f.a) {
            f.a aVar = (f.a) fVar;
            final int i = 0;
            list = (List) iii.c.f(aVar.f300674a, new Function1(this) { // from class: wwi.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f300693b;

                {
                    this.f300693b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f300693b.b();
                }
            }, new wug.k(18), new vh2.o(this, aVar, 28));
        } else {
            if (!(fVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i2 = 1;
            list = (List) iii.c.f(((g) fVar).f300676a, new Function1(this) { // from class: wwi.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f300693b;

                {
                    this.f300693b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f300693b.b();
                }
            }, new wug.k(19), new vh2.o(this, str, 29));
        }
        return new l(str, list);
    }

    public final List b() {
        List listQ = i2b.a.q(new s7("ID_HEADER_ALL_AIRPORTS", 0, 0, 0, 0, false, null, 126), hxi.a.b(5));
        yp0.b.k(listQ, 0, 0, 0, 0, 31);
        return listQ;
    }
}
