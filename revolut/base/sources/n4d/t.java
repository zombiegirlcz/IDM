package n4d;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.protobuf.f3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f212404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f212405c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ t(String str, String str2, String str3, String str4, int i) {
        this.f212403a = i;
        this.f212404b = str;
        this.f212405c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f212403a) {
            case 0:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM plain_multiple_watchlists_items WHERE sync_state = 'REMOVE' AND asset_type_key = ? AND from_code = ? AND to_code = ? AND watchlist_id = ?");
                String str = this.f212404b;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    String str2 = this.f212405c;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    String str3 = this.d;
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str3);
                    }
                    String str4 = this.e;
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, str4);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 1:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("UPDATE plain_multiple_watchlists_items SET sync_state = 'SYNCED'WHERE sync_state = 'ADD' AND asset_type_key = ? AND from_code = ? AND to_code = ? AND watchlist_id = ?");
                String str5 = this.f212404b;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str5);
                    }
                    String str6 = this.f212405c;
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str6);
                    }
                    String str7 = this.d;
                    if (str7 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str7);
                    }
                    String str8 = this.e;
                    if (str8 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, str8);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            default:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct, "breaker_name", this.f212404b);
                com.bumptech.glide.c.x(buildStruct, "from_state", this.f212405c);
                com.bumptech.glide.c.x(buildStruct, "to_state", this.d);
                com.bumptech.glide.c.x(buildStruct, "kind", this.e);
                return Unit.f186387a;
        }
    }
}
