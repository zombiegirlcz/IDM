package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f49512b;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i) {
        this.f49511a = i;
        this.f49512b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(Object obj2) {
        boolean z;
        switch (this.f49511a) {
            case 0:
                a0 a0Var = (a0) obj2;
                if (!this.f49512b.e.b() || a0Var.f49475h.a() == null) {
                    return;
                }
                synchronized (a0Var) {
                    z = a0Var.f49474g;
                }
                if (z) {
                    return;
                }
                a0Var.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f49512b;
                CloudMessage cloudMessage = (CloudMessage) obj2;
                af.j jVar = FirebaseMessaging.k;
                if (cloudMessage != null) {
                    vc.s.o(cloudMessage.getIntent());
                    ((Rpc) firebaseMessaging.f49453c.f23326c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f, new m(firebaseMessaging, 1));
                    return;
                }
                return;
        }
    }
}
