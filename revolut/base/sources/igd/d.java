package igd;

import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$Step;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f161162a;

    static {
        int[] iArr = new int[SharedAddAssetFlowContract$Step.values().length];
        try {
            iArr[SharedAddAssetFlowContract$Step.ASSET_TYPE_CHOOSER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedAddAssetFlowContract$Step.ASSET_CHOOSER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f161162a = iArr;
    }
}
