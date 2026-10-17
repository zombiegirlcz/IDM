package com.revolut.sso.impl.authentication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pjl.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/authentication/RevolutAuthenticationService;", "Landroid/app/Service;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutAuthenticationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f106026a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i iVar = this.f106026a;
        if (iVar == null) {
            Intrinsics.r("authenticator");
            throw null;
        }
        IBinder iBinder = iVar.getIBinder();
        Intrinsics.checkNotNullExpressionValue(iBinder, "getIBinder(...)");
        return iBinder;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Intrinsics.checkNotNullParameter(this, "context");
        this.f106026a = new i(this);
    }
}
