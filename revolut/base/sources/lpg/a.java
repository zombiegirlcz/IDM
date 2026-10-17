package lpg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f199120a = new a();

    private a() {
    }

    public static String a(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return "VAULT_INVITE@".concat(vaultId);
    }
}
