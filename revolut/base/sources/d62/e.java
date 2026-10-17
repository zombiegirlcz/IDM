package d62;

import com.revolut.feature.apm.iris.impl.qr.IrisQrHandlerImpl$NullBarcode;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import xo9.h;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements s52.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f111440a;

    public e(uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f111440a = apmFeatureChecker;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        ufm.c cVar = new ufm.c(new b(parsingResult, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        i iVar = new i(((ty1.b) this.f111440a).e(), new d2i.a(new a(this, code, 0), 12), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // g12.l
    public final Object c(xq2.a aVar, Continuation continuation) {
        String str;
        if (aVar == null || (str = aVar.f308049a) == null) {
            throw new IrisQrHandlerImpl$NullBarcode();
        }
        return new d(str);
    }
}
