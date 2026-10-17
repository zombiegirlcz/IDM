package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yu9.c f257486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f257487b;

    public l(b commonBubbleElementsMapper, m paymentBubbleFactory, wu9.a chatMessageReactionsMapper, yu9.c paymentBubbleTagMapper) {
        Intrinsics.checkNotNullParameter(chatMessageReactionsMapper, "chatMessageReactionsMapper");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleTagMapper, "paymentBubbleTagMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        this.f257486a = paymentBubbleTagMapper;
        this.f257487b = paymentBubbleFactory;
    }
}
