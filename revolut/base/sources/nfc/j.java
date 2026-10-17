package nfc;

import android.text.InputFilter;
import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f214896a = u.c(new InputFilter.AllCaps());

    public static final class a {
        private a() {
        }
    }

    public static boolean b(VatSelection vatSelection) {
        if (vatSelection == null || (vatSelection instanceof VatSelection.Registered) || vatSelection.equals(VatSelection.Optional.f60585a)) {
            return false;
        }
        if (vatSelection.equals(VatSelection.NotRegistered.f60584a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x019d  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r59) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nfc.j.a(jki.i):jki.m");
    }
}
