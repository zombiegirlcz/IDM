package pe7;

import android.content.Context;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public interface f {

    @NotNull
    public static final e Companion = e.f235335a;

    void acceptCall(Context context, VoiceCallInvite voiceCallInvite, c cVar);

    void disconnect(a aVar);

    boolean handleFcmMessage(Context context, Map map, d dVar);

    boolean isTwilioDynamicModuleAvailable();

    void muteCall(a aVar, boolean z);

    Object register(String str, String str2, Continuation continuation);

    void rejectCall(Context context, VoiceCallInvite voiceCallInvite);

    a startInboundCall(Context context, UUID uuid, String str, String str2, String str3, c cVar);
}
