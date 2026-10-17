package xo9;

import com.revolut.retail.core.navigation.DummyCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface i {
    default d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        ufm.b bVarM = d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    d0 b(xq2.a aVar);
}
