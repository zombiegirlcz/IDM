package gv9;

import androidx.sqlite.SQLiteConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f147094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iv9.a f147095c;

    public /* synthetic */ d(j jVar, iv9.a aVar, int i) {
        this.f147093a = i;
        this.f147094b = jVar;
        this.f147095c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f147093a) {
            case 0:
                this.f147094b.f147115b.insert(sQLiteConnection, this.f147095c);
                return Unit.f186387a;
            default:
                this.f147094b.f147115b.insert(sQLiteConnection, this.f147095c);
                return null;
        }
    }
}
