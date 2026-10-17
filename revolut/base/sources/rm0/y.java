package rm0;

import com.revolut.core.error.data.model.UnrecoverableStateException;
import com.revolut.core.security.exception.CertificateException;
import java.nio.charset.Charset;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class y implements v {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f255172c = Charsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f255173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf0.c f255174b;

    public y(q cipherProvider, qf0.c exceptionsOverseer) {
        Intrinsics.checkNotNullParameter(cipherProvider, "cipherProvider");
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        this.f255173a = cipherProvider;
        this.f255174b = exceptionsOverseer;
    }

    public final synchronized String b(hn0.c alias, u value) {
        hn0.k kVar;
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(value, "value");
        if (alias.b()) {
            throw new IllegalArgumentException("Use decryptValue with Cipher for values requiring user authentication");
        }
        kVar = new hn0.k(alias, value.a());
        try {
        } catch (CertificateException.CertificateAbsent e) {
            c(e);
            throw null;
        }
        return (String) ((b) this.f255173a).n(kVar, new rlh.d0(this, value, 1));
    }

    public final void c(CertificateException.CertificateAbsent certificateAbsent) throws UnrecoverableStateException {
        UnrecoverableStateException unrecoverableStateException = new UnrecoverableStateException(certificateAbsent);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        rd0.d.a(cVar, null, "Reporting unrecoverable state", unrecoverableStateException, h0Var);
        if (((Boolean) skm.e0.E(kotlin.coroutines.g.f186406a, new x(this, unrecoverableStateException, null))).booleanValue()) {
            throw unrecoverableStateException;
        }
        rd0.d.a(cVar, null, "No guardian is registered to handle unrecoverable state", unrecoverableStateException, h0Var);
        throw unrecoverableStateException;
    }
}
