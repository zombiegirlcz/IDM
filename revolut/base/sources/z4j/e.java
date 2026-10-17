package z4j;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f319390a;

    static {
        ConfirmationResult.ResultCode[] elements = {ConfirmationResult.ResultCode.MATCHED, ConfirmationResult.ResultCode.JOINT_MATCH};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f319390a = kotlin.collections.d.y0(elements);
    }
}
