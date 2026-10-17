package d9k;

import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f112402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PeerToPeerAmountScreenContract$InputData f112403b;

    public b(l80.e dateProvider, PeerToPeerAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f112402a = dateProvider;
        this.f112403b = inputData;
    }
}
