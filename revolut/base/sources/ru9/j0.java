package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yu9.c f257483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f257484b;

    public j0(wu9.a chatMessageReactionsMapper, b commonBubbleElementsMapper, yu9.c paymentBubbleTagMapper, m paymentBubbleFactory, h0 transactionBubbleTextStyleMapper) {
        Intrinsics.checkNotNullParameter(chatMessageReactionsMapper, "chatMessageReactionsMapper");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleTagMapper, "paymentBubbleTagMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(transactionBubbleTextStyleMapper, "transactionBubbleTextStyleMapper");
        this.f257483a = paymentBubbleTagMapper;
        this.f257484b = paymentBubbleFactory;
    }
}
