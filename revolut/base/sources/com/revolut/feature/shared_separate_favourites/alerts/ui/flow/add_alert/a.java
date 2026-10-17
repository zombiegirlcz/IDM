package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert;

import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qed.b;
import ued.d;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final SharedAddAlertFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f86697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qki.d f86698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f86699r;

    public a(SharedAddAlertFlowContract$InputData inputData, d sharedAlertsNotificationManager) {
        FavouritesAssetDetails favouritesAssetDetails;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedAlertsNotificationManager, "sharedAlertsNotificationManager");
        this.o = inputData;
        this.f86697p = sharedAlertsNotificationManager;
        if (inputData.Q3().isEmpty()) {
            throw new IllegalStateException("provide at least 1 assetTypeKey as inputData");
        }
        FavouritesAssetTypeKey favouritesAssetTypeKey = inputData.Q3().size() == 1 ? (FavouritesAssetTypeKey) inputData.Q3().get(0) : null;
        AssetIdWithSymbol assetIdWithSymbolI7 = inputData.i7();
        if (assetIdWithSymbolI7 == null || favouritesAssetTypeKey == null) {
            favouritesAssetDetails = null;
        } else {
            String str = assetIdWithSymbolI7.f86861a;
            String str2 = assetIdWithSymbolI7.f86862b;
            favouritesAssetDetails = new FavouritesAssetDetails(str, str2, str2, favouritesAssetTypeKey, false);
        }
        xi0.b bVarZ1 = inputData.Z1();
        String str3 = bVarZ1 != null ? bVarZ1.f306286a : null;
        boolean z = inputData instanceof SharedAddAlertFlowContract$InputData.Edit;
        SharedAddAlertFlowContract$InputData.Edit edit = z ? (SharedAddAlertFlowContract$InputData.Edit) inputData : null;
        this.f86698q = e.b(this, new SharedAddAlertFlowContract$State(favouritesAssetTypeKey, favouritesAssetDetails, str3, edit != null ? edit.f86693a : null));
        if (inputData.Q3().isEmpty()) {
            throw new IllegalStateException("provide at least 1 assetTypeKey as inputData");
        }
        this.f86699r = cp5.d.a(this, z ? SharedAddAlertFlowContract$Step.EDIT_ALERT : favouritesAssetDetails != null ? SharedAddAlertFlowContract$Step.CREATE_ALERT : inputData.Q3().size() == 1 ? SharedAddAlertFlowContract$Step.FROM_ASSET_CHOOSER : SharedAddAlertFlowContract$Step.FROM_ASSET_TYPE_CHOOSER, f0.f322471a, new q5g.f0(this, 16));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f86698q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f86699r;
    }
}
