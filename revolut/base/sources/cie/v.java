package cie;

import aw0.d8;
import aw0.e8;
import aw0.h8;
import aw0.i8;
import aw0.v7;
import aw0.x7;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.r f24523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f24524b;

    public v(mp.r productIntroInteractor, c0 tabAccountsNavBarProductIntroProvider) {
        Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
        Intrinsics.checkNotNullParameter(tabAccountsNavBarProductIntroProvider, "tabAccountsNavBarProductIntroProvider");
        this.f24523a = productIntroInteractor;
        this.f24524b = tabAccountsNavBarProductIntroProvider;
    }

    public final boolean a(AccountContent accountContent) {
        Boolean boolValueOf;
        c0 c0Var = this.f24524b;
        mp.r rVar = this.f24523a;
        if (accountContent == null) {
            return rVar.h(c0Var.a());
        }
        ProductAccount.ValueItem valueItem = accountContent.f89475b;
        AccountWidgetItemModel.EmptyStateStories emptyStateStories = valueItem.getF().f89486c;
        boolean z = true;
        if (emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.DelayedStories) {
            return true;
        }
        i8 i8VarC = c0Var.c(new ProductAccountDescriptor$Value.Main(valueItem.getF89504c(), accountContent.f89474a), emptyStateStories);
        if (i8VarC instanceof v7) {
            boolValueOf = Boolean.valueOf(rVar.h(((v7) i8VarC).f10573a));
        } else if (i8VarC instanceof x7) {
            boolValueOf = Boolean.valueOf(rVar.h(((x7) i8VarC).f10607a));
        } else if (i8VarC instanceof d8) {
            boolValueOf = Boolean.valueOf(rVar.h(((d8) i8VarC).f10282a));
        } else if (i8VarC instanceof e8) {
            boolValueOf = null;
        } else {
            if (!(i8VarC instanceof h8)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = ((h8) i8VarC).f10346a;
            if (arrayList.isEmpty()) {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (rVar.h(((x7) it8.next()).f10607a)) {
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        }
        return boolValueOf != null ? boolValueOf.booleanValue() : rVar.h(c0Var.a());
    }
}
