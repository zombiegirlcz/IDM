package jn0;

import android.security.keystore.StrongBoxUnavailableException;
import hn0.e;
import hn0.f;
import hn0.g;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rm0.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn0.b f176646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f176647b;

    public d(dn0.b signatureProvider, a0 keyStoreErrorsTracker) {
        Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
        Intrinsics.checkNotNullParameter(keyStoreErrorsTracker, "keyStoreErrorsTracker");
        this.f176646a = signatureProvider;
        this.f176647b = keyStoreErrorsTracker;
    }

    public static g c(c cVar) {
        if (cVar instanceof a) {
            return new e(((a) cVar).f176644a);
        }
        if (cVar instanceof b) {
            return new f(((b) cVar).f176645a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PublicKey a(c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        g alias = c(type);
        b(type);
        dn0.b bVar = this.f176646a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(alias, "alias");
        n80.e eVar = bVar.f116203c;
        Intrinsics.checkNotNullParameter("android.hardware.strongbox_keystore", "featureName");
        if (!eVar.f213186a.hasSystemFeature("android.hardware.strongbox_keystore")) {
            return bVar.a(alias, false);
        }
        try {
            return bVar.a(alias, true);
        } catch (StrongBoxUnavailableException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, "SignatureProviderImpl", "StrongBox unavailable, falling back to TEE", e, h0Var);
            return bVar.a(alias, false);
        } catch (ProviderException e2) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, "SignatureProviderImpl", "Using StrongBox failed, trying with TEE", e2, h0Var2);
            return bVar.a(alias, false);
        }
    }

    public final void b(c type) {
        eo.c cVar;
        Intrinsics.checkNotNullParameter(type, "type");
        g alias = c(type);
        try {
            dn0.b bVar = this.f176646a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(alias, "alias");
            ((wm0.g) bVar.f116202b.a()).c(alias.getName());
        } catch (Throwable th10) {
            eo.d dVar = eo.d.SIGNATURE_DELETION;
            if (type instanceof a) {
                cVar = eo.c.BIOMETRIC_SIGNATURE;
            } else {
                if (!(type instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = eo.c.NON_BIOMETRIC_SIGNATURE;
            }
            this.f176647b.a(new eo.e(dVar, cVar), th10);
            throw th10;
        }
    }

    public final byte[] d(c type, Signature signature, byte[] data) {
        eo.c cVar;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            signature.update(data);
            return signature.sign();
        } catch (Throwable th10) {
            eo.d dVar = eo.d.SIGNATURE_SIGNING;
            if (type instanceof a) {
                cVar = eo.c.BIOMETRIC_SIGNATURE;
            } else {
                if (!(type instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = eo.c.NON_BIOMETRIC_SIGNATURE;
            }
            this.f176647b.a(new eo.e(dVar, cVar), th10);
            return null;
        }
    }
}
