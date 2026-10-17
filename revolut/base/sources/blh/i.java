package blh;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements f {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f16657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f16658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final clh.e f16659c;
    public final b4f.b d;
    public final o97.m e;
    public final ihm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o5d.a f16660g;

    public i(tzg.m wealthAccountsInteractor, ybl.b instrumentTickerInteractor, clh.e mapper, clh.a headerVariantTransformer, b4f.b temporaryInstrumentRefProvider) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(headerVariantTransformer, "headerVariantTransformer");
        Intrinsics.checkNotNullParameter(temporaryInstrumentRefProvider, "temporaryInstrumentRefProvider");
        this.f16657a = wealthAccountsInteractor;
        this.f16658b = instrumentTickerInteractor;
        this.f16659c = mapper;
        this.d = temporaryInstrumentRefProvider;
        this.e = o97.m.INVEST;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f = bVarE;
    }

    public final ufm.c b(o97.y searchPayload) {
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        ufm.c cVar = new ufm.c(new a09.r(searchPayload, this, 8), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final void c(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : extensions) {
            if (obj2 instanceof o5d.a) {
                arrayList.add(obj2);
            }
        }
        this.f16660g = (o5d.a) zhm.d0.M0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r d(blh.d r9, kotlin.jvm.functions.Function1 r10, zsc.d r11, zsc.d r12, efm.r r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.i.d(blh.d, kotlin.jvm.functions.Function1, zsc.d, zsc.d, efm.r):efm.r");
    }
}
