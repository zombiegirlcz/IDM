package by1;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f19724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19725c;

    public /* synthetic */ e(g gVar, String str, int i) {
        this.f19723a = i;
        this.f19724b = gVar;
        this.f19725c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        wx1.d dVar;
        Integer numValueOf;
        wx1.d dVar2;
        wx1.d dVar3;
        switch (this.f19723a) {
            case 0:
                this.f19724b.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM qvik_contacts WHERE descriptorValue = ?");
                String str = this.f19725c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRequestEnabled");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings_blockIncomingMoneyRequests");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        Boolean boolValueOf = null;
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        wx1.b bVarJ = g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        int i2 = columnIndexOrThrow2;
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            i = columnIndexOrThrow3;
                            dVar = null;
                        } else {
                            if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                                i = columnIndexOrThrow3;
                                numValueOf = null;
                            } else {
                                i = columnIndexOrThrow3;
                                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                            }
                            if (numValueOf != null) {
                                boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            }
                            dVar = new wx1.d(boolValueOf);
                        }
                        arrayList.add(new h(text, text2, text3, text4, text5, text6, text7, bVarJ, z, dVar));
                        columnIndexOrThrow3 = i;
                        columnIndexOrThrow2 = i2;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                this.f19724b.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM qvik_contacts WHERE idValue = ?");
                String str2 = this.f19725c;
                boolean z3 = true;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str2);
                    }
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "idValue");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "descriptor");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "descriptorValue");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "contactName");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "alias");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "photoUri");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "isRequestEnabled");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "settings_blockIncomingMoneyRequests");
                    h hVar = null;
                    Boolean boolValueOf2 = null;
                    if (sQLiteStatementPrepare2.step()) {
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11);
                        String text9 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12);
                        String text10 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow13);
                        String text11 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14);
                        String text12 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow15);
                        String text13 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16);
                        String text14 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17);
                        wx1.b bVarJ2 = g.j(sQLiteStatementPrepare2.getText(columnIndexOrThrow18));
                        boolean z4 = ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow19)) != 0;
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow20)) {
                            dVar2 = null;
                        } else {
                            Integer numValueOf2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow20) ? null : Integer.valueOf((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow20));
                            if (numValueOf2 != null) {
                                if (numValueOf2.intValue() == 0) {
                                    z3 = false;
                                }
                                boolValueOf2 = Boolean.valueOf(z3);
                            }
                            dVar2 = new wx1.d(boolValueOf2);
                        }
                        hVar = new h(text8, text9, text10, text11, text12, text13, text14, bVarJ2, z4, dVar2);
                    }
                    sQLiteStatementPrepare2.close();
                    return hVar;
                } finally {
                }
            default:
                this.f19724b.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM qvik_contacts WHERE idValue = ?");
                String str3 = this.f19725c;
                boolean z6 = true;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str3);
                    }
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "id");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "idValue");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "descriptor");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "descriptorValue");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "contactName");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "alias");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "photoUri");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "state");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "isRequestEnabled");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "settings_blockIncomingMoneyRequests");
                    h hVar2 = null;
                    Boolean boolValueOf3 = null;
                    if (sQLiteStatementPrepare3.step()) {
                        String text15 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow21);
                        String text16 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow22);
                        String text17 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow23);
                        String text18 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow24);
                        String text19 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow25);
                        String text20 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow26);
                        String text21 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow27);
                        wx1.b bVarJ3 = g.j(sQLiteStatementPrepare3.getText(columnIndexOrThrow28));
                        boolean z11 = ((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow29)) != 0;
                        if (sQLiteStatementPrepare3.isNull(columnIndexOrThrow30)) {
                            dVar3 = null;
                        } else {
                            Integer numValueOf3 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow30) ? null : Integer.valueOf((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow30));
                            if (numValueOf3 != null) {
                                if (numValueOf3.intValue() == 0) {
                                    z6 = false;
                                }
                                boolValueOf3 = Boolean.valueOf(z6);
                            }
                            dVar3 = new wx1.d(boolValueOf3);
                        }
                        hVar2 = new h(text15, text16, text17, text18, text19, text20, text21, bVarJ3, z11, dVar3);
                    }
                    sQLiteStatementPrepare3.close();
                    return hVar2;
                } finally {
                }
        }
    }
}
