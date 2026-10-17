package eh7;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.individual_flags.data.network.IndividualFlagsService;
import dp4.a1;
import efb.i;
import gh7.h;
import gh7.k;
import gh7.l;
import gh7.m;
import gh7.n;
import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import om4.r0;
import org.jetbrains.annotations.NotNull;
import qqj.g;
import r4k.x;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndividualFlagsService f125744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f125745b;

    public d(IndividualFlagsService service, a individualFlagMapper, hhi.d flagsEndpointNameProvider, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(individualFlagMapper, "individualFlagMapper");
        Intrinsics.checkNotNullParameter(flagsEndpointNameProvider, "flagsEndpointNameProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f125744a = service;
        this.f125745b = individualFlagMapper;
        re0.d cache = new re0.d(memoryCache, storage);
        i key = new i(14);
        final int i = 0;
        Function2 mapToDto = new Function2(this) { // from class: eh7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f125743b;

            {
                this.f125743b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                k kVar = (k) obj2;
                switch (i) {
                    case 0:
                        n individualFlagState = (n) obj3;
                        Intrinsics.checkNotNullParameter(kVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(individualFlagState, "domain");
                        this.f125743b.f125745b.getClass();
                        Intrinsics.checkNotNullParameter(individualFlagState, "individualFlagState");
                        if (individualFlagState instanceof m) {
                            m mVar = (m) individualFlagState;
                            return new ch7.b(mVar.f143867a.getKey(), mVar.f143868b.name());
                        }
                        if (individualFlagState instanceof h) {
                            return ch7.a.f24140a;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        ch7.c individualFlagDto = (ch7.c) obj3;
                        Intrinsics.checkNotNullParameter(kVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(individualFlagDto, "dto");
                        a aVar = this.f125743b.f125745b;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(individualFlagDto, "individualFlagDto");
                        if (!(individualFlagDto instanceof ch7.b)) {
                            if (individualFlagDto instanceof ch7.a) {
                                return h.f143864a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        ch7.b individualFlagDto2 = (ch7.b) individualFlagDto;
                        Intrinsics.checkNotNullParameter(individualFlagDto2, "individualFlagDto");
                        k kVar2 = (k) aVar.f125741a.get(individualFlagDto2.getName());
                        if (kVar2 == null) {
                            throw new IllegalStateException(h30.l.r("Unknown name ", individualFlagDto2.getName()));
                        }
                        String value = individualFlagDto2.getValue();
                        l[] lVarArrValues = l.values();
                        int length = lVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                lVar = lVarArrValues[i2];
                                if (!a0.z(lVar.name(), value, true)) {
                                    i2++;
                                }
                            } else {
                                lVar = null;
                            }
                        }
                        if (lVar != null) {
                            return new m(kVar2, lVar);
                        }
                        throw new IllegalStateException(h30.l.r("Unknown value ", individualFlagDto2.getValue()));
                }
            }
        };
        final int i2 = 1;
        Function2 mapToDomain = new Function2(this) { // from class: eh7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f125743b;

            {
                this.f125743b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                l lVar;
                k kVar = (k) obj2;
                switch (i2) {
                    case 0:
                        n individualFlagState = (n) obj3;
                        Intrinsics.checkNotNullParameter(kVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(individualFlagState, "domain");
                        this.f125743b.f125745b.getClass();
                        Intrinsics.checkNotNullParameter(individualFlagState, "individualFlagState");
                        if (individualFlagState instanceof m) {
                            m mVar = (m) individualFlagState;
                            return new ch7.b(mVar.f143867a.getKey(), mVar.f143868b.name());
                        }
                        if (individualFlagState instanceof h) {
                            return ch7.a.f24140a;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        ch7.c individualFlagDto = (ch7.c) obj3;
                        Intrinsics.checkNotNullParameter(kVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(individualFlagDto, "dto");
                        a aVar = this.f125743b.f125745b;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(individualFlagDto, "individualFlagDto");
                        if (!(individualFlagDto instanceof ch7.b)) {
                            if (individualFlagDto instanceof ch7.a) {
                                return h.f143864a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        ch7.b individualFlagDto2 = (ch7.b) individualFlagDto;
                        Intrinsics.checkNotNullParameter(individualFlagDto2, "individualFlagDto");
                        k kVar2 = (k) aVar.f125741a.get(individualFlagDto2.getName());
                        if (kVar2 == null) {
                            throw new IllegalStateException(h30.l.r("Unknown name ", individualFlagDto2.getName()));
                        }
                        String value = individualFlagDto2.getValue();
                        l[] lVarArrValues = l.values();
                        int length = lVarArrValues.length;
                        int i22 = 0;
                        while (true) {
                            if (i22 < length) {
                                lVar = lVarArrValues[i22];
                                if (!a0.z(lVar.name(), value, true)) {
                                    i22++;
                                }
                            } else {
                                lVar = null;
                            }
                        }
                        if (lVar != null) {
                            return new m(kVar2, lVar);
                        }
                        throw new IllegalStateException(h30.l.r("Unknown value ", individualFlagDto2.getValue()));
                }
            }
        };
        a1 fromNetwork = new a1(this, null, 15);
        Type dtoType = new TypeToken<ch7.c>() { // from class: com.revolut.feature.individual_flags.data.repository.IndividualFlagsRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(dtoType, "getType(...)");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(dtoType, "dtoType");
        Intrinsics.checkNotNullParameter(mapToDto, "mapToDto");
        Intrinsics.checkNotNullParameter(mapToDomain, "mapToDomain");
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        new x4l.c(new r0(fromNetwork, mapToDomain, (Continuation) null), new x(cache, key), new qce.b(cache, key, 9), new a9h.c(7, cache, key, dtoType, mapToDomain, (Continuation) null), new re0.b(mapToDto, cache, key, dtoType, null), new g(cache, key, (Continuation) null, 4));
    }
}
