package cy9;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import bl0.g;
import com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase;
import com.revolut.sso.impl.data.db.SsoDatabase;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f110067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ de0.a f110068c;
    public final /* synthetic */ yk0.a d;

    public /* synthetic */ e(Context context, de0.a aVar, yk0.a aVar2, int i) {
        this.f110066a = i;
        this.f110067b = context;
        this.f110068c = aVar;
        this.d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f110066a;
        yk0.a aVar = this.d;
        de0.a aVar2 = this.f110068c;
        Context context = this.f110067b;
        switch (i) {
            case 0:
                RoomDatabase.Builder builderFallbackToDestructiveMigrationFrom = Room.databaseBuilder(context, RecipientSettingsDatabase.class, "recipient_settings_db").fallbackToDestructiveMigrationFrom(true, 1);
                RecipientSettingsDatabase.INSTANCE.getClass();
                return builderFallbackToDestructiveMigrationFrom.addMigrations((Migration[]) Arrays.copyOf(new Migration[0], 0)).openHelperFactory(new ce0.d(((g) aVar2).a("recipient_settings_db", aVar.getToken())));
            default:
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(context, SsoDatabase.class, "sso_db");
                SsoDatabase.INSTANCE.getClass();
                return builderDatabaseBuilder.addMigrations((Migration[]) Arrays.copyOf(new Migration[]{new ujl.a()}, 1)).fallbackToDestructiveMigration(true).openHelperFactory(new ce0.d(((g) aVar2).a("sso_db", aVar.getToken())));
        }
    }
}
