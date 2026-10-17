package z8g;

import a9g.i0;
import a9g.k0;
import a9g.l0;
import a9g.n0;
import a9g.n1;
import a9g.o0;
import a9g.p0;
import a9g.r1;
import a9g.s1;
import a9g.v1;
import a9g.w1;
import a9g.x1;
import a9g.z1;
import androidx.room.EntityInsertAdapter;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.utils.gson.GsonHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends EntityInsertAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320102a;

    public /* synthetic */ i(int i) {
        this.f320102a = i;
    }

    @Override // androidx.room.EntityInsertAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strK;
        String strK2;
        String strK3;
        String strK4;
        String strK5;
        String strK6;
        switch (this.f320102a) {
            case 0:
                k0 k0Var = (k0) obj2;
                String str = k0Var.f2521a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                String str2 = k0Var.f2522b;
                if (str2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str2);
                }
                l0 l0Var = k0Var.f2523c;
                String strK7 = null;
                if (l0Var != null) {
                    strK = GsonHolder.a().k(l0Var);
                    Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                } else {
                    strK = null;
                }
                if (strK == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK);
                }
                a9g.a aVar = k0Var.d;
                if (aVar != null) {
                    strK2 = GsonHolder.a().k(aVar);
                    Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                } else {
                    strK2 = null;
                }
                if (strK2 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK2);
                }
                String str3 = k0Var.e;
                if (str3 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str3);
                }
                String str4 = k0Var.f;
                if (str4 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str4);
                }
                String str5 = k0Var.f2524g;
                if (str5 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str5);
                }
                i0 i0Var = k0Var.f2525h;
                if (i0Var != null) {
                    strK7 = GsonHolder.a().k(i0Var);
                    Intrinsics.checkNotNullExpressionValue(strK7, "toJson(...)");
                }
                if (strK7 != null) {
                    sQLiteStatement.bindText(8, strK7);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 1:
                n0 n0Var = (n0) obj2;
                String str6 = n0Var.f2539a;
                if (str6 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str6);
                }
                String str7 = n0Var.f2540b;
                if (str7 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str7);
                }
                String str8 = n0Var.f2541c;
                if (str8 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str8);
                }
                String str9 = n0Var.d;
                if (str9 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str9);
                }
                String str10 = n0Var.e;
                if (str10 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str10);
                }
                a9g.k kVar = n0Var.f;
                String strK8 = null;
                if (kVar != null) {
                    strK3 = GsonHolder.a().k(kVar);
                    Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                } else {
                    strK3 = null;
                }
                if (strK3 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK3);
                }
                if (n0Var.f2542g == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, r0.intValue());
                }
                a9g.i iVar = n0Var.f2543h;
                if (iVar != null) {
                    strK8 = GsonHolder.a().k(iVar);
                    Intrinsics.checkNotNullExpressionValue(strK8, "toJson(...)");
                }
                if (strK8 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK8);
                }
                sQLiteStatement.bindLong(9, n0Var.i ? 1L : 0L);
                sQLiteStatement.bindLong(10, n0Var.f2544j ? 1L : 0L);
                break;
            case 2:
                o0 o0Var = (o0) obj2;
                String str11 = o0Var.f2550a;
                if (str11 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str11);
                }
                String str12 = o0Var.f2551b;
                if (str12 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str12);
                }
                String str13 = o0Var.f2552c;
                if (str13 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str13);
                }
                String str14 = o0Var.d;
                if (str14 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str14);
                }
                sQLiteStatement.bindDouble(5, o0Var.e);
                String str15 = o0Var.f;
                if (str15 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, str15);
                }
                sQLiteStatement.bindLong(7, o0Var.f2553g ? 1L : 0L);
                p0 p0Var = o0Var.f2554h;
                if (p0Var == null) {
                    sQLiteStatement.bindNull(8);
                    sQLiteStatement.bindNull(9);
                } else {
                    String str16 = p0Var.f2557a;
                    if (str16 == null) {
                        sQLiteStatement.bindNull(8);
                    } else {
                        sQLiteStatement.bindText(8, str16);
                    }
                    String str17 = p0Var.f2558b;
                    if (str17 != null) {
                        sQLiteStatement.bindText(9, str17);
                    } else {
                        sQLiteStatement.bindNull(9);
                    }
                }
                break;
            case 3:
                n0 n0Var2 = (n0) obj2;
                String str18 = n0Var2.f2539a;
                if (str18 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str18);
                }
                String str19 = n0Var2.f2540b;
                if (str19 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str19);
                }
                String str20 = n0Var2.f2541c;
                if (str20 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str20);
                }
                String str21 = n0Var2.d;
                if (str21 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str21);
                }
                String str22 = n0Var2.e;
                if (str22 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str22);
                }
                a9g.k kVar2 = n0Var2.f;
                String strK9 = null;
                if (kVar2 != null) {
                    strK4 = GsonHolder.a().k(kVar2);
                    Intrinsics.checkNotNullExpressionValue(strK4, "toJson(...)");
                } else {
                    strK4 = null;
                }
                if (strK4 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindText(6, strK4);
                }
                if (n0Var2.f2542g == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindLong(7, r0.intValue());
                }
                a9g.i iVar2 = n0Var2.f2543h;
                if (iVar2 != null) {
                    strK9 = GsonHolder.a().k(iVar2);
                    Intrinsics.checkNotNullExpressionValue(strK9, "toJson(...)");
                }
                if (strK9 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, strK9);
                }
                sQLiteStatement.bindLong(9, n0Var2.i ? 1L : 0L);
                sQLiteStatement.bindLong(10, n0Var2.f2544j ? 1L : 0L);
                break;
            case 4:
                r1 r1Var = (r1) obj2;
                String str23 = r1Var.f2573a;
                if (str23 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str23);
                }
                String str24 = r1Var.f2574b;
                if (str24 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str24);
                }
                String str25 = r1Var.f2575c;
                if (str25 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str25);
                }
                String str26 = r1Var.d;
                if (str26 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str26);
                }
                sQLiteStatement.bindLong(5, r1Var.e);
                break;
            case 5:
                v1 v1Var = (v1) obj2;
                sQLiteStatement.bindLong(1, v1Var.f2604a);
                sQLiteStatement.bindLong(2, v1Var.f2605b);
                z1 z1Var = v1Var.f2606c;
                if (z1Var != null) {
                    strK5 = GsonHolder.a().k(z1Var);
                    Intrinsics.checkNotNullExpressionValue(strK5, "toJson(...)");
                } else {
                    strK5 = null;
                }
                if (strK5 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, strK5);
                }
                sQLiteStatement.bindLong(4, v1Var.d);
                sQLiteStatement.bindLong(5, v1Var.e);
                String str27 = v1Var.f;
                if (str27 != null) {
                    sQLiteStatement.bindText(6, str27);
                } else {
                    sQLiteStatement.bindNull(6);
                }
                break;
            case 6:
                w1 w1Var = (w1) obj2;
                String str28 = w1Var.f2624a;
                if (str28 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str28);
                }
                sQLiteStatement.bindLong(2, w1Var.f2625b);
                String str29 = w1Var.f2626c;
                if (str29 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str29);
                }
                s1 s1Var = w1Var.d;
                String strK10 = null;
                if (s1Var != null) {
                    strK6 = GsonHolder.a().k(s1Var);
                    Intrinsics.checkNotNullExpressionValue(strK6, "toJson(...)");
                } else {
                    strK6 = null;
                }
                if (strK6 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strK6);
                }
                n1 n1Var = w1Var.e;
                if (n1Var != null) {
                    strK10 = GsonHolder.a().k(n1Var);
                    Intrinsics.checkNotNullExpressionValue(strK10, "toJson(...)");
                }
                if (strK10 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, strK10);
                }
                sQLiteStatement.bindLong(6, w1Var.f);
                sQLiteStatement.bindLong(7, w1Var.f2627g);
                String str30 = w1Var.f2628h;
                if (str30 != null) {
                    sQLiteStatement.bindText(8, str30);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 7:
                x1 x1Var = (x1) obj2;
                String str31 = x1Var.f2629a;
                if (str31 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str31);
                }
                sQLiteStatement.bindLong(2, x1Var.f2630b);
                break;
            case 8:
                aid.a aVar2 = (aid.a) obj2;
                String str32 = aVar2.f5231a;
                if (str32 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str32);
                }
                sQLiteStatement.bindLong(2, aVar2.f5232b);
                break;
            case 9:
                ar.a aVar3 = (ar.a) obj2;
                String str33 = aVar3.f8474a;
                if (str33 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str33);
                }
                String str34 = aVar3.f8475b;
                if (str34 != null) {
                    sQLiteStatement.bindText(2, str34);
                } else {
                    sQLiteStatement.bindNull(2);
                }
                break;
            case 10:
                String str35 = ((ar.b) obj2).f8476a;
                if (str35 != null) {
                    sQLiteStatement.bindText(1, str35);
                } else {
                    sQLiteStatement.bindNull(1);
                }
                break;
            case 11:
                cu5.a aVar4 = (cu5.a) obj2;
                String str36 = aVar4.f108811a;
                if (str36 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str36);
                }
                String str37 = aVar4.f108812b;
                if (str37 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str37);
                }
                String str38 = aVar4.f108813c;
                if (str38 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str38);
                }
                String strO = b21.a.o(aVar4.d);
                if (strO == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, strO);
                }
                Long lB = b21.a.b(aVar4.e);
                if (lB == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindLong(5, lB.longValue());
                }
                String strC = b21.a.c(aVar4.f);
                if (strC != null) {
                    sQLiteStatement.bindText(6, strC);
                } else {
                    sQLiteStatement.bindNull(6);
                }
                break;
            default:
                zzj.e eVar = (zzj.e) obj2;
                String str39 = eVar.f326763a;
                if (str39 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str39);
                }
                String str40 = eVar.f326764b;
                if (str40 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str40);
                }
                String str41 = eVar.f326765c;
                if (str41 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str41);
                }
                String str42 = eVar.d;
                if (str42 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str42);
                }
                String str43 = eVar.e;
                if (str43 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str43);
                }
                Long lB2 = b21.a.b(eVar.f);
                if (lB2 == null) {
                    sQLiteStatement.bindNull(6);
                } else {
                    sQLiteStatement.bindLong(6, lB2.longValue());
                }
                String str44 = eVar.f326766g;
                if (str44 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str44);
                }
                if (eVar.f326767h == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindLong(8, r0.intValue());
                }
                sQLiteStatement.bindLong(9, eVar.i ? 1L : 0L);
                String strM = b21.a.m(eVar.f326768j);
                if (strM == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strM);
                }
                String strM2 = b21.a.m(eVar.k);
                if (strM2 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, strM2);
                }
                String strM3 = b21.a.m(eVar.f326769l);
                if (strM3 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, strM3);
                }
                String strM4 = b21.a.m(eVar.f326770m);
                if (strM4 != null) {
                    sQLiteStatement.bindText(13, strM4);
                } else {
                    sQLiteStatement.bindNull(13);
                }
                break;
        }
    }

    @Override // androidx.room.EntityInsertAdapter
    public final String createQuery() {
        switch (this.f320102a) {
            case 0:
                return "INSERT OR REPLACE INTO `hotels_inventory_provider` (`id`,`name`,`logos`,`address`,`email`,`phone`,`termsAndConditionsUrl`,`disclaimers`) VALUES (?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `hotels_location` (`id`,`type`,`name`,`description`,`imageUrl`,`country`,`propertyCount`,`coordinates`,`isDistrict`,`isPopular`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `hotels_promotions` (`id`,`type`,`start`,`end`,`maxDiscountPercentage`,`locationId`,`isThirdPartyPromoEnabled`,`requirements_checkInFrom`,`requirements_checkOutTo`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `hotels_location` (`id`,`type`,`name`,`description`,`imageUrl`,`country`,`propertyCount`,`coordinates`,`isDistrict`,`isPopular`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `hotels_property_type_category` (`id`,`name`,`description`,`image`,`displayOrderRank`) VALUES (?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `hotels_recent_location_searches` (`id`,`searchTimestamp`,`type`,`checkIn`,`checkOut`,`roomsOccupancy`) VALUES (?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `hotels_recent_property_searches` (`id`,`searchTimestamp`,`name`,`propertyType`,`location`,`checkIn`,`checkOut`,`roomsOccupancy`) VALUES (?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `hotels_recent_smart_searches` (`prompt`,`searchTimestamp`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `shops_brand_recent_search` (`query`,`searchTimestamp`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `biometric_verification_deffered_upload_metadata` (`file_name`,`verification_id`) VALUES (?,?)";
            case 10:
                return "INSERT OR ABORT INTO `biometric_verification_deffered_upload_token` (`token`) VALUES (?)";
            case 11:
                return "INSERT OR REPLACE INTO `crypto_positions` (`type`,`currency`,`baseCurrency`,`investment`,`lastTransactionDate`,`averagePrice`) VALUES (?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `wealth_news` (`id`,`assetType`,`title`,`imageUrl`,`htmlBody`,`publishedDate`,`source`,`lengthInMins`,`isTopStory`,`relatedSymbols`,`relatedCurrencies`,`keywords`,`assetsFilters`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
