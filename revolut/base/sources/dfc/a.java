package dfc;

import cfc.b;
import kotlin.jvm.internal.Intrinsics;
import rqi.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f113883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f113884b;

    public a(c googlePlayNaviCommandFactory, b cardReaderUiMerchantInteractor) {
        Intrinsics.checkNotNullParameter(googlePlayNaviCommandFactory, "googlePlayNaviCommandFactory");
        Intrinsics.checkNotNullParameter(cardReaderUiMerchantInteractor, "cardReaderUiMerchantInteractor");
        this.f113883a = googlePlayNaviCommandFactory;
        this.f113884b = cardReaderUiMerchantInteractor;
    }
}
