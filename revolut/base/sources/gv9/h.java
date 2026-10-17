package gv9;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import avj.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147109a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f147110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f147111c;
    public final /* synthetic */ iv9.a d;

    public /* synthetic */ h(j jVar, iv9.a aVar, String str) {
        this.f147110b = jVar;
        this.d = aVar;
        this.f147111c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f147109a;
        j jVar = this.f147110b;
        jVar.getClass();
        switch (i) {
            case 0:
                iv9.a message = this.d;
                Intrinsics.checkNotNullParameter(message, "message");
                String previousMessageId = this.f147111c;
                Intrinsics.checkNotNullParameter(previousMessageId, "previousMessageId");
                RoomDatabase roomDatabase = jVar.f147114a;
                DBUtil.performBlocking(roomDatabase, false, true, new h(jVar, previousMessageId, message));
                DBUtil.performBlocking(roomDatabase, false, true, new o(message.f168777a, previousMessageId, 13));
                break;
            default:
                String previousMessageId2 = this.f147111c;
                Intrinsics.checkNotNullParameter(previousMessageId2, "previousMessageId");
                iv9.a message2 = this.d;
                Intrinsics.checkNotNullParameter(message2, "message");
                RoomDatabase roomDatabase2 = jVar.f147114a;
                DBUtil.performBlocking(roomDatabase2, false, true, new gqh.a(previousMessageId2, 10));
                DBUtil.performBlocking(roomDatabase2, false, true, new d(jVar, message2, 1));
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ h(j jVar, String str, iv9.a aVar) {
        this.f147110b = jVar;
        this.f147111c = str;
        this.d = aVar;
    }
}
