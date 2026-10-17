package mhj;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_info_bottom_sheet.EsimCommonInfoBottomSheetScreenContract$InputData;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCommonInfoBottomSheetScreenContract$InputData f205579a;

    public c(EsimCommonInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f205579a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimCommonInfoBottomSheetScreenContract$InputData esimCommonInfoBottomSheetScreenContract$InputData = this.f205579a;
        lw0.a aVar = new lw0.a(esimCommonInfoBottomSheetScreenContract$InputData.f100965a, null, null, null, false, 30);
        List listC = u.c(new TextDelegate.Model("ID_COMMON_DESCRIPTION", esimCommonInfoBottomSheetScreenContract$InputData.f100966b, false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new cii.b(null, listC, aVar);
    }
}
