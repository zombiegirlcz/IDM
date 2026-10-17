package oa2;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.RowDelegate.Model a(java.lang.String r36, int r37, int r38, com.revolut.feature.apm.core.models.alias.Alias r39) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.l.a(java.lang.String, int, int, com.revolut.feature.apm.core.models.alias.Alias):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        RowDelegate.Model modelA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f223505a;
        aim.e eVarB = u.b();
        List<Alias> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Alias alias : list2) {
            AliasType aliasType = alias.f61878a;
            if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
                modelA = a("LIST_ID_ALIAS_EMAIL", R$drawable.uikit_icn_24_mail, R$string.alias_alias_type_email, alias);
            } else if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
                modelA = a("LIST_ID_ALIAS_PHONE", R$drawable.uikit_icn_24_smartphone, R$string.alias_alias_type_mobile, alias);
            } else {
                if (!Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
                    if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) && !Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException(alias.f61878a + " unsupported");
                }
                modelA = a("LIST_ID_ALIAS_REVOLUT", R$drawable.uikit_icn_24_revolut, R$string.alias_alias_type_revolut_address, alias);
            }
            arrayList.add(modelA);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        List list3 = domainState.f223505a;
        int i = 0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((Alias) it8.next()).f61880c, AliasStatus.AVAILABLE.f61886b) && (i = i + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        return new k(eVarA, i);
    }
}
