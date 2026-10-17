package ie7;

import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CallNotificationService f160659b;

    public /* synthetic */ b(CallNotificationService callNotificationService, int i) {
        this.f160658a = i;
        this.f160659b = callNotificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r10 = r8.f160658a
            com.revolut.feature.in_app_calls.notifications.CallNotificationService r0 = r8.f160659b
            switch(r10) {
                case 0: goto La5;
                default: goto L7;
            }
        L7:
            com.revolut.feature.in_app_calls.domain.AudioRoute r9 = (com.revolut.feature.in_app_calls.domain.AudioRoute) r9
            be7.x r10 = r0.f74825q
            if (r10 == 0) goto La2
            java.lang.String r0 = "route"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r1 = rd0.c.DEBUG
            boolean r0 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.Earpiece
            if (r0 == 0) goto L1d
            java.lang.String r2 = "Earpiece"
            goto L4e
        L1d:
            boolean r2 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.Speaker
            if (r2 == 0) goto L24
            java.lang.String r2 = "Speaker"
            goto L4e
        L24:
            boolean r2 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.Bluetooth
            if (r2 == 0) goto L48
            r2 = r9
            com.revolut.feature.in_app_calls.domain.AudioRoute$Bluetooth r2 = (com.revolut.feature.in_app_calls.domain.AudioRoute.Bluetooth) r2
            java.lang.String r3 = r2.f74797a
            java.lang.String r4 = r2.f74798b
            java.lang.Integer r2 = r2.f74799c
            java.lang.String r5 = ", address="
            java.lang.String r6 = ", deviceIndex="
            java.lang.String r7 = "Bluetooth(name="
            java.lang.StringBuilder r3 = v0.a.m(r7, r3, r5, r4, r6)
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L4e
        L48:
            boolean r2 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.WiredHeadset
            if (r2 == 0) goto L9c
            java.lang.String r2 = "WiredHeadset"
        L4e:
            java.lang.String r3 = "selectAudioRoute >> route="
            java.lang.String r3 = j6.a.q(r3, r2)
            r5 = 0
            r6 = 16
            java.lang.String r2 = "InAppCalls"
            r4 = 0
            rd0.d.b(r1, r2, r3, r4, r5, r6)
            boolean r1 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.Bluetooth
            r2 = 2
            if (r1 == 0) goto L7d
            r3 = r9
            com.revolut.feature.in_app_calls.domain.AudioRoute$Bluetooth r3 = (com.revolut.feature.in_app_calls.domain.AudioRoute.Bluetooth) r3
            java.lang.String r3 = r3.f74798b
            if (r3 == 0) goto L7d
            android.bluetooth.BluetoothAdapter r4 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r4 == 0) goto L74
            android.bluetooth.BluetoothDevice r3 = r4.getRemoteDevice(r3)
            goto L75
        L74:
            r3 = 0
        L75:
            if (r3 == 0) goto L7d
            r10.f14716b = r2
            r10.requestBluetoothAudio(r3)
            goto La2
        L7d:
            if (r0 == 0) goto L81
            r2 = 1
            goto L90
        L81:
            boolean r0 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.Speaker
            if (r0 == 0) goto L88
            r2 = 8
            goto L90
        L88:
            if (r1 == 0) goto L8b
            goto L90
        L8b:
            boolean r9 = r9 instanceof com.revolut.feature.in_app_calls.domain.AudioRoute.WiredHeadset
            if (r9 == 0) goto L96
            r2 = 4
        L90:
            r10.f14716b = r2
            r10.setAudioRoute(r2)
            goto La2
        L96:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L9c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        La2:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        La5:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            pe7.a r10 = r0.f74816b
            if (r10 == 0) goto Lb6
            pe7.f r0 = r0.f()
            r0.muteCall(r10, r9)
        Lb6:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ie7.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
