package com.revolut.data.network.models.transfer.adapter;

import com.revolut.data.network.models.transfer.PeerToPeerTransferDto;
import he0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/data/network/models/transfer/adapter/PeerToPeerTransferDtoTypeAdapterFactory;", "", "<init>", "()V", "Lhe0/m;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto;", "create", "()Lhe0/m;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerTransferDtoTypeAdapterFactory {

    @NotNull
    public static final PeerToPeerTransferDtoTypeAdapterFactory INSTANCE = new PeerToPeerTransferDtoTypeAdapterFactory();

    private PeerToPeerTransferDtoTypeAdapterFactory() {
    }

    @NotNull
    public static final m create() {
        m mVarB = m.b(PeerToPeerTransferDto.class, "type");
        mVarB.c(PeerToPeerTransferDto.Transfer.class, "TRANSACTION");
        mVarB.c(PeerToPeerTransferDto.Link.class, "TRANSFER_LINK");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
        return mVarB;
    }
}
