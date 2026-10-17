package mif;

import androidx.room.RoomRawQuery;
import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f205823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f205824c;
    public final /* synthetic */ RoomRawQuery d;

    public /* synthetic */ q(s sVar, String str, RoomRawQuery roomRawQuery, int i) {
        this.f205822a = i;
        this.f205823b = sVar;
        this.f205824c = str;
        this.d = roomRawQuery;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f205822a) {
            case 0:
                return this.f205823b.G(this.f205824c, this.d, (SQLiteConnection) obj2);
            default:
                return this.f205823b.H(this.f205824c, this.d, (SQLiteConnection) obj2);
        }
    }
}
