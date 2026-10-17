package zeb;

import com.revolut.feature.retail.reverywhere.impl.network.ReverywhereService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReverywhereService f321660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f321661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f321662c;
    public final w4l.f d;

    public k(ReverywhereService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f321660a = service;
        this.f321661b = memoryCache;
        this.f321662c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: zeb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f321657b;

            {
                this.f321657b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        break;
                    case 1:
                        xeb.d token = (xeb.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(token, "token");
                        this.f321657b.f321661b.f("REVERYWHERE_TOKEN_MEMORY_KEY", token);
                        break;
                    default:
                        xeb.d token2 = (xeb.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(token2, "token");
                        this.f321657b.f321662c.G(token2, "REVERYWHERE_TOKEN_STORAGE_KEY", z.d(o0.b(xeb.d.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: zeb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f321659b;

            {
                this.f321659b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit unit = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (xeb.d) this.f321659b.f321661b.get("REVERYWHERE_TOKEN_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (xeb.d) j6.a.k(xeb.d.class, this.f321659b.f321662c, "REVERYWHERE_TOKEN_STORAGE_KEY");
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: zeb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f321657b;

            {
                this.f321657b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        break;
                    case 1:
                        xeb.d token = (xeb.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(token, "token");
                        this.f321657b.f321661b.f("REVERYWHERE_TOKEN_MEMORY_KEY", token);
                        break;
                    default:
                        xeb.d token2 = (xeb.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(token2, "token");
                        this.f321657b.f321662c.G(token2, "REVERYWHERE_TOKEN_STORAGE_KEY", z.d(o0.b(xeb.d.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: zeb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f321659b;

            {
                this.f321659b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit unit = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (xeb.d) this.f321659b.f321661b.get("REVERYWHERE_TOKEN_MEMORY_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        return (xeb.d) j6.a.k(xeb.d.class, this.f321659b.f321662c, "REVERYWHERE_TOKEN_STORAGE_KEY");
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: zeb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f321657b;

            {
                this.f321657b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        break;
                    case 1:
                        xeb.d token = (xeb.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(token, "token");
                        this.f321657b.f321661b.f("REVERYWHERE_TOKEN_MEMORY_KEY", token);
                        break;
                    default:
                        xeb.d token2 = (xeb.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(token2, "token");
                        this.f321657b.f321662c.G(token2, "REVERYWHERE_TOKEN_STORAGE_KEY", z.d(o0.b(xeb.d.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
