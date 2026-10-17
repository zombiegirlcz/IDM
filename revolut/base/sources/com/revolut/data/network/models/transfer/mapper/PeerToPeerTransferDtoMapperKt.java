package com.revolut.data.network.models.transfer.mapper;

import com.revolut.data.network.models.moneyrequest.mapper.TransferLinkMappingsKt;
import com.revolut.data.network.models.transfer.PeerToPeerTransferDto;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import k71.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"toDescriptor", "Lcom/revolut/domain/models/transfers/PeerToPeerTransferDescriptor;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto;", "toDomain", "Lcom/revolut/domain/models/transfers/PeerToPeerTransferDescriptor$Link;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto$Link;", "Lcom/revolut/domain/models/transfers/PeerToPeerTransferDescriptor$Transfer;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto$Transfer;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerTransferDtoMapperKt {
    @NotNull
    public static final PeerToPeerTransferDescriptor toDescriptor(@NotNull PeerToPeerTransferDto peerToPeerTransferDto) {
        Intrinsics.checkNotNullParameter(peerToPeerTransferDto, "<this>");
        if (peerToPeerTransferDto instanceof PeerToPeerTransferDto.Link) {
            return toDomain((PeerToPeerTransferDto.Link) peerToPeerTransferDto);
        }
        if (peerToPeerTransferDto instanceof PeerToPeerTransferDto.Transfer) {
            return toDomain((PeerToPeerTransferDto.Transfer) peerToPeerTransferDto);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final PeerToPeerTransferDescriptor.Link toDomain(PeerToPeerTransferDto.Link link) {
        return new PeerToPeerTransferDescriptor.Link(TransferLinkMappingsKt.toDomain(link.getData()), null);
    }

    private static final PeerToPeerTransferDescriptor.Transfer toDomain(PeerToPeerTransferDto.Transfer transfer) {
        return new PeerToPeerTransferDescriptor.Transfer(new c(transfer.getData().getGroupId()));
    }
}
