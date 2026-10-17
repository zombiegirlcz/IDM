package com.revolut.feature.in_app_calls.notifications;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CallNotificationService f74829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f74830x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CallNotificationService callNotificationService, gim.c cVar) {
        super(cVar);
        this.f74829w = callNotificationService;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f74830x |= Integer.MIN_VALUE;
        return CallNotificationService.b(this.f74829w, null, 0, this);
    }
}
