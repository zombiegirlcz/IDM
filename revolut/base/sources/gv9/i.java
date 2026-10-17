package gv9;

import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.faq.data.db.typeconverters.FaqListConverter;
import java.util.List;
import java.util.Map;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import nif.j0;
import nif.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147113b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f147112a = i;
        this.f147113b = obj2;
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String str;
        String strK;
        String strK2;
        String strK3;
        String strK4;
        switch (this.f147112a) {
            case 0:
                iv9.a aVar = (iv9.a) obj2;
                if (aVar.c() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, aVar.c());
                }
                if (aVar.g() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, aVar.g());
                }
                if (aVar.f() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, aVar.f());
                }
                if (aVar.d() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, aVar.d());
                }
                if (aVar.j() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, aVar.j());
                }
                sQLiteStatement.bindLong(6, aVar.l() ? 1L : 0L);
                sQLiteStatement.bindLong(7, aVar.b());
                sQLiteStatement.bindLong(8, aVar.k());
                if (aVar.i() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, aVar.i());
                }
                if (aVar.h() == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, aVar.h());
                }
                String strC = ((j) this.f147113b).f147116c.c(aVar.e());
                if (strC == null) {
                    sQLiteStatement.bindNull(11);
                    return;
                } else {
                    sQLiteStatement.bindText(11, strC);
                    return;
                }
            case 1:
                nx9.b bVar = (nx9.b) obj2;
                kx9.a aVar2 = (kx9.a) this.f147113b;
                if (bVar.c() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, bVar.c());
                }
                jx9.a aVar3 = aVar2.f190509c;
                nx9.d type = bVar.d();
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                String strA = type.a();
                if (strA == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, strA);
                }
                if (bVar.a() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, bVar.a());
                }
                jx9.a aVar4 = aVar2.f190509c;
                nx9.a type2 = bVar.b();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(type2, "type");
                String strA2 = type2.a();
                if (strA2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strA2);
                }
                sQLiteStatement.bindLong(5, bVar.e());
                sQLiteStatement.bindLong(6, bVar.f());
                return;
            case 2:
                k0 k0Var = (k0) obj2;
                if (k0Var.a() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, k0Var.a());
                }
                if (k0Var.c() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindLong(2, k0Var.c().longValue());
                }
                if (k0Var.d() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, k0Var.d());
                }
                if (k0Var.b() == null) {
                    sQLiteStatement.bindNull(4);
                    return;
                }
                mif.d dVar = (mif.d) this.f147113b;
                j0 j0VarB = k0Var.b();
                dVar.getClass();
                int i = mif.c.f205790a[j0VarB.ordinal()];
                if (i == 1) {
                    str = "FULLY_EXCLUDED";
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + j0VarB);
                    }
                    str = "PARTIALLY_EXCLUDED";
                }
                sQLiteStatement.bindText(4, str);
                return;
            case 3:
                ukd.a aVar5 = (ukd.a) obj2;
                if (aVar5.c() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, aVar5.c());
                }
                if (aVar5.e() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, aVar5.e());
                }
                if (aVar5.b() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, aVar5.b());
                }
                if (aVar5.f() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, aVar5.f());
                }
                if (aVar5.a() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, aVar5.a());
                }
                wkd.a aVar6 = ((okd.b) this.f147113b).f225991c;
                Map mapD = aVar5.d();
                if (mapD != null) {
                    strK = ((o) aVar6.f298271a.getValue()).k(mapD);
                } else {
                    aVar6.getClass();
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(6);
                    return;
                } else {
                    sQLiteStatement.bindText(6, strK);
                    return;
                }
            case 4:
                zek.o oVar = (zek.o) obj2;
                xek.c cVar = (xek.c) this.f147113b;
                if (oVar.j() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, oVar.j());
                }
                if (oVar.e() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, oVar.e());
                }
                if (oVar.g() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, oVar.g());
                }
                if (oVar.f() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, oVar.f());
                }
                if (oVar.k() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, oVar.k());
                }
                cfk.b bVar2 = cVar.f304697c;
                List billingOptionEmbeddedEntities = oVar.a();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(billingOptionEmbeddedEntities, "billingOptionEmbeddedEntities");
                String strK5 = bVar2.f23727a.k(billingOptionEmbeddedEntities);
                Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                if (strK5 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK5);
                }
                List featureInfos = oVar.i();
                bVar2.getClass();
                o oVar2 = bVar2.f23727a;
                Intrinsics.checkNotNullParameter(featureInfos, "featureInfos");
                String strK6 = oVar2.k(featureInfos);
                Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                if (strK6 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK6);
                }
                List featureGroups = oVar.h();
                Intrinsics.checkNotNullParameter(featureGroups, "featureGroups");
                String strK7 = oVar2.k(featureGroups);
                Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                if (strK7 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK7);
                }
                cfk.a aVar7 = cVar.d;
                List cards = oVar.b();
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(cards, "cards");
                String strK8 = aVar7.f23726a.k(cards);
                Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                if (strK8 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, strK8);
                }
                List products = oVar.m();
                Intrinsics.checkNotNullParameter(products, "products");
                String strK9 = oVar2.k(products);
                Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                if (strK9 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK9);
                }
                if (oVar.o() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, oVar.o());
                }
                if (oVar.n() == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindLong(12, oVar.n().intValue());
                }
                sQLiteStatement.bindLong(13, oVar.l());
                sQLiteStatement.bindLong(14, oVar.c());
                zek.e eVarD = oVar.d();
                if (eVarD != null) {
                    strK2 = oVar2.k(eVarD);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(15);
                } else {
                    sQLiteStatement.bindText(15, strK2);
                }
                sQLiteStatement.bindLong(16, oVar.p() ? 1L : 0L);
                return;
            default:
                zf0.b bVar3 = (zf0.b) obj2;
                xf0.c cVar2 = (xf0.c) this.f147113b;
                FaqListConverter faqListConverter = cVar2.f304748c;
                if (bVar3.f() == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, bVar3.f());
                }
                if (bVar3.l() == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, bVar3.l());
                }
                if (bVar3.c() == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, bVar3.c());
                }
                if (bVar3.i() == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, bVar3.i());
                }
                if (bVar3.h() == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, bVar3.h());
                }
                sQLiteStatement.bindLong(6, bVar3.n());
                List listJ = bVar3.j();
                String strK10 = null;
                if (listJ != null) {
                    strK3 = ((o) faqListConverter.f51380a.getValue()).k(listJ);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    faqListConverter.getClass();
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strK3);
                }
                if (bVar3.g() == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, bVar3.g());
                }
                if (bVar3.m() == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, bVar3.m());
                }
                ag0.a aVar8 = cVar2.d;
                List listA = bVar3.a();
                if (listA != null) {
                    strK4 = aVar8.f4748a.k(listA);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    aVar8.getClass();
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strK4);
                }
                if (bVar3.k() == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, bVar3.k());
                }
                List listB = bVar3.b();
                if (listB != null) {
                    strK10 = ((o) faqListConverter.f51380a.getValue()).k(listB);
                    Intrinsics.checkNotNullExpressionValue(strK10, "toJson(...)");
                } else {
                    faqListConverter.getClass();
                }
                if (strK10 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strK10);
                }
                if (bVar3.d() == null) {
                    sQLiteStatement.bindNull(13);
                } else {
                    sQLiteStatement.bindText(13, bVar3.d());
                }
                sQLiteStatement.bindLong(14, bVar3.e());
                return;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f147112a) {
            case 0:
                return "INSERT OR REPLACE INTO `payments_social_reactions` (`id`,`senderId`,`recipientId`,`media`,`type`,`isGroupChat`,`createdDate`,`updatedDate`,`status`,`state`,`metadata`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `payments_recent_v2` (`recipientId`,`recipientType`,`itemId`,`itemType`,`unreadCounter`,`unreadSyncTimestamp`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `excluded_transactions` (`excluded_transaction_id`,`included_amount`,`included_amount_currency`,`excluded_type`) VALUES (?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `slot_actions` (`id`,`screen_id`,`campaign_id`,`slot_type`,`action_type`,`params`) VALUES (?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `pricing_plan` (`id`,`code`,`display_code`,`currencyCode`,`min_period`,`billing`,`features`,`featureGroups`,`card_designs`,`products`,`state`,`queuePosition`,`priority`,`cardTier`,`cashback`,`is_default`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `faq` (`key`,`title`,`content`,`plane_content`,`placement`,`weight`,`relatedItems`,`language`,`userCountry`,`actions`,`specialisationQueue`,`chatEntrySuggestions`,`contentStyle`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
        }
    }
}
