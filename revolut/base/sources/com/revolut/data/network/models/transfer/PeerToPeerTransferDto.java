package com.revolut.data.network.models.transfer;

import com.revolut.data.network.models.moneyrequest.TransferLinkDetailsDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto;", "", "Transfer", "Link", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto$Link;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto$Transfer;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerTransferDto {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto$Link;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto;", "data", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "<init>", "(Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;)V", "getData", "()Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Link implements PeerToPeerTransferDto {

        @b("data")
        @NotNull
        private final TransferLinkDetailsDto data;

        public Link(@NotNull TransferLinkDetailsDto data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public static /* synthetic */ Link copy$default(Link link, TransferLinkDetailsDto transferLinkDetailsDto, int i, Object obj2) {
            if ((i & 1) != 0) {
                transferLinkDetailsDto = link.data;
            }
            return link.copy(transferLinkDetailsDto);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TransferLinkDetailsDto getData() {
            return this.data;
        }

        @NotNull
        public final Link copy(@NotNull TransferLinkDetailsDto data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Link(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && Intrinsics.f(this.data, ((Link) other).data);
        }

        @NotNull
        public final TransferLinkDetailsDto getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto$Transfer;", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferDto;", "data", "Lcom/revolut/data/network/models/transfer/PeerToPeerTransferInfoDto;", "<init>", "(Lcom/revolut/data/network/models/transfer/PeerToPeerTransferInfoDto;)V", "getData", "()Lcom/revolut/data/network/models/transfer/PeerToPeerTransferInfoDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements PeerToPeerTransferDto {

        @b("data")
        @NotNull
        private final PeerToPeerTransferInfoDto data;

        public Transfer(@NotNull PeerToPeerTransferInfoDto data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public static /* synthetic */ Transfer copy$default(Transfer transfer, PeerToPeerTransferInfoDto peerToPeerTransferInfoDto, int i, Object obj2) {
            if ((i & 1) != 0) {
                peerToPeerTransferInfoDto = transfer.data;
            }
            return transfer.copy(peerToPeerTransferInfoDto);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PeerToPeerTransferInfoDto getData() {
            return this.data;
        }

        @NotNull
        public final Transfer copy(@NotNull PeerToPeerTransferInfoDto data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Transfer(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transfer) && Intrinsics.f(this.data, ((Transfer) other).data);
        }

        @NotNull
        public final PeerToPeerTransferInfoDto getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }
    }
}
