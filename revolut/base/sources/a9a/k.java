package a9a;

import a08.o;
import cli.y;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends oki.h implements g {
    public final AliasRegistrationType.Inputtable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z80.b f2396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final phm.a f2397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f2398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f8a.a f2399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f2400t;

    public k(l mapper, AliasRegistrationType.Inputtable inputData, z80.b phoneToolsProvider, phm.a inputAliasCountryPrefixPickerControllerInteractor, ang.f userInteractor, f8a.a pixAreaInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(inputAliasCountryPrefixPickerControllerInteractor, "inputAliasCountryPrefixPickerControllerInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pixAreaInteractor, "pixAreaInteractor");
        this.o = inputData;
        this.f2396p = phoneToolsProvider;
        this.f2397q = inputAliasCountryPrefixPickerControllerInteractor;
        this.f2398r = userInteractor;
        this.f2399s = pixAreaInteractor;
        this.f2400t = mra.d.b(this, new f(inputData), mapper, null, false, 12);
    }

    public static final String I2(k kVar, PixKeys pixKeys, String str) {
        List list = pixKeys.f80417b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (Intrinsics.f(((PixKey) it8.next()).getF80405a(), str)) {
                    str = null;
                    break;
                }
            }
        }
        return str == null ? "" : str;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, mo3.a.g(u0.m(rd0.e.b(this.f2398r.k(false)), f8a.a.a(this.f2399s)), null, null, 3), null, null, new j(this, null), 3);
    }

    public final void J2(String newEmail) {
        Intrinsics.checkNotNullParameter(newEmail, "newEmail");
        y yVar = this.f2400t;
        AliasRegistrationType.Inputtable inputtable = ((f) ((j2) yVar.f22677a).getValue()).f2390a;
        AliasRegistrationType.Email email = inputtable instanceof AliasRegistrationType.Email ? (AliasRegistrationType.Email) inputtable : null;
        if (email != null) {
            H2(yVar, new o(email, newEmail, 21));
        }
    }

    public final void K2(String newPhone) {
        Intrinsics.checkNotNullParameter(newPhone, "newPhone");
        y yVar = this.f2400t;
        AliasRegistrationType.Inputtable inputtable = ((f) ((j2) yVar.f22677a).getValue()).f2390a;
        AliasRegistrationType.Phone phone = inputtable instanceof AliasRegistrationType.Phone ? (AliasRegistrationType.Phone) inputtable : null;
        if (phone != null) {
            H2(yVar, new o(phone, newPhone, 20));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f2400t;
    }
}
