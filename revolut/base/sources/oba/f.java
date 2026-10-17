package oba;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.address.models.AddressExtKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new CellDetailsNoteDelegate.Model("ID_ADDRESS_FIELD", AddressExtKt.format(domainState.f223905a), null, null, null, false, null, null, null, null, null, 0, 131060));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new e(listC);
    }
}
