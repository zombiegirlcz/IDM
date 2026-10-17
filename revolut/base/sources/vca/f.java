package vca;

import com.revolut.feature.pix.api.model.PixKey;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements j8a.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f287661a;

    public f(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f287661a = phoneToolsProvider;
    }

    public final String a(PixKey pixKey) {
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        if (pixKey instanceof PixKey.Document) {
            String str = ((PixKey.Document) pixKey).f80399a;
            HashMap map = im.c.f162274c;
            return v13.d.l("[000]{.}[000]{.}[000]{-}[00]", f0.f322471a).b(new jm.a(str, 0), false).f162271a.f175891b;
        }
        if (!(pixKey instanceof PixKey.PhoneNumber)) {
            return pixKey.getF80405a();
        }
        String str2 = ((PixKey.PhoneNumber) pixKey).f80403a;
        z80.b bVar = this.f287661a;
        wi0.b bVarE = bVar.e(str2);
        wi0.b.Companion.getClass();
        return z80.b.b(bVar, str2, null, Intrinsics.f(bVarE, wi0.b.A) ? yk0.b.NATIONAL : yk0.b.INTERNATIONAL, 2);
    }
}
