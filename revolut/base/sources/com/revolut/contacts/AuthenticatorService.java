package com.revolut.contacts;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import c60.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/revolut/contacts/AuthenticatorService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "c60/a", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthenticatorService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f51199a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.f(intent.getAction(), "android.accounts.AccountAuthenticator")) {
            if (f51199a == null) {
                Intrinsics.checkNotNullParameter(this, "context");
                f51199a = new a(this);
            }
            a aVar = f51199a;
            if (aVar != null) {
                return aVar.getIBinder();
            }
        }
        return null;
    }
}
