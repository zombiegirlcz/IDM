package e06;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.protobuf.f3;
import e54.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121434c;

    public /* synthetic */ g(long j2, String str, int i) {
        this.f121432a = i;
        this.f121433b = j2;
        this.f121434c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121432a) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                dj0.d tipAmount = new dj0.d(this.f121433b, update.f121426b);
                dj0.d cartAmount = update.f121425a;
                xi0.b currency = update.f121426b;
                Intrinsics.checkNotNullParameter(cartAmount, "cartAmount");
                Intrinsics.checkNotNullParameter(currency, "currency");
                String formattedTipAmount = this.f121434c;
                Intrinsics.checkNotNullParameter(formattedTipAmount, "formattedTipAmount");
                Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
                return new d(cartAmount, currency, formattedTipAmount, tipAmount);
            case 1:
                m update2 = (m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return m.a(update2, 0L, 0L, Long.valueOf(this.f121433b), this.f121434c, null, null, null, false, null, null, false, 4083);
            case 2:
                long j2 = this.f121433b;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("UPDATE payments_recent_v2 SET unreadCounter = 0, unreadSyncTimestamp = ? WHERE recipientId = ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    String str = this.f121434c;
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str);
                    }
                    sQLiteStatementPrepare.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare.close();
                    return unit;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 3:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct, "status", this.f121434c);
                long j3 = this.f121433b;
                if (j3 > 0) {
                    com.bumptech.glide.c.u(buildStruct, "freed_up_bytes", Double.valueOf(j3));
                }
                return Unit.f186387a;
            default:
                u1k.e updateState = (u1k.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                xi0.b.Companion.getClass();
                return u1k.e.a(updateState, null, new dj0.d(this.f121433b, xi0.a.a(this.f121434c)), 1);
        }
    }

    public /* synthetic */ g(String str, long j2, int i) {
        this.f121432a = i;
        this.f121434c = str;
        this.f121433b = j2;
    }
}
