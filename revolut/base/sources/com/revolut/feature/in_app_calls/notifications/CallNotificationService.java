package com.revolut.feature.in_app_calls.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.app.ServiceCompat;
import be7.k;
import be7.x;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.in_app_calls.CallActivity;
import com.revolut.feature.in_app_calls.Callee;
import com.revolut.feature.in_app_calls.R$string;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import ie7.l;
import ie7.m;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import pe7.f;
import skm.a2;
import skm.c2;
import skm.e0;
import skm.p0;
import vc.s;
import vkm.j2;
import yhm.j;
import zkm.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/in_app_calls/notifications/CallNotificationService;", "Landroid/telecom/ConnectionService;", "Lpe7/c;", "", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "Companion", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallNotificationService extends ConnectionService implements pe7.c, CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VoiceCallInvite f74815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pe7.a f74816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pe7.a f74817c;
    public boolean d;
    public a2 e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eam.b f74818g = new eam.b(this, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineContext f74819h;
    public l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public be7.c f74820j;
    public k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f74821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f74822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fe7.b f74823n;
    public TelecomManager o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PhoneAccountHandle f74824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x f74825q;

    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/notifications/CallNotificationService$Companion$InboundCallExtras;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InboundCallExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<InboundCallExtras> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UUID f74826a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f74827b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f74828c;
            public final Callee d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InboundCallExtras((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), (Callee) parcel.readParcelable(InboundCallExtras.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InboundCallExtras[i];
                }
            }

            public InboundCallExtras(UUID uuid, UUID uuid2, String str, Callee callee) {
                this.f74826a = uuid;
                this.f74827b = uuid2;
                this.f74828c = str;
                this.d = callee;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InboundCallExtras)) {
                    return false;
                }
                InboundCallExtras inboundCallExtras = (InboundCallExtras) obj2;
                return Intrinsics.f(this.f74826a, inboundCallExtras.f74826a) && Intrinsics.f(this.f74827b, inboundCallExtras.f74827b) && Intrinsics.f(this.f74828c, inboundCallExtras.f74828c) && Intrinsics.f(this.d, inboundCallExtras.d);
            }

            public final int hashCode() {
                UUID uuid = this.f74826a;
                int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
                UUID uuid2 = this.f74827b;
                int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
                String str = this.f74828c;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Callee callee = this.d;
                return iHashCode3 + (callee != null ? callee.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f74826a);
                dest.writeSerializable(this.f74827b);
                dest.writeString(this.f74828c);
                dest.writeParcelable(this.d, i);
            }
        }

        private Companion() {
        }

        public static Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallNotificationService.class);
            intent.putExtra("EXTRA_INVITE", (Parcelable) null);
            Intent action = intent.setAction("com.revolut.feature.in_app_calls.HANG_UP_CALL");
            Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
            return action;
        }
    }

    public CallNotificationService() {
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.f74819h = e.d(c2VarE, o.f323119a);
        this.f74821l = j.b(new ie7.a(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.revolut.feature.in_app_calls.notifications.CallNotificationService r12, com.revolut.feature.in_app_calls.notifications.CallNotificationService.Companion.InboundCallExtras r13, int r14, gim.c r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof com.revolut.feature.in_app_calls.notifications.a
            if (r0 == 0) goto L13
            r0 = r15
            com.revolut.feature.in_app_calls.notifications.a r0 = (com.revolut.feature.in_app_calls.notifications.a) r0
            int r1 = r0.f74830x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74830x = r1
            goto L18
        L13:
            com.revolut.feature.in_app_calls.notifications.a r0 = new com.revolut.feature.in_app_calls.notifications.a
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f74830x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            int r14 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> Lb8
            goto L4c
        L2a:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto La2
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            yhm.o.b(r15)
            skm.w1 r15 = skm.w1.f264016b     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            com.revolut.feature.in_app_calls.notifications.b r2 = new com.revolut.feature.in_app_calls.notifications.b     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            r2.<init>(r12, r13, r3)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            r0.u = r14     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            r0.f74830x = r4     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            java.lang.Object r15 = skm.e0.J(r15, r2, r0)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            if (r15 != r1) goto L4c
            return r1
        L4c:
            be7.o r15 = (be7.o) r15     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            be7.k r13 = r12.e()     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            java.util.UUID r0 = r15.f14707a     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            com.revolut.feature.in_app_calls.b r13 = (com.revolut.feature.in_app_calls.b) r13     // Catch: java.lang.Exception -> L9e java.util.concurrent.CancellationException -> Lb8
            java.lang.String r1 = "ticketId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)     // Catch: java.lang.Exception -> L9e java.util.concurrent.CancellationException -> Lb8
            be7.l r1 = new be7.l     // Catch: java.lang.Exception -> L9e java.util.concurrent.CancellationException -> Lb8
            r2 = 2
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L9e java.util.concurrent.CancellationException -> Lb8
            r13.e(r1)     // Catch: java.lang.Exception -> L9e java.util.concurrent.CancellationException -> Lb8
            int r13 = r12.f     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            if (r14 == r13) goto L6b
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> Lb8
            return r12
        L6b:
            pe7.f r5 = r12.f()     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            java.util.UUID r7 = r15.f14707a     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            java.lang.String r8 = r15.f14708b     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            java.lang.String r9 = r15.f14709c     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            java.lang.String r10 = r15.d     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> Lb8
            r11 = r12
            r6 = r12
            pe7.a r12 = r5.startInboundCall(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            r6.f74817c = r12     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            boolean r13 = r6.d     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            if (r13 == 0) goto Lb5
            if (r12 == 0) goto L90
            pe7.f r13 = r6.f()     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            r13.disconnect(r12)     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            goto L90
        L8d:
            r0 = move-exception
        L8e:
            r13 = r0
            goto La2
        L90:
            r6.f74817c = r3     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            r6.stopForeground(r4)     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            r6.stopSelf()     // Catch: java.lang.Exception -> L8d java.util.concurrent.CancellationException -> Lb8
            goto Lb5
        L99:
            r0 = move-exception
            r6 = r12
            goto L8e
        L9c:
            r13 = r12
            goto La2
        L9e:
            r0 = move-exception
            r6 = r12
            r12 = r0
            goto L9c
        La2:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            java.lang.String r15 = "InAppCalls"
            rd0.d.a(r14, r15, r3, r13, r12)
            boolean r12 = r6.d
            if (r12 != 0) goto Lb5
            r12 = 5
            j(r6, r3, r13, r12)
        Lb5:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lb8:
            r0 = move-exception
            r12 = r0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.in_app_calls.notifications.CallNotificationService.b(com.revolut.feature.in_app_calls.notifications.CallNotificationService, com.revolut.feature.in_app_calls.notifications.CallNotificationService$Companion$InboundCallExtras, int, gim.c):java.lang.Object");
    }

    public static void j(CallNotificationService callNotificationService, pe7.a aVar, Exception exc2, int i) {
        Object value;
        Object value2;
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            exc2 = null;
        }
        boolean z = (i & 4) != 0;
        if (callNotificationService.d) {
            return;
        }
        callNotificationService.d = true;
        pe7.a aVar2 = callNotificationService.f74816b;
        if (aVar2 != null) {
            callNotificationService.f().disconnect(aVar2);
        }
        callNotificationService.f74816b = null;
        pe7.a aVar3 = callNotificationService.f74817c;
        if (aVar3 != null) {
            callNotificationService.f().disconnect(aVar3);
        }
        callNotificationService.f74817c = null;
        callNotificationService.f74815a = null;
        x xVar = callNotificationService.f74825q;
        if (xVar != null) {
            xVar.a();
        }
        callNotificationService.f74825q = null;
        fe7.b bVar = callNotificationService.f74823n;
        if (bVar == null) {
            Intrinsics.r("callControlsDispatcher");
            throw null;
        }
        j2 j2Var = bVar.f134456a;
        do {
            value = j2Var.getValue();
            ((Boolean) value).getClass();
        } while (!j2Var.h(value, Boolean.FALSE));
        j2 j2Var2 = bVar.f134457b;
        do {
            value2 = j2Var2.getValue();
        } while (!j2Var2.h(value2, null));
        callNotificationService.d().c();
        if (z) {
            be7.c cVarD = callNotificationService.d();
            cVarD.c();
            oo0.d dVarA = cVarD.a();
            Uri DISCONNECT_URI = be7.c.e;
            Intrinsics.checkNotNullExpressionValue(DISCONNECT_URI, "DISCONNECT_URI");
            ((oo0.k) dVarA).h(DISCONNECT_URI, 0L);
            oo0.d dVarA2 = cVarD.a();
            Intrinsics.checkNotNullExpressionValue(DISCONNECT_URI, "DISCONNECT_URI");
            ((oo0.k) dVarA2).f(DISCONNECT_URI);
        }
        com.revolut.feature.in_app_calls.b bVar2 = (com.revolut.feature.in_app_calls.b) callNotificationService.e();
        bVar2.e(new b58.f(exc2, bVar2, aVar != null ? aVar.f235333b : null));
        callNotificationService.stopForeground(1);
        a2 a2Var = callNotificationService.e;
        if (a2Var == null || !a2Var.d()) {
            callNotificationService.stopSelf();
        }
    }

    public final void a() {
        VoiceCallInvite voiceCallInvite = this.f74815a;
        if (voiceCallInvite == null) {
            return;
        }
        if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            CallActivity.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(this, "context");
            startActivity(CallActivity.Companion.a(0, this));
            return;
        }
        f().acceptCall(this, voiceCallInvite, this);
        l lVar = this.i;
        if (lVar == null) {
            Intrinsics.r("notificationBuilder");
            throw null;
        }
        i(lVar.a(this, voiceCallInvite));
        ((com.revolut.feature.in_app_calls.b) e()).e(new bbh.a(17));
    }

    public final boolean c() {
        boolean z = checkSelfPermission("android.permission.MANAGE_OWN_CALLS") == 0;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "InAppCalls", com.google.android.gms.internal.mlkit_vision_face.a.r("Has MANAGE_OWN_CALLS permission: ", z), null, null, 16);
        return z;
    }

    public final be7.c d() {
        be7.c cVar = this.f74820j;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("callAudioPlayer");
        throw null;
    }

    public final k e() {
        k kVar = this.k;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("inAppCallsInteractor");
        throw null;
    }

    public final f f() {
        f fVar = this.f74822m;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("voiceCallsWrapper");
        throw null;
    }

    public final void g() {
        a2 a2Var;
        if (this.f74816b == null && this.f74817c == null && ((a2Var = this.e) == null || !a2Var.d())) {
            return;
        }
        j(this, this.f74816b, null, 6);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF74819h() {
        return this.f74819h;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h(Intent intent) {
        VoiceCallInvite voiceCallInvite;
        VoiceCallInvite voiceCallInvite2 = (VoiceCallInvite) intent.getParcelableExtra("EXTRA_INVITE");
        if (voiceCallInvite2 != null) {
            this.f74815a = voiceCallInvite2;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.DEBUG;
        String action = intent.getAction();
        VoiceCallInvite voiceCallInvite3 = this.f74815a;
        rd0.d.b(cVar, "InAppCalls", "Service >> processing " + action + "; callId=" + (voiceCallInvite3 != null ? i26.l.h(voiceCallInvite3) : null), null, null, 16);
        String action2 = intent.getAction();
        if (action2 != null) {
            switch (action2.hashCode()) {
                case -1683888526:
                    if (action2.equals("com.revolut.feature.in_app_calls.HANG_UP_CALL")) {
                        g();
                        return;
                    }
                    return;
                case -1003380252:
                    if (action2.equals("com.revolut.feature.in_app_calls.DECLINE_CALL") && (voiceCallInvite = this.f74815a) != null) {
                        f().rejectCall(this, voiceCallInvite);
                        j(this, null, null, 3);
                        return;
                    }
                    return;
                case -733418536:
                    if (action2.equals("com.revolut.feature.in_app_calls.ACCEPT_CALL")) {
                        a();
                        return;
                    }
                    return;
                case 620253939:
                    if (action2.equals("ACTION_CALL_TO_REVOLUT")) {
                        pe7.a aVar = this.f74816b;
                        if (aVar != null) {
                            f().disconnect(aVar);
                        }
                        this.f74816b = null;
                        pe7.a aVar2 = this.f74817c;
                        if (aVar2 != null) {
                            f().disconnect(aVar2);
                        }
                        this.f74817c = null;
                        this.f74815a = null;
                        this.d = false;
                        a2 a2Var = this.e;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        this.f++;
                        Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_INBOUND_CALL_EXTRAS");
                        if (parcelableExtra == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Companion.InboundCallExtras inboundCallExtras = (Companion.InboundCallExtras) parcelableExtra;
                        if (c()) {
                            try {
                                Uri uriFromParts = Uri.fromParts("tel", "revolut", null);
                                TelecomManager telecomManager = this.o;
                                if (telecomManager == null) {
                                    Intrinsics.r("telecomManager");
                                    throw null;
                                }
                                PhoneAccountHandle phoneAccountHandle = this.f74824p;
                                if (phoneAccountHandle == null) {
                                    Intrinsics.r("phoneAccountHandle");
                                    throw null;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
                                bundle.putInt("android.telecom.extra.INCOMING_VIDEO_STATE", 0);
                                telecomManager.placeCall(uriFromParts, bundle);
                            } catch (Exception e) {
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.b(rd0.c.WARNING, "InAppCalls", com.google.android.gms.internal.mlkit_vision_face.a.n("Failed to place outgoing call via Telecom: ", e), null, null, 16);
                            }
                        }
                        l lVar = this.i;
                        if (lVar == null) {
                            Intrinsics.r("notificationBuilder");
                            throw null;
                        }
                        i(lVar.a(this, null));
                        com.revolut.feature.in_app_calls.b bVar = (com.revolut.feature.in_app_calls.b) e();
                        bVar.e(new b4d.c(inboundCallExtras.d, bVar, inboundCallExtras.f74826a, inboundCallExtras.f74827b));
                        CallActivity.INSTANCE.getClass();
                        Intrinsics.checkNotNullParameter(this, "context");
                        startActivity(CallActivity.Companion.a(1, this));
                        this.e = e0.C(this, null, null, new c(this, inboundCallExtras, this.f, null), 3);
                        d().b();
                        return;
                    }
                    return;
                case 1557806564:
                    if (action2.equals("ACTION_START_CALL")) {
                        this.d = false;
                        VoiceCallInvite callInvite = this.f74815a;
                        if (callInvite == null) {
                            return;
                        }
                        if (c()) {
                            Uri uriFromParts2 = Uri.fromParts("tel", callInvite.f74840b, null);
                            TelecomManager telecomManager2 = this.o;
                            if (telecomManager2 == null) {
                                Intrinsics.r("telecomManager");
                                throw null;
                            }
                            PhoneAccountHandle phoneAccountHandle2 = this.f74824p;
                            if (phoneAccountHandle2 == null) {
                                Intrinsics.r("phoneAccountHandle");
                                throw null;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle2);
                            bundle2.putInt("android.telecom.extra.INCOMING_VIDEO_STATE", 0);
                            bundle2.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", uriFromParts2);
                            Unit unit = Unit.f186387a;
                            telecomManager2.addNewIncomingCall(phoneAccountHandle2, bundle2);
                        }
                        l lVar2 = this.i;
                        if (lVar2 == null) {
                            Intrinsics.r("notificationBuilder");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(this, "context");
                        Intrinsics.checkNotNullParameter(callInvite, "callInvite");
                        Intrinsics.checkNotNullParameter(callInvite, "<this>");
                        Person personB = l.b(this, (String) callInvite.f74841c.get("agentName"));
                        m.b(this);
                        NotificationCompat.Builder contentText = new NotificationCompat.Builder(this, "com.revolut.call.incoming").setContentTitle(getString(R$string.in_app_calls_notification_title)).setTicker(getString(R$string.in_app_calls_notification_text)).setContentText(getString(R$string.in_app_calls_notification_text));
                        d dVar = lVar2.f160671a;
                        s70.a aVar3 = dVar.f74835b;
                        z70.a aVar4 = dVar.f74834a;
                        Context context = aVar4.getContext();
                        Companion companion = INSTANCE;
                        Context context2 = aVar4.getContext();
                        companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intent intent2 = new Intent(context2, (Class<?>) CallNotificationService.class);
                        intent2.putExtra("EXTRA_INVITE", (Parcelable) null);
                        Intent action3 = intent2.setAction("com.revolut.feature.in_app_calls.DECLINE_CALL");
                        Intrinsics.checkNotNullExpressionValue(action3, "setAction(...)");
                        PendingIntent service = PendingIntent.getService(context, 2, action3, 201326592);
                        Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
                        Context context3 = aVar4.getContext();
                        CallActivity.Companion companion2 = CallActivity.INSTANCE;
                        Context context4 = aVar4.getContext();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(context4, "context");
                        NotificationCompat.Builder sound = contentText.setStyle(NotificationCompat.CallStyle.forIncomingCall(personB, service, ((s70.b) aVar3).g(context3, 3, CallActivity.Companion.a(1, context4), 201326592, 3))).addPerson(personB).setVisibility(1).setPriority(2).setCategory("call").setSmallIcon(R$drawable.uikit_icn_24_logo_revolut_colour).setSound(Settings.System.DEFAULT_RINGTONE_URI);
                        m.Companion.getClass();
                        NotificationCompat.Builder ongoing = sound.setVibrate(m.f160672a).setAutoCancel(true).setOngoing(true);
                        Context context5 = aVar4.getContext();
                        Context context6 = aVar4.getContext();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(context6, "context");
                        NotificationCompat.Builder fullScreenIntent = ongoing.setFullScreenIntent(((s70.b) aVar3).g(context5, 1, CallActivity.Companion.a(0, context6), 201326592, 3), true);
                        Context context7 = aVar4.getContext();
                        Context context8 = aVar4.getContext();
                        companion2.getClass();
                        Intrinsics.checkNotNullParameter(context8, "context");
                        Notification notificationBuild = fullScreenIntent.setContentIntent(((s70.b) aVar3).g(context7, 1, CallActivity.Companion.a(0, context8), 201326592, 3)).build();
                        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
                        notificationBuild.flags |= 4;
                        i(notificationBuild);
                        com.revolut.feature.in_app_calls.b bVar2 = (com.revolut.feature.in_app_calls.b) e();
                        Intrinsics.checkNotNullParameter(callInvite, "callInvite");
                        bVar2.e(new b9i.f(callInvite, bVar2));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void i(Notification notification) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(notification, "notification");
        int i = checkSelfPermission("android.permission.RECORD_AUDIO") == 0 ? 132 : 4;
        Intrinsics.checkNotNullParameter(notification, "notification");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                objValueOf = Boolean.valueOf(checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
            } else {
                objValueOf = "N/A (pre-Tiramisu)";
            }
            String channelId = notification.getChannelId();
            Object systemService = getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(channelId) : null;
            boolean z = notificationChannel != null;
            Integer numValueOf = notificationChannel != null ? Integer.valueOf(notificationChannel.getImportance()) : null;
            Boolean boolValueOf = notificationManager != null ? Boolean.valueOf(notificationManager.areNotificationsEnabled()) : null;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "InAppCalls", "FGS pre-start: permGranted=" + objValueOf + ", notifsEnabled=" + boolValueOf + ", channelExists=" + z + ", channelImportance=" + numValueOf + ", channelId=" + channelId + ", notificationId=112", null, null, 16);
        } catch (Exception e) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "InAppCalls", com.google.android.gms.internal.mlkit_vision_face.a.n("Failed to log FGS pre-start state: ", e), null, null, 16);
        }
        try {
            ServiceCompat.startForeground(this, 112, notification, i);
        } catch (Exception unused) {
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "InAppCalls", "Unable to start foreground service with type FOREGROUND_SERVICE_TYPE_MICROPHONE", null, null, 16);
            ServiceCompat.startForeground(this, 112, notification, 4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        phm.a aVar = (phm.a) ue0.e.j(this).a().get(ee7.a.class);
        Continuation continuation = null;
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", ee7.a.class, " is not found"));
        }
        ee7.a aVar3 = (ee7.a) aVar2.b();
        l70.e eVar = aVar3.f125111a;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        s70.a aVarM = eVar.m();
        s.j(aVarM);
        this.i = new l(new d(aVarF, aVarM), new m());
        this.f74820j = new be7.c(e4m.b.a(aVar3.o));
        this.k = (k) aVar3.f125115h.get();
        this.f74822m = (f) aVar3.i.get();
        this.f74823n = (fe7.b) aVar3.f125120p.get();
        this.o = (TelecomManager) aVar3.f125121q.get();
        this.f74824p = new PhoneAccountHandle(new ComponentName(this, (Class<?>) CallNotificationService.class), "RevolutCalls");
        PhoneAccountHandle phoneAccountHandle = this.f74824p;
        if (phoneAccountHandle == null) {
            Intrinsics.r("phoneAccountHandle");
            throw null;
        }
        PhoneAccount phoneAccountBuild = new PhoneAccount.Builder(phoneAccountHandle, "RevolutCalls").setCapabilities(2048).build();
        TelecomManager telecomManager = this.o;
        if (telecomManager == null) {
            Intrinsics.r("telecomManager");
            throw null;
        }
        telecomManager.registerPhoneAccount(phoneAccountBuild);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.revolut.feature.in_app_calls.ACCEPT_CALL");
        intentFilter.addAction("com.revolut.feature.in_app_calls.DECLINE_CALL");
        intentFilter.addAction("com.revolut.feature.in_app_calls.HANG_UP_CALL");
        int i = Build.VERSION.SDK_INT;
        eam.b bVar = this.f74818g;
        if (i >= 33) {
            registerReceiver(bVar, intentFilter, 2);
        } else {
            registerReceiver(bVar, intentFilter);
        }
        e0.C(this, null, null, new ie7.c(this, continuation, 0), 3);
        e0.C(this, null, null, new ie7.c(this, continuation, 1), 3);
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Intrinsics.checkNotNullParameter(connectionRequest, "connectionRequest");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "InAppCalls", "onCreateIncomingConnection", null, null, 16);
        x xVar = new x(this);
        xVar.setConnectionCapabilities(64);
        xVar.setConnectionProperties(128);
        xVar.setAddress(connectionRequest.getAddress(), 1);
        xVar.setRinging();
        this.f74825q = xVar;
        return xVar;
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "InAppCalls", "onCreateOutgoingConnection", null, null, 16);
        x xVar = new x(this);
        xVar.setConnectionCapabilities(64);
        xVar.setConnectionProperties(128);
        xVar.setAddress(request.getAddress(), 1);
        xVar.setDialing();
        this.f74825q = xVar;
        return xVar;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "InAppCalls", "onCreateOutgoingConnectionFailed", null, null, 16);
        j(this, null, null, 7);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        x xVar = this.f74825q;
        if (xVar != null) {
            xVar.a();
        }
        this.f74825q = null;
        d().c();
        unregisterReceiver(this.f74818g);
        e0.j(this.f74819h, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        h(intent);
        return 2;
    }
}
