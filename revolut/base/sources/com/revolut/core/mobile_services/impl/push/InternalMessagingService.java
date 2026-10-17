package com.revolut.core.mobile_services.impl.push;

import androidx.lifecycle.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/mobile_services/impl/push/InternalMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "mobile_services_google_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f51397b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f51398a = j.b(new b(this, 24));

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "p0");
        hi0.b bVar = (hi0.b) this.f51398a.getValue();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        bVar.f152442b.onNext(message);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "p0");
        hi0.b bVar = (hi0.b) this.f51398a.getValue();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        bVar.f152443c.onNext(token);
    }
}
