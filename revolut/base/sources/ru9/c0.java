package ru9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f257462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yu9.c f257463b;

    public c0(b commonBubbleElementsMapper, m paymentBubbleFactory, wu9.a chatMessageReactionsMapper, yu9.c paymentBubbleTagMapper) {
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(paymentBubbleTagMapper, "paymentBubbleTagMapper");
        Intrinsics.checkNotNullParameter(chatMessageReactionsMapper, "chatMessageReactionsMapper");
        this.f257462a = paymentBubbleFactory;
        this.f257463b = paymentBubbleTagMapper;
    }
}
