package ffc;

import com.revolut.feature.revpro.card_reader.impl.repository.service.RevProRequirementsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import fag.m0;
import fca.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevProRequirementsService f134798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f134799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f134800c;

    public c(RevProRequirementsService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f134798a = service;
        this.f134799b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f134800c = new f(new Function2(this) { // from class: ffc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f134797b;

            {
                this.f134797b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<zec.a> appState = this.f134797b.f134798a.getAppState();
                        m0 m0Var = new m0(new fe9.f(17), 24);
                        appState.getClass();
                        i iVar = new i(appState, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f134797b.f134799b.f("APP_NEEDS_UPDATE_KEY", bool);
                        return Unit.f186387a;
                }
            }
        }, new d(this, 10), new Function2(this) { // from class: ffc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f134797b;

            {
                this.f134797b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<zec.a> appState = this.f134797b.f134798a.getAppState();
                        m0 m0Var = new m0(new fe9.f(17), 24);
                        appState.getClass();
                        i iVar = new i(appState, m0Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f134797b.f134799b.f("APP_NEEDS_UPDATE_KEY", bool);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
