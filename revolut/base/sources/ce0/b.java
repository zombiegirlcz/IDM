package ce0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.Room;
import androidx.room.migration.Migration;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23330c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(Object obj2, Object obj3, Cloneable cloneable, Object obj4, Object obj5, int i) {
        this.f23328a = i;
        this.f23329b = obj2;
        this.f23330c = obj3;
        this.d = cloneable;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23328a) {
            case 0:
                Context context = (Context) this.f23329b;
                c cVar = (c) this.f23330c;
                Migration[] migrationArr = (Migration[]) this.d;
                de0.a aVar = (de0.a) this.e;
                yk0.a aVar2 = (yk0.a) this.f;
                Class cls = cVar.f23332b;
                String str = cVar.f23331a;
                return Room.databaseBuilder(context, cls, str).addMigrations((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length)).openHelperFactory(new d(((bl0.g) aVar).a(str, aVar2.getToken())));
            default:
                com.revolut.retail.core.navigation.b bVar = (com.revolut.retail.core.navigation.b) this.f23329b;
                nri.b bVar2 = (nri.b) this.f23330c;
                Intent intent = (Intent) this.d;
                Integer num = (Integer) this.e;
                Bundle bundle = (Bundle) this.f;
                if (num != null) {
                    int iIntValue = num.intValue();
                    sri.c cVar2 = bVar.f98672b;
                    if (cVar2 instanceof sri.a) {
                        ((sri.a) cVar2).f265230a.startActivityForResult(intent, iIntValue, bundle);
                    } else {
                        bVar2.startActivityForResult(intent, iIntValue, bundle);
                    }
                } else {
                    bVar2.startActivity(intent, bundle);
                }
                return Unit.f186387a;
        }
    }
}
