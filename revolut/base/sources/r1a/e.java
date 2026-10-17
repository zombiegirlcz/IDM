package r1a;

import fnc.s;
import kotlin.jvm.internal.Intrinsics;
import l1a.i;
import nd.o;
import s1a.f;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c70.a f250947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f250948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f250949c;
    public final gte.a d;
    public final s e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f250950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f250951h;

    public e(c70.a clipboard, o chooserCommandFactory, f01.c uiKitResources, gte.a featureToggleInteractor, s splitBillLinkInteractor, f splitBillLinkBottomSheetProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, i splitBillQrStateProvider) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(chooserCommandFactory, "chooserCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(splitBillLinkBottomSheetProvider, "splitBillLinkBottomSheetProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(splitBillQrStateProvider, "splitBillQrStateProvider");
        this.f250947a = clipboard;
        this.f250948b = chooserCommandFactory;
        this.f250949c = uiKitResources;
        this.d = featureToggleInteractor;
        this.e = splitBillLinkInteractor;
        this.f = splitBillLinkBottomSheetProvider;
        this.f250950g = transactionsInteractor;
        this.f250951h = splitBillQrStateProvider;
    }
}
