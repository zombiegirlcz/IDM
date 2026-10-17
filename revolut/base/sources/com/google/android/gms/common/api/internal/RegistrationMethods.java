package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class RegistrationMethods<A extends Api.AnyClient, L> {

    @NonNull
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;

    @NonNull
    public final UnregisterListenerMethod zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @NonNull
    public final Runnable f37803zab;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, L> {
        private RemoteCall zaa;

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private RemoteCall f37804zab;

        /* JADX INFO: renamed from: zad, reason: collision with root package name */
        private ListenerHolder f37806zad;

        /* JADX INFO: renamed from: zae, reason: collision with root package name */
        private Feature[] f37807zae;

        /* JADX INFO: renamed from: zag, reason: collision with root package name */
        private int f37809zag;

        /* JADX INFO: renamed from: zac, reason: collision with root package name */
        private Runnable f37805zac = zacj.zaa;

        /* JADX INFO: renamed from: zaf, reason: collision with root package name */
        private boolean f37808zaf = true;

        private Builder() {
        }

        @NonNull
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            Preconditions.checkArgument(this.zaa != null, "Must set register function");
            Preconditions.checkArgument(this.f37804zab != null, "Must set unregister function");
            Preconditions.checkArgument(this.f37806zad != null, "Must set holder");
            return new RegistrationMethods<>(new zack(this, this.f37806zad, this.f37807zae, this.f37808zaf, this.f37809zag), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.f37806zad.getListenerKey(), "Key must not be null")), this.f37805zac, null);
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@NonNull Runnable runnable) {
            this.f37805zac = runnable;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> register(@NonNull RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.f37808zaf = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> setFeatures(@NonNull Feature... featureArr) {
            this.f37807zae = featureArr;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.f37809zag = i;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> unregister(@NonNull RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.f37804zab = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, L> withHolder(@NonNull ListenerHolder<L> listenerHolder) {
            this.f37806zad = listenerHolder;
            return this;
        }

        public /* synthetic */ Builder(zacm zacmVar) {
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacnVar) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.f37803zab = runnable;
    }

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>(null);
    }
}
