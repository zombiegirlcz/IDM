package f7l;

import com.revolut.shared.feature.configuration.impl.network.ConfigurationService;
import com.youTransactor.uCube.rpc.Constants;
import e7l.g;
import efm.d0;
import efm.r;
import f2i.o;
import j7l.m;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigurationService f132659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f132660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.c f132661c;
    public final ne0.j d;
    public final ne0.j e;
    public volatile Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f132662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f132663h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f132664j;

    public k(ConfigurationService service, ue0.c configStorage, lfm.c configDataCompositeDisposable, ne0.j configMemoryCache, ne0.j transferReasonConfigMemoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(configStorage, "configStorage");
        Intrinsics.checkNotNullParameter(configDataCompositeDisposable, "configDataCompositeDisposable");
        Intrinsics.checkNotNullParameter(configMemoryCache, "configMemoryCache");
        Intrinsics.checkNotNullParameter(transferReasonConfigMemoryCache, "transferReasonConfigMemoryCache");
        this.f132659a = service;
        this.f132660b = configStorage;
        this.f132661c = configDataCompositeDisposable;
        this.d = configMemoryCache;
        this.e = transferReasonConfigMemoryCache;
        this.f132662g = yhm.j.b(new es.e(this, 17));
        final int i = 1;
        final int i2 = 2;
        final int i3 = 3;
        this.f132663h = new w4l.f(new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i;
                int i6 = 0;
                k kVar = this.f132650b;
                switch (i5) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i6);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i6), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new e(this, 0), new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i2;
                int i6 = 0;
                k kVar = this.f132650b;
                switch (i5) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i6);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i6), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new e(this, 1), new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i3;
                int i6 = 0;
                k kVar = this.f132650b;
                switch (i5) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i6);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i6), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 4;
        final int i6 = 5;
        final int i21 = 6;
        this.i = new w4l.f(new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i5;
                int i66 = 0;
                k kVar = this.f132650b;
                switch (i59) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i66);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i66), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new e(this, 2), new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i6;
                int i66 = 0;
                k kVar = this.f132650b;
                switch (i59) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i66);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i66), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new e(this, 3), new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i21;
                int i66 = 0;
                k kVar = this.f132650b;
                switch (i59) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i66);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i66), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 7;
        final int i32 = 0;
        this.f132664j = new w4l.f(new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i22;
                int i66 = 0;
                k kVar = this.f132650b;
                switch (i59) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i66);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i66), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new e(this, 5), new Function2(this) { // from class: f7l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f132650b;

            {
                this.f132650b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i32;
                int i66 = 0;
                k kVar = this.f132650b;
                switch (i59) {
                    case 0:
                        g params = (g) obj2;
                        c7l.d config = (c7l.d) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(config, "config");
                        kVar.e.f(k.d(params), config);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<j7l.d> userConfiguration = kVar.f132659a.getUserConfiguration();
                        j jVar = j.f;
                        dug.e eVar = new dug.e(18);
                        userConfiguration.getClass();
                        ufm.i iVar = new ufm.i(userConfiguration, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        e7l.f config2 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config2, "config");
                        kVar.d.f("CONFIG_TYPE_USER", config2);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config2);
                        return Unit.f186387a;
                    case 3:
                        e7l.f config3 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config3, "config");
                        kVar.f132660b.G(i7l.b.i(config3), "CONFIG_TYPE_USER", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<j7l.d> commonConfiguration = kVar.f132659a.getCommonConfiguration(kVar.a());
                        h hVar = h.f;
                        dug.e eVar2 = new dug.e(17);
                        commonConfiguration.getClass();
                        ufm.f fVar = new ufm.f(new ufm.i(commonConfiguration, eVar2, 1), new o(new e(kVar, 4), 14), i66);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doAfterSuccess(...)");
                        return fVar;
                    case 5:
                        e7l.f config4 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config4, "config");
                        kVar.d.f("CACHED_CONFIG", config4);
                        ((ihm.b) kVar.f132662g.getValue()).onNext(config4);
                        return Unit.f186387a;
                    case 6:
                        e7l.f config5 = (e7l.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(config5, "config");
                        kVar.f132660b.G(i7l.b.i(config5), "CACHED_CONFIG", z.d(o0.b(j7l.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        g transferReasonParams = (g) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(transferReasonParams, "transferReasonParams");
                        ConfigurationService configurationService = kVar.f132659a;
                        String str = transferReasonParams.f132653a;
                        String str2 = transferReasonParams.f132654b;
                        String str3 = transferReasonParams.f132655c;
                        String str4 = transferReasonParams.d;
                        String str5 = transferReasonParams.e;
                        Long l2 = transferReasonParams.f;
                        c7l.a aVar = transferReasonParams.f132656g;
                        String strName = aVar != null ? aVar.name() : null;
                        c7l.a aVar2 = transferReasonParams.f132657h;
                        d0<m> transferReasonConfig = configurationService.getTransferReasonConfig(str, str2, str3, str4, str5, l2, l2, strName, aVar2 != null ? aVar2.name() : null);
                        o oVar = new o(new c(i66), 13);
                        transferReasonConfig.getClass();
                        ufm.i iVar2 = new ufm.i(transferReasonConfig, oVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String d(g gVar) {
        String str = gVar.f132653a;
        String str2 = gVar.f132654b;
        Object obj2 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str3 = gVar.f132655c;
        String str4 = gVar.d;
        if (str4 == null) {
            str4 = "";
        }
        Long l2 = gVar.f;
        if (l2 == null) {
            m70.a.c(t0.f186434a);
        } else {
            obj2 = l2;
        }
        return str + str2 + str3 + str4 + obj2;
    }

    public final long a() {
        Long l2 = this.f;
        return l2 != null ? l2.longValue() : ((Number) this.f132660b.v0(Long.valueOf(new Date(0L).getTime()), "COMMON_CONFIG_LAST_MODIFIED_DATE", Long.TYPE)).longValue();
    }

    public final e7l.f b() {
        ne0.j jVar = this.d;
        e7l.f fVar = (e7l.f) jVar.get("CONFIG_TYPE_USER");
        if (fVar != null) {
            return fVar;
        }
        ue0.c cVar = this.f132660b;
        j7l.e eVar = (j7l.e) j6.a.k(j7l.e.class, cVar, "CONFIG_TYPE_USER");
        e7l.f fVarD = eVar != null ? i7l.b.d(eVar) : null;
        if (fVarD != null) {
            return fVarD;
        }
        e7l.f fVar2 = (e7l.f) jVar.get("CACHED_CONFIG");
        if (fVar2 != null) {
            return fVar2;
        }
        j7l.e eVar2 = (j7l.e) j6.a.k(j7l.e.class, cVar, "CACHED_CONFIG");
        e7l.f fVarD2 = eVar2 != null ? i7l.b.d(eVar2) : null;
        if (fVarD2 != null) {
            return fVarD2;
        }
        e7l.f fVarD3 = i7l.b.d(new j7l.d(0));
        IllegalStateException illegalStateException = new IllegalStateException("No config in storage - locally created config is being used!");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return fVarD3;
    }

    public final r c(e7l.g configType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (configType.equals(g.b.f123407a)) {
            return this.f132663h.e(Unit.f186387a, loadingStrategy);
        }
        if (configType.equals(g.a.f123406a)) {
            return this.i.e(Unit.f186387a, loadingStrategy);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od0.e
    public final void clear() {
        this.d.clear();
        this.f132660b.I0("CONFIG_TYPE_USER");
    }
}
