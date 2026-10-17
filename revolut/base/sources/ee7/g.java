package ee7;

import android.content.Context;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import e8.r;
import gim.i;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements pe7.f {
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(g.class, "delegate", "getDelegate()Lcom/revolut/feature/in_app_calls/wrapper/VoiceCallsWrapper;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f125133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg0.a f125134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125135c;
    public final r d;

    public g(z70.a contextProvider, xg0.a dynamicDelivery, String twilioModuleName) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        uh0.a dynamicDeliveryCompat = uh0.a.f280049a;
        Intrinsics.checkNotNullParameter(dynamicDeliveryCompat, "dynamicDeliveryCompat");
        Intrinsics.checkNotNullParameter(twilioModuleName, "twilioModuleName");
        this.f125133a = contextProvider;
        this.f125134b = dynamicDelivery;
        this.f125135c = twilioModuleName;
        this.d = new r((Function0) new f(this, 0));
    }

    public final pe7.f a() {
        return (pe7.f) this.d.b(e[0]);
    }

    @Override // pe7.f
    public final void acceptCall(Context context, VoiceCallInvite callInvite, pe7.c listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callInvite, "callInvite");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a().acceptCall(context, callInvite, listener);
    }

    public final Object b(i iVar) throws Throwable {
        ec8.c cVar = new ec8.c(this, null, 3);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // pe7.f
    public final void disconnect(pe7.a voiceCall) {
        Intrinsics.checkNotNullParameter(voiceCall, "voiceCall");
        a().disconnect(voiceCall);
    }

    @Override // pe7.f
    public final boolean handleFcmMessage(Context context, Map data, pe7.d listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return a().handleFcmMessage(context, data, listener);
    }

    @Override // pe7.f
    public final boolean isTwilioDynamicModuleAvailable() {
        return a().isTwilioDynamicModuleAvailable();
    }

    @Override // pe7.f
    public final void muteCall(pe7.a voiceCall, boolean z) {
        Intrinsics.checkNotNullParameter(voiceCall, "voiceCall");
        a().muteCall(voiceCall, z);
    }

    @Override // pe7.f
    public final Object register(String str, String str2, Continuation continuation) {
        Object objRegister = a().register(str, str2, continuation);
        return objRegister == fim.a.COROUTINE_SUSPENDED ? objRegister : Unit.f186387a;
    }

    @Override // pe7.f
    public final void rejectCall(Context context, VoiceCallInvite callInvite) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callInvite, "callInvite");
        a().rejectCall(context, callInvite);
    }

    @Override // pe7.f
    public final pe7.a startInboundCall(Context context, UUID ticketId, String str, String accessToken, String str2, pe7.c listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return a().startInboundCall(context, ticketId, str, accessToken, str2, listener);
    }
}
