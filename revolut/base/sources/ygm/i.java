package ygm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Disposable f313673a;

    public i(Disposable disposable) {
        this.f313673a = disposable;
    }

    public final String toString() {
        return "NotificationLite.Disposable[" + this.f313673a + "]";
    }
}
