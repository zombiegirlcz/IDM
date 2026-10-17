package bk2;

import bb2.t;
import com.revolut.feature.atm.impl.network.service.AtmsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.l;
import ne0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements od0.e {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtmsService f16236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f16237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f16238c;
    public final n d;
    public final n e;
    public final w4l.f f;

    public j(AtmsService atmsService, e atmSettingsStorage, c atmMapper) {
        Intrinsics.checkNotNullParameter(atmsService, "atmsService");
        Intrinsics.checkNotNullParameter(atmSettingsStorage, "atmSettingsStorage");
        Intrinsics.checkNotNullParameter(atmMapper, "atmMapper");
        this.f16236a = atmsService;
        this.f16237b = atmSettingsStorage;
        n.Companion.getClass();
        this.f16238c = l.a(1, 5L);
        this.d = l.a(1, 5L);
        this.e = l.a(1, 5L);
        final int i = 0;
        new w4l.f(new t(this, 27), new f(this, 1), new Function2(this) { // from class: bk2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f16235b;

            {
                this.f16235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        this.f16235b.f16238c.f("ATMS_KEY", items);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f16235b;
                        AtmsService atmsService2 = jVar.f16236a;
                        double d = params.f16225a;
                        double d5 = params.f16226b;
                        boolean z = params.f16227c;
                        sj2.c cVar = params.d;
                        d0<List<ak2.b>> atmsNearby = atmsService2.getAtmsNearby(d, d5, 15, z, cVar != null ? cVar.a() : null);
                        bjg.d dVar = new bjg.d(5, new bjg.c(jVar, 6));
                        atmsNearby.getClass();
                        ufm.i iVar = new ufm.i(atmsNearby, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        this.f16235b.d.f("ATMS_NEARBY_KEY", items2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i2 = 1;
        Function2 function2 = new Function2(this) { // from class: bk2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f16235b;

            {
                this.f16235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        this.f16235b.f16238c.f("ATMS_KEY", items);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f16235b;
                        AtmsService atmsService2 = jVar.f16236a;
                        double d = params.f16225a;
                        double d5 = params.f16226b;
                        boolean z = params.f16227c;
                        sj2.c cVar = params.d;
                        d0<List<ak2.b>> atmsNearby = atmsService2.getAtmsNearby(d, d5, 15, z, cVar != null ? cVar.a() : null);
                        bjg.d dVar = new bjg.d(5, new bjg.c(jVar, 6));
                        atmsNearby.getClass();
                        ufm.i iVar = new ufm.i(atmsNearby, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        this.f16235b.d.f("ATMS_NEARBY_KEY", items2);
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        this.f = new w4l.f(function2, new f(this, i3), new Function2(this) { // from class: bk2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f16235b;

            {
                this.f16235b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        if (obj2 != null) {
                            throw new ClassCastException();
                        }
                        List items = (List) obj3;
                        Intrinsics.checkNotNullParameter(null, "<unused var>");
                        Intrinsics.checkNotNullParameter(items, "items");
                        this.f16235b.f16238c.f("ATMS_KEY", items);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d params = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = this.f16235b;
                        AtmsService atmsService2 = jVar.f16236a;
                        double d = params.f16225a;
                        double d5 = params.f16226b;
                        boolean z = params.f16227c;
                        sj2.c cVar = params.d;
                        d0<List<ak2.b>> atmsNearby = atmsService2.getAtmsNearby(d, d5, 15, z, cVar != null ? cVar.a() : null);
                        bjg.d dVar = new bjg.d(5, new bjg.c(jVar, 6));
                        atmsNearby.getClass();
                        ufm.i iVar = new ufm.i(atmsNearby, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        List items2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(items2, "items");
                        this.f16235b.d.f("ATMS_NEARBY_KEY", items2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    @Override // od0.e
    public final void clear() {
        this.f16238c.clear();
        this.e.clear();
    }
}
