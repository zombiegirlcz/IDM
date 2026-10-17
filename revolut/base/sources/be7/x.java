package be7;

import android.bluetooth.BluetoothDevice;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.revolut.feature.in_app_calls.domain.AudioRoute;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import vkm.j2;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends Connection {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CallNotificationService f14715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14716b;

    public x(CallNotificationService callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f14715a = callback;
        this.f14716b = Integer.MIN_VALUE;
        setAudioModeIsVoip(true);
    }

    public static AudioRoute.Bluetooth b(CallAudioState callAudioState) {
        String name;
        BluetoothDevice activeBluetoothDevice = callAudioState.getActiveBluetoothDevice();
        if (activeBluetoothDevice == null) {
            return new AudioRoute.Bluetooth(null, null, null);
        }
        try {
            name = activeBluetoothDevice.getName();
        } catch (SecurityException unused) {
            name = null;
        }
        return new AudioRoute.Bluetooth(name, null, activeBluetoothDevice.getAddress());
    }

    public final void a() {
        this.f14716b = Integer.MIN_VALUE;
        setDisconnected(new DisconnectCause(2));
        destroy();
    }

    @Override // android.telecom.Connection
    public final void onAbort() {
        super.onAbort();
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, "InAppCalls", "Connection >> onAbort", null, null, 16);
        a();
        this.f14715a.g();
    }

    @Override // android.telecom.Connection
    public final void onAnswer() {
        super.onAnswer();
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, "InAppCalls", "Connection >> onAnswer", null, null, 16);
        this.f14715a.a();
    }

    @Override // android.telecom.Connection
    public final void onCallAudioStateChanged(CallAudioState state) {
        Object next;
        Object value;
        String name;
        Intrinsics.checkNotNullParameter(state, "state");
        super.onCallAudioStateChanged(state);
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, "InAppCalls", a0.d.g(state.getRoute(), state.getSupportedRouteMask(), "onCallAudioStateChanged >> route=", ", supportedRouteMask="), null, null, 16);
        if (this.f14716b != Integer.MIN_VALUE) {
            if (state.getRoute() != this.f14716b && (state.getSupportedRouteMask() & this.f14716b) != 0) {
                return;
            } else {
                this.f14716b = Integer.MIN_VALUE;
            }
        }
        aim.e eVarB = u.b();
        int supportedRouteMask = state.getSupportedRouteMask() & 8;
        AudioRoute audioRoute = AudioRoute.Speaker.f74801a;
        if (supportedRouteMask != 0) {
            eVarB.add(audioRoute);
        }
        int supportedRouteMask2 = state.getSupportedRouteMask() & 1;
        AudioRoute.Earpiece earpiece = AudioRoute.Earpiece.f74800a;
        if (supportedRouteMask2 != 0) {
            eVarB.add(earpiece);
        }
        if ((state.getSupportedRouteMask() & 2) != 0) {
            Collection<BluetoothDevice> supportedBluetoothDevices = state.getSupportedBluetoothDevices();
            Intrinsics.h(supportedBluetoothDevices);
            if (supportedBluetoothDevices.isEmpty()) {
                eVarB.add(b(state));
            } else {
                int i = 0;
                for (Object obj2 : supportedBluetoothDevices) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) obj2;
                    Intrinsics.h(bluetoothDevice);
                    try {
                        name = bluetoothDevice.getName();
                    } catch (SecurityException unused) {
                        name = null;
                    }
                    eVarB.add(new AudioRoute.Bluetooth(name, Integer.valueOf(i2), bluetoothDevice.getAddress()));
                    i = i2;
                }
            }
        }
        int supportedRouteMask3 = state.getSupportedRouteMask() & 4;
        AudioRoute.WiredHeadset wiredHeadset = AudioRoute.WiredHeadset.f74802a;
        if (supportedRouteMask3 != 0) {
            eVarB.add(wiredHeadset);
        }
        aim.e eVarA = u.a(eVarB);
        int route = state.getRoute();
        if (route == 2) {
            AudioRoute.Bluetooth bluetoothB = b(state);
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = eVarA.listIterator(0);
            while (true) {
                aim.b bVar = (aim.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                }
                Object next2 = bVar.next();
                if (next2 instanceof AudioRoute.Bluetooth) {
                    arrayList.add(next2);
                }
            }
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (it8.hasNext()) {
                    next = it8.next();
                    if (Intrinsics.f(((AudioRoute.Bluetooth) next).f74798b, bluetoothB.f74798b)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AudioRoute.Bluetooth bluetooth = (AudioRoute.Bluetooth) next;
            audioRoute = bluetooth == null ? bluetoothB : bluetooth;
        } else if (route == 4) {
            audioRoute = wiredHeadset;
        } else if (route != 8) {
            audioRoute = earpiece;
        }
        fe7.a state2 = new fe7.a(eVarA, audioRoute);
        CallNotificationService callNotificationService = this.f14715a;
        callNotificationService.getClass();
        Intrinsics.checkNotNullParameter(state2, "state");
        if (callNotificationService.f74825q != null) {
            fe7.b bVar2 = callNotificationService.f74823n;
            if (bVar2 == null) {
                Intrinsics.r("callControlsDispatcher");
                throw null;
            }
            Intrinsics.checkNotNullParameter(state2, "state");
            j2 j2Var = bVar2.f134457b;
            do {
                value = j2Var.getValue();
            } while (!j2Var.h(value, state2));
        }
    }

    @Override // android.telecom.Connection
    public final void onDisconnect() {
        super.onDisconnect();
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, "InAppCalls", "Connection >> onDisconnect", null, null, 16);
        a();
        this.f14715a.g();
    }

    @Override // android.telecom.Connection
    public final void onReject() {
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(rd0.c.DEBUG, "InAppCalls", "Connection >> onReject", null, null, 16);
        a();
        CallNotificationService callNotificationService = this.f14715a;
        VoiceCallInvite voiceCallInvite = callNotificationService.f74815a;
        if (voiceCallInvite == null) {
            return;
        }
        callNotificationService.f().rejectCall(callNotificationService, voiceCallInvite);
        CallNotificationService.j(callNotificationService, null, null, 3);
    }
}
