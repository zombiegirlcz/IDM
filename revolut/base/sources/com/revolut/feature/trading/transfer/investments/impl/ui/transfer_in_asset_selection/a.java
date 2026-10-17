package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import s9f.b;
import s9f.c;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f91565p;

    public a(TransferInAssetSelectionFlowContract$InputData inputData) {
        TransferInAssetSelectionFlowContract$State transferInAssetSelectionFlowContract$State;
        FlowStep numberOfShares;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        boolean z = inputData instanceof TransferInAssetSelectionFlowContract$InputData.NewTransferAssetSelection;
        if (z) {
            transferInAssetSelectionFlowContract$State = new TransferInAssetSelectionFlowContract$State(null, 0, null);
        } else {
            if (!(inputData instanceof TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            TransferInSelectedAsset transferInSelectedAsset = ((TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection) inputData).f91555b;
            transferInAssetSelectionFlowContract$State = new TransferInAssetSelectionFlowContract$State(transferInSelectedAsset.f91510a, transferInSelectedAsset.f91511b, transferInSelectedAsset.f91512c);
        }
        this.o = e.b(this, transferInAssetSelectionFlowContract$State);
        if (inputData instanceof TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection) {
            numberOfShares = new TransferInAssetSelectionFlowContract$Step.NumberOfShares(((TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection) inputData).f91555b.f91510a);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            numberOfShares = TransferInAssetSelectionFlowContract$Step.SelectInstrument.f91564a;
        }
        this.f91565p = cp5.d.a(this, numberOfShares, f0.f322471a, new qce.b(inputData, this, 13));
    }

    public static c I2(TransferInAssetSelectionFlowContract$State transferInAssetSelectionFlowContract$State) {
        TransferInInstrument transferInInstrument = transferInAssetSelectionFlowContract$State.f91559a;
        if (transferInInstrument != null) {
            return new c(new TransferInSelectedAsset(transferInInstrument, transferInAssetSelectionFlowContract$State.f91560b, transferInAssetSelectionFlowContract$State.f91561c));
        }
        return null;
    }

    @Override // qki.e
    public final d getState() {
        return this.o;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91565p;
    }
}
