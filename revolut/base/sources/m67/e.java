package m67;

import com.revolut.feature.gambling.impl.services.GamblingBlockService;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m62.l;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import w4l.f;
import z9h.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GamblingBlockService f203030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f203031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f203032c;
    public final f d;

    public e(GamblingBlockService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f203030a = service;
        this.f203031b = memoryCache;
        this.f203032c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: m67.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f203027b;

            {
                this.f203027b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<l67.a> gamblingBlock = this.f203027b.f203030a.getGamblingBlock();
                        m30.b bVar = new m30.b(28, new l(1));
                        gamblingBlock.getClass();
                        i iVar = new i(gamblingBlock, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        i67.a gamblingBlockState = (i67.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
                        this.f203027b.f203031b.f("GAMBLING_BLOCK_KEY", gamblingBlockState.name());
                        break;
                    default:
                        i67.a gamblingBlockState2 = (i67.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(gamblingBlockState2, "gamblingBlockState");
                        n.l(String.class, this.f203027b.f203032c, "GAMBLING_BLOCK_KEY", gamblingBlockState2.name());
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: m67.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f203029b;

            {
                this.f203029b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                i67.a aVarValueOf;
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        String str = (String) this.f203029b.f203031b.get("GAMBLING_BLOCK_KEY");
                        if (str == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        try {
                            return i67.a.valueOf(str);
                        } catch (IllegalArgumentException unused) {
                            return i67.a.UNDEFINED;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        String str2 = (String) this.f203029b.f203032c.T2("GAMBLING_BLOCK_KEY", String.class);
                        if (str2 != null) {
                            Intrinsics.checkNotNullParameter(str2, "<this>");
                            try {
                                aVarValueOf = i67.a.valueOf(str2);
                            } catch (IllegalArgumentException unused2) {
                                aVarValueOf = i67.a.UNDEFINED;
                            }
                            if (aVarValueOf != null) {
                                return aVarValueOf;
                            }
                            break;
                        }
                        return i67.a.UNDEFINED;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: m67.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f203027b;

            {
                this.f203027b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<l67.a> gamblingBlock = this.f203027b.f203030a.getGamblingBlock();
                        m30.b bVar = new m30.b(28, new l(1));
                        gamblingBlock.getClass();
                        i iVar = new i(gamblingBlock, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        i67.a gamblingBlockState = (i67.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
                        this.f203027b.f203031b.f("GAMBLING_BLOCK_KEY", gamblingBlockState.name());
                        break;
                    default:
                        i67.a gamblingBlockState2 = (i67.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(gamblingBlockState2, "gamblingBlockState");
                        n.l(String.class, this.f203027b.f203032c, "GAMBLING_BLOCK_KEY", gamblingBlockState2.name());
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: m67.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f203029b;

            {
                this.f203029b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                i67.a aVarValueOf;
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        String str = (String) this.f203029b.f203031b.get("GAMBLING_BLOCK_KEY");
                        if (str == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        try {
                            return i67.a.valueOf(str);
                        } catch (IllegalArgumentException unused) {
                            return i67.a.UNDEFINED;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        String str2 = (String) this.f203029b.f203032c.T2("GAMBLING_BLOCK_KEY", String.class);
                        if (str2 != null) {
                            Intrinsics.checkNotNullParameter(str2, "<this>");
                            try {
                                aVarValueOf = i67.a.valueOf(str2);
                            } catch (IllegalArgumentException unused2) {
                                aVarValueOf = i67.a.UNDEFINED;
                            }
                            if (aVarValueOf != null) {
                                return aVarValueOf;
                            }
                            break;
                        }
                        return i67.a.UNDEFINED;
                }
            }
        };
        final int i3 = 2;
        this.d = new f(function2, function1, function22, function12, new Function2(this) { // from class: m67.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f203027b;

            {
                this.f203027b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<l67.a> gamblingBlock = this.f203027b.f203030a.getGamblingBlock();
                        m30.b bVar = new m30.b(28, new l(1));
                        gamblingBlock.getClass();
                        i iVar = new i(gamblingBlock, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        i67.a gamblingBlockState = (i67.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
                        this.f203027b.f203031b.f("GAMBLING_BLOCK_KEY", gamblingBlockState.name());
                        break;
                    default:
                        i67.a gamblingBlockState2 = (i67.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(gamblingBlockState2, "gamblingBlockState");
                        n.l(String.class, this.f203027b.f203032c, "GAMBLING_BLOCK_KEY", gamblingBlockState2.name());
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
