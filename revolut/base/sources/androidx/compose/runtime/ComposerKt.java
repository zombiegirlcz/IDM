package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0015\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\" \u0010!\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\r\u001a\u0004\b#\u0010$\" \u0010&\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010\r\u001a\u0004\b'\u0010$\" \u0010)\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b)\u0010\"\u0012\u0004\b+\u0010\r\u001a\u0004\b*\u0010$\" \u0010,\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b,\u0010\"\u0012\u0004\b.\u0010\r\u001a\u0004\b-\u0010$\" \u0010/\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b/\u0010\"\u0012\u0004\b1\u0010\r\u001a\u0004\b0\u0010$\" \u00102\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b2\u0010\"\u0012\u0004\b4\u0010\r\u001a\u0004\b3\u0010$¨\u00065"}, d2 = {"", "isTraceInProgress", "()Z", "", "key", "dirty1", "dirty2", "", "info", "", "traceEventStart", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "message", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "composeImmediateRuntimeError", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/tooling/ComposeStackTraceMode;", "composeStackTraceMode", "I", "getComposeStackTraceMode", "()I", "setComposeStackTraceMode-76WK1J0", "(I)V", "", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "reference", "getReference", "getReference$annotations", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ComposerKt {
    private static int composeStackTraceMode = ComposeStackTraceMode.INSTANCE.m1719getNoneMD5MrJc();

    @NotNull
    private static final Object invocation = new OpaqueKey("provider");

    @NotNull
    private static final Object provider = new OpaqueKey("provider");

    @NotNull
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");

    @NotNull
    private static final Object providerValues = new OpaqueKey("providerValues");

    @NotNull
    private static final Object providerMaps = new OpaqueKey("providers");

    @NotNull
    private static final Object reference = new OpaqueKey("reference");

    public static final void composeImmediateRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError(p.a.p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError(p.a.p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int getComposeStackTraceMode() {
        return composeStackTraceMode;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @NotNull
    public static final Object getInvocation() {
        return invocation;
    }

    @NotNull
    public static final Object getProvider() {
        return provider;
    }

    @NotNull
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @NotNull
    public static final Object getReference() {
        return reference;
    }

    public static final boolean isTraceInProgress() {
        return false;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new yz4.b(rememberManager, 3));
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCurrentGroup$lambda$0(RememberManager rememberManager, int i, Object obj2) {
        if (obj2 instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj2);
        }
        if (obj2 instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj2);
        }
        if (obj2 instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj2).release();
        }
        return Unit.f186387a;
    }

    public static final void traceEventEnd() {
    }

    public static final void traceEventStart(int i, int i2, int i3, @NotNull String str) {
    }
}
