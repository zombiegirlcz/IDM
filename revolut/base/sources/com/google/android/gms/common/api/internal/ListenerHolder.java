package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ListenerHolder<L> {
    private final Executor zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private volatile Object f37787zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private volatile ListenerKey f37788zac;

    @KeepForSdk
    public static final class ListenerKey<L> {
        private final Object zaa;

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private final String f37789zab;

        @KeepForSdk
        public ListenerKey(L l2, String str) {
            this.zaa = l2;
            this.f37789zab = str;
        }

        @KeepForSdk
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj2;
            return this.zaa == listenerKey.zaa && this.f37789zab.equals(listenerKey.f37789zab);
        }

        @KeepForSdk
        public int hashCode() {
            return this.f37789zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            return this.f37789zab + "@" + System.identityHashCode(this.zaa);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@NonNull L l2);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Looper looper, @NonNull L l2, @NonNull String str) {
        this.zaa = new HandlerExecutor(looper);
        this.f37787zab = Preconditions.checkNotNull(l2, "Listener must not be null");
        this.f37788zac = new ListenerKey(l2, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.f37787zab = null;
        this.f37788zac = null;
    }

    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.f37788zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.f37787zab != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(Notifier notifier) {
        Object obj2 = this.f37787zab;
        if (obj2 == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj2);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Executor executor, @NonNull L l2, @NonNull String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.f37787zab = Preconditions.checkNotNull(l2, "Listener must not be null");
        this.f37788zac = new ListenerKey(l2, Preconditions.checkNotEmpty(str));
    }
}
