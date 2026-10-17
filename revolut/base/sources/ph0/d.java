package ph0;

import androidx.credentials.CredentialManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.serialization.json.Json;
import nkm.k;
import org.jetbrains.annotations.NotNull;
import pfk.h0;
import rlm.o;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gi0.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CredentialManager f236188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f236189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f236190c;

    public d(CredentialManager credentialManager) {
        Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
        this.f236188a = credentialManager;
        this.f236189b = ue0.e.b(Json.d, new h0(21));
        this.f236190c = w.y0(new pgk.d(14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a(CharSequence charSequence, long j2) {
        k kVar = new k(Regex.c((Regex) this.f236190c.getValue(), charSequence));
        while (kVar.hasNext()) {
            if (Intrinsics.f(((MatchResult) kVar.next()).getValue(), String.valueOf(j2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0215, code lost:
    
        if (kotlin.text.d0.J(r3, "No create options available", false) == true) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.app.Activity r21, vg0.k r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.d.b(android.app.Activity, vg0.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.app.Activity r22, vg0.e0 r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.d.c(android.app.Activity, vg0.e0, gim.c):java.lang.Object");
    }
}
