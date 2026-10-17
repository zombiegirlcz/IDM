package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f257475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ugc.a f257476b;

    public h(wu9.a chatMessageReactionsMapper, b commonBubbleElementsMapper, m paymentBubbleFactory, ugc.a groupChatMessageTagV2Mapper) {
        Intrinsics.checkNotNullParameter(chatMessageReactionsMapper, "chatMessageReactionsMapper");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(groupChatMessageTagV2Mapper, "groupChatMessageTagV2Mapper");
        this.f257475a = paymentBubbleFactory;
        this.f257476b = groupChatMessageTagV2Mapper;
    }
}
