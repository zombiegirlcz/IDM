package hi6;

import com.revolut.domain.models.openbanking.JointDataSharingConsentState;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f152510b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f152511a;

    static {
        JointDataSharingConsentState[] elements = {JointDataSharingConsentState.BOTH_REJECTED, JointDataSharingConsentState.PEER_REJECTED, JointDataSharingConsentState.CURRENT_USER_REJECTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f152510b = kotlin.collections.d.y0(elements);
    }

    public d(b itemsFactory) {
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        this.f152511a = itemsFactory;
    }
}
