package c0a;

import iz9.e;
import kotlin.jvm.internal.Intrinsics;
import o7.d;
import r10.f;
import yz9.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f20196c;
    public final lv9.d d;
    public final zjh.f e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f20197g;

    public b(e socialPaymentsInteractor, f peerToPeerChatEmptyStateProvider, d peerToPeerChatMessagesStateProvider, lv9.d messageReactionsInteractor, zjh.f personalisationsProvider, c transactionForAnimationHolder, a chatItemMerger) {
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerChatEmptyStateProvider, "peerToPeerChatEmptyStateProvider");
        Intrinsics.checkNotNullParameter(peerToPeerChatMessagesStateProvider, "peerToPeerChatMessagesStateProvider");
        Intrinsics.checkNotNullParameter(messageReactionsInteractor, "messageReactionsInteractor");
        Intrinsics.checkNotNullParameter(personalisationsProvider, "personalisationsProvider");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        Intrinsics.checkNotNullParameter(chatItemMerger, "chatItemMerger");
        this.f20194a = socialPaymentsInteractor;
        this.f20195b = peerToPeerChatEmptyStateProvider;
        this.f20196c = peerToPeerChatMessagesStateProvider;
        this.d = messageReactionsInteractor;
        this.e = personalisationsProvider;
        this.f = transactionForAnimationHolder;
        this.f20197g = chatItemMerger;
    }
}
