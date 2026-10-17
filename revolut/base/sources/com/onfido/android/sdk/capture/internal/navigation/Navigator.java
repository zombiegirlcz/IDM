package com.onfido.android.sdk.capture.internal.navigation;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import ib.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "", "commandQueue", "Lcom/onfido/android/sdk/capture/internal/navigation/CommandQueue;", "(Lcom/onfido/android/sdk/capture/internal/navigation/CommandQueue;)V", "backTo", "", b.Screen, "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "exitCurrentScreen", "navigateTo", "replace", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Navigator {

    @NotNull
    private final CommandQueue commandQueue;

    public Navigator(@NotNull CommandQueue commandQueue) {
        Intrinsics.checkNotNullParameter(commandQueue, "commandQueue");
        this.commandQueue = commandQueue;
    }

    public final void backTo(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.commandQueue.executeCommands(new BackTo(screen));
    }

    public final void exitCurrentScreen() {
        this.commandQueue.executeCommands(Back.INSTANCE);
    }

    public final void navigateTo(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.commandQueue.executeCommands(new Forward(screen));
    }

    public final void replace(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.commandQueue.executeCommands(new Replace(screen));
    }
}
