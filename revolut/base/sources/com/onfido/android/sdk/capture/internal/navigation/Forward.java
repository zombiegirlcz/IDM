package com.onfido.android.sdk.capture.internal.navigation;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import ib.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/navigation/Forward;", "Lcom/onfido/android/sdk/capture/internal/navigation/NavigationCommand;", b.Screen, "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "(Lcom/onfido/android/sdk/capture/internal/navigation/Screen;)V", "getScreen", "()Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Forward extends NavigationCommand {

    @NotNull
    private final Screen screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Forward(@NotNull Screen screen) {
        super(null);
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
    }

    public static /* synthetic */ Forward copy$default(Forward forward, Screen screen, int i, Object obj2) {
        if ((i & 1) != 0) {
            screen = forward.screen;
        }
        return forward.copy(screen);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    @NotNull
    public final Forward copy(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new Forward(screen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Forward) && Intrinsics.f(this.screen, ((Forward) other).screen);
    }

    @NotNull
    public final Screen getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return this.screen.hashCode();
    }

    @NotNull
    public String toString() {
        return "Forward(screen=" + this.screen + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
