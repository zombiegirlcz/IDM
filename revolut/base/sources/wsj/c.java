package wsj;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import y8l.h;
import y8l.o;
import ysj.i;
import ysj.j;
import ysj.k;
import ysj.y;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends EntityDeleteOrUpdateAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299742b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f299741a = i;
        this.f299742b = obj2;
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    public final void bind(SQLiteStatement sQLiteStatement, Object obj2) {
        String strC;
        String strC2;
        switch (this.f299741a) {
            case 0:
                k kVar = (k) obj2;
                d dVar = (d) this.f299742b;
                String str = kVar.f316487a;
                if (str == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str);
                }
                String str2 = kVar.f316488b;
                if (str2 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str2);
                }
                String str3 = kVar.f316489c;
                if (str3 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str3);
                }
                String str4 = kVar.d;
                if (str4 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str4);
                }
                sQLiteStatement.bindLong(5, kVar.e);
                xsj.b bVarC = dVar.c();
                List type = kVar.f;
                bVarC.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                Json json = bVarC.f308548a;
                json.getClass();
                i iVar = j.Companion;
                sQLiteStatement.bindText(6, json.c(new qlm.e(iVar.serializer()), type));
                xsj.c cVarD = dVar.d();
                j jVar = kVar.f316490g;
                if (jVar != null) {
                    Json json2 = cVarD.f308549a;
                    json2.getClass();
                    strC = json2.c(iVar.serializer(), jVar);
                } else {
                    cVarD.getClass();
                    strC = null;
                }
                if (strC == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, strC);
                }
                String str5 = kVar.f316487a;
                if (str5 != null) {
                    sQLiteStatement.bindText(8, str5);
                } else {
                    sQLiteStatement.bindNull(8);
                }
                break;
            case 1:
                ysj.g gVar = (ysj.g) obj2;
                g gVar2 = (g) this.f299742b;
                String str6 = gVar.f316477a;
                if (str6 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str6);
                }
                String str7 = gVar.f316478b;
                if (str7 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str7);
                }
                String str8 = gVar.f316479c;
                if (str8 == null) {
                    sQLiteStatement.bindNull(3);
                } else {
                    sQLiteStatement.bindText(3, str8);
                }
                String str9 = gVar.d;
                if (str9 == null) {
                    sQLiteStatement.bindNull(4);
                } else {
                    sQLiteStatement.bindText(4, str9);
                }
                String str10 = gVar.e;
                if (str10 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str10);
                }
                sQLiteStatement.bindLong(6, gVar.f);
                sQLiteStatement.bindLong(7, gVar.f316480g);
                xsj.a aVarF = gVar2.f();
                List type2 = gVar.f316481h;
                aVarF.getClass();
                Intrinsics.checkNotNullParameter(type2, "type");
                Json json3 = aVarF.f308547a;
                json3.getClass();
                sQLiteStatement.bindText(8, json3.c(new qlm.e(ysj.c.Companion.serializer()), type2));
                String str11 = gVar.i;
                if (str11 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindText(9, str11);
                }
                xsj.d dVarG = gVar2.g();
                y yVar = gVar.f316482j;
                if (yVar != null) {
                    Json json4 = dVarG.f308550a;
                    json4.getClass();
                    strC2 = json4.c(y.Companion.serializer(), yVar);
                } else {
                    dVarG.getClass();
                    strC2 = null;
                }
                if (strC2 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, strC2);
                }
                String str12 = gVar.f316477a;
                if (str12 != null) {
                    sQLiteStatement.bindText(11, str12);
                } else {
                    sQLiteStatement.bindNull(11);
                }
                break;
            default:
                h hVar = (h) obj2;
                o oVar = (o) this.f299742b;
                String str13 = hVar.f311676a;
                if (str13 == null) {
                    sQLiteStatement.bindNull(1);
                } else {
                    sQLiteStatement.bindText(1, str13);
                }
                String str14 = hVar.f311677b;
                if (str14 == null) {
                    sQLiteStatement.bindNull(2);
                } else {
                    sQLiteStatement.bindText(2, str14);
                }
                sQLiteStatement.bindText(3, o.g(oVar, hVar.f311678c));
                sQLiteStatement.bindLong(4, hVar.d);
                String str15 = hVar.e;
                if (str15 == null) {
                    sQLiteStatement.bindNull(5);
                } else {
                    sQLiteStatement.bindText(5, str15);
                }
                sQLiteStatement.bindLong(6, hVar.f);
                String str16 = hVar.f311679g;
                if (str16 == null) {
                    sQLiteStatement.bindNull(7);
                } else {
                    sQLiteStatement.bindText(7, str16);
                }
                String str17 = hVar.f311680h;
                if (str17 == null) {
                    sQLiteStatement.bindNull(8);
                } else {
                    sQLiteStatement.bindText(8, str17);
                }
                Long l2 = hVar.i;
                if (l2 == null) {
                    sQLiteStatement.bindNull(9);
                } else {
                    sQLiteStatement.bindLong(9, l2.longValue());
                }
                String str18 = hVar.f311681j;
                if (str18 == null) {
                    sQLiteStatement.bindNull(10);
                } else {
                    sQLiteStatement.bindText(10, str18);
                }
                String str19 = hVar.f311684n;
                if (str19 == null) {
                    sQLiteStatement.bindNull(11);
                } else {
                    sQLiteStatement.bindText(11, str19);
                }
                String str20 = hVar.o;
                if (str20 == null) {
                    sQLiteStatement.bindNull(12);
                } else {
                    sQLiteStatement.bindText(12, str20);
                }
                y8l.i iVar2 = hVar.k;
                if (iVar2 != null) {
                    String str21 = iVar2.f311687a;
                    if (str21 == null) {
                        sQLiteStatement.bindNull(13);
                    } else {
                        sQLiteStatement.bindText(13, str21);
                    }
                    sQLiteStatement.bindText(14, o.h(oVar, iVar2.f311688b));
                    String str22 = iVar2.f311689c;
                    if (str22 == null) {
                        sQLiteStatement.bindNull(15);
                    } else {
                        sQLiteStatement.bindText(15, str22);
                    }
                    String str23 = iVar2.d;
                    if (str23 == null) {
                        sQLiteStatement.bindNull(16);
                    } else {
                        sQLiteStatement.bindText(16, str23);
                    }
                    String str24 = iVar2.e;
                    if (str24 == null) {
                        sQLiteStatement.bindNull(17);
                    } else {
                        sQLiteStatement.bindText(17, str24);
                    }
                    String str25 = iVar2.f;
                    if (str25 == null) {
                        sQLiteStatement.bindNull(18);
                    } else {
                        sQLiteStatement.bindText(18, str25);
                    }
                    String str26 = iVar2.f311690g;
                    if (str26 == null) {
                        sQLiteStatement.bindNull(19);
                    } else {
                        sQLiteStatement.bindText(19, str26);
                    }
                    String str27 = iVar2.f311691h;
                    if (str27 == null) {
                        sQLiteStatement.bindNull(20);
                    } else {
                        sQLiteStatement.bindText(20, str27);
                    }
                    String str28 = iVar2.i;
                    if (str28 == null) {
                        sQLiteStatement.bindNull(21);
                    } else {
                        sQLiteStatement.bindText(21, str28);
                    }
                    String str29 = iVar2.f311692j;
                    if (str29 == null) {
                        sQLiteStatement.bindNull(22);
                    } else {
                        sQLiteStatement.bindText(22, str29);
                    }
                    String str30 = iVar2.k;
                    if (str30 == null) {
                        sQLiteStatement.bindNull(23);
                    } else {
                        sQLiteStatement.bindText(23, str30);
                    }
                    String str31 = iVar2.f311693l;
                    if (str31 == null) {
                        sQLiteStatement.bindNull(24);
                    } else {
                        sQLiteStatement.bindText(24, str31);
                    }
                    String str32 = iVar2.f311694m;
                    if (str32 == null) {
                        sQLiteStatement.bindNull(25);
                    } else {
                        sQLiteStatement.bindText(25, str32);
                    }
                    String str33 = iVar2.f311695n;
                    if (str33 == null) {
                        sQLiteStatement.bindNull(26);
                    } else {
                        sQLiteStatement.bindText(26, str33);
                    }
                    String str34 = iVar2.o;
                    if (str34 == null) {
                        sQLiteStatement.bindNull(27);
                    } else {
                        sQLiteStatement.bindText(27, str34);
                    }
                    String str35 = iVar2.f311696p;
                    if (str35 == null) {
                        sQLiteStatement.bindNull(28);
                    } else {
                        sQLiteStatement.bindText(28, str35);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 13, 14, 15, 16);
                    prk.o.z(sQLiteStatement, 17, 18, 19, 20);
                    prk.o.z(sQLiteStatement, 21, 22, 23, 24);
                    prk.o.z(sQLiteStatement, 25, 26, 27, 28);
                }
                y8l.i iVar3 = hVar.f311682l;
                String str36 = iVar3.f311687a;
                if (str36 == null) {
                    sQLiteStatement.bindNull(29);
                } else {
                    sQLiteStatement.bindText(29, str36);
                }
                sQLiteStatement.bindText(30, o.h(oVar, iVar3.f311688b));
                String str37 = iVar3.f311689c;
                if (str37 == null) {
                    sQLiteStatement.bindNull(31);
                } else {
                    sQLiteStatement.bindText(31, str37);
                }
                String str38 = iVar3.d;
                if (str38 == null) {
                    sQLiteStatement.bindNull(32);
                } else {
                    sQLiteStatement.bindText(32, str38);
                }
                String str39 = iVar3.e;
                if (str39 == null) {
                    sQLiteStatement.bindNull(33);
                } else {
                    sQLiteStatement.bindText(33, str39);
                }
                String str40 = iVar3.f;
                if (str40 == null) {
                    sQLiteStatement.bindNull(34);
                } else {
                    sQLiteStatement.bindText(34, str40);
                }
                String str41 = iVar3.f311690g;
                if (str41 == null) {
                    sQLiteStatement.bindNull(35);
                } else {
                    sQLiteStatement.bindText(35, str41);
                }
                String str42 = iVar3.f311691h;
                if (str42 == null) {
                    sQLiteStatement.bindNull(36);
                } else {
                    sQLiteStatement.bindText(36, str42);
                }
                String str43 = iVar3.i;
                if (str43 == null) {
                    sQLiteStatement.bindNull(37);
                } else {
                    sQLiteStatement.bindText(37, str43);
                }
                String str44 = iVar3.f311692j;
                if (str44 == null) {
                    sQLiteStatement.bindNull(38);
                } else {
                    sQLiteStatement.bindText(38, str44);
                }
                String str45 = iVar3.k;
                if (str45 == null) {
                    sQLiteStatement.bindNull(39);
                } else {
                    sQLiteStatement.bindText(39, str45);
                }
                String str46 = iVar3.f311693l;
                if (str46 == null) {
                    sQLiteStatement.bindNull(40);
                } else {
                    sQLiteStatement.bindText(40, str46);
                }
                String str47 = iVar3.f311694m;
                if (str47 == null) {
                    sQLiteStatement.bindNull(41);
                } else {
                    sQLiteStatement.bindText(41, str47);
                }
                String str48 = iVar3.f311695n;
                if (str48 == null) {
                    sQLiteStatement.bindNull(42);
                } else {
                    sQLiteStatement.bindText(42, str48);
                }
                String str49 = iVar3.o;
                if (str49 == null) {
                    sQLiteStatement.bindNull(43);
                } else {
                    sQLiteStatement.bindText(43, str49);
                }
                String str50 = iVar3.f311696p;
                if (str50 == null) {
                    sQLiteStatement.bindNull(44);
                } else {
                    sQLiteStatement.bindText(44, str50);
                }
                y8l.i iVar4 = hVar.f311683m;
                if (iVar4 != null) {
                    String str51 = iVar4.f311687a;
                    if (str51 == null) {
                        sQLiteStatement.bindNull(45);
                    } else {
                        sQLiteStatement.bindText(45, str51);
                    }
                    sQLiteStatement.bindText(46, o.h(oVar, iVar4.f311688b));
                    String str52 = iVar4.f311689c;
                    if (str52 == null) {
                        sQLiteStatement.bindNull(47);
                    } else {
                        sQLiteStatement.bindText(47, str52);
                    }
                    String str53 = iVar4.d;
                    if (str53 == null) {
                        sQLiteStatement.bindNull(48);
                    } else {
                        sQLiteStatement.bindText(48, str53);
                    }
                    String str54 = iVar4.e;
                    if (str54 == null) {
                        sQLiteStatement.bindNull(49);
                    } else {
                        sQLiteStatement.bindText(49, str54);
                    }
                    String str55 = iVar4.f;
                    if (str55 == null) {
                        sQLiteStatement.bindNull(50);
                    } else {
                        sQLiteStatement.bindText(50, str55);
                    }
                    String str56 = iVar4.f311690g;
                    if (str56 == null) {
                        sQLiteStatement.bindNull(51);
                    } else {
                        sQLiteStatement.bindText(51, str56);
                    }
                    String str57 = iVar4.f311691h;
                    if (str57 == null) {
                        sQLiteStatement.bindNull(52);
                    } else {
                        sQLiteStatement.bindText(52, str57);
                    }
                    String str58 = iVar4.i;
                    if (str58 == null) {
                        sQLiteStatement.bindNull(53);
                    } else {
                        sQLiteStatement.bindText(53, str58);
                    }
                    String str59 = iVar4.f311692j;
                    if (str59 == null) {
                        sQLiteStatement.bindNull(54);
                    } else {
                        sQLiteStatement.bindText(54, str59);
                    }
                    String str60 = iVar4.k;
                    if (str60 == null) {
                        sQLiteStatement.bindNull(55);
                    } else {
                        sQLiteStatement.bindText(55, str60);
                    }
                    String str61 = iVar4.f311693l;
                    if (str61 == null) {
                        sQLiteStatement.bindNull(56);
                    } else {
                        sQLiteStatement.bindText(56, str61);
                    }
                    String str62 = iVar4.f311694m;
                    if (str62 == null) {
                        sQLiteStatement.bindNull(57);
                    } else {
                        sQLiteStatement.bindText(57, str62);
                    }
                    String str63 = iVar4.f311695n;
                    if (str63 == null) {
                        sQLiteStatement.bindNull(58);
                    } else {
                        sQLiteStatement.bindText(58, str63);
                    }
                    String str64 = iVar4.o;
                    if (str64 == null) {
                        sQLiteStatement.bindNull(59);
                    } else {
                        sQLiteStatement.bindText(59, str64);
                    }
                    String str65 = iVar4.f311696p;
                    if (str65 == null) {
                        sQLiteStatement.bindNull(60);
                    } else {
                        sQLiteStatement.bindText(60, str65);
                    }
                } else {
                    prk.o.z(sQLiteStatement, 45, 46, 47, 48);
                    prk.o.z(sQLiteStatement, 49, 50, 51, 52);
                    prk.o.z(sQLiteStatement, 53, 54, 55, 56);
                    prk.o.z(sQLiteStatement, 57, 58, 59, 60);
                }
                y8l.k kVar2 = hVar.f311685p;
                if (kVar2 != null) {
                    sQLiteStatement.bindLong(61, kVar2.f311697a ? 1L : 0L);
                    sQLiteStatement.bindLong(62, kVar2.f311698b ? 1L : 0L);
                } else {
                    sQLiteStatement.bindNull(61);
                    sQLiteStatement.bindNull(62);
                }
                y8l.a aVar = hVar.f311686q;
                if (aVar != null) {
                    String str66 = aVar.f311673a;
                    if (str66 == null) {
                        sQLiteStatement.bindNull(63);
                    } else {
                        sQLiteStatement.bindText(63, str66);
                    }
                    String str67 = aVar.f311674b;
                    if (str67 == null) {
                        sQLiteStatement.bindNull(64);
                    } else {
                        sQLiteStatement.bindText(64, str67);
                    }
                } else {
                    sQLiteStatement.bindNull(63);
                    sQLiteStatement.bindNull(64);
                }
                String str68 = hVar.f311676a;
                if (str68 != null) {
                    sQLiteStatement.bindText(65, str68);
                } else {
                    sQLiteStatement.bindNull(65);
                }
                break;
        }
    }

    @Override // androidx.room.EntityDeleteOrUpdateAdapter
    public final String createQuery() {
        switch (this.f299741a) {
            case 0:
                return "UPDATE OR ABORT `income_sorter_executions` SET `id` = ?,`incomeSorterId` = ?,`state` = ?,`sourceTransactionId` = ?,`updatedDate` = ?,`destinations` = ?,`remainderDestination` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `income_sorters` SET `id` = ?,`walletId` = ?,`baseTransactionId` = ?,`state` = ?,`type` = ?,`createdDate` = ?,`updatedDate` = ?,`destinations` = ?,`sortMethod` = ?,`remainingBalanceDestinationId` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR REPLACE `money_requests` SET `id` = ?,`state` = ?,`channel` = ?,`amount` = ?,`currency` = ?,`update_date` = ?,`comment` = ?,`gif_url` = ?,`expiry_date` = ?,`receive_url` = ?,`split_bill_id` = ?,`registered_identity_id` = ?,`payer_id` = ?,`payer_type` = ?,`payer_code` = ?,`payer_username` = ?,`payer_legal_name` = ?,`payer_first_name` = ?,`payer_last_name` = ?,`payer_country` = ?,`payer_phone` = ?,`payer_email` = ?,`payer_name` = ?,`payer_app_mode` = ?,`payer_pda_recipient_country` = ?,`payer_contact_name` = ?,`payer_alias` = ?,`payer_customer_type` = ?,`creator_id` = ?,`creator_type` = ?,`creator_code` = ?,`creator_username` = ?,`creator_legal_name` = ?,`creator_first_name` = ?,`creator_last_name` = ?,`creator_country` = ?,`creator_phone` = ?,`creator_email` = ?,`creator_name` = ?,`creator_app_mode` = ?,`creator_pda_recipient_country` = ?,`creator_contact_name` = ?,`creator_alias` = ?,`creator_customer_type` = ?,`requester_id` = ?,`requester_type` = ?,`requester_code` = ?,`requester_username` = ?,`requester_legal_name` = ?,`requester_first_name` = ?,`requester_last_name` = ?,`requester_country` = ?,`requester_phone` = ?,`requester_email` = ?,`requester_name` = ?,`requester_app_mode` = ?,`requester_pda_recipient_country` = ?,`requester_contact_name` = ?,`requester_alias` = ?,`requester_customer_type` = ?,`settings_editableAmount` = ?,`settings_editableReference` = ?,`attributes_invoice_url` = ?,`attributes_invoice_number` = ? WHERE `id` = ?";
        }
    }
}
