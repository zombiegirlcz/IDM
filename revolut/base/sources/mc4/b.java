package mc4;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f204268a;

    static {
        String[] elements = {"AccessBlocked", "AccessTemporarilyBlocked", "ManualActionRequired", "InvalidCredentials", "TargetCredentialsMismatch", "TargetCredentialsMismatch", "UnsupportedLanguage", "InsufficientIdentificationLevel"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f204268a = kotlin.collections.d.y0(elements);
    }
}
