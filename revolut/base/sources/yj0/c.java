package yj0;

import com.revolut.ProtectedRevolutApplication;
import java.io.EOFException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.h0;
import mmm.k0;
import mmm.l0;
import mmm.n;
import mmm.o;
import mmm.q0;
import mmm.s;
import mmm.s0;
import mmm.t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f314355c;
    public final SecureRandom d;

    public c(Lazy lazy) {
        SecureRandom secureRandom = new SecureRandom();
        Intrinsics.checkNotNullParameter(lazy, ProtectedRevolutApplication.s("I"));
        Intrinsics.checkNotNullParameter(secureRandom, ProtectedRevolutApplication.s("J"));
        super(s.f207307a);
        this.f314355c = lazy;
        this.d = secureRandom;
    }

    public static boolean v(h0 h0Var) {
        return h0Var.b().equals(ProtectedRevolutApplication.s("K")) || h0Var.b().equals(ProtectedRevolutApplication.s("L"));
    }

    @Override // mmm.t, mmm.s
    public final q0 d(h0 h0Var) throws IOException {
        Intrinsics.checkNotNullParameter(h0Var, ProtectedRevolutApplication.s("M"));
        if (v(h0Var)) {
            return super.d(h0Var);
        }
        throw new IOException(ProtectedRevolutApplication.s("N") + h0Var);
    }

    @Override // mmm.t, mmm.s
    public final q0 r(h0 h0Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(h0Var, ProtectedRevolutApplication.s("M"));
        if (v(h0Var)) {
            return super.r(h0Var);
        }
        k0 k0VarB = u1.b(super.r(h0Var));
        ei.b bVar = new ei.b(new byte[12]);
        this.d.nextBytes(bVar.a());
        k0VarB.writeInt(bVar.b());
        k0VarB.write(bVar.a());
        byte[] bArrA = bVar.a();
        Cipher cipher = Cipher.getInstance(ProtectedRevolutApplication.s("O"));
        cipher.init(1, new SecretKeySpec((byte[]) this.f314355c.getValue(), ProtectedRevolutApplication.s("P")), new GCMParameterSpec(128, bArrA));
        Intrinsics.checkNotNullExpressionValue(cipher, ProtectedRevolutApplication.s("Q"));
        return new n(k0VarB, cipher);
    }

    @Override // mmm.t, mmm.s
    public final s0 t(h0 h0Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, EOFException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(h0Var, ProtectedRevolutApplication.s("M"));
        if (v(h0Var)) {
            return super.t(h0Var);
        }
        l0 l0VarC = u1.c(super.t(h0Var));
        int i = l0VarC.readInt();
        l0VarC.b(12L);
        byte[] bArrA = new ei.b(l0VarC.f207283b.o(12L), i).a();
        Cipher cipher = Cipher.getInstance(ProtectedRevolutApplication.s("O"));
        cipher.init(2, new SecretKeySpec((byte[]) this.f314355c.getValue(), ProtectedRevolutApplication.s("P")), new GCMParameterSpec(128, bArrA));
        Intrinsics.checkNotNullExpressionValue(cipher, ProtectedRevolutApplication.s("Q"));
        o oVar = new o(l0VarC, cipher);
        Intrinsics.checkNotNullParameter(oVar, ProtectedRevolutApplication.s("R"));
        return new b(oVar);
    }
}
