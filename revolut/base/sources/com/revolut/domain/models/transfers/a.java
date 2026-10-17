package com.revolut.domain.models.transfers;

import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final String a(PeerToPeerTransferDescriptor peerToPeerTransferDescriptor) {
        Intrinsics.checkNotNullParameter(peerToPeerTransferDescriptor, "<this>");
        if (peerToPeerTransferDescriptor instanceof PeerToPeerTransferDescriptor.Link) {
            PeerToPeerTransferDescriptor.Link link = (PeerToPeerTransferDescriptor.Link) peerToPeerTransferDescriptor;
            String str = link.f60548b;
            return str == null ? link.f60547a.getF60363b() : str;
        }
        if (peerToPeerTransferDescriptor instanceof PeerToPeerTransferDescriptor.Transfer) {
            return ((PeerToPeerTransferDescriptor.Transfer) peerToPeerTransferDescriptor).f60549a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
