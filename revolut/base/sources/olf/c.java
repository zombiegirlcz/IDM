package olf;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import wa7.p;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f226383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.m f226384b;

    public c(h0 commonDataSource, thf.m transactionTextResourcesMapper, p hiddenAccountsTransactionInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        this.f226383a = commonDataSource;
        this.f226384b = transactionTextResourcesMapper;
    }

    public static TextLocalisedClause a(int i, List list, boolean z) {
        return new TextLocalisedClause(i, list, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, z, 246), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cmf.g b(tof.a3 r27, java.util.Map r28, na7.a r29, cmf.g r30, int r31) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: olf.c.b(tof.a3, java.util.Map, na7.a, cmf.g, int):cmf.g");
    }

    public final oi3.g c(Flow header) {
        Intrinsics.checkNotNullParameter(header, "header");
        h0 h0Var = this.f226383a;
        return new oi3.g(yh5.b.g(h0Var.d(), h0Var.e(), h0Var.g(), header), this, 8);
    }
}
