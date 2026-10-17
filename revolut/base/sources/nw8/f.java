package nw8;

import com.revolut.feature.selfserve.sow.api.navigation.SowFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f219798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final npi.f f219799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f219800c;
    public final t70.g d;
    public final FeatureCommand e;

    public f(g presentationModel, npi.f dialogView, m navigator, t70.g localization) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f219798a = presentationModel;
        this.f219799b = dialogView;
        this.f219800c = navigator;
        this.d = localization;
        this.e = new FeatureCommand(new SowFeatureConfig.Sow(false, false));
    }
}
