package h96;

import cli.y;
import cli.z;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements z {

    @NotNull
    public static final g Companion = new g();
    public final DirectDepositPreviewContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tqi.g f150184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b96.h f150185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f150186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t70.g f150187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f150188t;

    public j(k stateMapper, DirectDepositPreviewContract$InputData inputData, tqi.g shareNaviCommandFactory, b96.h pdfInteractor, ang.f userInteractor, t70.g localization) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(pdfInteractor, "pdfInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.o = inputData;
        this.f150184p = shareNaviCommandFactory;
        this.f150185q = pdfInteractor;
        this.f150186r = userInteractor;
        this.f150187s = localization;
        this.f150188t = mra.d.b(this, new a(inputData.f71955c, null, inputData.f71954b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        DirectDepositPreviewContract$InputData directDepositPreviewContract$InputData = this.o;
        l.a1(this, q.q(this.f150185q.a(directDepositPreviewContract$InputData.f71955c, directDepositPreviewContract$InputData.f71954b)), null, null, new i(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150188t;
    }
}
