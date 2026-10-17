package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zznn;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.PublishCallback;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbx implements Messages {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzbx f48156zza = new zzbx();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final Api.ClientKey f48157zzb = new Api.ClientKey();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final Api.AbstractClientBuilder f48158zzc = new zzbj();

    private zzbx() {
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> getPermissionStatus(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzbq(this, googleApiClient));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final void handleIntent(Intent intent, MessageListener messageListener) {
        zznn.zzb(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> publish(GoogleApiClient googleApiClient, Message message) {
        PublishOptions publishOptions = PublishOptions.DEFAULT;
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        PublishCallback callback = publishOptions.getCallback();
        ListenerHolder listenerHolderRegisterListener = callback == null ? null : googleApiClient.registerListener(callback);
        return googleApiClient.execute(new zzbk(this, googleApiClient, message, listenerHolderRegisterListener != null ? new zzbt(listenerHolderRegisterListener) : null, publishOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> registerStatusCallback(GoogleApiClient googleApiClient, StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return googleApiClient.execute(new zzbr(this, googleApiClient, googleApiClient.registerListener(statusCallback)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        SubscribeCallback callback = subscribeOptions.getCallback();
        ListenerHolder listenerHolderRegisterListener = callback == null ? null : googleApiClient.registerListener(callback);
        return googleApiClient.execute(new zzbn(this, googleApiClient, pendingIntent, listenerHolderRegisterListener != null ? new zzbw(listenerHolderRegisterListener) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unpublish(GoogleApiClient googleApiClient, Message message) {
        Preconditions.checkNotNull(message);
        return googleApiClient.execute(new zzbl(this, googleApiClient, message));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unregisterStatusCallback(GoogleApiClient googleApiClient, StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return googleApiClient.execute(new zzbi(this, googleApiClient, googleApiClient.registerListener(statusCallback)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        return googleApiClient.execute(new zzbp(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, MessageListener messageListener) {
        Preconditions.checkNotNull(messageListener);
        return googleApiClient.execute(new zzbo(this, googleApiClient, googleApiClient.registerListener(messageListener)));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> publish(GoogleApiClient googleApiClient, Message message, PublishOptions publishOptions) {
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        PublishCallback callback = publishOptions.getCallback();
        ListenerHolder listenerHolderRegisterListener = callback == null ? null : googleApiClient.registerListener(callback);
        return googleApiClient.execute(new zzbk(this, googleApiClient, message, listenerHolderRegisterListener != null ? new zzbt(listenerHolderRegisterListener) : null, publishOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        SubscribeCallback callback = subscribeOptions.getCallback();
        ListenerHolder listenerHolderRegisterListener = callback == null ? null : googleApiClient.registerListener(callback);
        return googleApiClient.execute(new zzbn(this, googleApiClient, pendingIntent, listenerHolderRegisterListener != null ? new zzbw(listenerHolderRegisterListener) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, MessageListener messageListener) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderRegisterListener = googleApiClient.registerListener(messageListener);
        SubscribeCallback callback = subscribeOptions.getCallback();
        ListenerHolder listenerHolderRegisterListener2 = callback == null ? null : googleApiClient.registerListener(callback);
        return googleApiClient.execute(new zzbm(this, googleApiClient, listenerHolderRegisterListener, listenerHolderRegisterListener2 != null ? new zzbw(listenerHolderRegisterListener2) : null, subscribeOptions));
    }

    @Override // com.google.android.gms.nearby.messages.Messages
    public final PendingResult<Status> subscribe(GoogleApiClient googleApiClient, MessageListener messageListener, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderRegisterListener = googleApiClient.registerListener(messageListener);
        SubscribeCallback callback = subscribeOptions.getCallback();
        ListenerHolder listenerHolderRegisterListener2 = callback == null ? null : googleApiClient.registerListener(callback);
        return googleApiClient.execute(new zzbm(this, googleApiClient, listenerHolderRegisterListener, listenerHolderRegisterListener2 != null ? new zzbw(listenerHolderRegisterListener2) : null, subscribeOptions));
    }
}
