package cke;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f24825a;

    public j(ImmutableSet accountsStateMappers) {
        Intrinsics.checkNotNullParameter(accountsStateMappers, "accountsStateMappers");
        this.f24825a = accountsStateMappers;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Object next;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f24821a;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            RowDelegate.Model model = null;
            if (!it8.hasNext()) {
                return new g(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("CryptoAccountPickerScreen_AccountsSubheader", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_account_picker_header_accounts, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            }
            AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState = (AccountsExtensionContract$AccountsState) it8.next();
            String str = (String) d0.d0(accountsExtensionContract$AccountsState.v6());
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Crypto account state without ID");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CryptoAccountPickerScreenStateMapper", null, illegalStateException, h0Var);
            } else {
                Iterator it9 = this.f24825a.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (((dje.c) next).c(accountsExtensionContract$AccountsState)) {
                        break;
                    }
                }
                dje.c cVar = (dje.c) next;
                if (cVar == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("No mapper found for crypto account state");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CryptoAccountPickerScreenStateMapper", null, illegalStateException2, h0Var2);
                } else {
                    boolean zA7 = accountsExtensionContract$AccountsState.a7(domainState.f24822b);
                    String strConcat = "CryptoAccountPickerScreen_Account_".concat(str);
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new GlyphImage(cVar.e(accountsExtensionContract$AccountsState), null, null, 6), zA7 ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
                    Clause clauseF = cVar.f(accountsExtensionContract$AccountsState);
                    if (clauseF != null) {
                        model = new RowDelegate.Model(strConcat, image40, clauseF, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(cVar.d(accountsExtensionContract$AccountsState), null, null, false, 126), false, null, zA7, null, null, null, null, null, null, new d(str), null, 0, 0, 0, 0, 532667384);
                    }
                }
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
    }
}
