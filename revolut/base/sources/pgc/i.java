package pgc;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import rgc.k;
import rgc.l;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f235874b;

    public /* synthetic */ i(j jVar, int i) {
        this.f235873a = i;
        this.f235874b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        String text;
        int i;
        int i2;
        int i3;
        l lVar;
        String text2;
        int i5;
        int i6;
        int i21;
        l lVar2;
        switch (this.f235873a) {
            case 0:
                tgc.a aVar = this.f235874b.f235877c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM rewards_short WHERE partner = '1'");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "perk_id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchant");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "claimType");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "activation_state");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recommended");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "homeFeed");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "partner");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "only_manual_activation");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "social_proof_likes");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                        Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                        sgc.a aVarC = tgc.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        rgc.e eVarB = tgc.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            text = null;
                            i2 = columnIndexOrThrow2;
                            i = columnIndexOrThrow3;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                            i = columnIndexOrThrow3;
                            i2 = columnIndexOrThrow2;
                        }
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                        int i22 = columnIndexOrThrow4;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)) != 0;
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                        boolean z6 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)) != 0;
                        int i32 = columnIndexOrThrow15;
                        if (sQLiteStatementPrepare.isNull(i32)) {
                            i3 = columnIndexOrThrow5;
                            lVar = null;
                        } else {
                            i3 = columnIndexOrThrow5;
                            lVar = new l((int) sQLiteStatementPrepare.getLong(i32));
                        }
                        arrayList.add(new k(text3, text4, text5, lValueOf, lValueOf2, aVarC, eVarB, text6, lVar, text7, text, z, z3, z4, z6));
                        columnIndexOrThrow5 = i3;
                        columnIndexOrThrow4 = i22;
                        columnIndexOrThrow15 = i32;
                        columnIndexOrThrow2 = i2;
                        columnIndexOrThrow3 = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            default:
                tgc.a aVar2 = this.f235874b.f235877c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM rewards_short WHERE recommended = '0' AND homeFeed = '0' AND partner = '0'");
                try {
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "perk_id");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchant");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "claimType");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "activation_state");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recommended");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "homeFeed");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "partner");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "only_manual_activation");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "social_proof_likes");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                        Long lValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                        Long lValueOf4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                        sgc.a aVarC2 = tgc.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21));
                        rgc.e eVarB2 = tgc.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22));
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow25)) {
                            text2 = null;
                            i6 = columnIndexOrThrow17;
                            i5 = columnIndexOrThrow18;
                        } else {
                            text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                            i5 = columnIndexOrThrow18;
                            i6 = columnIndexOrThrow17;
                        }
                        boolean z11 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow26)) != 0;
                        int i33 = columnIndexOrThrow19;
                        boolean z12 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)) != 0;
                        boolean z29 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)) != 0;
                        boolean z31 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)) != 0;
                        int i43 = columnIndexOrThrow30;
                        if (sQLiteStatementPrepare.isNull(i43)) {
                            i21 = columnIndexOrThrow20;
                            lVar2 = null;
                        } else {
                            i21 = columnIndexOrThrow20;
                            lVar2 = new l((int) sQLiteStatementPrepare.getLong(i43));
                        }
                        arrayList2.add(new k(text8, text9, text10, lValueOf3, lValueOf4, aVarC2, eVarB2, text11, lVar2, text12, text2, z11, z12, z29, z31));
                        columnIndexOrThrow20 = i21;
                        columnIndexOrThrow19 = i33;
                        columnIndexOrThrow30 = i43;
                        columnIndexOrThrow17 = i6;
                        columnIndexOrThrow18 = i5;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
