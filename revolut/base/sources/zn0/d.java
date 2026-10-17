package zn0;

import com.google.gson.reflect.TypeToken;
import com.revolut.core.strings_ota.impl.services.StringsOtaService;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import w4l.f;
import wim.z;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements wn0.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f323647g = new TypeToken<Map<String, ? extends String>>() { // from class: com.revolut.core.strings_ota.impl.repository.OtaStringsRepositoryImpl$Companion$STRING_MAP_TYPE_REFERENCE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f323648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f323649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f323650c;
    public final StringsOtaService d;
    public final qd0.b e;
    public final f f;

    public d(ue0.c storage, j memoryCache, b80.c networkStateRepository, StringsOtaService service, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f323648a = storage;
        this.f323649b = memoryCache;
        this.f323650c = networkStateRepository;
        this.d = service;
        this.e = languageProvider;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: zn0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f323644b;

            {
                this.f323644b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f323644b;
                        break;
                    case 1:
                        Map stringsOtaInfo = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stringsOtaInfo, "stringsOtaInfo");
                        d dVar2 = this.f323644b;
                        dVar2.f323649b.f("STRINGS_OTA_INFO" + dVar2.a(), stringsOtaInfo);
                        break;
                    default:
                        Map stringsOtaInfo2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stringsOtaInfo2, "stringsOtaInfo");
                        d dVar3 = this.f323644b;
                        dVar3.f323648a.G(stringsOtaInfo2, j6.a.q("STRINGS_OTA_INFO", dVar3.a()), z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: zn0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f323646b;

            {
                this.f323646b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f323646b;
                        return (Map) v7.r("STRINGS_OTA_INFO", dVar.a(), dVar.f323649b);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar2 = this.f323646b;
                        ue0.c cVar = dVar2.f323648a;
                        String strQ = j6.a.q("STRINGS_OTA_INFO", dVar2.a());
                        Type STRING_MAP_TYPE_REFERENCE = d.f323647g;
                        Intrinsics.checkNotNullExpressionValue(STRING_MAP_TYPE_REFERENCE, "STRING_MAP_TYPE_REFERENCE");
                        return (Map) cVar.T2(strQ, STRING_MAP_TYPE_REFERENCE);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: zn0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f323644b;

            {
                this.f323644b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f323644b;
                        break;
                    case 1:
                        Map stringsOtaInfo = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stringsOtaInfo, "stringsOtaInfo");
                        d dVar2 = this.f323644b;
                        dVar2.f323649b.f("STRINGS_OTA_INFO" + dVar2.a(), stringsOtaInfo);
                        break;
                    default:
                        Map stringsOtaInfo2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stringsOtaInfo2, "stringsOtaInfo");
                        d dVar3 = this.f323644b;
                        dVar3.f323648a.G(stringsOtaInfo2, j6.a.q("STRINGS_OTA_INFO", dVar3.a()), z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: zn0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f323646b;

            {
                this.f323646b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f323646b;
                        return (Map) v7.r("STRINGS_OTA_INFO", dVar.a(), dVar.f323649b);
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar2 = this.f323646b;
                        ue0.c cVar = dVar2.f323648a;
                        String strQ = j6.a.q("STRINGS_OTA_INFO", dVar2.a());
                        Type STRING_MAP_TYPE_REFERENCE = d.f323647g;
                        Intrinsics.checkNotNullExpressionValue(STRING_MAP_TYPE_REFERENCE, "STRING_MAP_TYPE_REFERENCE");
                        return (Map) cVar.T2(strQ, STRING_MAP_TYPE_REFERENCE);
                }
            }
        };
        final int i3 = 2;
        this.f = new f(function2, function1, function22, function12, new Function2(this) { // from class: zn0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f323644b;

            {
                this.f323644b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d dVar = this.f323644b;
                        break;
                    case 1:
                        Map stringsOtaInfo = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stringsOtaInfo, "stringsOtaInfo");
                        d dVar2 = this.f323644b;
                        dVar2.f323649b.f("STRINGS_OTA_INFO" + dVar2.a(), stringsOtaInfo);
                        break;
                    default:
                        Map stringsOtaInfo2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(stringsOtaInfo2, "stringsOtaInfo");
                        d dVar3 = this.f323644b;
                        dVar3.f323648a.G(stringsOtaInfo2, j6.a.q("STRINGS_OTA_INFO", dVar3.a()), z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final String a() {
        qd0.b bVar = this.e;
        if (Intrinsics.f(((s80.b) bVar).a().toLanguageTag(), "en-US")) {
            String languageTag = ((s80.b) bVar).a().toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
            return languageTag;
        }
        String language = ((s80.b) bVar).a().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    public final String b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) v7.r("STRINGS_OTA_INFO", a(), this.f323649b);
        if (map == null) {
            String strQ = j6.a.q("STRINGS_OTA_INFO", a());
            Type STRING_MAP_TYPE_REFERENCE = f323647g;
            Intrinsics.checkNotNullExpressionValue(STRING_MAP_TYPE_REFERENCE, "STRING_MAP_TYPE_REFERENCE");
            map = (Map) this.f323648a.T2(strQ, STRING_MAP_TYPE_REFERENCE);
            if (map == null) {
                return null;
            }
        }
        return (String) map.get(key);
    }

    public final efm.b c() {
        return this.f.g(Unit.f186387a, false);
    }
}
