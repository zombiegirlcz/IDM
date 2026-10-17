package eob;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.api.navigation.JuniorAccountDestination$JuniorSavingChildPickerDestination;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.vaults.common.SavingAccountType;
import hjb.m;
import hjb.p;
import hjb.s;
import hjb.t;
import hjb.w;
import hjb.x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qf1.k;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements pf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f127896a;

    public i(dcd.b interestRateFormatter) {
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        this.f127896a = interestRateFormatter;
    }

    @Override // pf1.a
    public final k a(qf1.d dVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2;
        int i3;
        int i5;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        int i6;
        x item = (x) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        hjb.h hVar = item.f152703c;
        t tVar = item.f152702b;
        boolean z = hVar instanceof hjb.g;
        if (z) {
            i = R$drawable.uikit_icn_24_vault;
        } else if (hVar instanceof hjb.e) {
            i = R$drawable.uikit_icn_24_joint;
        } else {
            if (!Intrinsics.f(hVar, hjb.f.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_children;
        }
        int i21 = i;
        uib.c cVar = item.d;
        if (z) {
            if (cVar != null) {
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                int i22 = vib.b.f289560a[cVar.ordinal()];
                if (i22 == 1) {
                    i6 = R$string.savings_account_switcher_new_account_title__multiple_products;
                } else if (i22 == 2) {
                    i6 = R$string.savings_umbrella_products_group_name_flexible_cash_funds;
                } else if (i22 == 3) {
                    i6 = R$string.savings_umbrella_products_group_name_flexible_account;
                } else if (i22 == 4) {
                    i6 = R$string.savings_account_switcher_new_account_title_mmf;
                } else {
                    if (i22 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = R$string.savings_account_switcher_new_account_title_ias;
                }
                textLocalisedClause = new TextLocalisedClause(i6, null, null, 14);
            } else if (tVar instanceof s) {
                textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_new_account_title__multiple_products, null, null, 14);
            } else if (tVar instanceof p) {
                textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_new_account_title_mmf, null, null, 14);
            } else {
                if (!(tVar instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_new_account_title_ias, null, null, 14);
            }
        } else if (hVar instanceof hjb.e) {
            if (tVar instanceof s) {
                textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_new_account_title_joint_multiple_products, null, null, 14);
            } else if (tVar instanceof p) {
                textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_new_account_title_joint_mmf, null, null, 14);
            } else {
                if (!(tVar instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_new_account_title_joint_ias, null, null, 14);
            }
        } else {
            if (!(hVar instanceof hjb.f)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.junior_spaces_add_new_product_saving_title, null, null, 14);
        }
        if (z) {
            i2 = R$string.savings_account_switcher_new_account_grouped_title;
        } else if (hVar instanceof hjb.e) {
            i2 = R$string.savings_account_switcher_new_account_grouped_title_joint;
        } else {
            if (!Intrinsics.f(hVar, hjb.f.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.junior_spaces_add_new_product_saving_grouped_title;
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i2, null, null, 14);
        boolean z3 = tVar instanceof s;
        dcd.b bVar = this.f127896a;
        if (z3) {
            s sVar = (s) tVar;
            w wVar = sVar.f152695b;
            w wVar2 = sVar.f152694a;
            textLocalisedClause3 = new TextLocalisedClause(R$string.savings_entry_points_subtitle_multiple_products, u.c(bVar.h(wVar2.f152698a, wVar2.f152700c, wVar2.f152699b, wVar != null ? Double.valueOf(wVar.f152698a) : null, wVar != null ? wVar.f152700c : null, wVar != null ? wVar.f152699b : null, sVar.f152696c)), null, 12);
        } else if (tVar instanceof p) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.savings_entry_points_subtitle_mmf, null, null, 14);
        } else {
            if (!(tVar instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            m mVar = (m) tVar;
            w wVar3 = mVar.f152690c;
            String str = mVar.e;
            wi0.b.Companion.getClass();
            if (Intrinsics.f(str, "BE") && z) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias, null, null, 14);
            } else if (Intrinsics.f(str, "BE") && (hVar instanceof hjb.f)) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias, null, null, 14);
            } else {
                if (!Intrinsics.f(str, "BE") || !(hVar instanceof hjb.e)) {
                    w wVar4 = mVar.f152689b;
                    i3 = i21;
                    CompositeClause compositeClauseH = bVar.h(wVar4.f152698a, wVar4.f152700c, wVar4.f152699b, wVar3 != null ? Double.valueOf(wVar3.f152698a) : null, wVar3 != null ? wVar3.f152700c : null, wVar3 != null ? wVar3.f152699b : null, mVar.d);
                    boolean z4 = mVar.f152688a;
                    if ((hVar instanceof hjb.e) || (hVar instanceof hjb.f)) {
                        i5 = z4 ? R$string.savings_entry_points_subtitle_ias_exact_value_daily : R$string.savings_entry_points_subtitle_ias_exact_value_monthly;
                    } else {
                        if (!z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = z4 ? R$string.savings_entry_points_subtitle_ias_daily : R$string.savings_entry_points_subtitle_ias_monthly;
                    }
                    textLocalisedClause2 = new TextLocalisedClause(i5, u.c(compositeClauseH), null, 12);
                    return new k(i3, textLocalisedClause, textLocalisedClause2, textLocalisedClause4, null, null, 48);
                }
                textLocalisedClause3 = new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias_joint, null, null, 14);
            }
        }
        textLocalisedClause2 = textLocalisedClause3;
        i3 = i21;
        return new k(i3, textLocalisedClause, textLocalisedClause2, textLocalisedClause4, null, null, 48);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        x item = (x) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        hjb.h hVar = item.f152703c;
        if (hVar instanceof hjb.g) {
            return f0.f322471a;
        }
        if (hVar instanceof hjb.f) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_savings, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_kids, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_teens, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_junior, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_child, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_youth, null, null, 14));
        }
        if (hVar instanceof hjb.e) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_joint, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shared, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_household, null, null, 14));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        x item = (x) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        hjb.h hVar = item.f152703c;
        if (Intrinsics.f(hVar, hjb.f.INSTANCE)) {
            return new qf1.h(JuniorAccountDestination$JuniorSavingChildPickerDestination.f76700a);
        }
        if (hVar instanceof hjb.e) {
            return new qf1.h(new SavingsAccountCreationFlow$Destination(null, new SavingAccountType.Joint(((hjb.e) hVar).f152683a), 13));
        }
        if (Intrinsics.f(hVar, hjb.g.INSTANCE)) {
            return new qf1.h(new SavingsAccountCreationFlow$Destination(null, SavingAccountType.Personal.f94740a, 13));
        }
        throw new NoWhenBranchMatchedException();
    }
}
