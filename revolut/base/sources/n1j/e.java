package n1j;

import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.v1;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f211381c = r0.k(new Pair(k1j.a.JOINT_ACCOUNT, pie.b.e), new Pair(k1j.a.JOINT_SAVINGS, pie.e.e), new Pair(k1j.a.JOINT_VAULTS, pie.d.e));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cge.h f211382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g48.r0 f211383b;

    public e(cge.h productAccountsInfoProvider, g48.r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f211382a = productAccountsInfoProvider;
        this.f211383b = jointAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(n1j.e r8, java.util.Set r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1j.e.a(n1j.e, java.util.Set, gim.c):java.io.Serializable");
    }

    public final v1 b(Set allowedGroups) {
        Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
        return new v1(new mp6.j(this, allowedGroups, (Continuation) null, 1));
    }
}
