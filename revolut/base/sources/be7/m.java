package be7;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.protobuf.f3;
import com.revolut.data.model.Data;
import com.revolut.feature.in_app_calls.ActiveCallData;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import h93.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of9.d;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14705c;
    public final /* synthetic */ String d;

    public /* synthetic */ m(Object obj2, String str, String str2, String str3, int i) {
        this.f14703a = i;
        this.f14704b = str;
        this.f14705c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f14703a) {
            case 0:
                InAppCallStateWithData updateCallState = (InAppCallStateWithData) obj2;
                Intrinsics.checkNotNullParameter(updateCallState, "$this$updateCallState");
                return InAppCallStateWithData.a(updateCallState, a.CONNECTED, null, null, null, null, new ActiveCallData(System.currentTimeMillis(), this.f14704b, this.f14705c, this.d), null, null, 478);
            case 1:
                Data settingsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(settingsData, "settingsData");
                od0.h hVar = od0.i.Companion;
                f0 f0VarR = ha3.x.r(this.f14704b, this.f14705c, (i93.c) settingsData.getContent(), this.d);
                hVar.getClass();
                return zi0.c.P(od0.h.a(f0VarR), settingsData.getLoading(), null, 2);
            case 2:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("DELETE FROM plain_watchlist_items WHERE sync_state = 'REMOVE' AND asset_type_key = ? AND fromCode = ? AND toCode = ?");
                String str = this.f14704b;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str);
                    }
                    String str2 = this.f14705c;
                    if (str2 == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, str2);
                    }
                    String str3 = this.d;
                    if (str3 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, str3);
                    }
                    sQLiteStatementPrepare2.step();
                    sQLiteStatementPrepare2.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 3:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("UPDATE plain_watchlist_items SET sync_state = 'SYNCED'WHERE sync_state = 'ADD' AND asset_type_key = ? AND fromCode = ? AND toCode = ?");
                String str4 = this.f14704b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    String str5 = this.f14705c;
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str5);
                    }
                    String str6 = this.d;
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str6);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 4:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct, "device_drm_id", this.f14704b);
                com.bumptech.glide.c.x(buildStruct, "biometric_availability_status", this.f14705c);
                com.bumptech.glide.c.x(buildStruct, "biometric_prompt_type", this.d);
                return Unit.f186387a;
            case 5:
                List inputs = (List) obj2;
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                return d.e(this.f14704b, this.f14705c, this.d, inputs);
            case 6:
                String failurePoint = (String) obj2;
                Intrinsics.checkNotNullParameter(failurePoint, "failurePoint");
                return q7c.x.a(failurePoint, this.f14704b, this.f14705c, this.d);
            default:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pigeon_tree_node WHERE `type` = ? AND language = ? AND title LIKE '%' || ? || '%'");
                String str7 = this.f14704b;
                try {
                    if (str7 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str7);
                    }
                    String str8 = this.f14705c;
                    if (str8 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str8);
                    }
                    String str9 = this.d;
                    if (str9 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str9);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentKey");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hidden");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deeplink");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "language");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        int i = columnIndexOrThrow2;
                        arrayList.add(new zf0.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                        columnIndexOrThrow2 = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
        }
    }

    public /* synthetic */ m(String str, String str2, String str3, int i) {
        this.f14703a = i;
        this.f14704b = str;
        this.f14705c = str2;
        this.d = str3;
    }
}
