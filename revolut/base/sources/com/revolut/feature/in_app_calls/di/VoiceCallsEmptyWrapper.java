package com.revolut.feature.in_app_calls.di;

import android.content.Context;
import androidx.annotation.Keep;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe7.b;
import pe7.c;
import pe7.f;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"Lcom/revolut/feature/in_app_calls/di/VoiceCallsEmptyWrapper;", "Lpe7/f;", "<init>", "()V", "", "accessToken", "fcmToken", "", "register", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "data", "Lpe7/d;", "listener", "", "handleFcmMessage", "(Landroid/content/Context;Ljava/util/Map;Lpe7/d;)Z", "Ljava/util/UUID;", "ticketId", "category", "endpoint", "Lpe7/c;", "Lpe7/a;", "startInboundCall", "(Landroid/content/Context;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpe7/c;)Lpe7/a;", "Lcom/revolut/feature/in_app_calls/wrapper/VoiceCallInvite;", "callInvite", "acceptCall", "(Landroid/content/Context;Lcom/revolut/feature/in_app_calls/wrapper/VoiceCallInvite;Lpe7/c;)V", "rejectCall", "(Landroid/content/Context;Lcom/revolut/feature/in_app_calls/wrapper/VoiceCallInvite;)V", "voiceCall", "isMuted", "muteCall", "(Lpe7/a;Z)V", "isCallMuted", "(Lpe7/a;)Z", "disconnect", "(Lpe7/a;)V", "Lpe7/b;", "createAudioSwitch", "(Landroid/content/Context;)Lpe7/b;", "isTwilioDynamicModuleAvailable", "Z", "()Z", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class VoiceCallsEmptyWrapper implements f {

    @NotNull
    public static final VoiceCallsEmptyWrapper INSTANCE = new VoiceCallsEmptyWrapper();
    private static final boolean isTwilioDynamicModuleAvailable = false;

    public static final class a implements b {
    }

    private VoiceCallsEmptyWrapper() {
    }

    @Override // pe7.f
    public void acceptCall(@NotNull Context context, @NotNull VoiceCallInvite callInvite, @NotNull c listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callInvite, "callInvite");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @NotNull
    public b createAudioSwitch(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a();
    }

    @Override // pe7.f
    public void disconnect(@NotNull pe7.a voiceCall) {
        Intrinsics.checkNotNullParameter(voiceCall, "voiceCall");
    }

    @Override // pe7.f
    public boolean handleFcmMessage(@NotNull Context context, @NotNull Map<String, String> data, @NotNull pe7.d listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return false;
    }

    public boolean isCallMuted(@NotNull pe7.a voiceCall) {
        Intrinsics.checkNotNullParameter(voiceCall, "voiceCall");
        return false;
    }

    @Override // pe7.f
    public boolean isTwilioDynamicModuleAvailable() {
        return isTwilioDynamicModuleAvailable;
    }

    @Override // pe7.f
    public void muteCall(@NotNull pe7.a voiceCall, boolean isMuted) {
        Intrinsics.checkNotNullParameter(voiceCall, "voiceCall");
    }

    @Override // pe7.f
    public Object register(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "InAppCalls", "Skipping Twilio registration: dynamic module is not installed", null, null, 16);
        return Unit.f186387a;
    }

    @Override // pe7.f
    public void rejectCall(@NotNull Context context, @NotNull VoiceCallInvite callInvite) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callInvite, "callInvite");
    }

    @Override // pe7.f
    public pe7.a startInboundCall(@NotNull Context context, @NotNull UUID ticketId, String category, @NotNull String accessToken, String endpoint, @NotNull c listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return null;
    }
}
